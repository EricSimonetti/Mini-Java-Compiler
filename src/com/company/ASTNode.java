package com.company;

import java.util.ArrayList;


abstract class ASTNode
{
    ArrayList<ASTNode> children = new ArrayList<>();
    ASTNode parent;

    public ASTNode getParent() { return parent; }
    public ArrayList<ASTNode> getChildren() { return children; }
    public ArrayList<StatementNode> getStatements(){ return null; }
    public StatementNode addStatement(StatementNode statement){ return null;}
    public int getNumStatements(){ return 0;}

    public ArrayList<ExpressionNode> getExpressions(){ return null; }
    public ExpressionNode addExpression(ExpressionNode expression){ return null;}
    public int getNumExpressions(){ return 0;}
}

class GoalNode extends ASTNode
{
    private MainClassNode Main;
    private ArrayList<ClassNode> classes;

    public GoalNode(){
        classes = new ArrayList<>();
    }

    public MainClassNode addMainClass(ASTNode parent) {
        Main = new MainClassNode(parent);
        children.add(Main);
        return Main;
    }

    public ClassNode addClass(String name, ASTNode parent) {
        ClassNode newClass = new ClassNode(name, parent);
        classes.add(newClass);
        children.add(newClass);
        return newClass;
    }
    public ClassNode addClass(String name, String extend, ASTNode parent) {
        ClassNode newClass = new ClassNode(name, parent);
        newClass.addExtends(extend);
        classes.add(newClass);
        children.add(newClass);
        return newClass;
    }

    public MainClassNode getMain() {
        return Main;
    }

    public ArrayList<ClassNode> getClasses() {
        return classes;
    }
}

class MainClassNode extends ASTNode
{
    private String name;
    private ArrayList<StatementNode> statements;
    private int numStatements;

    public MainClassNode(ASTNode parent){
        this.statements = new ArrayList<>();
        this.parent = parent;
        this.numStatements = 1;
    }
    public void setName(String name) {this.name = name;}
    public String getName() { return name; }

    @Override public ArrayList<StatementNode> getStatements() {
        return statements;
    }
    @Override public StatementNode addStatement(StatementNode statement) {
        statements.add(statement);
        children.add(statement);
        return statement;
    }
    @Override public int getNumStatements(){
        return numStatements;
    }
}

class ClassNode extends ASTNode
{
    private String name;
    private String extend;
    private ArrayList<VarNode> vars = new ArrayList<>();
    private ArrayList<MethodDeclarationNode> methods = new ArrayList<>();

    public ClassNode(String name, ASTNode parent){
        this.name = name;
        this.parent = parent;
    }
    public void addVar(String type, String name){
        VarNode newVar = new VarNode(type, name);
        newVar.addParent(this);
        vars.add(newVar);
        children.add(newVar);
    }
    public MethodDeclarationNode addMethod(String type, String name, ArrayList<VarNode> vars){
        MethodDeclarationNode newMethod = new MethodDeclarationNode(type, name, vars, this);
        methods.add(newMethod);
        children.add(newMethod);
        return newMethod;
    }
    void addExtends(String extend){
        this.extend = extend;
    }
    String getExtend(){
        return extend;
    }

    public ArrayList<MethodDeclarationNode> getMethods() {
        return methods;
    }

    public ArrayList<VarNode> getVars() {
        return vars;
    }

    public String getName() { return name; }
}

class VarNode extends ASTNode
{
    private String type;
    private String name;
    private ExpressionNode value;

    public VarNode(String type, String name){
        this.type = type;
        this.name = name;
    }
    public void addParent(ASTNode parent){
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getType(){
        return type;
    }

    public void changeValue(ExpressionNode newValue){
        value = newValue;
    }

    public ExpressionNode getValue() {
        return value;
    }
}

class MethodDeclarationNode extends ASTNode
{
    private String returnType;
    private String name;
    private ArrayList<VarNode> vars = new ArrayList<>();
    private MethodBodyNode body;

    public MethodDeclarationNode(String returnType, String name, ArrayList<VarNode> parameters, ASTNode parent){
        for(VarNode v: parameters)
            v.addParent(this);
        this.parent = parent;
        this.returnType = returnType;
        this.name = name;
        vars.addAll(parameters);
        children.addAll(parameters);
    }

    public MethodBodyNode setBody(ArrayList<VarNode> vars, ArrayList<StatementNode> statements, int numStatements){
        MethodBodyNode newBody = new MethodBodyNode(vars, statements, numStatements, this);
        children.add(newBody);
        this.body = newBody;
        return newBody;
    }

    public MethodBodyNode getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public ArrayList<VarNode> getVars() {
        return vars;
    }

    public String getReturnType() {
        return returnType;
    }
}

class MethodBodyNode extends ASTNode
{
    private ArrayList<VarNode> vars;
    private ArrayList<StatementNode> statements;
    private ArrayList<ExpressionNode> expressions;
    private int numStatements;
    private int numExpressions;

    public MethodBodyNode(ArrayList<VarNode> vars, ArrayList<StatementNode> statements, int numStatements, ASTNode parent){
        this.parent = parent;
        this.expressions = new ArrayList<>();
        this.vars = vars;
        this.statements = statements;
        this.numStatements = numStatements;
        this.numExpressions = 1;
    }
    public void addVar(String type, String name){
        VarNode newVar = new VarNode(type, name);
        newVar.addParent(this);
        vars.add(newVar);
        children.add(newVar);
    }

    public ArrayList<VarNode> getVars() {
        return vars;
    }

    @Override public ArrayList<StatementNode> getStatements() {
        return statements;
    }
    @Override public StatementNode addStatement(StatementNode statement) {
        statements.add(statement);
        children.add(statement);
        return statement;
    }
    @Override public int getNumStatements(){
        return numStatements;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

abstract class StatementNode extends ASTNode {
}

class BodyStatementNode extends StatementNode {
    private ArrayList<StatementNode> statements;
    private int numStatements;

    public BodyStatementNode(int numStatements, ASTNode parent){
        this.parent = parent;
        this.statements = new ArrayList<>();
        this.numStatements = numStatements;
    }
    @Override public ArrayList<StatementNode> getStatements() {
        return statements;
    }
    @Override public StatementNode addStatement(StatementNode statement) {
        statements.add(statement);
        children.add(statement);
        return statement;
    }
    @Override public int getNumStatements(){
        return numStatements;
    }
}

class IfStatementNode extends StatementNode{
    private ArrayList<ExpressionNode> expressions;
    private ArrayList<StatementNode> statements;
    private int numStatements;
    private int numExpressions;

    public IfStatementNode(ASTNode parent){
        this.parent = parent;
        expressions = new ArrayList<>();
        statements = new ArrayList<>();
        numStatements = 2;
        numExpressions = 1;
    }
    @Override public ArrayList<StatementNode> getStatements() {
        return statements;
    }
    @Override public StatementNode addStatement(StatementNode statement) {
        statements.add(statement);
        children.add(statement);
        return statement;
    }
    @Override public int getNumStatements(){
        return numStatements;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }

}

class WhileStatementNode extends StatementNode{
    private ArrayList<ExpressionNode> expressions;
    private ArrayList<StatementNode> statements;
    private int numStatements;
    private int numExpressions;

    public WhileStatementNode(ASTNode parent){
        this.parent = parent;
        expressions = new ArrayList<>();
        statements = new ArrayList<>();
        numStatements = 1;
        numExpressions = 1;
    }
    @Override public ArrayList<StatementNode> getStatements() {
        return statements;
    }
    @Override public StatementNode addStatement(StatementNode statement) {
        statements.add(statement);
        children.add(statement);
        return statement;
    }
    @Override public int getNumStatements(){
        return numStatements;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class PrintStatement extends StatementNode{
    private ArrayList<ExpressionNode> expressions;
    private int numExpressions;

    public PrintStatement(ASTNode parent){
        this.parent = parent;
        this.expressions = new ArrayList<>();
        this.numExpressions = 1;
    }
    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class EqualsStatement extends StatementNode{
    private String varName;
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    EqualsStatement(String varName, ASTNode parent){
        this.varName = varName;
        this.parent = parent;
        this.numExpressions = 1;
    }

    public String getVarName() {
        return varName;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class ArrayEqualsStatement extends StatementNode{
    private String varName;
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    ArrayEqualsStatement(String varName, ASTNode parent){
        this.parent = parent;
        this.varName = varName;
        this.numExpressions = 2;
    }

    public String getVarName() {
        return varName;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

abstract class ExpressionNode extends ASTNode
{
    private String type;

    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
}

class OperationExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private String operation;
    private int numExpressions;

    OperationExpression(String operation, ASTNode parent){
        this.parent = parent;
        this.operation = operation;
        this.numExpressions = 2;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }

    public String getOperation() {
        return operation;
    }
}

class LengthExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    LengthExpression(ASTNode parent){
        this.parent = parent;
        this.numExpressions = 1;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class FunctionCallExpression extends ExpressionNode {
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private String functionName;
    private int numExpressions;

    FunctionCallExpression(String functionName, int numExpressions, ASTNode parent){
        this.parent = parent;
        this.functionName = functionName;
        this.numExpressions = numExpressions;
    }

    public String getFunctionName() {
        return functionName;
    }

    @Override public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class IntegerExpression extends ExpressionNode{
    int value;

    IntegerExpression(boolean sign, int literal, ASTNode parent){
        this.parent = parent;
        setType("int");

        if(sign){
            literal = -literal;
        }
        value = literal;
    }
}

class BooleanExpression extends ExpressionNode{
    boolean value;

    BooleanExpression(String literal, ASTNode parent){
        this.parent = parent;
        setType("boolean");
        value = literal.equals("true");
    }
}

class VarExpression extends ExpressionNode{
    private String name;

    VarExpression(String name, ASTNode parent) {
        this.parent = parent;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ReturnedArrayExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions;
    private int numExpressions;

    ReturnedArrayExpression(ASTNode parent){
        this.parent = parent;
        this.expressions = new ArrayList<>();
        this.numExpressions = 2;
    }
    @Override
    public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class ThisExpression extends ExpressionNode{

    ThisExpression(ASTNode parent){
        this.parent = parent;
        ASTNode temp = parent;
        while(temp!=null){
            temp = temp.getParent();
            if(temp instanceof MainClassNode){
                setType(((MainClassNode)temp).getName());
                temp = null;
            }
            if(temp instanceof ClassNode){
                setType(((ClassNode)temp).getName());
                temp = null;
            }
        }
    }
}

class NewArrayExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    NewArrayExpression(ASTNode parent){
        this.parent = parent;
        this.numExpressions = 1;
    }

    @Override
    public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class NewObjectExpression extends ExpressionNode{

    NewObjectExpression(String type, ASTNode parent) {
        this.parent = parent;
        setType(type);
    }
}

class NotExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    NotExpression(ASTNode parent){
        this.parent = parent;
        this.numExpressions = 1;
    }
    @Override
    public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class ParenthesisExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    ParenthesisExpression(ASTNode parent) {
        this.parent = parent;
        this.numExpressions = 1;
    }
    @Override
    public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}

class TernaryExpression extends ExpressionNode{
    private ArrayList<ExpressionNode> expressions = new ArrayList<>();
    private int numExpressions;

    TernaryExpression(ASTNode parent) {
        this.parent = parent;
        this.numExpressions = 3;
    }
    @Override
    public ArrayList<ExpressionNode> getExpressions() {
        return expressions;
    }
    @Override public ExpressionNode addExpression(ExpressionNode expression){
        expressions.add(expression);
        children.add(expression);
        return expression;
    }
    @Override public int getNumExpressions(){
        return numExpressions;
    }
}
