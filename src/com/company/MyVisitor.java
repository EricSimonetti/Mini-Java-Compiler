package com.company;

import java.util.ArrayList;

class MyVisitor extends lambdaPlusMiniJavaBaseVisitor<Object> {
    ASTNode AST;
    ASTNode head;

    @Override public Object visitGoal(lambdaPlusMiniJavaParser.GoalContext ctx) {
        //System.out.println("visited goal");
        AST = new GoalNode();
        head = AST;
        return visitChildren(ctx);
    }

    @Override public Object visitMainClass(lambdaPlusMiniJavaParser.MainClassContext ctx) {
        //System.out.println("visited mainclass");
        AST = ((GoalNode)AST).addMainClass(AST);
        ((MainClassNode)AST).setName(ctx.ID(0).getText());
        return visitChildren(ctx);
    }

    @Override public Object visitClassDeclaration(lambdaPlusMiniJavaParser.ClassDeclarationContext ctx) {
        //System.out.println("classdec");
        while(!(AST instanceof GoalNode)){
            AST = AST.getParent();
        }
        if(ctx.ID().size()>1){
            AST = ((GoalNode)AST).addClass(ctx.ID(0).getText(),ctx.ID(1).getText(), AST);
        }
        else {
            AST = ((GoalNode)AST).addClass(ctx.ID(0).getText(), AST);
        }
        return visitChildren(ctx);
    }

    @Override public Object visitVarDeclaration(lambdaPlusMiniJavaParser.VarDeclarationContext ctx) {
        //System.out.println("visited vardec");
        if(AST instanceof ClassNode){
            ((ClassNode)AST).addVar(ctx.type().getText(), ctx.ID().getText());
        }
        else if(AST instanceof MethodBodyNode){
            ((MethodBodyNode)AST).addVar(ctx.type().getText(), ctx.ID().getText());
        }
        return visitChildren(ctx);
    }

    @Override public Object visitMethodDeclaration(lambdaPlusMiniJavaParser.MethodDeclarationContext ctx) {
        //System.out.println("visited method ");
        while(!(AST instanceof ClassNode)){
            AST = AST.getParent();
        }
        ArrayList<VarNode> vars = new ArrayList<>();
        for(int i = 0; i<ctx.parameters().ID().size(); i++){
            vars.add( new VarNode( ctx.parameters().type(i).getText(), ctx.parameters().ID(i).getText()));
        }
        AST = ((ClassNode)AST).addMethod(ctx.type().getText(), ctx.ID().getText(), vars);
        return visitChildren(ctx);
    }

    @Override public Object visitMethodBody(lambdaPlusMiniJavaParser.MethodBodyContext ctx) {
        //System.out.println("visited body");
        ArrayList<VarNode> vars = new ArrayList<>();
        ArrayList<StatementNode> statements = new ArrayList<>();
        AST = ((MethodDeclarationNode)AST).setBody(vars, statements, ctx.statement().size());
        return visitChildren(ctx);
    }

    @Override public Object visitStatement(lambdaPlusMiniJavaParser.StatementContext ctx) {
        //System.out.println("visited Statement");
        while(AST.getStatements() == null || AST.getStatements().size() == AST.getNumStatements()){
            AST = AST.getParent();
        }
        StatementNode statement;
        int numStatements = ctx.statement().size();
        if(ctx.LBRACKET()!=null){
            statement = new BodyStatementNode(numStatements, AST);
        }
        else if(ctx.IF()!=null){
            statement = new IfStatementNode(AST);
        }
        else if(ctx.WHILE()!=null){
            statement = new WhileStatementNode(AST);
        }
        else if(ctx.PRINT()!=null){
            statement = new PrintStatement(AST);
        }
        else if(ctx.EQUALS()!=null){
            statement = new EqualsStatement(ctx.ID().getText(), AST);
        }
        else{
            statement = new ArrayEqualsStatement(ctx.ID().getText(), AST);
        }
        AST = AST.addStatement(statement);

        return visitChildren(ctx);
    }

    @Override public Object visitExpression(lambdaPlusMiniJavaParser.ExpressionContext ctx) {
        //System.out.println("visited Expression ");
        while(AST.getExpressions() == null || AST.getExpressions().size() == AST.getNumExpressions()){
            AST = AST.getParent();
        }
        ExpressionNode expression;
        if(ctx.OPERATOR()!=null){
            expression = new OperationExpression(ctx.OPERATOR().toString(), AST);
        }
        else if(ctx.SIGN()!=null){
            expression = new OperationExpression(ctx.SIGN().toString(), AST);
        }
        else if(ctx.LENGTH()!=null){
            expression = new LengthExpression(AST);
        }
        else if(ctx.DOT()!=null){
            expression = new FunctionCallExpression(ctx.ID().getText(), ctx.expression().size(), AST);
        }
        else if(ctx.INT_LITERAL()!=null){
            expression = new IntegerExpression(ctx.SIGN()!=null, Integer.parseInt(ctx.INT_LITERAL().toString()), AST);
        }
        else if(ctx.BOOLEAN_LITERAL()!=null){
            expression = new BooleanExpression(ctx.BOOLEAN_LITERAL().getText(), AST);
        }
        else if(ctx.THIS()!=null){
            expression = new ThisExpression(AST);
        }
        else if(ctx.INT()!=null){
            expression = new NewArrayExpression(AST);
        }
        else if(ctx.LSQUARE_BRACKET()!=null){
            expression = new ReturnedArrayExpression(AST);
        }
        else if(ctx.NEW()!=null){
            expression = new NewObjectExpression(ctx.ID().getText(), AST);
        }
        else if(ctx.NOT()!=null){
            expression = new NotExpression(AST);
        }
        else if(ctx.ID()!=null){
            expression = new VarExpression(ctx.ID().getText(), AST);
        }
        else if(ctx.QMARK()!=null){
            expression = new TernaryExpression(AST);
        }
        else{
            expression = new ParenthesisExpression(AST);
        }
        AST = AST.addExpression(expression);
        return visitChildren(ctx);
    }

    public ASTNode getAST() {
        return head;
    }
}
