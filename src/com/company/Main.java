package com.company;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i<14; i++){
            String sourceFile = "test_files/TypeChecking/Test" + i + ".txt";
            System.out.println("\nChecking for errors in file: " + sourceFile);
            try {
                CharStream cs = fromFileName(sourceFile);
                lambdaPlusMiniJavaLexer lex = new lambdaPlusMiniJavaLexer(cs);
                CommonTokenStream token = new CommonTokenStream(lex);
                lambdaPlusMiniJavaParser parser = new lambdaPlusMiniJavaParser(token);

                ParseTree tree = parser.goal();
                parser.removeErrorListeners();
                parser.addErrorListener(MyErrorListener.INSTANCE);

                MyVisitor visitor = new MyVisitor();
                visitor.visit(tree);
                ASTNode AST = visitor.getAST();
                TypeCheck typechecker = new TypeCheck(AST);
                //typechecker.print();

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
