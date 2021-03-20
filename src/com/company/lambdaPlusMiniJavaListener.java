// Generated from C:/Users/erics/Desktop/Compiler/MiniJavaCompiler/src/com/company\lambdaPlusMiniJava.g4 by ANTLR 4.8

    package com.company;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lambdaPlusMiniJavaParser}.
 */
public interface lambdaPlusMiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(lambdaPlusMiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(lambdaPlusMiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(lambdaPlusMiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(lambdaPlusMiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(lambdaPlusMiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(lambdaPlusMiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(lambdaPlusMiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(lambdaPlusMiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(lambdaPlusMiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(lambdaPlusMiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(lambdaPlusMiniJavaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(lambdaPlusMiniJavaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(lambdaPlusMiniJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(lambdaPlusMiniJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lambdaPlusMiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lambdaPlusMiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(lambdaPlusMiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(lambdaPlusMiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lambdaPlusMiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(lambdaPlusMiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lambdaPlusMiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(lambdaPlusMiniJavaParser.ExpressionContext ctx);
}