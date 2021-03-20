package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener implements lambdaPlusMiniJavaListener {

    @Override public void enterGoal(lambdaPlusMiniJavaParser.GoalContext ctx) { }

    @Override public void exitGoal(lambdaPlusMiniJavaParser.GoalContext ctx) { }

    @Override public void enterMainClass(lambdaPlusMiniJavaParser.MainClassContext ctx) { }

    @Override public void exitMainClass(lambdaPlusMiniJavaParser.MainClassContext ctx) { }

    @Override public void enterClassDeclaration(lambdaPlusMiniJavaParser.ClassDeclarationContext ctx) { }

    @Override public void exitClassDeclaration(lambdaPlusMiniJavaParser.ClassDeclarationContext ctx) { }

    @Override public void enterVarDeclaration(lambdaPlusMiniJavaParser.VarDeclarationContext ctx) { }

    @Override public void exitVarDeclaration(lambdaPlusMiniJavaParser.VarDeclarationContext ctx) { }

    @Override public void enterMethodDeclaration(lambdaPlusMiniJavaParser.MethodDeclarationContext ctx) { }

    @Override public void exitMethodDeclaration(lambdaPlusMiniJavaParser.MethodDeclarationContext ctx) { }

    @Override public void enterParameters(lambdaPlusMiniJavaParser.ParametersContext ctx) { }

    @Override public void exitParameters(lambdaPlusMiniJavaParser.ParametersContext ctx) { }

    @Override public void enterMethodBody(lambdaPlusMiniJavaParser.MethodBodyContext ctx) { }

    @Override public void exitMethodBody(lambdaPlusMiniJavaParser.MethodBodyContext ctx) { }

    @Override public void enterType(lambdaPlusMiniJavaParser.TypeContext ctx) { }

    @Override public void exitType(lambdaPlusMiniJavaParser.TypeContext ctx) { }

    @Override public void enterStatement(lambdaPlusMiniJavaParser.StatementContext ctx) { }

    @Override public void exitStatement(lambdaPlusMiniJavaParser.StatementContext ctx) { }

    @Override public void enterExpression(lambdaPlusMiniJavaParser.ExpressionContext ctx) { }

    @Override public void exitExpression(lambdaPlusMiniJavaParser.ExpressionContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}

