package com.company;

import java.util.ArrayList;

public class TypeCheck {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    ASTNode AST;
    public TypeCheck(ASTNode AST){
        this.AST = AST;
        checkClassErrors();
        checkTree(AST);
        checkMethods();

    }

    private void checkTree(ASTNode curr){

        for(ASTNode n : curr.children){
            if(n instanceof StatementNode){
                checkStatement((StatementNode)n);
            }
            else if(n instanceof ExpressionNode){
                checkType((ExpressionNode)n);
            }
        }

        for(ASTNode n : curr.children){
            checkTree(n);
        }
    }

    private void checkStatement(StatementNode s){
        if(s instanceof IfStatementNode){
            String type = checkType(s.getExpressions().get(0));
            if(!type.equals("boolean")){
                throwError("Error: Boolean statement expected inside if statement");
            }
        }
        else if(s instanceof WhileStatementNode){
            String type = checkType(s.getExpressions().get(0));
            if(!type.equals("boolean")){
                throwError("Error: Boolean statement expected inside while statement");
            }
        }
        else if(s instanceof EqualsStatement){
            String expType = checkType(s.getExpressions().get(0));
            String varName = ((EqualsStatement)s).getVarName();

            VarNode var = findVar(varName, s);
            String varType = var.getType();

            if(varType.equals("")){
                throwError("Error: Variable \'" + varName + "\' has not been declared");
            }
            else{
                var.changeValue(s.getExpressions().get(0));
            }
            if( !varType.equals(expType) ){
                throwError("Error: Variable \'" + varName + "\' set to incorrect type");
            }
        }
        else if (s instanceof ArrayEqualsStatement){
            String indexType = checkType(s.getExpressions().get(0));
            String expType = checkType(s.getExpressions().get(1));
            String varName = ((ArrayEqualsStatement)s).getVarName();

            VarNode var = findVar(varName, s);
            String varType = var.getType();

            if(!indexType.equals("int")){
                throwError("Error: Array index must be type int");
            }
            if(varType.equals("")){
                throwError("Error: Variable \'" + varName + "\' has not been declared");
            }
            else{
                var.changeValue(s.getExpressions().get(1));
            }
            if( !varType.equals("int[]") ){
                throwError("Error: Non-Array variable \'" + varName + "\' cannot be indexed as an array");
            }
            else if( !expType.equals("int") ){
                throwError("Error: Array \'" + varName + "\' set to incorrect type");
            }
        }
    }

    private void checkMethods(){
        for(ClassNode c : ((GoalNode)AST).getClasses()){
            for(int i = 0; i<c.getMethods().size(); i++){
                //type check for return type
                MethodBodyNode m = c.getMethods().get(i).getBody();
                String returnType = c.getMethods().get(i).getReturnType();
                String returnedExpressionType = checkType(m.getExpressions().get(0));
                if(!returnType.equals(returnedExpressionType)){
                    throwError("Error: Incorrect type of returned expression in Method \'" + c.getMethods().get(i).getName() + "\'");
                }

                //check for duplicate methods
                ArrayList<VarNode> func1Params = c.getMethods().get(i).getVars();
                for(int ii = 0; ii<func1Params.size(); ii++){
                    String varName = func1Params.get(ii).getName();
                    for(int j = ii+1; j<func1Params.size(); j++) {
                        if(varName.equals(func1Params.get(j).getName())){
                            throwError("Error: Parameter \'" + varName + "\' in method \'" +
                                    c.getMethods().get(i).getName() + "\' has been declared twice");
                        }
                    }
                }

                String name = c.getMethods().get(i).getName();
                for(int j = i+1; j<c.getMethods().size(); j++){
                    if(name.equals(c.getMethods().get(i).getName())){
                        ArrayList<VarNode> func2Params = c.getMethods().get(j).getVars();
                        boolean repeat = true;
                        for(int k = 0; k<func1Params.size(); k++){
                            if( !(func1Params.get(k).getType().equals(func2Params.get(k).getType())) ){
                                repeat = false;
                            }
                        }
                        if(repeat){
                            throwError("Error: Method \'" + c.getMethods().get(i).getName() + "\' in class \'" +
                                    c.getName() + "\' has been declared twice");
                        }
                    }
                }
            }
        }
    }

    private void checkClassErrors(){
        ArrayList<String> names = new ArrayList<>();
        for(ClassNode c : ((GoalNode)AST).getClasses()){
            names.add(c.getName());
        }
        names.add(((GoalNode)AST).getMain().getName());

        for(int i = 0; i<names.size(); i++){
            String name = names.get(i);

            for(int j = i+1; j<names.size(); j++){
                if(name.equals(names.get(j))){
                    throwError("Error: Class \'" + name + "\' has been declared twice");
                }
            }
        }


        ArrayList<ClassNode> check = new ArrayList<>();
        for(ASTNode n : AST.children){
            if(n instanceof ClassNode && ((ClassNode)n).getExtend() != null ){
                check.add((ClassNode)n);
                if( ((ClassNode)n).getExtend().equals(((GoalNode)AST).getMain().getName()) ){
                    //throws illegal inheritance for inheriting from main class
                    check.remove(n);
                    throwError("Error: Cannot extend Main class");
                }
            }
        }

        for(ClassNode n : check){
            boolean found = false;
            for(ASTNode m : AST.children){
                if(m instanceof ClassNode && n.getExtend().equals(((ClassNode)m).getName())){
                    found = true;
                }
            }
            if(!found){
                throwError("Error: Class \'" + n.getName() + "\' extends a class that has not be declared");
            }
        }

        ArrayList<InheritanceTree> inheritanceTrees = buildInheritanceTree(check);
        for(int i = 1; i<=inheritanceTrees.size(); i++){
            if(!inheritanceTrees.get(i-1).isVisited() && iterate(inheritanceTrees.get(i-1), i)){
                //throws illegal inheritance due to recursive inheritance for IT
                //one error is thrown for each loop
                throwError("Error: Class \'" + inheritanceTrees.get(i-1).getName() + "\' is in an inheritance loop");
            }
        }
    }

    private boolean iterate(InheritanceTree IT, int iterationNumber){
        IT.setVisited(iterationNumber);
        while(IT.getExtend()!=null){
            IT.setVisited(iterationNumber);
            IT = IT.getExtend();
            if(IT.isVisited()){
                return IT.getVisited() == iterationNumber;
            }
        }
        return false;
    }

    private ArrayList<InheritanceTree> buildInheritanceTree(ArrayList<ClassNode> check){
        ArrayList<InheritanceTree> trees = new ArrayList<>();
        for(ClassNode n : check) {
            trees.add(new InheritanceTree(n));
        }

        for(InheritanceTree t : trees){
            for(InheritanceTree u : trees){
                if(u.getExtendName().equals(t.getName())){
                    u.setExtend(t);
                }
            }
        }

        return trees;
    }

    public String checkType(ExpressionNode exp){
        //System.out.println(exp.getClass().toString());
        String type = "";
        if(exp.getType()!=null){
            return exp.getType();
        }


        if(exp instanceof OperationExpression){
            String operation = ((OperationExpression)exp).getOperation();
            if(operation.equals("*") || operation.equals("+") || operation.equals("-")){
                type = "int";
            }
            else{
                type = "boolean";
            }

            String type1 = checkType(exp.getExpressions().get(0));
            String type2 = checkType(exp.getExpressions().get(1));
            if(!type1.equals(type2)){
                throwError("Error: Mismatched types on operation \'" + operation + "\'");
            }
        }
        else if(exp instanceof ReturnedArrayExpression){
            String arrayType = checkType(exp.getExpressions().get(0));
            String indexType = checkType(exp.getExpressions().get(1));
            if(!arrayType.equals("int[]")){
                throwError("Error: Expected int array not " + arrayType);
            }
            if(!indexType.equals("int")){
                throwError("Error: Array index must be int type");
            }
            type = "int";
        }
        else if(exp instanceof LengthExpression){
            type = checkType(exp.getExpressions().get(0));
            if(!type.equals("int[]")){
                throwError("Error: Length expression only takes " + type + " type");
            }
        }
        else if(exp instanceof FunctionCallExpression){
            String classType = checkType(exp.getExpressions().get(0));
            String funcName = ((FunctionCallExpression)exp).getFunctionName();

            boolean found = false;
            boolean foundClass = false;
            for(ClassNode c : ((GoalNode)AST).getClasses()){
                if(c.getName().equals(classType)){
                    foundClass = true;
                    for(MethodDeclarationNode m : c.getMethods()){
                        if(m.getName().equals(funcName)) {
                            found = true;
                            for (int i = 1; i < exp.getExpressions().size(); i++) {
                                if (m.getVars().size() == exp.getExpressions().size()-1 &&
                                        !m.getVars().get(i-1).getType().equals(checkType(exp.getExpressions().get(i)))) {
                                    found = false;
                                }
                            }
                        }
                        if(found) {
                            type = m.getReturnType();
                            break;
                        }
                    }
                }
            }
            if(!foundClass){
                throwError("Error: Class \'" + classType + "\' does not exist");
            }
            else if(!found){
                String types = exp.getExpressions().get(1).getType();
                for(int i = 2; i<exp.getExpressions().size(); i++){
                    types += ", " + exp.getExpressions().get(i).getType();
                }
                throwError("Error: Method " + funcName + "( " + types + " ) does not exist in class \'" + classType + "\'");
            }

        }
        else if(exp instanceof IntegerExpression){
            type = ((IntegerExpression)exp).getType();
        }
        else if(exp instanceof BooleanExpression){
            type = ((BooleanExpression)exp).getType();
        }
        else if(exp instanceof VarExpression){
            String name = ((VarExpression)exp).getName();
            VarNode var = findVar(name, exp);
            type = var.getType();

            if(type.equals("")){
                throwError("Error: Variable \'" + name + "\' has not been declared");
            }
        }
        else if(exp instanceof ThisExpression){
            type = ((ThisExpression)exp).getType();
        }
        else if(exp instanceof NewArrayExpression){
            type = "int[]";
            String indexType = checkType(exp.getExpressions().get(0));
            if(!indexType.equals("int")){
                throwError("Error: Array size must be int type");
            }
        }
        else if(exp instanceof NewObjectExpression){
            type = ((NewObjectExpression)exp).getType();
        }
        else if(exp instanceof NotExpression){
            String booleanType = checkType( (exp.getExpressions().get(0)));
            if(!booleanType.equals("boolean")){
                throwError("Error: Not expression requires boolean type");
            }
            type = "boolean";
        }
        else if(exp instanceof TernaryExpression){
            String booleanExpressionType = checkType(exp.getExpressions().get(0));
            String exp1Type = checkType(exp.getExpressions().get(1));
            String exp2Type = checkType(exp.getExpressions().get(2));

            if(!booleanExpressionType.equals("boolean")){
                throwError("Error: Ternary requires boolean expression preceding \'?\' symbol");
            }
            if(!exp1Type.equals(exp2Type)){
                throwError("Error: Mismatched ternary return types");
            }
            type = exp1Type;

        }
        else{
            type = checkType(exp.getExpressions().get(0));
        }
        exp.setType(type);
        return type;
    }

    private VarNode findVar(String name, ASTNode curr){
        VarNode var = null;
        String type = "";
        while(curr.getParent() != null){
            curr = curr.getParent();
            ArrayList<VarNode> check = new ArrayList<>();
            if(curr instanceof ClassNode){
                check = ((ClassNode)curr).getVars();
            }
            else if(curr instanceof MethodDeclarationNode){
                check = ((MethodDeclarationNode)curr).getVars();
            }
            else if(curr instanceof MethodBodyNode){
                check = ((MethodBodyNode)curr).getVars();
            }

            for(VarNode v : check){
                if(name.equals(v.getName())){
                    var = v;
                    type = v.getType();
                }
            }
            if(!type.equals("")) curr = AST;
        }

        if(var == null){
            return new VarNode("", name);
        }
        return var;
    }

    public void print(){
        print(AST);
    }

    private void print(ASTNode AST){
        System.out.println(AST.getClass().toString());
        for(ASTNode n : AST.children){
            print(n);
        }
    }

    private void throwError(String msg){
        System.out.println(ANSI_RED + msg + ANSI_RESET);
    }
}
