// Generated from C:/Users/erics/Desktop/Compiler/MiniJavaCompiler/src/com/company\lambdaPlusMiniJava.g4 by ANTLR 4.8

    package com.company;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lambdaPlusMiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CLASS=2, PUBLIC=3, STATIC=4, VOID=5, MAIN=6, EXTENDS=7, FOR=8, 
		WHILE=9, IF=10, ELSE=11, RETURN=12, THIS=13, NEW=14, PRINT=15, LENGTH=16, 
		INT=17, BOOLEAN=18, STRING=19, BOOLEAN_LITERAL=20, LEFT_PARENTHESIS=21, 
		RIGHT_PARENTHESIS=22, LBRACKET=23, RBRACKET=24, LSQUARE_BRACKET=25, RSQUARE_BRACKET=26, 
		DOT=27, NOT=28, EQUALS=29, QMARK=30, COLON=31, SEMICOLON=32, OPERATOR=33, 
		SIGN=34, INT_LITERAL=35, ID=36, WHITESPACE=37, MULTI_LINE_COMMENT=38, 
		COMMENT=39;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_parameters = 5, RULE_methodBody = 6, 
		RULE_type = 7, RULE_statement = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"parameters", "methodBody", "type", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'class'", "'public'", "'static'", "'void'", "'main'", "'extends'", 
			"'for'", "'while'", "'if'", "'else'", "'return'", "'this'", "'new'", 
			"'System.out.println'", "'length'", "'int'", "'boolean'", "'String'", 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "'!'", "'='", 
			"'?'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", "EXTENDS", "FOR", 
			"WHILE", "IF", "ELSE", "RETURN", "THIS", "NEW", "PRINT", "LENGTH", "INT", 
			"BOOLEAN", "STRING", "BOOLEAN_LITERAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"LBRACKET", "RBRACKET", "LSQUARE_BRACKET", "RSQUARE_BRACKET", "DOT", 
			"NOT", "EQUALS", "QMARK", "COLON", "SEMICOLON", "OPERATOR", "SIGN", "INT_LITERAL", 
			"ID", "WHITESPACE", "MULTI_LINE_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lambdaPlusMiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lambdaPlusMiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(lambdaPlusMiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(lambdaPlusMiniJavaParser.RIGHT_PARENTHESIS); }
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(lambdaPlusMiniJavaParser.RIGHT_PARENTHESIS, i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				mainClass();
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLASS) {
					{
					{
					setState(21);
					classDeclaration();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27);
				match(EOF);
				}
				break;
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(LEFT_PARENTHESIS);
				setState(30);
				classDeclaration();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RIGHT_PARENTHESIS) {
					{
					{
					setState(31);
					match(RIGHT_PARENTHESIS);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(EOF);
				notifyErrorListeners("missing Main class");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(lambdaPlusMiniJavaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(lambdaPlusMiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lambdaPlusMiniJavaParser.ID, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(lambdaPlusMiniJavaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(lambdaPlusMiniJavaParser.LBRACKET, i);
		}
		public TerminalNode PUBLIC() { return getToken(lambdaPlusMiniJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(lambdaPlusMiniJavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(lambdaPlusMiniJavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(lambdaPlusMiniJavaParser.MAIN, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode STRING() { return getToken(lambdaPlusMiniJavaParser.STRING, 0); }
		public TerminalNode LSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.LSQUARE_BRACKET, 0); }
		public TerminalNode RSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.RSQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.RIGHT_PARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(lambdaPlusMiniJavaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(lambdaPlusMiniJavaParser.RBRACKET, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(CLASS);
				setState(43);
				match(ID);
				setState(44);
				match(LBRACKET);
				setState(45);
				match(PUBLIC);
				setState(46);
				match(STATIC);
				setState(47);
				match(VOID);
				setState(48);
				match(MAIN);
				setState(49);
				match(LEFT_PARENTHESIS);
				setState(50);
				match(STRING);
				setState(51);
				match(LSQUARE_BRACKET);
				setState(52);
				match(RSQUARE_BRACKET);
				setState(53);
				match(ID);
				setState(54);
				match(RIGHT_PARENTHESIS);
				setState(55);
				match(LBRACKET);
				setState(56);
				statement(0);
				setState(57);
				match(RBRACKET);
				setState(58);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(CLASS);
				setState(61);
				match(LBRACKET);
				setState(62);
				match(PUBLIC);
				setState(63);
				match(STATIC);
				setState(64);
				match(VOID);
				setState(65);
				match(MAIN);
				setState(66);
				match(LEFT_PARENTHESIS);
				setState(67);
				match(STRING);
				setState(68);
				match(LSQUARE_BRACKET);
				setState(69);
				match(RSQUARE_BRACKET);
				setState(70);
				match(ID);
				setState(71);
				match(RIGHT_PARENTHESIS);
				setState(72);
				match(LBRACKET);
				setState(73);
				statement(0);
				setState(74);
				match(RBRACKET);
				setState(75);
				match(RBRACKET);
				notifyErrorListeners("missing main class name");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(CLASS);
				setState(79);
				match(ID);
				setState(80);
				match(LBRACKET);
				setState(81);
				match(STATIC);
				setState(82);
				match(VOID);
				setState(83);
				match(MAIN);
				setState(84);
				match(LEFT_PARENTHESIS);
				setState(85);
				match(STRING);
				setState(86);
				match(LSQUARE_BRACKET);
				setState(87);
				match(RSQUARE_BRACKET);
				setState(88);
				match(ID);
				setState(89);
				match(RIGHT_PARENTHESIS);
				setState(90);
				match(LBRACKET);
				setState(91);
				statement(0);
				setState(92);
				match(RBRACKET);
				setState(93);
				match(RBRACKET);
				notifyErrorListeners("missing key word 'public' in main class declaration");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(CLASS);
				setState(97);
				match(ID);
				setState(98);
				match(LBRACKET);
				setState(99);
				match(PUBLIC);
				setState(100);
				match(VOID);
				setState(101);
				match(MAIN);
				setState(102);
				match(LEFT_PARENTHESIS);
				setState(103);
				match(STRING);
				setState(104);
				match(LSQUARE_BRACKET);
				setState(105);
				match(RSQUARE_BRACKET);
				setState(106);
				match(ID);
				setState(107);
				match(RIGHT_PARENTHESIS);
				setState(108);
				match(LBRACKET);
				setState(109);
				statement(0);
				setState(110);
				match(RBRACKET);
				setState(111);
				match(RBRACKET);
				notifyErrorListeners("missing key word 'static' in main class declaration");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(CLASS);
				setState(115);
				match(ID);
				setState(116);
				match(LBRACKET);
				setState(117);
				match(PUBLIC);
				setState(118);
				match(STATIC);
				setState(119);
				match(MAIN);
				setState(120);
				match(LEFT_PARENTHESIS);
				setState(121);
				match(STRING);
				setState(122);
				match(LSQUARE_BRACKET);
				setState(123);
				match(RSQUARE_BRACKET);
				setState(124);
				match(ID);
				setState(125);
				match(RIGHT_PARENTHESIS);
				setState(126);
				match(LBRACKET);
				setState(127);
				statement(0);
				setState(128);
				match(RBRACKET);
				setState(129);
				match(RBRACKET);
				notifyErrorListeners("missing key word 'void' in main class declaration");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(CLASS);
				setState(133);
				match(ID);
				setState(134);
				match(LBRACKET);
				setState(135);
				match(PUBLIC);
				setState(136);
				match(STATIC);
				setState(137);
				match(VOID);
				setState(138);
				match(LEFT_PARENTHESIS);
				setState(139);
				match(STRING);
				setState(140);
				match(LSQUARE_BRACKET);
				setState(141);
				match(RSQUARE_BRACKET);
				setState(142);
				match(ID);
				setState(143);
				match(RIGHT_PARENTHESIS);
				setState(144);
				match(LBRACKET);
				setState(145);
				statement(0);
				setState(146);
				match(RBRACKET);
				setState(147);
				match(RBRACKET);
				notifyErrorListeners("missing key word 'main' in main class declaration");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(CLASS);
				setState(151);
				match(ID);
				setState(152);
				match(LBRACKET);
				setState(153);
				match(PUBLIC);
				setState(154);
				match(STATIC);
				setState(155);
				match(VOID);
				setState(156);
				match(MAIN);
				setState(157);
				match(LEFT_PARENTHESIS);
				setState(158);
				match(STRING);
				setState(159);
				match(LSQUARE_BRACKET);
				setState(160);
				match(RSQUARE_BRACKET);
				setState(161);
				match(ID);
				setState(162);
				match(RIGHT_PARENTHESIS);
				setState(163);
				match(LBRACKET);
				setState(164);
				statement(0);
				setState(165);
				match(RBRACKET);
				notifyErrorListeners("Main class declaration missing right bracket");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(CLASS);
				setState(169);
				match(ID);
				setState(170);
				match(PUBLIC);
				setState(171);
				match(STATIC);
				setState(172);
				match(VOID);
				setState(173);
				match(MAIN);
				setState(174);
				match(LEFT_PARENTHESIS);
				setState(175);
				match(STRING);
				setState(176);
				match(LSQUARE_BRACKET);
				setState(177);
				match(RSQUARE_BRACKET);
				setState(178);
				match(ID);
				setState(179);
				match(RIGHT_PARENTHESIS);
				setState(180);
				match(LBRACKET);
				setState(181);
				statement(0);
				setState(182);
				match(RBRACKET);
				setState(183);
				match(RBRACKET);
				notifyErrorListeners("Main class declaration missing left bracket");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				match(CLASS);
				setState(187);
				match(ID);
				setState(188);
				match(LBRACKET);
				setState(189);
				match(PUBLIC);
				setState(190);
				match(STATIC);
				setState(191);
				match(VOID);
				setState(192);
				match(MAIN);
				setState(193);
				match(LEFT_PARENTHESIS);
				setState(194);
				match(STRING);
				setState(195);
				match(LSQUARE_BRACKET);
				setState(196);
				match(RSQUARE_BRACKET);
				setState(197);
				match(ID);
				setState(198);
				match(RIGHT_PARENTHESIS);
				setState(199);
				match(LBRACKET);
				setState(200);
				match(RBRACKET);
				setState(201);
				match(RBRACKET);
				notifyErrorListeners("Empty main class body");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(lambdaPlusMiniJavaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(lambdaPlusMiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lambdaPlusMiniJavaParser.ID, i);
		}
		public TerminalNode LBRACKET() { return getToken(lambdaPlusMiniJavaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(lambdaPlusMiniJavaParser.RBRACKET, 0); }
		public TerminalNode EXTENDS() { return getToken(lambdaPlusMiniJavaParser.EXTENDS, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(CLASS);
				setState(206);
				match(ID);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(207);
					match(EXTENDS);
					setState(208);
					match(ID);
					}
				}

				setState(211);
				match(LBRACKET);
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						varDeclaration();
						}
						} 
					}
					setState(217);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(218);
					methodDeclaration();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(CLASS);
				setState(226);
				match(ID);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(227);
					match(EXTENDS);
					setState(228);
					match(ID);
					}
				}

				setState(231);
				match(LBRACKET);
				setState(232);
				match(RBRACKET);
				notifyErrorListeners("Empty class body");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(CLASS);
				setState(235);
				match(ID);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(236);
					match(EXTENDS);
					setState(237);
					match(ID);
					}
				}

				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						varDeclaration();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(246);
					methodDeclaration();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(RBRACKET);
				notifyErrorListeners("Class declaration missing right bracket");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(CLASS);
				setState(255);
				match(ID);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(256);
					match(EXTENDS);
					setState(257);
					match(ID);
					}
				}

				setState(260);
				match(LBRACKET);
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(261);
						varDeclaration();
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					{
					setState(267);
					methodDeclaration();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				notifyErrorListeners("Class declaration missing left bracket");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(lambdaPlusMiniJavaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(lambdaPlusMiniJavaParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				type();
				setState(277);
				match(ID);
				setState(278);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				type();
				setState(281);
				match(ID);
				notifyErrorListeners("Missing semi-colon");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(ID);
				setState(285);
				match(SEMICOLON);
				notifyErrorListeners("Missing type in variable declaration");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(lambdaPlusMiniJavaParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(lambdaPlusMiniJavaParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(PUBLIC);
				setState(290);
				type();
				setState(291);
				match(ID);
				setState(292);
				parameters();
				setState(293);
				methodBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				type();
				setState(296);
				match(ID);
				setState(297);
				parameters();
				notifyErrorListeners("Method declaration missing public");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(PUBLIC);
				setState(301);
				match(ID);
				setState(302);
				parameters();
				notifyErrorListeners("Method declaration missing return type");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(PUBLIC);
				setState(306);
				type();
				setState(307);
				parameters();
				notifyErrorListeners("Method declaration missing method name");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(PUBLIC);
				setState(311);
				type();
				setState(312);
				match(ID);
				notifyErrorListeners("Method declaration missing argument list");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.RIGHT_PARENTHESIS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(lambdaPlusMiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lambdaPlusMiniJavaParser.ID, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(LEFT_PARENTHESIS);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(318);
					type();
					setState(319);
					match(ID);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(320);
						match(T__0);
						setState(321);
						type();
						setState(322);
						match(ID);
						}
						}
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(331);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(LEFT_PARENTHESIS);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(333);
					type();
					setState(334);
					match(ID);
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(335);
						match(T__0);
						setState(336);
						type();
						setState(337);
						match(ID);
						}
						}
						setState(343);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				notifyErrorListeners("Argument list declaration missing right parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(347);
					type();
					setState(348);
					match(ID);
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(349);
						match(T__0);
						setState(350);
						type();
						setState(351);
						match(ID);
						}
						}
						setState(357);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(360);
				match(RIGHT_PARENTHESIS);
				notifyErrorListeners("Argument list missing left parenthesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(LEFT_PARENTHESIS);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(363);
					match(ID);
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(364);
						match(T__0);
						setState(365);
						type();
						setState(366);
						match(ID);
						}
						}
						setState(372);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(375);
				match(RIGHT_PARENTHESIS);
				notifyErrorListeners("Variable in argument list missing type");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				match(LEFT_PARENTHESIS);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(378);
					type();
					setState(379);
					match(ID);
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(380);
						match(T__0);
						setState(381);
						match(ID);
						}
						}
						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(389);
				match(RIGHT_PARENTHESIS);
				notifyErrorListeners("Variable in argument list missing type");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(lambdaPlusMiniJavaParser.LBRACKET, 0); }
		public TerminalNode RETURN() { return getToken(lambdaPlusMiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(lambdaPlusMiniJavaParser.SEMICOLON, 0); }
		public TerminalNode RBRACKET() { return getToken(lambdaPlusMiniJavaParser.RBRACKET, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		int _la;
		try {
			int _alt;
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(LBRACKET);
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						varDeclaration();
						}
						} 
					}
					setState(399);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << LBRACKET) | (1L << ID))) != 0)) {
					{
					{
					setState(400);
					statement(0);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(RETURN);
				setState(407);
				expression(0);
				setState(408);
				match(SEMICOLON);
				setState(409);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(LBRACKET);
				setState(412);
				match(RBRACKET);
				notifyErrorListeners("Empty method body");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(LBRACKET);
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						varDeclaration();
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << LBRACKET) | (1L << ID))) != 0)) {
					{
					{
					setState(421);
					statement(0);
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(RBRACKET);
				notifyErrorListeners("Missing return statement");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lambdaPlusMiniJavaParser.INT, 0); }
		public TerminalNode LSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.LSQUARE_BRACKET, 0); }
		public TerminalNode RSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.RSQUARE_BRACKET, 0); }
		public TerminalNode BOOLEAN() { return getToken(lambdaPlusMiniJavaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(lambdaPlusMiniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(INT);
				setState(432);
				match(LSQUARE_BRACKET);
				setState(433);
				match(RSQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(lambdaPlusMiniJavaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(lambdaPlusMiniJavaParser.RBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(lambdaPlusMiniJavaParser.IF, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.LEFT_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode ELSE() { return getToken(lambdaPlusMiniJavaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(lambdaPlusMiniJavaParser.WHILE, 0); }
		public TerminalNode PRINT() { return getToken(lambdaPlusMiniJavaParser.PRINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(lambdaPlusMiniJavaParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(lambdaPlusMiniJavaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(lambdaPlusMiniJavaParser.EQUALS, 0); }
		public TerminalNode LSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.LSQUARE_BRACKET, 0); }
		public TerminalNode RSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.RSQUARE_BRACKET, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(440);
				match(LBRACKET);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << LBRACKET) | (1L << ID))) != 0)) {
					{
					{
					setState(441);
					statement(0);
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				match(RBRACKET);
				}
				break;
			case 2:
				{
				setState(448);
				match(IF);
				setState(449);
				match(LEFT_PARENTHESIS);
				setState(450);
				expression(0);
				setState(451);
				match(RIGHT_PARENTHESIS);
				setState(452);
				statement(0);
				setState(453);
				match(ELSE);
				setState(454);
				statement(14);
				}
				break;
			case 3:
				{
				setState(456);
				match(WHILE);
				setState(457);
				match(LEFT_PARENTHESIS);
				setState(458);
				expression(0);
				setState(459);
				match(RIGHT_PARENTHESIS);
				setState(460);
				statement(13);
				}
				break;
			case 4:
				{
				setState(462);
				match(PRINT);
				setState(463);
				match(LEFT_PARENTHESIS);
				setState(464);
				expression(0);
				setState(465);
				match(RIGHT_PARENTHESIS);
				setState(466);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				setState(468);
				match(ID);
				setState(469);
				match(EQUALS);
				setState(470);
				expression(0);
				setState(471);
				match(SEMICOLON);
				}
				break;
			case 6:
				{
				setState(473);
				match(ID);
				setState(474);
				match(LSQUARE_BRACKET);
				setState(475);
				expression(0);
				setState(476);
				match(RSQUARE_BRACKET);
				setState(477);
				match(EQUALS);
				setState(478);
				expression(0);
				setState(479);
				match(SEMICOLON);
				}
				break;
			case 7:
				{
				setState(481);
				match(IF);
				setState(482);
				match(LEFT_PARENTHESIS);
				setState(483);
				expression(0);
				setState(484);
				match(RIGHT_PARENTHESIS);
				setState(485);
				statement(9);
				notifyErrorListeners("Missing else");
				}
				break;
			case 8:
				{
				setState(488);
				match(LBRACKET);
				setState(489);
				match(RBRACKET);
				notifyErrorListeners("Empty loop body");
				}
				break;
			case 9:
				{
				setState(491);
				match(LBRACKET);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << LBRACKET) | (1L << ID))) != 0)) {
					{
					{
					setState(492);
					statement(0);
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
				match(RBRACKET);
				notifyErrorListeners("Missing right bracket");
				}
				break;
			case 10:
				{
				setState(500);
				match(ID);
				setState(501);
				expression(0);
				setState(502);
				match(SEMICOLON);
				notifyErrorListeners("Missing equals sign bracket");
				}
				break;
			case 11:
				{
				setState(505);
				match(ID);
				setState(506);
				match(LSQUARE_BRACKET);
				setState(507);
				expression(0);
				setState(508);
				match(RSQUARE_BRACKET);
				setState(509);
				expression(0);
				setState(510);
				match(SEMICOLON);
				notifyErrorListeners("Missing equals sign bracket");
				}
				break;
			case 12:
				{
				setState(513);
				match(PRINT);
				setState(514);
				match(LEFT_PARENTHESIS);
				setState(515);
				expression(0);
				setState(516);
				match(RIGHT_PARENTHESIS);
				notifyErrorListeners("Missing semi-colon");
				}
				break;
			case 13:
				{
				setState(519);
				match(ID);
				setState(520);
				match(EQUALS);
				setState(521);
				expression(0);
				notifyErrorListeners("Missing semi-colon");
				}
				break;
			case 14:
				{
				setState(524);
				match(ID);
				setState(525);
				match(LSQUARE_BRACKET);
				setState(526);
				expression(0);
				setState(527);
				match(RSQUARE_BRACKET);
				setState(528);
				match(EQUALS);
				setState(529);
				expression(0);
				notifyErrorListeners("Missing semi-colon");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(534);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(535);
					match(RBRACKET);
					notifyErrorListeners("Missing left bracket");
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(lambdaPlusMiniJavaParser.INT_LITERAL, 0); }
		public TerminalNode SIGN() { return getToken(lambdaPlusMiniJavaParser.SIGN, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(lambdaPlusMiniJavaParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode ID() { return getToken(lambdaPlusMiniJavaParser.ID, 0); }
		public TerminalNode THIS() { return getToken(lambdaPlusMiniJavaParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(lambdaPlusMiniJavaParser.NEW, 0); }
		public TerminalNode INT() { return getToken(lambdaPlusMiniJavaParser.INT, 0); }
		public TerminalNode LSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.LSQUARE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQUARE_BRACKET() { return getToken(lambdaPlusMiniJavaParser.RSQUARE_BRACKET, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(lambdaPlusMiniJavaParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode NOT() { return getToken(lambdaPlusMiniJavaParser.NOT, 0); }
		public TerminalNode OPERATOR() { return getToken(lambdaPlusMiniJavaParser.OPERATOR, 0); }
		public TerminalNode QMARK() { return getToken(lambdaPlusMiniJavaParser.QMARK, 0); }
		public TerminalNode COLON() { return getToken(lambdaPlusMiniJavaParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(lambdaPlusMiniJavaParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(lambdaPlusMiniJavaParser.LENGTH, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lambdaPlusMiniJavaListener ) ((lambdaPlusMiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lambdaPlusMiniJavaVisitor ) return ((lambdaPlusMiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(543);
					match(SIGN);
					}
				}

				setState(546);
				match(INT_LITERAL);
				}
				break;
			case 2:
				{
				setState(547);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 3:
				{
				setState(548);
				match(ID);
				}
				break;
			case 4:
				{
				setState(549);
				match(THIS);
				}
				break;
			case 5:
				{
				setState(550);
				match(NEW);
				setState(551);
				match(INT);
				setState(552);
				match(LSQUARE_BRACKET);
				setState(553);
				expression(0);
				setState(554);
				match(RSQUARE_BRACKET);
				}
				break;
			case 6:
				{
				setState(556);
				match(NEW);
				setState(557);
				match(ID);
				setState(558);
				match(LEFT_PARENTHESIS);
				setState(559);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 7:
				{
				setState(560);
				match(NOT);
				setState(561);
				expression(6);
				}
				break;
			case 8:
				{
				setState(562);
				match(LEFT_PARENTHESIS);
				setState(563);
				expression(0);
				setState(564);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 9:
				{
				setState(566);
				match(NEW);
				setState(567);
				match(INT);
				setState(568);
				match(LSQUARE_BRACKET);
				setState(569);
				match(RSQUARE_BRACKET);
				notifyErrorListeners("Array size not specified");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(574);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR || _la==SIGN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(575);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(577);
						match(QMARK);
						setState(578);
						expression(0);
						setState(579);
						match(COLON);
						setState(580);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(583);
						match(QMARK);
						setState(584);
						expression(0);
						setState(585);
						expression(2);
						notifyErrorListeners("Missing colon in ternary expression");
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(589);
						match(LSQUARE_BRACKET);
						setState(590);
						expression(0);
						setState(591);
						match(RSQUARE_BRACKET);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(593);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(594);
						match(DOT);
						setState(595);
						match(LENGTH);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(596);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(597);
						match(DOT);
						setState(598);
						match(ID);
						setState(599);
						match(LEFT_PARENTHESIS);
						setState(608);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NEW) | (1L << BOOLEAN_LITERAL) | (1L << LEFT_PARENTHESIS) | (1L << NOT) | (1L << SIGN) | (1L << INT_LITERAL) | (1L << ID))) != 0)) {
							{
							setState(600);
							expression(0);
							setState(605);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__0) {
								{
								{
								setState(601);
								match(T__0);
								setState(602);
								expression(0);
								}
								}
								setState(607);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(610);
						match(RIGHT_PARENTHESIS);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(612);
						match(LSQUARE_BRACKET);
						setState(613);
						match(RSQUARE_BRACKET);
						notifyErrorListeners("Array index not specified");
						}
						break;
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u026f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ce\n\3\3\4\3\4"+
		"\3\4\3\4\5\4\u00d4\n\4\3\4\3\4\7\4\u00d8\n\4\f\4\16\4\u00db\13\4\3\4\7"+
		"\4\u00de\n\4\f\4\16\4\u00e1\13\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e8\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f1\n\4\3\4\7\4\u00f4\n\4\f\4\16\4\u00f7"+
		"\13\4\3\4\7\4\u00fa\n\4\f\4\16\4\u00fd\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u0105\n\4\3\4\3\4\7\4\u0109\n\4\f\4\16\4\u010c\13\4\3\4\7\4\u010f\n"+
		"\4\f\4\16\4\u0112\13\4\3\4\5\4\u0115\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u0122\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u013e"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0147\n\7\f\7\16\7\u014a\13\7\5\7"+
		"\u014c\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0156\n\7\f\7\16\7\u0159"+
		"\13\7\5\7\u015b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0164\n\7\f\7\16\7"+
		"\u0167\13\7\5\7\u0169\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0173\n"+
		"\7\f\7\16\7\u0176\13\7\5\7\u0178\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0181"+
		"\n\7\f\7\16\7\u0184\13\7\5\7\u0186\n\7\3\7\3\7\5\7\u018a\n\7\3\b\3\b\7"+
		"\b\u018e\n\b\f\b\16\b\u0191\13\b\3\b\7\b\u0194\n\b\f\b\16\b\u0197\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u01a3\n\b\f\b\16\b\u01a6"+
		"\13\b\3\b\7\b\u01a9\n\b\f\b\16\b\u01ac\13\b\3\b\3\b\5\b\u01b0\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u01b8\n\t\3\n\3\n\3\n\7\n\u01bd\n\n\f\n\16\n"+
		"\u01c0\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01f0\n\n"+
		"\f\n\16\n\u01f3\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0217\n\n\3\n\3\n\3\n\7\n\u021c\n\n\f\n\16\n\u021f"+
		"\13\n\3\13\3\13\5\13\u0223\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u023e\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u025e\n\13\f\13\16\13\u0261"+
		"\13\13\5\13\u0263\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u026a\n\13\f\13\16"+
		"\13\u026d\13\13\3\13\2\4\22\24\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2#$\2\u02bb"+
		"\2*\3\2\2\2\4\u00cd\3\2\2\2\6\u0114\3\2\2\2\b\u0121\3\2\2\2\n\u013d\3"+
		"\2\2\2\f\u0189\3\2\2\2\16\u01af\3\2\2\2\20\u01b7\3\2\2\2\22\u0216\3\2"+
		"\2\2\24\u023d\3\2\2\2\26\32\5\4\3\2\27\31\5\6\4\2\30\27\3\2\2\2\31\34"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36"+
		"\7\2\2\3\36+\3\2\2\2\37 \7\27\2\2 $\5\6\4\2!#\7\30\2\2\"!\3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\2\2\3()\b\2\1\2"+
		")+\3\2\2\2*\26\3\2\2\2*\37\3\2\2\2+\3\3\2\2\2,-\7\4\2\2-.\7&\2\2./\7\31"+
		"\2\2/\60\7\5\2\2\60\61\7\6\2\2\61\62\7\7\2\2\62\63\7\b\2\2\63\64\7\27"+
		"\2\2\64\65\7\25\2\2\65\66\7\33\2\2\66\67\7\34\2\2\678\7&\2\289\7\30\2"+
		"\29:\7\31\2\2:;\5\22\n\2;<\7\32\2\2<=\7\32\2\2=\u00ce\3\2\2\2>?\7\4\2"+
		"\2?@\7\31\2\2@A\7\5\2\2AB\7\6\2\2BC\7\7\2\2CD\7\b\2\2DE\7\27\2\2EF\7\25"+
		"\2\2FG\7\33\2\2GH\7\34\2\2HI\7&\2\2IJ\7\30\2\2JK\7\31\2\2KL\5\22\n\2L"+
		"M\7\32\2\2MN\7\32\2\2NO\b\3\1\2O\u00ce\3\2\2\2PQ\7\4\2\2QR\7&\2\2RS\7"+
		"\31\2\2ST\7\6\2\2TU\7\7\2\2UV\7\b\2\2VW\7\27\2\2WX\7\25\2\2XY\7\33\2\2"+
		"YZ\7\34\2\2Z[\7&\2\2[\\\7\30\2\2\\]\7\31\2\2]^\5\22\n\2^_\7\32\2\2_`\7"+
		"\32\2\2`a\b\3\1\2a\u00ce\3\2\2\2bc\7\4\2\2cd\7&\2\2de\7\31\2\2ef\7\5\2"+
		"\2fg\7\7\2\2gh\7\b\2\2hi\7\27\2\2ij\7\25\2\2jk\7\33\2\2kl\7\34\2\2lm\7"+
		"&\2\2mn\7\30\2\2no\7\31\2\2op\5\22\n\2pq\7\32\2\2qr\7\32\2\2rs\b\3\1\2"+
		"s\u00ce\3\2\2\2tu\7\4\2\2uv\7&\2\2vw\7\31\2\2wx\7\5\2\2xy\7\6\2\2yz\7"+
		"\b\2\2z{\7\27\2\2{|\7\25\2\2|}\7\33\2\2}~\7\34\2\2~\177\7&\2\2\177\u0080"+
		"\7\30\2\2\u0080\u0081\7\31\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\32\2"+
		"\2\u0083\u0084\7\32\2\2\u0084\u0085\b\3\1\2\u0085\u00ce\3\2\2\2\u0086"+
		"\u0087\7\4\2\2\u0087\u0088\7&\2\2\u0088\u0089\7\31\2\2\u0089\u008a\7\5"+
		"\2\2\u008a\u008b\7\6\2\2\u008b\u008c\7\7\2\2\u008c\u008d\7\27\2\2\u008d"+
		"\u008e\7\25\2\2\u008e\u008f\7\33\2\2\u008f\u0090\7\34\2\2\u0090\u0091"+
		"\7&\2\2\u0091\u0092\7\30\2\2\u0092\u0093\7\31\2\2\u0093\u0094\5\22\n\2"+
		"\u0094\u0095\7\32\2\2\u0095\u0096\7\32\2\2\u0096\u0097\b\3\1\2\u0097\u00ce"+
		"\3\2\2\2\u0098\u0099\7\4\2\2\u0099\u009a\7&\2\2\u009a\u009b\7\31\2\2\u009b"+
		"\u009c\7\5\2\2\u009c\u009d\7\6\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7\b"+
		"\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\7\33\2\2\u00a2"+
		"\u00a3\7\34\2\2\u00a3\u00a4\7&\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\7"+
		"\31\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\b\3\1\2"+
		"\u00a9\u00ce\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\7&\2\2\u00ac\u00ad"+
		"\7\5\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\7\7\2\2\u00af\u00b0\7\b\2\2\u00b0"+
		"\u00b1\7\27\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4"+
		"\7\34\2\2\u00b4\u00b5\7&\2\2\u00b5\u00b6\7\30\2\2\u00b6\u00b7\7\31\2\2"+
		"\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7\32\2\2\u00b9\u00ba\7\32\2\2\u00ba"+
		"\u00bb\b\3\1\2\u00bb\u00ce\3\2\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\7&"+
		"\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\7\5\2\2\u00c0\u00c1\7\6\2\2\u00c1"+
		"\u00c2\7\7\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\7"+
		"\25\2\2\u00c5\u00c6\7\33\2\2\u00c6\u00c7\7\34\2\2\u00c7\u00c8\7&\2\2\u00c8"+
		"\u00c9\7\30\2\2\u00c9\u00ca\7\31\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc"+
		"\7\32\2\2\u00cc\u00ce\b\3\1\2\u00cd,\3\2\2\2\u00cd>\3\2\2\2\u00cdP\3\2"+
		"\2\2\u00cdb\3\2\2\2\u00cdt\3\2\2\2\u00cd\u0086\3\2\2\2\u00cd\u0098\3\2"+
		"\2\2\u00cd\u00aa\3\2\2\2\u00cd\u00bc\3\2\2\2\u00ce\5\3\2\2\2\u00cf\u00d0"+
		"\7\4\2\2\u00d0\u00d3\7&\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d4\7&\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\7\31"+
		"\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00de\5\n\6\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u0115\7\32\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e7\7&\2\2\u00e5"+
		"\u00e6\7\t\2\2\u00e6\u00e8\7&\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00eb\7\32\2\2\u00eb"+
		"\u0115\b\4\1\2\u00ec\u00ed\7\4\2\2\u00ed\u00f0\7&\2\2\u00ee\u00ef\7\t"+
		"\2\2\u00ef\u00f1\7&\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f5\3\2\2\2\u00f2\u00f4\5\b\5\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\5\n\6\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7\32\2\2\u00ff\u0115\b\4\1\2\u0100\u0101\7"+
		"\4\2\2\u0101\u0104\7&\2\2\u0102\u0103\7\t\2\2\u0103\u0105\7&\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\7\31"+
		"\2\2\u0107\u0109\5\b\5\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010f\5\n\6\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0115\b\4\1\2\u0114\u00cf\3\2\2\2\u0114\u00e3\3\2\2\2\u0114"+
		"\u00ec\3\2\2\2\u0114\u0100\3\2\2\2\u0115\7\3\2\2\2\u0116\u0117\5\20\t"+
		"\2\u0117\u0118\7&\2\2\u0118\u0119\7\"\2\2\u0119\u0122\3\2\2\2\u011a\u011b"+
		"\5\20\t\2\u011b\u011c\7&\2\2\u011c\u011d\b\5\1\2\u011d\u0122\3\2\2\2\u011e"+
		"\u011f\7&\2\2\u011f\u0120\7\"\2\2\u0120\u0122\b\5\1\2\u0121\u0116\3\2"+
		"\2\2\u0121\u011a\3\2\2\2\u0121\u011e\3\2\2\2\u0122\t\3\2\2\2\u0123\u0124"+
		"\7\5\2\2\u0124\u0125\5\20\t\2\u0125\u0126\7&\2\2\u0126\u0127\5\f\7\2\u0127"+
		"\u0128\5\16\b\2\u0128\u013e\3\2\2\2\u0129\u012a\5\20\t\2\u012a\u012b\7"+
		"&\2\2\u012b\u012c\5\f\7\2\u012c\u012d\b\6\1\2\u012d\u013e\3\2\2\2\u012e"+
		"\u012f\7\5\2\2\u012f\u0130\7&\2\2\u0130\u0131\5\f\7\2\u0131\u0132\b\6"+
		"\1\2\u0132\u013e\3\2\2\2\u0133\u0134\7\5\2\2\u0134\u0135\5\20\t\2\u0135"+
		"\u0136\5\f\7\2\u0136\u0137\b\6\1\2\u0137\u013e\3\2\2\2\u0138\u0139\7\5"+
		"\2\2\u0139\u013a\5\20\t\2\u013a\u013b\7&\2\2\u013b\u013c\b\6\1\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0123\3\2\2\2\u013d\u0129\3\2\2\2\u013d\u012e\3\2"+
		"\2\2\u013d\u0133\3\2\2\2\u013d\u0138\3\2\2\2\u013e\13\3\2\2\2\u013f\u014b"+
		"\7\27\2\2\u0140\u0141\5\20\t\2\u0141\u0148\7&\2\2\u0142\u0143\7\3\2\2"+
		"\u0143\u0144\5\20\t\2\u0144\u0145\7&\2\2\u0145\u0147\3\2\2\2\u0146\u0142"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u018a\7\30\2\2\u014e\u015a\7\27\2\2\u014f"+
		"\u0150\5\20\t\2\u0150\u0157\7&\2\2\u0151\u0152\7\3\2\2\u0152\u0153\5\20"+
		"\t\2\u0153\u0154\7&\2\2\u0154\u0156\3\2\2\2\u0155\u0151\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u014f\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u018a\b\7\1\2\u015d\u015e\5\20\t\2\u015e\u0165\7"+
		"&\2\2\u015f\u0160\7\3\2\2\u0160\u0161\5\20\t\2\u0161\u0162\7&\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u015f\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u015d\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7\30"+
		"\2\2\u016b\u018a\b\7\1\2\u016c\u0177\7\27\2\2\u016d\u0174\7&\2\2\u016e"+
		"\u016f\7\3\2\2\u016f\u0170\5\20\t\2\u0170\u0171\7&\2\2\u0171\u0173\3\2"+
		"\2\2\u0172\u016e\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u016d\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\30\2\2\u017a"+
		"\u018a\b\7\1\2\u017b\u0185\7\27\2\2\u017c\u017d\5\20\t\2\u017d\u0182\7"+
		"&\2\2\u017e\u017f\7\3\2\2\u017f\u0181\7&\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0185\u017c\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\7\30\2\2\u0188\u018a\b\7\1\2\u0189\u013f\3"+
		"\2\2\2\u0189\u014e\3\2\2\2\u0189\u0168\3\2\2\2\u0189\u016c\3\2\2\2\u0189"+
		"\u017b\3\2\2\2\u018a\r\3\2\2\2\u018b\u018f\7\31\2\2\u018c\u018e\5\b\5"+
		"\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0195\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\5\22\n\2"+
		"\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\16\2\2"+
		"\u0199\u019a\5\24\13\2\u019a\u019b\7\"\2\2\u019b\u019c\7\32\2\2\u019c"+
		"\u01b0\3\2\2\2\u019d\u019e\7\31\2\2\u019e\u019f\7\32\2\2\u019f\u01b0\b"+
		"\b\1\2\u01a0\u01a4\7\31\2\2\u01a1\u01a3\5\b\5\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\5\22\n\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\32\2\2\u01ae\u01b0\b\b\1\2\u01af"+
		"\u018b\3\2\2\2\u01af\u019d\3\2\2\2\u01af\u01a0\3\2\2\2\u01b0\17\3\2\2"+
		"\2\u01b1\u01b2\7\23\2\2\u01b2\u01b3\7\33\2\2\u01b3\u01b8\7\34\2\2\u01b4"+
		"\u01b8\7\24\2\2\u01b5\u01b8\7\23\2\2\u01b6\u01b8\7&\2\2\u01b7\u01b1\3"+
		"\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\21\3\2\2\2\u01b9\u01ba\b\n\1\2\u01ba\u01be\7\31\2\2\u01bb\u01bd\5\22"+
		"\n\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u0217\7\32"+
		"\2\2\u01c2\u01c3\7\f\2\2\u01c3\u01c4\7\27\2\2\u01c4\u01c5\5\24\13\2\u01c5"+
		"\u01c6\7\30\2\2\u01c6\u01c7\5\22\n\2\u01c7\u01c8\7\r\2\2\u01c8\u01c9\5"+
		"\22\n\20\u01c9\u0217\3\2\2\2\u01ca\u01cb\7\13\2\2\u01cb\u01cc\7\27\2\2"+
		"\u01cc\u01cd\5\24\13\2\u01cd\u01ce\7\30\2\2\u01ce\u01cf\5\22\n\17\u01cf"+
		"\u0217\3\2\2\2\u01d0\u01d1\7\21\2\2\u01d1\u01d2\7\27\2\2\u01d2\u01d3\5"+
		"\24\13\2\u01d3\u01d4\7\30\2\2\u01d4\u01d5\7\"\2\2\u01d5\u0217\3\2\2\2"+
		"\u01d6\u01d7\7&\2\2\u01d7\u01d8\7\37\2\2\u01d8\u01d9\5\24\13\2\u01d9\u01da"+
		"\7\"\2\2\u01da\u0217\3\2\2\2\u01db\u01dc\7&\2\2\u01dc\u01dd\7\33\2\2\u01dd"+
		"\u01de\5\24\13\2\u01de\u01df\7\34\2\2\u01df\u01e0\7\37\2\2\u01e0\u01e1"+
		"\5\24\13\2\u01e1\u01e2\7\"\2\2\u01e2\u0217\3\2\2\2\u01e3\u01e4\7\f\2\2"+
		"\u01e4\u01e5\7\27\2\2\u01e5\u01e6\5\24\13\2\u01e6\u01e7\7\30\2\2\u01e7"+
		"\u01e8\5\22\n\13\u01e8\u01e9\b\n\1\2\u01e9\u0217\3\2\2\2\u01ea\u01eb\7"+
		"\31\2\2\u01eb\u01ec\7\32\2\2\u01ec\u0217\b\n\1\2\u01ed\u01f1\7\31\2\2"+
		"\u01ee\u01f0\5\22\n\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\7\32\2\2\u01f5\u0217\b\n\1\2\u01f6\u01f7\7&\2\2\u01f7\u01f8\5\24"+
		"\13\2\u01f8\u01f9\7\"\2\2\u01f9\u01fa\b\n\1\2\u01fa\u0217\3\2\2\2\u01fb"+
		"\u01fc\7&\2\2\u01fc\u01fd\7\33\2\2\u01fd\u01fe\5\24\13\2\u01fe\u01ff\7"+
		"\34\2\2\u01ff\u0200\5\24\13\2\u0200\u0201\7\"\2\2\u0201\u0202\b\n\1\2"+
		"\u0202\u0217\3\2\2\2\u0203\u0204\7\21\2\2\u0204\u0205\7\27\2\2\u0205\u0206"+
		"\5\24\13\2\u0206\u0207\7\30\2\2\u0207\u0208\b\n\1\2\u0208\u0217\3\2\2"+
		"\2\u0209\u020a\7&\2\2\u020a\u020b\7\37\2\2\u020b\u020c\5\24\13\2\u020c"+
		"\u020d\b\n\1\2\u020d\u0217\3\2\2\2\u020e\u020f\7&\2\2\u020f\u0210\7\33"+
		"\2\2\u0210\u0211\5\24\13\2\u0211\u0212\7\34\2\2\u0212\u0213\7\37\2\2\u0213"+
		"\u0214\5\24\13\2\u0214\u0215\b\n\1\2\u0215\u0217\3\2\2\2\u0216\u01b9\3"+
		"\2\2\2\u0216\u01c2\3\2\2\2\u0216\u01ca\3\2\2\2\u0216\u01d0\3\2\2\2\u0216"+
		"\u01d6\3\2\2\2\u0216\u01db\3\2\2\2\u0216\u01e3\3\2\2\2\u0216\u01ea\3\2"+
		"\2\2\u0216\u01ed\3\2\2\2\u0216\u01f6\3\2\2\2\u0216\u01fb\3\2\2\2\u0216"+
		"\u0203\3\2\2\2\u0216\u0209\3\2\2\2\u0216\u020e\3\2\2\2\u0217\u021d\3\2"+
		"\2\2\u0218\u0219\f\t\2\2\u0219\u021a\7\32\2\2\u021a\u021c\b\n\1\2\u021b"+
		"\u0218\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\23\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\b\13\1\2\u0221\u0223"+
		"\7$\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u023e\7%\2\2\u0225\u023e\7\26\2\2\u0226\u023e\7&\2\2\u0227\u023e\7\17"+
		"\2\2\u0228\u0229\7\20\2\2\u0229\u022a\7\23\2\2\u022a\u022b\7\33\2\2\u022b"+
		"\u022c\5\24\13\2\u022c\u022d\7\34\2\2\u022d\u023e\3\2\2\2\u022e\u022f"+
		"\7\20\2\2\u022f\u0230\7&\2\2\u0230\u0231\7\27\2\2\u0231\u023e\7\30\2\2"+
		"\u0232\u0233\7\36\2\2\u0233\u023e\5\24\13\b\u0234\u0235\7\27\2\2\u0235"+
		"\u0236\5\24\13\2\u0236\u0237\7\30\2\2\u0237\u023e\3\2\2\2\u0238\u0239"+
		"\7\20\2\2\u0239\u023a\7\23\2\2\u023a\u023b\7\33\2\2\u023b\u023c\7\34\2"+
		"\2\u023c\u023e\b\13\1\2\u023d\u0220\3\2\2\2\u023d\u0225\3\2\2\2\u023d"+
		"\u0226\3\2\2\2\u023d\u0227\3\2\2\2\u023d\u0228\3\2\2\2\u023d\u022e\3\2"+
		"\2\2\u023d\u0232\3\2\2\2\u023d\u0234\3\2\2\2\u023d\u0238\3\2\2\2\u023e"+
		"\u026b\3\2\2\2\u023f\u0240\f\22\2\2\u0240\u0241\t\2\2\2\u0241\u026a\5"+
		"\24\13\23\u0242\u0243\f\6\2\2\u0243\u0244\7 \2\2\u0244\u0245\5\24\13\2"+
		"\u0245\u0246\7!\2\2\u0246\u0247\5\24\13\7\u0247\u026a\3\2\2\2\u0248\u0249"+
		"\f\3\2\2\u0249\u024a\7 \2\2\u024a\u024b\5\24\13\2\u024b\u024c\5\24\13"+
		"\4\u024c\u024d\b\13\1\2\u024d\u026a\3\2\2\2\u024e\u024f\f\21\2\2\u024f"+
		"\u0250\7\33\2\2\u0250\u0251\5\24\13\2\u0251\u0252\7\34\2\2\u0252\u026a"+
		"\3\2\2\2\u0253\u0254\f\20\2\2\u0254\u0255\7\35\2\2\u0255\u026a\7\22\2"+
		"\2\u0256\u0257\f\17\2\2\u0257\u0258\7\35\2\2\u0258\u0259\7&\2\2\u0259"+
		"\u0262\7\27\2\2\u025a\u025f\5\24\13\2\u025b\u025c\7\3\2\2\u025c\u025e"+
		"\5\24\13\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2"+
		"\u025f\u0260\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u025a"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u026a\7\30\2\2"+
		"\u0265\u0266\f\4\2\2\u0266\u0267\7\33\2\2\u0267\u0268\7\34\2\2\u0268\u026a"+
		"\b\13\1\2\u0269\u023f\3\2\2\2\u0269\u0242\3\2\2\2\u0269\u0248\3\2\2\2"+
		"\u0269\u024e\3\2\2\2\u0269\u0253\3\2\2\2\u0269\u0256\3\2\2\2\u0269\u0265"+
		"\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\25\3\2\2\2\u026d\u026b\3\2\2\2.\32$*\u00cd\u00d3\u00d9\u00df\u00e7\u00f0"+
		"\u00f5\u00fb\u0104\u010a\u0110\u0114\u0121\u013d\u0148\u014b\u0157\u015a"+
		"\u0165\u0168\u0174\u0177\u0182\u0185\u0189\u018f\u0195\u01a4\u01aa\u01af"+
		"\u01b7\u01be\u01f1\u0216\u021d\u0222\u023d\u025f\u0262\u0269\u026b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}