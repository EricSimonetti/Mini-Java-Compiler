// Generated from C:/Users/erics/Desktop/Compiler/MiniJavaCompiler/src/com/company\lambdaPlusMiniJava.g4 by ANTLR 4.8

    package com.company;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lambdaPlusMiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lambdaPlusMiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(lambdaPlusMiniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(lambdaPlusMiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(lambdaPlusMiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(lambdaPlusMiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(lambdaPlusMiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(lambdaPlusMiniJavaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(lambdaPlusMiniJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(lambdaPlusMiniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(lambdaPlusMiniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lambdaPlusMiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(lambdaPlusMiniJavaParser.ExpressionContext ctx);
}