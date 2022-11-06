// Generated from C:/Users/p3admin/Downloads/db2automator-master/db2automator-master/src/main/java/com/p3solutions/db2lookExecutor/parser\Db2Look.g4 by ANTLR 4.10.1
package com.p3solutions.db2lookExecutor.parser.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Db2LookParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONNECT=1, TO=2, SUMMARY=3, TYPE=4, SEQUENCE=5, CREATE=6, ALIAS=7, ALTER=8, 
		INDEX=9, LARGE=10, REGULAR=11, SYSTEM=12, USER=13, TEMPORARY=14, TABLESPACE=15, 
		SCHEMA=16, REFRESH=17, TABLE=18, ADD=19, PRIMARY_KEY=20, FOREIGN_KEY=21, 
		DATABASE=22, PARTITION=23, GROUP=24, UNIQUE=25, CHECK=26, GRANT=27, RESET=28, 
		SET=29, TRUSTED_CONTEXT=30, COMMIT=31, TERMINATE=32, BUFFERPOOL=33, STOGROUP=34, 
		OR_REPLACE=35, VIEW=36, PROCEDURE=37, FUNCTION=38, COMMENT=39, TRIGGER=40, 
		BEGIN=41, END=42, CONSTRAINT=43, AUDIT=44, POLICY=45, ROLE=46, LT_BRACKET=47, 
		RT_BRACKET=48, SYMBOL9=49, SLASH=50, SEMI_COLON=51, QUOTATION=52, COMMA=53, 
		SPACE=54, TAB=55, TAB1=56, TAB3=57, CURLY_BRACKET1=58, CURLY_BRACKET2=59, 
		COMMENTS=60, SINGLE_COMMENTS=61, HASH_SKIPPER=62, POINTER_SYMBOL=63, DOT=64, 
		NUMS=65, NUMBER=66, EQUAL=67, OR_OPERATOR=68, LT_SET_BRACKET=69, RT_SET_BRACKET=70, 
		ASTRIEK=71, SMALLER_THAN=72, GREATER_THAN=73, PERCENTAGE=74, PLUS=75, 
		SUB=76, DOLLAR=77, EXCLAMATION=78, WORD=79, DIGIT=80, LOWERCASE=81, UPPERCASE=82, 
		COLON=83, QUESTION_MARK=84;
	public static final int
		RULE_fileHandler = 0, RULE_alterSequence = 1, RULE_tabSpace = 2, RULE_connectStatement = 3, 
		RULE_connectDbQuery = 4, RULE_connectResetQuery = 5, RULE_createDatabasePartitionGroupStatement = 6, 
		RULE_createDbPartitionGroupQuery = 7, RULE_createBufferPoolStatement = 8, 
		RULE_createBufferPoolQuery = 9, RULE_mimicStorageGroupStatement = 10, 
		RULE_mimicStorageGroupQuery = 11, RULE_createTableSpaceStatement = 12, 
		RULE_createTableSpaceQuery = 13, RULE_mimicTableSpaceStatement = 14, RULE_mimicTableSpaceQuery = 15, 
		RULE_createSchemaStatement = 16, RULE_createSchemaQuery = 17, RULE_createTypeStatement = 18, 
		RULE_createTypeQuery = 19, RULE_createSequenceStatement = 20, RULE_createSequenceQuery = 21, 
		RULE_tableSegment = 22, RULE_commentQuery = 23, RULE_createTableQuery = 24, 
		RULE_alterTableAddPrimaryKeyQuery = 25, RULE_refreshTableQuery = 26, RULE_alterTableAddForeignKeyQuery = 27, 
		RULE_alterTableAddUniqueConstraintQuery = 28, RULE_alterTableAddCheckConstraintQuery = 29, 
		RULE_otherAlterQuery = 30, RULE_createIndexQuery = 31, RULE_setStatement = 32, 
		RULE_userDefinedFunctions = 33, RULE_createUDFQuery = 34, RULE_createViewStatement = 35, 
		RULE_createViewQuery = 36, RULE_aliasStatement = 37, RULE_aliasQuery = 38, 
		RULE_createStoredProcedureStatement = 39, RULE_createProcedureQuery = 40, 
		RULE_createTriggerStatement = 41, RULE_createTriggerQuery = 42, RULE_grantStatement = 43, 
		RULE_grantQuery = 44, RULE_terminateStatement = 45, RULE_space = 46, RULE_commitStatement = 47, 
		RULE_trustedContextStatement = 48, RULE_createAuditStatement = 49, RULE_createRoleStatement = 50, 
		RULE_fullNameModel = 51, RULE_databaseName = 52, RULE_schemaName = 53, 
		RULE_tableName = 54, RULE_name = 55, RULE_variable = 56, RULE_handle = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileHandler", "alterSequence", "tabSpace", "connectStatement", "connectDbQuery", 
			"connectResetQuery", "createDatabasePartitionGroupStatement", "createDbPartitionGroupQuery", 
			"createBufferPoolStatement", "createBufferPoolQuery", "mimicStorageGroupStatement", 
			"mimicStorageGroupQuery", "createTableSpaceStatement", "createTableSpaceQuery", 
			"mimicTableSpaceStatement", "mimicTableSpaceQuery", "createSchemaStatement", 
			"createSchemaQuery", "createTypeStatement", "createTypeQuery", "createSequenceStatement", 
			"createSequenceQuery", "tableSegment", "commentQuery", "createTableQuery", 
			"alterTableAddPrimaryKeyQuery", "refreshTableQuery", "alterTableAddForeignKeyQuery", 
			"alterTableAddUniqueConstraintQuery", "alterTableAddCheckConstraintQuery", 
			"otherAlterQuery", "createIndexQuery", "setStatement", "userDefinedFunctions", 
			"createUDFQuery", "createViewStatement", "createViewQuery", "aliasStatement", 
			"aliasQuery", "createStoredProcedureStatement", "createProcedureQuery", 
			"createTriggerStatement", "createTriggerQuery", "grantStatement", "grantQuery", 
			"terminateStatement", "space", "commitStatement", "trustedContextStatement", 
			"createAuditStatement", "createRoleStatement", "fullNameModel", "databaseName", 
			"schemaName", "tableName", "name", "variable", "handle"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'('", 
			"')'", null, null, "';'", null, null, null, null, null, null, null, null, 
			null, null, null, "'=>'", "'.'", null, null, "'='", "'|'", "'['", "']'", 
			"'*'", "'<'", "'>'", "'%'", "'+'", "'-'", "'$'", "'!'", null, null, null, 
			null, "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONNECT", "TO", "SUMMARY", "TYPE", "SEQUENCE", "CREATE", "ALIAS", 
			"ALTER", "INDEX", "LARGE", "REGULAR", "SYSTEM", "USER", "TEMPORARY", 
			"TABLESPACE", "SCHEMA", "REFRESH", "TABLE", "ADD", "PRIMARY_KEY", "FOREIGN_KEY", 
			"DATABASE", "PARTITION", "GROUP", "UNIQUE", "CHECK", "GRANT", "RESET", 
			"SET", "TRUSTED_CONTEXT", "COMMIT", "TERMINATE", "BUFFERPOOL", "STOGROUP", 
			"OR_REPLACE", "VIEW", "PROCEDURE", "FUNCTION", "COMMENT", "TRIGGER", 
			"BEGIN", "END", "CONSTRAINT", "AUDIT", "POLICY", "ROLE", "LT_BRACKET", 
			"RT_BRACKET", "SYMBOL9", "SLASH", "SEMI_COLON", "QUOTATION", "COMMA", 
			"SPACE", "TAB", "TAB1", "TAB3", "CURLY_BRACKET1", "CURLY_BRACKET2", "COMMENTS", 
			"SINGLE_COMMENTS", "HASH_SKIPPER", "POINTER_SYMBOL", "DOT", "NUMS", "NUMBER", 
			"EQUAL", "OR_OPERATOR", "LT_SET_BRACKET", "RT_SET_BRACKET", "ASTRIEK", 
			"SMALLER_THAN", "GREATER_THAN", "PERCENTAGE", "PLUS", "SUB", "DOLLAR", 
			"EXCLAMATION", "WORD", "DIGIT", "LOWERCASE", "UPPERCASE", "COLON", "QUESTION_MARK"
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
	public String getGrammarFileName() { return "Db2Look.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Db2LookParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileHandlerContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Db2LookParser.EOF, 0); }
		public CommitStatementContext commitStatement() {
			return getRuleContext(CommitStatementContext.class,0);
		}
		public List<ConnectResetQueryContext> connectResetQuery() {
			return getRuleContexts(ConnectResetQueryContext.class);
		}
		public ConnectResetQueryContext connectResetQuery(int i) {
			return getRuleContext(ConnectResetQueryContext.class,i);
		}
		public TerminateStatementContext terminateStatement() {
			return getRuleContext(TerminateStatementContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<ConnectStatementContext> connectStatement() {
			return getRuleContexts(ConnectStatementContext.class);
		}
		public ConnectStatementContext connectStatement(int i) {
			return getRuleContext(ConnectStatementContext.class,i);
		}
		public List<CreateDatabasePartitionGroupStatementContext> createDatabasePartitionGroupStatement() {
			return getRuleContexts(CreateDatabasePartitionGroupStatementContext.class);
		}
		public CreateDatabasePartitionGroupStatementContext createDatabasePartitionGroupStatement(int i) {
			return getRuleContext(CreateDatabasePartitionGroupStatementContext.class,i);
		}
		public List<CreateBufferPoolStatementContext> createBufferPoolStatement() {
			return getRuleContexts(CreateBufferPoolStatementContext.class);
		}
		public CreateBufferPoolStatementContext createBufferPoolStatement(int i) {
			return getRuleContext(CreateBufferPoolStatementContext.class,i);
		}
		public List<MimicStorageGroupStatementContext> mimicStorageGroupStatement() {
			return getRuleContexts(MimicStorageGroupStatementContext.class);
		}
		public MimicStorageGroupStatementContext mimicStorageGroupStatement(int i) {
			return getRuleContext(MimicStorageGroupStatementContext.class,i);
		}
		public List<CreateTableSpaceStatementContext> createTableSpaceStatement() {
			return getRuleContexts(CreateTableSpaceStatementContext.class);
		}
		public CreateTableSpaceStatementContext createTableSpaceStatement(int i) {
			return getRuleContext(CreateTableSpaceStatementContext.class,i);
		}
		public List<MimicTableSpaceStatementContext> mimicTableSpaceStatement() {
			return getRuleContexts(MimicTableSpaceStatementContext.class);
		}
		public MimicTableSpaceStatementContext mimicTableSpaceStatement(int i) {
			return getRuleContext(MimicTableSpaceStatementContext.class,i);
		}
		public List<CreateRoleStatementContext> createRoleStatement() {
			return getRuleContexts(CreateRoleStatementContext.class);
		}
		public CreateRoleStatementContext createRoleStatement(int i) {
			return getRuleContext(CreateRoleStatementContext.class,i);
		}
		public List<CreateSchemaStatementContext> createSchemaStatement() {
			return getRuleContexts(CreateSchemaStatementContext.class);
		}
		public CreateSchemaStatementContext createSchemaStatement(int i) {
			return getRuleContext(CreateSchemaStatementContext.class,i);
		}
		public List<CreateTypeStatementContext> createTypeStatement() {
			return getRuleContexts(CreateTypeStatementContext.class);
		}
		public CreateTypeStatementContext createTypeStatement(int i) {
			return getRuleContext(CreateTypeStatementContext.class,i);
		}
		public List<CreateSequenceStatementContext> createSequenceStatement() {
			return getRuleContexts(CreateSequenceStatementContext.class);
		}
		public CreateSequenceStatementContext createSequenceStatement(int i) {
			return getRuleContext(CreateSequenceStatementContext.class,i);
		}
		public List<AlterSequenceContext> alterSequence() {
			return getRuleContexts(AlterSequenceContext.class);
		}
		public AlterSequenceContext alterSequence(int i) {
			return getRuleContext(AlterSequenceContext.class,i);
		}
		public List<AlterTableAddForeignKeyQueryContext> alterTableAddForeignKeyQuery() {
			return getRuleContexts(AlterTableAddForeignKeyQueryContext.class);
		}
		public AlterTableAddForeignKeyQueryContext alterTableAddForeignKeyQuery(int i) {
			return getRuleContext(AlterTableAddForeignKeyQueryContext.class,i);
		}
		public List<UserDefinedFunctionsContext> userDefinedFunctions() {
			return getRuleContexts(UserDefinedFunctionsContext.class);
		}
		public UserDefinedFunctionsContext userDefinedFunctions(int i) {
			return getRuleContext(UserDefinedFunctionsContext.class,i);
		}
		public List<CreateViewStatementContext> createViewStatement() {
			return getRuleContexts(CreateViewStatementContext.class);
		}
		public CreateViewStatementContext createViewStatement(int i) {
			return getRuleContext(CreateViewStatementContext.class,i);
		}
		public List<AliasStatementContext> aliasStatement() {
			return getRuleContexts(AliasStatementContext.class);
		}
		public AliasStatementContext aliasStatement(int i) {
			return getRuleContext(AliasStatementContext.class,i);
		}
		public List<TableSegmentContext> tableSegment() {
			return getRuleContexts(TableSegmentContext.class);
		}
		public TableSegmentContext tableSegment(int i) {
			return getRuleContext(TableSegmentContext.class,i);
		}
		public List<CreateStoredProcedureStatementContext> createStoredProcedureStatement() {
			return getRuleContexts(CreateStoredProcedureStatementContext.class);
		}
		public CreateStoredProcedureStatementContext createStoredProcedureStatement(int i) {
			return getRuleContext(CreateStoredProcedureStatementContext.class,i);
		}
		public List<CreateTriggerStatementContext> createTriggerStatement() {
			return getRuleContexts(CreateTriggerStatementContext.class);
		}
		public CreateTriggerStatementContext createTriggerStatement(int i) {
			return getRuleContext(CreateTriggerStatementContext.class,i);
		}
		public List<CreateAuditStatementContext> createAuditStatement() {
			return getRuleContexts(CreateAuditStatementContext.class);
		}
		public CreateAuditStatementContext createAuditStatement(int i) {
			return getRuleContext(CreateAuditStatementContext.class,i);
		}
		public List<TrustedContextStatementContext> trustedContextStatement() {
			return getRuleContexts(TrustedContextStatementContext.class);
		}
		public TrustedContextStatementContext trustedContextStatement(int i) {
			return getRuleContext(TrustedContextStatementContext.class,i);
		}
		public List<GrantStatementContext> grantStatement() {
			return getRuleContexts(GrantStatementContext.class);
		}
		public GrantStatementContext grantStatement(int i) {
			return getRuleContext(GrantStatementContext.class,i);
		}
		public List<AlterTableAddCheckConstraintQueryContext> alterTableAddCheckConstraintQuery() {
			return getRuleContexts(AlterTableAddCheckConstraintQueryContext.class);
		}
		public AlterTableAddCheckConstraintQueryContext alterTableAddCheckConstraintQuery(int i) {
			return getRuleContext(AlterTableAddCheckConstraintQueryContext.class,i);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public FileHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterFileHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitFileHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitFileHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileHandlerContext fileHandler() throws RecognitionException {
		FileHandlerContext _localctx = new FileHandlerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fileHandler);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					tabSpace();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(122);
							tabSpace();
							}
							} 
						}
						setState(127);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(128);
						connectStatement();
						}
						break;
					case 2:
						{
						setState(129);
						createDatabasePartitionGroupStatement();
						}
						break;
					case 3:
						{
						setState(130);
						createBufferPoolStatement();
						}
						break;
					case 4:
						{
						setState(131);
						mimicStorageGroupStatement();
						}
						break;
					case 5:
						{
						setState(132);
						createTableSpaceStatement();
						}
						break;
					case 6:
						{
						setState(133);
						mimicTableSpaceStatement();
						}
						break;
					case 7:
						{
						setState(134);
						createRoleStatement();
						}
						break;
					case 8:
						{
						setState(135);
						createSchemaStatement();
						}
						break;
					case 9:
						{
						setState(136);
						createTypeStatement();
						}
						break;
					case 10:
						{
						setState(137);
						createSequenceStatement();
						}
						break;
					case 11:
						{
						setState(138);
						alterSequence();
						}
						break;
					case 12:
						{
						setState(139);
						alterTableAddForeignKeyQuery();
						}
						break;
					case 13:
						{
						{
						setState(149);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(143);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(140);
										tabSpace();
										}
										} 
									}
									setState(145);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
								}
								setState(146);
								setStatement();
								}
								} 
							}
							setState(151);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						}
						{
						setState(152);
						alterTableAddCheckConstraintQuery();
						}
						}
						}
						break;
					case 14:
						{
						setState(153);
						userDefinedFunctions();
						}
						break;
					case 15:
						{
						setState(154);
						createViewStatement();
						}
						break;
					case 16:
						{
						setState(155);
						aliasStatement();
						}
						break;
					case 17:
						{
						setState(156);
						tableSegment();
						}
						break;
					case 18:
						{
						setState(157);
						createStoredProcedureStatement();
						}
						break;
					case 19:
						{
						setState(158);
						createTriggerStatement();
						}
						break;
					case 20:
						{
						setState(159);
						createAuditStatement();
						}
						break;
					case 21:
						{
						setState(160);
						trustedContextStatement();
						}
						break;
					case 22:
						{
						setState(161);
						connectResetQuery();
						}
						break;
					case 23:
						{
						setState(162);
						grantStatement();
						}
						break;
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(165);
							tabSpace();
							}
							} 
						}
						setState(170);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					tabSpace();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(182);
			commitStatement();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					tabSpace();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(189);
			connectResetQuery();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					tabSpace();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(196);
			terminateStatement();
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(198);
				tabSpace();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(EOF);
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

	public static class AlterSequenceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode SEQUENCE() { return getToken(Db2LookParser.SEQUENCE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AlterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSequenceContext alterSequence() throws RecognitionException {
		AlterSequenceContext _localctx = new AlterSequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alterSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(206);
				tabSpace();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(ALTER);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				tabSpace();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(218);
			match(SEQUENCE);
			setState(220); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(219);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(224);
			fullNameModel();
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(230);
			match(SEMI_COLON);
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

	public static class TabSpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(Db2LookParser.SPACE, 0); }
		public TerminalNode TAB() { return getToken(Db2LookParser.TAB, 0); }
		public TerminalNode TAB1() { return getToken(Db2LookParser.TAB1, 0); }
		public TerminalNode TAB3() { return getToken(Db2LookParser.TAB3, 0); }
		public TabSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTabSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTabSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTabSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabSpaceContext tabSpace() throws RecognitionException {
		TabSpaceContext _localctx = new TabSpaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tabSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ConnectStatementContext extends ParserRuleContext {
		public ConnectDbQueryContext connectDbQuery() {
			return getRuleContext(ConnectDbQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public ConnectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterConnectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitConnectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitConnectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectStatementContext connectStatement() throws RecognitionException {
		ConnectStatementContext _localctx = new ConnectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(234);
				tabSpace();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			connectDbQuery();
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

	public static class ConnectDbQueryContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(Db2LookParser.CONNECT, 0); }
		public TerminalNode TO() { return getToken(Db2LookParser.TO, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public ConnectDbQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectDbQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterConnectDbQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitConnectDbQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitConnectDbQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectDbQueryContext connectDbQuery() throws RecognitionException {
		ConnectDbQueryContext _localctx = new ConnectDbQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connectDbQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			match(CONNECT);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				tabSpace();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(248);
			match(TO);
			setState(250); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(249);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(254);
			fullNameModel();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(255);
				tabSpace();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(SEMI_COLON);
			}
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

	public static class ConnectResetQueryContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(Db2LookParser.CONNECT, 0); }
		public TerminalNode RESET() { return getToken(Db2LookParser.RESET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public ConnectResetQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectResetQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterConnectResetQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitConnectResetQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitConnectResetQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectResetQueryContext connectResetQuery() throws RecognitionException {
		ConnectResetQueryContext _localctx = new ConnectResetQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_connectResetQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(263);
				tabSpace();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(269);
			match(CONNECT);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(270);
				tabSpace();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(RESET);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(277);
				tabSpace();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(SEMI_COLON);
			}
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

	public static class CreateDatabasePartitionGroupStatementContext extends ParserRuleContext {
		public CreateDbPartitionGroupQueryContext createDbPartitionGroupQuery() {
			return getRuleContext(CreateDbPartitionGroupQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateDatabasePartitionGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabasePartitionGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateDatabasePartitionGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateDatabasePartitionGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateDatabasePartitionGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabasePartitionGroupStatementContext createDatabasePartitionGroupStatement() throws RecognitionException {
		CreateDatabasePartitionGroupStatementContext _localctx = new CreateDatabasePartitionGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createDatabasePartitionGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(285);
				tabSpace();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			createDbPartitionGroupQuery();
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

	public static class CreateDbPartitionGroupQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(Db2LookParser.DATABASE, 0); }
		public TerminalNode PARTITION() { return getToken(Db2LookParser.PARTITION, 0); }
		public TerminalNode GROUP() { return getToken(Db2LookParser.GROUP, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateDbPartitionGroupQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDbPartitionGroupQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateDbPartitionGroupQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateDbPartitionGroupQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateDbPartitionGroupQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDbPartitionGroupQueryContext createDbPartitionGroupQuery() throws RecognitionException {
		CreateDbPartitionGroupQueryContext _localctx = new CreateDbPartitionGroupQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createDbPartitionGroupQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(CREATE);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				tabSpace();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(299);
			match(DATABASE);
			setState(301); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				tabSpace();
				}
				}
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(305);
			match(PARTITION);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				tabSpace();
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(311);
			match(GROUP);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(317);
			match(SEMI_COLON);
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

	public static class CreateBufferPoolStatementContext extends ParserRuleContext {
		public CreateBufferPoolQueryContext createBufferPoolQuery() {
			return getRuleContext(CreateBufferPoolQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateBufferPoolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBufferPoolStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateBufferPoolStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateBufferPoolStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateBufferPoolStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateBufferPoolStatementContext createBufferPoolStatement() throws RecognitionException {
		CreateBufferPoolStatementContext _localctx = new CreateBufferPoolStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createBufferPoolStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(319);
				tabSpace();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			createBufferPoolQuery();
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

	public static class CreateBufferPoolQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode BUFFERPOOL() { return getToken(Db2LookParser.BUFFERPOOL, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateBufferPoolQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBufferPoolQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateBufferPoolQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateBufferPoolQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateBufferPoolQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateBufferPoolQueryContext createBufferPoolQuery() throws RecognitionException {
		CreateBufferPoolQueryContext _localctx = new CreateBufferPoolQueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createBufferPoolQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CREATE);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				tabSpace();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(333);
			match(BUFFERPOOL);
			setState(335); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(334);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(337); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(339);
			fullNameModel();
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(345);
			match(SEMI_COLON);
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

	public static class MimicStorageGroupStatementContext extends ParserRuleContext {
		public MimicStorageGroupQueryContext mimicStorageGroupQuery() {
			return getRuleContext(MimicStorageGroupQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicStorageGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicStorageGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicStorageGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicStorageGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicStorageGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicStorageGroupStatementContext mimicStorageGroupStatement() throws RecognitionException {
		MimicStorageGroupStatementContext _localctx = new MimicStorageGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mimicStorageGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(347);
				tabSpace();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			mimicStorageGroupQuery();
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

	public static class MimicStorageGroupQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode STOGROUP() { return getToken(Db2LookParser.STOGROUP, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicStorageGroupQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicStorageGroupQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicStorageGroupQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicStorageGroupQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicStorageGroupQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicStorageGroupQueryContext mimicStorageGroupQuery() throws RecognitionException {
		MimicStorageGroupQueryContext _localctx = new MimicStorageGroupQueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mimicStorageGroupQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ALTER);
			setState(357); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(356);
				tabSpace();
				}
				}
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(361);
			match(STOGROUP);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(362);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(SEMI_COLON);
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

	public static class CreateTableSpaceStatementContext extends ParserRuleContext {
		public CreateTableSpaceQueryContext createTableSpaceQuery() {
			return getRuleContext(CreateTableSpaceQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTableSpaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTableSpaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTableSpaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTableSpaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpaceStatementContext createTableSpaceStatement() throws RecognitionException {
		CreateTableSpaceStatementContext _localctx = new CreateTableSpaceStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createTableSpaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(370);
				tabSpace();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			createTableSpaceQuery();
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

	public static class CreateTableSpaceQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public List<TerminalNode> TABLESPACE() { return getTokens(Db2LookParser.TABLESPACE); }
		public TerminalNode TABLESPACE(int i) {
			return getToken(Db2LookParser.TABLESPACE, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public TerminalNode REGULAR() { return getToken(Db2LookParser.REGULAR, 0); }
		public TerminalNode LARGE() { return getToken(Db2LookParser.LARGE, 0); }
		public TerminalNode TEMPORARY() { return getToken(Db2LookParser.TEMPORARY, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode USER() { return getToken(Db2LookParser.USER, 0); }
		public CreateTableSpaceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpaceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTableSpaceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTableSpaceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTableSpaceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpaceQueryContext createTableSpaceQuery() throws RecognitionException {
		CreateTableSpaceQueryContext _localctx = new CreateTableSpaceQueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createTableSpaceQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(CREATE);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(379);
					tabSpace();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USER) {
				{
				setState(385);
				match(USER);
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(388);
				tabSpace();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LARGE) | (1L << REGULAR) | (1L << TEMPORARY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					tabSpace();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TABLESPACE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(406);
			match(TABLESPACE);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(412);
			match(SEMI_COLON);
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

	public static class MimicTableSpaceStatementContext extends ParserRuleContext {
		public MimicTableSpaceQueryContext mimicTableSpaceQuery() {
			return getRuleContext(MimicTableSpaceQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicTableSpaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicTableSpaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicTableSpaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicTableSpaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicTableSpaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicTableSpaceStatementContext mimicTableSpaceStatement() throws RecognitionException {
		MimicTableSpaceStatementContext _localctx = new MimicTableSpaceStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mimicTableSpaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(414);
				tabSpace();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			mimicTableSpaceQuery();
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

	public static class MimicTableSpaceQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLESPACE() { return getToken(Db2LookParser.TABLESPACE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public MimicTableSpaceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mimicTableSpaceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterMimicTableSpaceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitMimicTableSpaceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitMimicTableSpaceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MimicTableSpaceQueryContext mimicTableSpaceQuery() throws RecognitionException {
		MimicTableSpaceQueryContext _localctx = new MimicTableSpaceQueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mimicTableSpaceQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(ALTER);
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(423);
				tabSpace();
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(428);
			match(TABLESPACE);
			setState(430); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(429);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(434);
			match(SEMI_COLON);
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

	public static class CreateSchemaStatementContext extends ParserRuleContext {
		public CreateSchemaQueryContext createSchemaQuery() {
			return getRuleContext(CreateSchemaQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSchemaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSchemaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSchemaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSchemaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSchemaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSchemaStatementContext createSchemaStatement() throws RecognitionException {
		CreateSchemaStatementContext _localctx = new CreateSchemaStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_createSchemaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(436);
				tabSpace();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			createSchemaQuery();
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

	public static class CreateSchemaQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(Db2LookParser.SCHEMA, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSchemaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSchemaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSchemaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSchemaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSchemaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSchemaQueryContext createSchemaQuery() throws RecognitionException {
		CreateSchemaQueryContext _localctx = new CreateSchemaQueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_createSchemaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(CREATE);
			setState(446); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(445);
				tabSpace();
				}
				}
				setState(448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(450);
			match(SCHEMA);
			setState(452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(451);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(456);
			match(SEMI_COLON);
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

	public static class CreateTypeStatementContext extends ParserRuleContext {
		public CreateTypeQueryContext createTypeQuery() {
			return getRuleContext(CreateTypeQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeStatementContext createTypeStatement() throws RecognitionException {
		CreateTypeStatementContext _localctx = new CreateTypeStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_createTypeStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(458);
							tabSpace();
							}
							} 
						}
						setState(463);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					}
					setState(464);
					setStatement();
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(470);
				tabSpace();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			createTypeQuery();
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

	public static class CreateTypeQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(Db2LookParser.TYPE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTypeQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTypeQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTypeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTypeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTypeQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTypeQueryContext createTypeQuery() throws RecognitionException {
		CreateTypeQueryContext _localctx = new CreateTypeQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_createTypeQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(CREATE);
			setState(480); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(479);
				tabSpace();
				}
				}
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(484);
			match(TYPE);
			setState(486); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(485);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(490);
			fullNameModel();
			setState(492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(496);
			match(SEMI_COLON);
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

	public static class CreateSequenceStatementContext extends ParserRuleContext {
		public CreateSequenceQueryContext createSequenceQuery() {
			return getRuleContext(CreateSequenceQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSequenceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequenceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSequenceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSequenceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSequenceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSequenceStatementContext createSequenceStatement() throws RecognitionException {
		CreateSequenceStatementContext _localctx = new CreateSequenceStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_createSequenceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(498);
				tabSpace();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			createSequenceQuery();
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

	public static class CreateSequenceQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(Db2LookParser.SEQUENCE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateSequenceQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequenceQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateSequenceQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateSequenceQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateSequenceQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSequenceQueryContext createSequenceQuery() throws RecognitionException {
		CreateSequenceQueryContext _localctx = new CreateSequenceQueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_createSequenceQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(CREATE);
			setState(508); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(507);
				tabSpace();
				}
				}
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(512);
			match(SEQUENCE);
			setState(514); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(513);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(516); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(518);
			fullNameModel();
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(524);
			match(SEMI_COLON);
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

	public static class TableSegmentContext extends ParserRuleContext {
		public CreateTableQueryContext createTableQuery() {
			return getRuleContext(CreateTableQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<CommentQueryContext> commentQuery() {
			return getRuleContexts(CommentQueryContext.class);
		}
		public CommentQueryContext commentQuery(int i) {
			return getRuleContext(CommentQueryContext.class,i);
		}
		public List<AlterTableAddPrimaryKeyQueryContext> alterTableAddPrimaryKeyQuery() {
			return getRuleContexts(AlterTableAddPrimaryKeyQueryContext.class);
		}
		public AlterTableAddPrimaryKeyQueryContext alterTableAddPrimaryKeyQuery(int i) {
			return getRuleContext(AlterTableAddPrimaryKeyQueryContext.class,i);
		}
		public List<RefreshTableQueryContext> refreshTableQuery() {
			return getRuleContexts(RefreshTableQueryContext.class);
		}
		public RefreshTableQueryContext refreshTableQuery(int i) {
			return getRuleContext(RefreshTableQueryContext.class,i);
		}
		public List<AlterTableAddUniqueConstraintQueryContext> alterTableAddUniqueConstraintQuery() {
			return getRuleContexts(AlterTableAddUniqueConstraintQueryContext.class);
		}
		public AlterTableAddUniqueConstraintQueryContext alterTableAddUniqueConstraintQuery(int i) {
			return getRuleContext(AlterTableAddUniqueConstraintQueryContext.class,i);
		}
		public List<OtherAlterQueryContext> otherAlterQuery() {
			return getRuleContexts(OtherAlterQueryContext.class);
		}
		public OtherAlterQueryContext otherAlterQuery(int i) {
			return getRuleContext(OtherAlterQueryContext.class,i);
		}
		public List<CreateIndexQueryContext> createIndexQuery() {
			return getRuleContexts(CreateIndexQueryContext.class);
		}
		public CreateIndexQueryContext createIndexQuery(int i) {
			return getRuleContext(CreateIndexQueryContext.class,i);
		}
		public TableSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTableSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTableSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTableSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSegmentContext tableSegment() throws RecognitionException {
		TableSegmentContext _localctx = new TableSegmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableSegment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					tabSpace();
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(532);
							tabSpace();
							}
							} 
						}
						setState(537);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					}
					setState(538);
					setStatement();
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(544);
				tabSpace();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			createTableQuery();
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(551);
							tabSpace();
							}
							} 
						}
						setState(556);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					}
					setState(581);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(557);
						commentQuery();
						}
						break;
					case 2:
						{
						setState(558);
						alterTableAddPrimaryKeyQuery();
						}
						break;
					case 3:
						{
						setState(559);
						refreshTableQuery();
						}
						break;
					case 4:
						{
						setState(560);
						alterTableAddUniqueConstraintQuery();
						}
						break;
					case 5:
						{
						setState(561);
						otherAlterQuery();
						}
						break;
					case 6:
						{
						{
						setState(571);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(565);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(562);
										tabSpace();
										}
										} 
									}
									setState(567);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
								}
								setState(568);
								setStatement();
								}
								} 
							}
							setState(573);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						}
						setState(577);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
							{
							{
							setState(574);
							tabSpace();
							}
							}
							setState(579);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(580);
						createIndexQuery();
						}
						}
						break;
					}
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
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

	public static class CommentQueryContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(Db2LookParser.COMMENT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public CommentQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCommentQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCommentQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCommentQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentQueryContext commentQuery() throws RecognitionException {
		CommentQueryContext _localctx = new CommentQueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_commentQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(COMMENT);
			setState(590); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(589);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(594);
			match(SEMI_COLON);
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

	public static class CreateTableQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode SUMMARY() { return getToken(Db2LookParser.SUMMARY, 0); }
		public List<TerminalNode> ALTER() { return getTokens(Db2LookParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(Db2LookParser.ALTER, i);
		}
		public CreateTableQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTableQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTableQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTableQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableQueryContext createTableQuery() throws RecognitionException {
		CreateTableQueryContext _localctx = new CreateTableQueryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_createTableQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(CREATE);
			setState(598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(597);
				tabSpace();
				}
				}
				setState(600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUMMARY) {
				{
				setState(602);
				match(SUMMARY);
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(603);
					tabSpace();
					}
					}
					setState(606); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				}
			}

			setState(610);
			match(TABLE);
			setState(612); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(611);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==ALTER || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(614); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(616);
			match(SEMI_COLON);
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

	public static class AlterTableAddPrimaryKeyQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode PRIMARY_KEY() { return getToken(Db2LookParser.PRIMARY_KEY, 0); }
		public TerminalNode LT_BRACKET() { return getToken(Db2LookParser.LT_BRACKET, 0); }
		public List<TerminalNode> RT_BRACKET() { return getTokens(Db2LookParser.RT_BRACKET); }
		public TerminalNode RT_BRACKET(int i) {
			return getToken(Db2LookParser.RT_BRACKET, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public AlterTableAddPrimaryKeyQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddPrimaryKeyQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddPrimaryKeyQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddPrimaryKeyQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddPrimaryKeyQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddPrimaryKeyQueryContext alterTableAddPrimaryKeyQuery() throws RecognitionException {
		AlterTableAddPrimaryKeyQueryContext _localctx = new AlterTableAddPrimaryKeyQueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alterTableAddPrimaryKeyQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(ALTER);
			setState(620); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(619);
				tabSpace();
				}
				}
				setState(622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(624);
			match(TABLE);
			setState(626); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(625);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(628); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(630);
			fullNameModel();
			setState(632); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(631);
				tabSpace();
				}
				}
				setState(634); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(636);
			match(ADD);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(637);
					tabSpace();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(643);
				match(CONSTRAINT);
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(644);
						tabSpace();
						}
						} 
					}
					setState(649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(650);
				fullNameModel();
				}
				break;
			}
			setState(654); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(653);
				tabSpace();
				}
				}
				setState(656); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(658);
			match(PRIMARY_KEY);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(659);
				tabSpace();
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			match(LT_BRACKET);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(666);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RT_BRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			match(RT_BRACKET);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(673);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(SEMI_COLON);
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

	public static class RefreshTableQueryContext extends ParserRuleContext {
		public TerminalNode REFRESH() { return getToken(Db2LookParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public RefreshTableQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshTableQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterRefreshTableQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitRefreshTableQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitRefreshTableQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshTableQueryContext refreshTableQuery() throws RecognitionException {
		RefreshTableQueryContext _localctx = new RefreshTableQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_refreshTableQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(REFRESH);
			setState(683); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(682);
				tabSpace();
				}
				}
				setState(685); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(687);
			match(TABLE);
			setState(689); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(688);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(691); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(693);
			match(SEMI_COLON);
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

	public static class AlterTableAddForeignKeyQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public TerminalNode FOREIGN_KEY() { return getToken(Db2LookParser.FOREIGN_KEY, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AlterTableAddForeignKeyQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddForeignKeyQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddForeignKeyQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddForeignKeyQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddForeignKeyQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddForeignKeyQueryContext alterTableAddForeignKeyQuery() throws RecognitionException {
		AlterTableAddForeignKeyQueryContext _localctx = new AlterTableAddForeignKeyQueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alterTableAddForeignKeyQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(695);
				tabSpace();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(ALTER);
			setState(703); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(702);
				tabSpace();
				}
				}
				setState(705); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(707);
			match(TABLE);
			setState(709); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(708);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(711); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(713);
			fullNameModel();
			setState(715); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(714);
				tabSpace();
				}
				}
				setState(717); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(719);
			match(ADD);
			setState(721); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(720);
				tabSpace();
				}
				}
				setState(723); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(725);
			match(CONSTRAINT);
			setState(727); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(726);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(729); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(731);
			fullNameModel();
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(732);
				tabSpace();
				}
				}
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(738);
			match(FOREIGN_KEY);
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(739);
					tabSpace();
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(746); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(745);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(748); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(750);
			match(SEMI_COLON);
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

	public static class AlterTableAddUniqueConstraintQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode UNIQUE() { return getToken(Db2LookParser.UNIQUE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public AlterTableAddUniqueConstraintQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddUniqueConstraintQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddUniqueConstraintQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddUniqueConstraintQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddUniqueConstraintQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddUniqueConstraintQueryContext alterTableAddUniqueConstraintQuery() throws RecognitionException {
		AlterTableAddUniqueConstraintQueryContext _localctx = new AlterTableAddUniqueConstraintQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alterTableAddUniqueConstraintQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(ALTER);
			setState(754); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(753);
				tabSpace();
				}
				}
				setState(756); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(758);
			match(TABLE);
			setState(760); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(759);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(762); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(764);
			fullNameModel();
			setState(766); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(765);
				tabSpace();
				}
				}
				setState(768); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(770);
			match(ADD);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(772); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(771);
					tabSpace();
					}
					}
					setState(774); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				setState(776);
				match(CONSTRAINT);
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(777);
						tabSpace();
						}
						} 
					}
					setState(782);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(783);
				fullNameModel();
				}
				break;
			}
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(787);
				tabSpace();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
			match(UNIQUE);
			setState(795); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(794);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(797); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(799);
			match(SEMI_COLON);
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

	public static class AlterTableAddCheckConstraintQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public List<FullNameModelContext> fullNameModel() {
			return getRuleContexts(FullNameModelContext.class);
		}
		public FullNameModelContext fullNameModel(int i) {
			return getRuleContext(FullNameModelContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Db2LookParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(Db2LookParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(Db2LookParser.CHECK, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> CREATE() { return getTokens(Db2LookParser.CREATE); }
		public TerminalNode CREATE(int i) {
			return getToken(Db2LookParser.CREATE, i);
		}
		public AlterTableAddCheckConstraintQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAddCheckConstraintQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterTableAddCheckConstraintQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterTableAddCheckConstraintQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterTableAddCheckConstraintQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableAddCheckConstraintQueryContext alterTableAddCheckConstraintQuery() throws RecognitionException {
		AlterTableAddCheckConstraintQueryContext _localctx = new AlterTableAddCheckConstraintQueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alterTableAddCheckConstraintQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(801);
				tabSpace();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
			match(ALTER);
			setState(809); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(808);
				tabSpace();
				}
				}
				setState(811); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(813);
			match(TABLE);
			setState(815); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(814);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(817); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(819);
			fullNameModel();
			setState(821); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(820);
				tabSpace();
				}
				}
				setState(823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(825);
			match(ADD);
			setState(827); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(826);
				tabSpace();
				}
				}
				setState(829); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(831);
			match(CONSTRAINT);
			setState(835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(832);
					tabSpace();
					}
					} 
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(838);
			fullNameModel();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(839);
				tabSpace();
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			match(CHECK);
			setState(847); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(846);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CREATE || _la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(849); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(851);
			match(SEMI_COLON);
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

	public static class OtherAlterQueryContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(Db2LookParser.TABLE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<TerminalNode> PRIMARY_KEY() { return getTokens(Db2LookParser.PRIMARY_KEY); }
		public TerminalNode PRIMARY_KEY(int i) {
			return getToken(Db2LookParser.PRIMARY_KEY, i);
		}
		public List<TerminalNode> FOREIGN_KEY() { return getTokens(Db2LookParser.FOREIGN_KEY); }
		public TerminalNode FOREIGN_KEY(int i) {
			return getToken(Db2LookParser.FOREIGN_KEY, i);
		}
		public List<TerminalNode> CHECK() { return getTokens(Db2LookParser.CHECK); }
		public TerminalNode CHECK(int i) {
			return getToken(Db2LookParser.CHECK, i);
		}
		public List<TerminalNode> UNIQUE() { return getTokens(Db2LookParser.UNIQUE); }
		public TerminalNode UNIQUE(int i) {
			return getToken(Db2LookParser.UNIQUE, i);
		}
		public OtherAlterQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherAlterQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterOtherAlterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitOtherAlterQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitOtherAlterQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherAlterQueryContext otherAlterQuery() throws RecognitionException {
		OtherAlterQueryContext _localctx = new OtherAlterQueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_otherAlterQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(853);
				tabSpace();
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			match(ALTER);
			setState(861); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(860);
				tabSpace();
				}
				}
				setState(863); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(865);
			match(TABLE);
			setState(867); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(866);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(869); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(871);
			fullNameModel();
			setState(873); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(872);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(875); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(878); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(877);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << UNIQUE) | (1L << CHECK) | (1L << SEMI_COLON))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(880); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(882);
			match(SEMI_COLON);
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

	public static class CreateIndexQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(Db2LookParser.INDEX, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode UNIQUE() { return getToken(Db2LookParser.UNIQUE, 0); }
		public CreateIndexQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateIndexQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateIndexQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateIndexQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexQueryContext createIndexQuery() throws RecognitionException {
		CreateIndexQueryContext _localctx = new CreateIndexQueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_createIndexQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(CREATE);
			setState(886); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(885);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(888); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(890);
					match(UNIQUE);
					}
				}

				setState(894); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(893);
					tabSpace();
					}
					}
					setState(896); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				}
			}

			setState(900);
			match(INDEX);
			setState(902); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(901);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(904); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(906);
			fullNameModel();
			setState(908); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(907);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(912);
			match(SEMI_COLON);
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

	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(Db2LookParser.SET, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_setStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(914);
				tabSpace();
				}
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(920);
			match(SET);
			setState(922); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(921);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(924); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(926);
			match(SEMI_COLON);
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

	public static class UserDefinedFunctionsContext extends ParserRuleContext {
		public CreateUDFQueryContext createUDFQuery() {
			return getRuleContext(CreateUDFQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public UserDefinedFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterUserDefinedFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitUserDefinedFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitUserDefinedFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserDefinedFunctionsContext userDefinedFunctions() throws RecognitionException {
		UserDefinedFunctionsContext _localctx = new UserDefinedFunctionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_userDefinedFunctions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(931);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(928);
							tabSpace();
							}
							} 
						}
						setState(933);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
					}
					setState(934);
					setStatement();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(940);
				tabSpace();
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(946);
			createUDFQuery();
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

	public static class CreateUDFQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(Db2LookParser.FUNCTION, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public TerminalNode LT_BRACKET() { return getToken(Db2LookParser.LT_BRACKET, 0); }
		public List<TerminalNode> RT_BRACKET() { return getTokens(Db2LookParser.RT_BRACKET); }
		public TerminalNode RT_BRACKET(int i) {
			return getToken(Db2LookParser.RT_BRACKET, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public TerminalNode END() { return getToken(Db2LookParser.END, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateUDFQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUDFQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateUDFQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateUDFQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateUDFQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUDFQueryContext createUDFQuery() throws RecognitionException {
		CreateUDFQueryContext _localctx = new CreateUDFQueryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_createUDFQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(CREATE);
			setState(950); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(949);
				tabSpace();
				}
				}
				setState(952); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(954);
			match(FUNCTION);
			setState(956); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(955);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(958); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(960);
			fullNameModel();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(961);
				tabSpace();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
			match(LT_BRACKET);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(968);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RT_BRACKET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(974);
			match(RT_BRACKET);
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(975);
					matchWildcard();
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(981);
			match(SEMI_COLON);
			{
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(982);
				tabSpace();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988);
			match(END);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(989);
				tabSpace();
				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(995);
			match(SEMI_COLON);
			}
			setState(998); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(997);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1000); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CreateViewStatementContext extends ParserRuleContext {
		public CreateViewQueryContext createViewQuery() {
			return getRuleContext(CreateViewQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateViewStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateViewStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateViewStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewStatementContext createViewStatement() throws RecognitionException {
		CreateViewStatementContext _localctx = new CreateViewStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createViewStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1005);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1002);
							tabSpace();
							}
							} 
						}
						setState(1007);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
					}
					setState(1008);
					setStatement();
					}
					} 
				}
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1014);
				tabSpace();
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1020);
			createViewQuery();
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

	public static class CreateViewQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(Db2LookParser.VIEW, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateViewQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewQueryContext createViewQuery() throws RecognitionException {
		CreateViewQueryContext _localctx = new CreateViewQueryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_createViewQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(CREATE);
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1023);
				tabSpace();
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1028);
			match(VIEW);
			setState(1030); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1029);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1032); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1034);
			fullNameModel();
			setState(1036); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1035);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1040);
			match(SEMI_COLON);
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

	public static class AliasStatementContext extends ParserRuleContext {
		public AliasQueryContext aliasQuery() {
			return getRuleContext(AliasQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AliasStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAliasStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAliasStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAliasStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasStatementContext aliasStatement() throws RecognitionException {
		AliasStatementContext _localctx = new AliasStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aliasStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1042);
				tabSpace();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048);
			aliasQuery();
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

	public static class AliasQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode ALIAS() { return getToken(Db2LookParser.ALIAS, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AliasQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAliasQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAliasQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAliasQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasQueryContext aliasQuery() throws RecognitionException {
		AliasQueryContext _localctx = new AliasQueryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_aliasQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(CREATE);
			setState(1052); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1051);
				tabSpace();
				}
				}
				setState(1054); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1056);
			match(ALIAS);
			setState(1058); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1057);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1060); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1062);
			fullNameModel();
			setState(1064); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1063);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1068);
			match(SEMI_COLON);
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

	public static class CreateStoredProcedureStatementContext extends ParserRuleContext {
		public CreateProcedureQueryContext createProcedureQuery() {
			return getRuleContext(CreateProcedureQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateStoredProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStoredProcedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateStoredProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateStoredProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateStoredProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStoredProcedureStatementContext createStoredProcedureStatement() throws RecognitionException {
		CreateStoredProcedureStatementContext _localctx = new CreateStoredProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_createStoredProcedureStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1073);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1070);
							tabSpace();
							}
							} 
						}
						setState(1075);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
					}
					setState(1076);
					setStatement();
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1082);
				tabSpace();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088);
			createProcedureQuery();
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

	public static class CreateProcedureQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(Db2LookParser.PROCEDURE, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public List<TerminalNode> BEGIN() { return getTokens(Db2LookParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(Db2LookParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(Db2LookParser.END); }
		public TerminalNode END(int i) {
			return getToken(Db2LookParser.END, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateProcedureQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedureQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateProcedureQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateProcedureQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateProcedureQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcedureQueryContext createProcedureQuery() throws RecognitionException {
		CreateProcedureQueryContext _localctx = new CreateProcedureQueryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_createProcedureQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(CREATE);
			setState(1092); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1091);
				tabSpace();
				}
				}
				setState(1094); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1096);
			match(PROCEDURE);
			setState(1098); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1097);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1102);
			fullNameModel();
			setState(1106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1103);
					tabSpace();
					}
					} 
				}
				setState(1108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(1109);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==BEGIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
			match(BEGIN);
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1116);
					tabSpace();
					}
					} 
				}
				setState(1121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(1123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1122);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==END) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1127);
				tabSpace();
				}
				}
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1133);
			match(END);
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1134);
				tabSpace();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1140);
			match(SEMI_COLON);
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

	public static class CreateTriggerStatementContext extends ParserRuleContext {
		public CreateTriggerQueryContext createTriggerQuery() {
			return getRuleContext(CreateTriggerQueryContext.class,0);
		}
		public List<SetStatementContext> setStatement() {
			return getRuleContexts(SetStatementContext.class);
		}
		public SetStatementContext setStatement(int i) {
			return getRuleContext(SetStatementContext.class,i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTriggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTriggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTriggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTriggerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTriggerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTriggerStatementContext createTriggerStatement() throws RecognitionException {
		CreateTriggerStatementContext _localctx = new CreateTriggerStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_createTriggerStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1142);
							tabSpace();
							}
							} 
						}
						setState(1147);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
					}
					setState(1148);
					setStatement();
					}
					} 
				}
				setState(1153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1154);
				tabSpace();
				}
				}
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1160);
			createTriggerQuery();
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

	public static class CreateTriggerQueryContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(Db2LookParser.TRIGGER, 0); }
		public FullNameModelContext fullNameModel() {
			return getRuleContext(FullNameModelContext.class,0);
		}
		public TerminalNode END() { return getToken(Db2LookParser.END, 0); }
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateTriggerQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTriggerQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateTriggerQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateTriggerQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateTriggerQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTriggerQueryContext createTriggerQuery() throws RecognitionException {
		CreateTriggerQueryContext _localctx = new CreateTriggerQueryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_createTriggerQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(CREATE);
			setState(1164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1163);
				tabSpace();
				}
				}
				setState(1166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1168);
			match(TRIGGER);
			setState(1170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1169);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1174);
			fullNameModel();
			setState(1178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1175);
					matchWildcard();
					}
					} 
				}
				setState(1180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			{
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1181);
				tabSpace();
				}
				}
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1187);
			match(END);
			setState(1188);
			match(SEMI_COLON);
			}
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

	public static class GrantStatementContext extends ParserRuleContext {
		public GrantQueryContext grantQuery() {
			return getRuleContext(GrantQueryContext.class,0);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public GrantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterGrantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitGrantStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitGrantStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantStatementContext grantStatement() throws RecognitionException {
		GrantStatementContext _localctx = new GrantStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_grantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1190);
				tabSpace();
				}
				}
				setState(1195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1196);
			grantQuery();
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

	public static class GrantQueryContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(Db2LookParser.GRANT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public GrantQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterGrantQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitGrantQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitGrantQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantQueryContext grantQuery() throws RecognitionException {
		GrantQueryContext _localctx = new GrantQueryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_grantQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(GRANT);
			setState(1200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1199);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1204);
			match(SEMI_COLON);
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

	public static class TerminateStatementContext extends ParserRuleContext {
		public TerminalNode TERMINATE() { return getToken(Db2LookParser.TERMINATE, 0); }
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(Db2LookParser.SEMI_COLON, 0); }
		public List<TerminalNode> EOF() { return getTokens(Db2LookParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(Db2LookParser.EOF, i);
		}
		public TerminateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTerminateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTerminateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTerminateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminateStatementContext terminateStatement() throws RecognitionException {
		TerminateStatementContext _localctx = new TerminateStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_terminateStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1206);
				tabSpace();
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
			match(TERMINATE);
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					tabSpace();
					}
					} 
				}
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1219);
				match(SEMI_COLON);
				}
				break;
			}
			setState(1223); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1222);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==EOF) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1225); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SpaceContext extends ParserRuleContext {
		public TabSpaceContext tabSpace() {
			return getRuleContext(TabSpaceContext.class,0);
		}
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			tabSpace();
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

	public static class CommitStatementContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(Db2LookParser.COMMIT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CommitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCommitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCommitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCommitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitStatementContext commitStatement() throws RecognitionException {
		CommitStatementContext _localctx = new CommitStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_commitStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1229);
				tabSpace();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1235);
			match(COMMIT);
			setState(1237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1236);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1241);
			match(SEMI_COLON);
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

	public static class TrustedContextStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode TRUSTED_CONTEXT() { return getToken(Db2LookParser.TRUSTED_CONTEXT, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TrustedContextStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trustedContextStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTrustedContextStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTrustedContextStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTrustedContextStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrustedContextStatementContext trustedContextStatement() throws RecognitionException {
		TrustedContextStatementContext _localctx = new TrustedContextStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_trustedContextStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1243);
				tabSpace();
				}
				}
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1249);
			match(CREATE);
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1250);
				space();
				}
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1256);
			match(TRUSTED_CONTEXT);
			setState(1258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1257);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1262);
			match(SEMI_COLON);
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

	public static class CreateAuditStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode AUDIT() { return getToken(Db2LookParser.AUDIT, 0); }
		public TerminalNode POLICY() { return getToken(Db2LookParser.POLICY, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateAuditStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAuditStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateAuditStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateAuditStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateAuditStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateAuditStatementContext createAuditStatement() throws RecognitionException {
		CreateAuditStatementContext _localctx = new CreateAuditStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_createAuditStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1264);
				tabSpace();
				}
				}
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1270);
			match(CREATE);
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1271);
				tabSpace();
				}
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1277);
			match(AUDIT);
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1278);
				tabSpace();
				}
				}
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1284);
			match(POLICY);
			setState(1286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1285);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1290);
			match(SEMI_COLON);
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

	public static class CreateRoleStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(Db2LookParser.ROLE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(Db2LookParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(Db2LookParser.SEMI_COLON, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateRoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRoleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateRoleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateRoleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateRoleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleStatementContext createRoleStatement() throws RecognitionException {
		CreateRoleStatementContext _localctx = new CreateRoleStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_createRoleStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1292);
				tabSpace();
				}
				}
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1298);
			match(CREATE);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1299);
				tabSpace();
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1305);
			match(ROLE);
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1306);
					tabSpace();
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1312);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1) | (1L << CURLY_BRACKET2) | (1L << COMMENTS) | (1L << SINGLE_COMMENTS) | (1L << HASH_SKIPPER) | (1L << POINTER_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1317);
			match(SEMI_COLON);
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

	public static class FullNameModelContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Db2LookParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Db2LookParser.DOT, i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public FullNameModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullNameModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterFullNameModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitFullNameModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitFullNameModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullNameModelContext fullNameModel() throws RecognitionException {
		FullNameModelContext _localctx = new FullNameModelContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fullNameModel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1319);
					databaseName();
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
						{
						{
						setState(1320);
						space();
						}
						}
						setState(1325);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1326);
					match(DOT);
					}
					break;
				}
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1330);
						space();
						}
						} 
					}
					setState(1335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1336);
				schemaName();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1337);
					space();
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1343);
				match(DOT);
				}
				break;
			}
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1347);
					space();
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			setState(1353);
			tableName();
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

	public static class DatabaseNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			name();
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

	public static class SchemaNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			name();
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

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			name();
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

	public static class NameContext extends ParserRuleContext {
		public HandleContext handle() {
			return getRuleContext(HandleContext.class,0);
		}
		public List<TerminalNode> QUOTATION() { return getTokens(Db2LookParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(Db2LookParser.QUOTATION, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_name);
		try {
			setState(1366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER:
			case SCHEMA:
			case GROUP:
			case SPACE:
			case TAB:
			case TAB1:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				handle();
				}
				break;
			case QUOTATION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1362);
				match(QUOTATION);
				setState(1363);
				variable();
				setState(1364);
				match(QUOTATION);
				}
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

	public static class VariableContext extends ParserRuleContext {
		public List<HandleContext> handle() {
			return getRuleContexts(HandleContext.class);
		}
		public HandleContext handle(int i) {
			return getRuleContext(HandleContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1368);
					space();
					}
					} 
				}
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			setState(1374);
			handle();
			setState(1378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1375);
					space();
					}
					} 
				}
				setState(1380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USER) | (1L << SCHEMA) | (1L << GROUP) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) || _la==WORD) {
				{
				{
				setState(1384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1381);
						space();
						}
						} 
					}
					setState(1386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				setState(1387);
				handle();
				setState(1391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1388);
						space();
						}
						} 
					}
					setState(1393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				}
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class HandleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(Db2LookParser.WORD, 0); }
		public TerminalNode SPACE() { return getToken(Db2LookParser.SPACE, 0); }
		public TerminalNode TAB() { return getToken(Db2LookParser.TAB, 0); }
		public TerminalNode TAB1() { return getToken(Db2LookParser.TAB1, 0); }
		public TerminalNode USER() { return getToken(Db2LookParser.USER, 0); }
		public TerminalNode SCHEMA() { return getToken(Db2LookParser.SCHEMA, 0); }
		public TerminalNode GROUP() { return getToken(Db2LookParser.GROUP, 0); }
		public HandleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterHandle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitHandle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitHandle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandleContext handle() throws RecognitionException {
		HandleContext _localctx = new HandleContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_handle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USER) | (1L << SCHEMA) | (1L << GROUP) | (1L << SPACE) | (1L << TAB) | (1L << TAB1))) != 0) || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static final String _serializedATN =
		"\u0004\u0001T\u057a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0005\u0000v\b\u0000"+
		"\n\u0000\f\u0000y\t\u0000\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000"+
		"\u007f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u008e\b\u0000\n\u0000\f\u0000\u0091"+
		"\t\u0000\u0001\u0000\u0005\u0000\u0094\b\u0000\n\u0000\f\u0000\u0097\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u00a4\b\u0000\u0001\u0000\u0005\u0000\u00a7\b\u0000\n\u0000\f\u0000"+
		"\u00aa\t\u0000\u0005\u0000\u00ac\b\u0000\n\u0000\f\u0000\u00af\t\u0000"+
		"\u0001\u0000\u0005\u0000\u00b2\b\u0000\n\u0000\f\u0000\u00b5\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u00b9\b\u0000\n\u0000\f\u0000\u00bc\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u00c0\b\u0000\n\u0000\f\u0000\u00c3"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00c8\b\u0000"+
		"\n\u0000\f\u0000\u00cb\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001\u00d0\b\u0001\n\u0001\f\u0001\u00d3\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u00d7\b\u0001\u000b\u0001\f\u0001\u00d8\u0001\u0001\u0001"+
		"\u0001\u0004\u0001\u00dd\b\u0001\u000b\u0001\f\u0001\u00de\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u00e3\b\u0001\u000b\u0001\f\u0001\u00e4\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003\u00ec"+
		"\b\u0003\n\u0003\f\u0003\u00ef\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u00f5\b\u0004\u000b\u0004\f\u0004\u00f6\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u00fb\b\u0004\u000b\u0004\f\u0004\u00fc"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0101\b\u0004\n\u0004\f\u0004\u0104"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u0109\b\u0005"+
		"\n\u0005\f\u0005\u010c\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0110"+
		"\b\u0005\n\u0005\f\u0005\u0113\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0117\b\u0005\n\u0005\f\u0005\u011a\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0005\u0006\u011f\b\u0006\n\u0006\f\u0006\u0122\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u0128\b\u0007\u000b\u0007"+
		"\f\u0007\u0129\u0001\u0007\u0001\u0007\u0004\u0007\u012e\b\u0007\u000b"+
		"\u0007\f\u0007\u012f\u0001\u0007\u0001\u0007\u0004\u0007\u0134\b\u0007"+
		"\u000b\u0007\f\u0007\u0135\u0001\u0007\u0001\u0007\u0004\u0007\u013a\b"+
		"\u0007\u000b\u0007\f\u0007\u013b\u0001\u0007\u0001\u0007\u0001\b\u0005"+
		"\b\u0141\b\b\n\b\f\b\u0144\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t"+
		"\u014a\b\t\u000b\t\f\t\u014b\u0001\t\u0001\t\u0004\t\u0150\b\t\u000b\t"+
		"\f\t\u0151\u0001\t\u0001\t\u0004\t\u0156\b\t\u000b\t\f\t\u0157\u0001\t"+
		"\u0001\t\u0001\n\u0005\n\u015d\b\n\n\n\f\n\u0160\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u0166\b\u000b\u000b\u000b\f\u000b\u0167"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u016c\b\u000b\n\u000b\f\u000b\u016f"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u0174\b\f\n\f\f\f\u0177"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u017d\b\r\n\r\f\r\u0180\t"+
		"\r\u0001\r\u0003\r\u0183\b\r\u0001\r\u0005\r\u0186\b\r\n\r\f\r\u0189\t"+
		"\r\u0001\r\u0001\r\u0005\r\u018d\b\r\n\r\f\r\u0190\t\r\u0001\r\u0004\r"+
		"\u0193\b\r\u000b\r\f\r\u0194\u0001\r\u0001\r\u0004\r\u0199\b\r\u000b\r"+
		"\f\r\u019a\u0001\r\u0001\r\u0001\u000e\u0005\u000e\u01a0\b\u000e\n\u000e"+
		"\f\u000e\u01a3\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u01a9\b\u000f\u000b\u000f\f\u000f\u01aa\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u01af\b\u000f\u000b\u000f\f\u000f\u01b0\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0005\u0010\u01b6\b\u0010\n\u0010\f\u0010\u01b9"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u01bf"+
		"\b\u0011\u000b\u0011\f\u0011\u01c0\u0001\u0011\u0001\u0011\u0004\u0011"+
		"\u01c5\b\u0011\u000b\u0011\f\u0011\u01c6\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0005\u0012\u01cc\b\u0012\n\u0012\f\u0012\u01cf\t\u0012\u0001\u0012"+
		"\u0005\u0012\u01d2\b\u0012\n\u0012\f\u0012\u01d5\t\u0012\u0001\u0012\u0005"+
		"\u0012\u01d8\b\u0012\n\u0012\f\u0012\u01db\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u01e1\b\u0013\u000b\u0013\f\u0013"+
		"\u01e2\u0001\u0013\u0001\u0013\u0004\u0013\u01e7\b\u0013\u000b\u0013\f"+
		"\u0013\u01e8\u0001\u0013\u0001\u0013\u0004\u0013\u01ed\b\u0013\u000b\u0013"+
		"\f\u0013\u01ee\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u01f4\b"+
		"\u0014\n\u0014\f\u0014\u01f7\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u01fd\b\u0015\u000b\u0015\f\u0015\u01fe\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u0203\b\u0015\u000b\u0015\f\u0015\u0204"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u0209\b\u0015\u000b\u0015\f\u0015"+
		"\u020a\u0001\u0015\u0001\u0015\u0001\u0016\u0005\u0016\u0210\b\u0016\n"+
		"\u0016\f\u0016\u0213\t\u0016\u0001\u0016\u0005\u0016\u0216\b\u0016\n\u0016"+
		"\f\u0016\u0219\t\u0016\u0001\u0016\u0005\u0016\u021c\b\u0016\n\u0016\f"+
		"\u0016\u021f\t\u0016\u0001\u0016\u0005\u0016\u0222\b\u0016\n\u0016\f\u0016"+
		"\u0225\t\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0229\b\u0016\n\u0016"+
		"\f\u0016\u022c\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0234\b\u0016\n\u0016\f\u0016\u0237"+
		"\t\u0016\u0001\u0016\u0005\u0016\u023a\b\u0016\n\u0016\f\u0016\u023d\t"+
		"\u0016\u0001\u0016\u0005\u0016\u0240\b\u0016\n\u0016\f\u0016\u0243\t\u0016"+
		"\u0001\u0016\u0003\u0016\u0246\b\u0016\u0005\u0016\u0248\b\u0016\n\u0016"+
		"\f\u0016\u024b\t\u0016\u0001\u0017\u0001\u0017\u0004\u0017\u024f\b\u0017"+
		"\u000b\u0017\f\u0017\u0250\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0004\u0018\u0257\b\u0018\u000b\u0018\f\u0018\u0258\u0001\u0018\u0001"+
		"\u0018\u0004\u0018\u025d\b\u0018\u000b\u0018\f\u0018\u025e\u0003\u0018"+
		"\u0261\b\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u0265\b\u0018\u000b"+
		"\u0018\f\u0018\u0266\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0004"+
		"\u0019\u026d\b\u0019\u000b\u0019\f\u0019\u026e\u0001\u0019\u0001\u0019"+
		"\u0004\u0019\u0273\b\u0019\u000b\u0019\f\u0019\u0274\u0001\u0019\u0001"+
		"\u0019\u0004\u0019\u0279\b\u0019\u000b\u0019\f\u0019\u027a\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u027f\b\u0019\n\u0019\f\u0019\u0282\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0286\b\u0019\n\u0019\f\u0019\u0289\t\u0019"+
		"\u0001\u0019\u0003\u0019\u028c\b\u0019\u0001\u0019\u0004\u0019\u028f\b"+
		"\u0019\u000b\u0019\f\u0019\u0290\u0001\u0019\u0001\u0019\u0005\u0019\u0295"+
		"\b\u0019\n\u0019\f\u0019\u0298\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u029c\b\u0019\n\u0019\f\u0019\u029f\t\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u02a3\b\u0019\n\u0019\f\u0019\u02a6\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0004\u001a\u02ac\b\u001a\u000b\u001a\f\u001a"+
		"\u02ad\u0001\u001a\u0001\u001a\u0004\u001a\u02b2\b\u001a\u000b\u001a\f"+
		"\u001a\u02b3\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u02b9\b\u001b"+
		"\n\u001b\f\u001b\u02bc\t\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u02c0"+
		"\b\u001b\u000b\u001b\f\u001b\u02c1\u0001\u001b\u0001\u001b\u0004\u001b"+
		"\u02c6\b\u001b\u000b\u001b\f\u001b\u02c7\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u02cc\b\u001b\u000b\u001b\f\u001b\u02cd\u0001\u001b\u0001\u001b"+
		"\u0004\u001b\u02d2\b\u001b\u000b\u001b\f\u001b\u02d3\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u02d8\b\u001b\u000b\u001b\f\u001b\u02d9\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u02de\b\u001b\n\u001b\f\u001b\u02e1\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u02e5\b\u001b\n\u001b\f\u001b\u02e8\t\u001b"+
		"\u0001\u001b\u0004\u001b\u02eb\b\u001b\u000b\u001b\f\u001b\u02ec\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0004\u001c\u02f3\b\u001c\u000b"+
		"\u001c\f\u001c\u02f4\u0001\u001c\u0001\u001c\u0004\u001c\u02f9\b\u001c"+
		"\u000b\u001c\f\u001c\u02fa\u0001\u001c\u0001\u001c\u0004\u001c\u02ff\b"+
		"\u001c\u000b\u001c\f\u001c\u0300\u0001\u001c\u0001\u001c\u0004\u001c\u0305"+
		"\b\u001c\u000b\u001c\f\u001c\u0306\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u030b\b\u001c\n\u001c\f\u001c\u030e\t\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0312\b\u001c\u0001\u001c\u0005\u001c\u0315\b\u001c\n\u001c\f\u001c"+
		"\u0318\t\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u031c\b\u001c\u000b"+
		"\u001c\f\u001c\u031d\u0001\u001c\u0001\u001c\u0001\u001d\u0005\u001d\u0323"+
		"\b\u001d\n\u001d\f\u001d\u0326\t\u001d\u0001\u001d\u0001\u001d\u0004\u001d"+
		"\u032a\b\u001d\u000b\u001d\f\u001d\u032b\u0001\u001d\u0001\u001d\u0004"+
		"\u001d\u0330\b\u001d\u000b\u001d\f\u001d\u0331\u0001\u001d\u0001\u001d"+
		"\u0004\u001d\u0336\b\u001d\u000b\u001d\f\u001d\u0337\u0001\u001d\u0001"+
		"\u001d\u0004\u001d\u033c\b\u001d\u000b\u001d\f\u001d\u033d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0342\b\u001d\n\u001d\f\u001d\u0345\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0349\b\u001d\n\u001d\f\u001d\u034c\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0004\u001d\u0350\b\u001d\u000b\u001d\f\u001d"+
		"\u0351\u0001\u001d\u0001\u001d\u0001\u001e\u0005\u001e\u0357\b\u001e\n"+
		"\u001e\f\u001e\u035a\t\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u035e"+
		"\b\u001e\u000b\u001e\f\u001e\u035f\u0001\u001e\u0001\u001e\u0004\u001e"+
		"\u0364\b\u001e\u000b\u001e\f\u001e\u0365\u0001\u001e\u0001\u001e\u0004"+
		"\u001e\u036a\b\u001e\u000b\u001e\f\u001e\u036b\u0001\u001e\u0004\u001e"+
		"\u036f\b\u001e\u000b\u001e\f\u001e\u0370\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u0377\b\u001f\u000b\u001f\f\u001f\u0378"+
		"\u0001\u001f\u0003\u001f\u037c\b\u001f\u0001\u001f\u0004\u001f\u037f\b"+
		"\u001f\u000b\u001f\f\u001f\u0380\u0003\u001f\u0383\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0004\u001f\u0387\b\u001f\u000b\u001f\f\u001f\u0388\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u038d\b\u001f\u000b\u001f\f\u001f\u038e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0005 \u0394\b \n \f \u0397\t \u0001 "+
		"\u0001 \u0004 \u039b\b \u000b \f \u039c\u0001 \u0001 \u0001!\u0005!\u03a2"+
		"\b!\n!\f!\u03a5\t!\u0001!\u0005!\u03a8\b!\n!\f!\u03ab\t!\u0001!\u0005"+
		"!\u03ae\b!\n!\f!\u03b1\t!\u0001!\u0001!\u0001\"\u0001\"\u0004\"\u03b7"+
		"\b\"\u000b\"\f\"\u03b8\u0001\"\u0001\"\u0004\"\u03bd\b\"\u000b\"\f\"\u03be"+
		"\u0001\"\u0001\"\u0005\"\u03c3\b\"\n\"\f\"\u03c6\t\"\u0001\"\u0001\"\u0005"+
		"\"\u03ca\b\"\n\"\f\"\u03cd\t\"\u0001\"\u0001\"\u0005\"\u03d1\b\"\n\"\f"+
		"\"\u03d4\t\"\u0001\"\u0001\"\u0005\"\u03d8\b\"\n\"\f\"\u03db\t\"\u0001"+
		"\"\u0001\"\u0005\"\u03df\b\"\n\"\f\"\u03e2\t\"\u0001\"\u0001\"\u0001\""+
		"\u0004\"\u03e7\b\"\u000b\"\f\"\u03e8\u0001#\u0005#\u03ec\b#\n#\f#\u03ef"+
		"\t#\u0001#\u0005#\u03f2\b#\n#\f#\u03f5\t#\u0001#\u0005#\u03f8\b#\n#\f"+
		"#\u03fb\t#\u0001#\u0001#\u0001$\u0001$\u0004$\u0401\b$\u000b$\f$\u0402"+
		"\u0001$\u0001$\u0004$\u0407\b$\u000b$\f$\u0408\u0001$\u0001$\u0004$\u040d"+
		"\b$\u000b$\f$\u040e\u0001$\u0001$\u0001%\u0005%\u0414\b%\n%\f%\u0417\t"+
		"%\u0001%\u0001%\u0001&\u0001&\u0004&\u041d\b&\u000b&\f&\u041e\u0001&\u0001"+
		"&\u0004&\u0423\b&\u000b&\f&\u0424\u0001&\u0001&\u0004&\u0429\b&\u000b"+
		"&\f&\u042a\u0001&\u0001&\u0001\'\u0005\'\u0430\b\'\n\'\f\'\u0433\t\'\u0001"+
		"\'\u0005\'\u0436\b\'\n\'\f\'\u0439\t\'\u0001\'\u0005\'\u043c\b\'\n\'\f"+
		"\'\u043f\t\'\u0001\'\u0001\'\u0001(\u0001(\u0004(\u0445\b(\u000b(\f(\u0446"+
		"\u0001(\u0001(\u0004(\u044b\b(\u000b(\f(\u044c\u0001(\u0001(\u0005(\u0451"+
		"\b(\n(\f(\u0454\t(\u0001(\u0005(\u0457\b(\n(\f(\u045a\t(\u0001(\u0001"+
		"(\u0005(\u045e\b(\n(\f(\u0461\t(\u0001(\u0004(\u0464\b(\u000b(\f(\u0465"+
		"\u0001(\u0005(\u0469\b(\n(\f(\u046c\t(\u0001(\u0001(\u0005(\u0470\b(\n"+
		"(\f(\u0473\t(\u0001(\u0001(\u0001)\u0005)\u0478\b)\n)\f)\u047b\t)\u0001"+
		")\u0005)\u047e\b)\n)\f)\u0481\t)\u0001)\u0005)\u0484\b)\n)\f)\u0487\t"+
		")\u0001)\u0001)\u0001*\u0001*\u0004*\u048d\b*\u000b*\f*\u048e\u0001*\u0001"+
		"*\u0004*\u0493\b*\u000b*\f*\u0494\u0001*\u0001*\u0005*\u0499\b*\n*\f*"+
		"\u049c\t*\u0001*\u0005*\u049f\b*\n*\f*\u04a2\t*\u0001*\u0001*\u0001*\u0001"+
		"+\u0005+\u04a8\b+\n+\f+\u04ab\t+\u0001+\u0001+\u0001,\u0001,\u0004,\u04b1"+
		"\b,\u000b,\f,\u04b2\u0001,\u0001,\u0001-\u0005-\u04b8\b-\n-\f-\u04bb\t"+
		"-\u0001-\u0001-\u0005-\u04bf\b-\n-\f-\u04c2\t-\u0001-\u0003-\u04c5\b-"+
		"\u0001-\u0004-\u04c8\b-\u000b-\f-\u04c9\u0001.\u0001.\u0001/\u0005/\u04cf"+
		"\b/\n/\f/\u04d2\t/\u0001/\u0001/\u0004/\u04d6\b/\u000b/\f/\u04d7\u0001"+
		"/\u0001/\u00010\u00050\u04dd\b0\n0\f0\u04e0\t0\u00010\u00010\u00050\u04e4"+
		"\b0\n0\f0\u04e7\t0\u00010\u00010\u00040\u04eb\b0\u000b0\f0\u04ec\u0001"+
		"0\u00010\u00011\u00051\u04f2\b1\n1\f1\u04f5\t1\u00011\u00011\u00051\u04f9"+
		"\b1\n1\f1\u04fc\t1\u00011\u00011\u00051\u0500\b1\n1\f1\u0503\t1\u0001"+
		"1\u00011\u00041\u0507\b1\u000b1\f1\u0508\u00011\u00011\u00012\u00052\u050e"+
		"\b2\n2\f2\u0511\t2\u00012\u00012\u00052\u0515\b2\n2\f2\u0518\t2\u0001"+
		"2\u00012\u00052\u051c\b2\n2\f2\u051f\t2\u00012\u00042\u0522\b2\u000b2"+
		"\f2\u0523\u00012\u00012\u00013\u00013\u00053\u052a\b3\n3\f3\u052d\t3\u0001"+
		"3\u00013\u00033\u0531\b3\u00013\u00053\u0534\b3\n3\f3\u0537\t3\u00013"+
		"\u00013\u00053\u053b\b3\n3\f3\u053e\t3\u00013\u00013\u00033\u0542\b3\u0001"+
		"3\u00053\u0545\b3\n3\f3\u0548\t3\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00037\u0557\b7\u0001"+
		"8\u00058\u055a\b8\n8\f8\u055d\t8\u00018\u00018\u00058\u0561\b8\n8\f8\u0564"+
		"\t8\u00018\u00058\u0567\b8\n8\f8\u056a\t8\u00018\u00018\u00058\u056e\b"+
		"8\n8\f8\u0571\t8\u00058\u0573\b8\n8\f8\u0576\t8\u00019\u00019\u00019\u0002"+
		"\u03d2\u049a\u0000:\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnpr\u0000\f\u0001\u000033\u0001\u000069\u0002\u0000\n\u000b\u000e\u000e"+
		"\u0001\u0000\u000f\u000f\u0002\u0000\b\b33\u0001\u000000\u0002\u0000\u0006"+
		"\u000633\u0003\u0000\u0014\u0015\u0019\u001a33\u0001\u0000))\u0001\u0000"+
		"**\u0000\u0001\u0005\u0000\r\r\u0010\u0010\u0018\u001868OO\u0618\u0000"+
		"w\u0001\u0000\u0000\u0000\u0002\u00d1\u0001\u0000\u0000\u0000\u0004\u00e8"+
		"\u0001\u0000\u0000\u0000\u0006\u00ed\u0001\u0000\u0000\u0000\b\u00f2\u0001"+
		"\u0000\u0000\u0000\n\u010a\u0001\u0000\u0000\u0000\f\u0120\u0001\u0000"+
		"\u0000\u0000\u000e\u0125\u0001\u0000\u0000\u0000\u0010\u0142\u0001\u0000"+
		"\u0000\u0000\u0012\u0147\u0001\u0000\u0000\u0000\u0014\u015e\u0001\u0000"+
		"\u0000\u0000\u0016\u0163\u0001\u0000\u0000\u0000\u0018\u0175\u0001\u0000"+
		"\u0000\u0000\u001a\u017a\u0001\u0000\u0000\u0000\u001c\u01a1\u0001\u0000"+
		"\u0000\u0000\u001e\u01a6\u0001\u0000\u0000\u0000 \u01b7\u0001\u0000\u0000"+
		"\u0000\"\u01bc\u0001\u0000\u0000\u0000$\u01d3\u0001\u0000\u0000\u0000"+
		"&\u01de\u0001\u0000\u0000\u0000(\u01f5\u0001\u0000\u0000\u0000*\u01fa"+
		"\u0001\u0000\u0000\u0000,\u0211\u0001\u0000\u0000\u0000.\u024c\u0001\u0000"+
		"\u0000\u00000\u0254\u0001\u0000\u0000\u00002\u026a\u0001\u0000\u0000\u0000"+
		"4\u02a9\u0001\u0000\u0000\u00006\u02ba\u0001\u0000\u0000\u00008\u02f0"+
		"\u0001\u0000\u0000\u0000:\u0324\u0001\u0000\u0000\u0000<\u0358\u0001\u0000"+
		"\u0000\u0000>\u0374\u0001\u0000\u0000\u0000@\u0395\u0001\u0000\u0000\u0000"+
		"B\u03a9\u0001\u0000\u0000\u0000D\u03b4\u0001\u0000\u0000\u0000F\u03f3"+
		"\u0001\u0000\u0000\u0000H\u03fe\u0001\u0000\u0000\u0000J\u0415\u0001\u0000"+
		"\u0000\u0000L\u041a\u0001\u0000\u0000\u0000N\u0437\u0001\u0000\u0000\u0000"+
		"P\u0442\u0001\u0000\u0000\u0000R\u047f\u0001\u0000\u0000\u0000T\u048a"+
		"\u0001\u0000\u0000\u0000V\u04a9\u0001\u0000\u0000\u0000X\u04ae\u0001\u0000"+
		"\u0000\u0000Z\u04b9\u0001\u0000\u0000\u0000\\\u04cb\u0001\u0000\u0000"+
		"\u0000^\u04d0\u0001\u0000\u0000\u0000`\u04de\u0001\u0000\u0000\u0000b"+
		"\u04f3\u0001\u0000\u0000\u0000d\u050f\u0001\u0000\u0000\u0000f\u0541\u0001"+
		"\u0000\u0000\u0000h\u054b\u0001\u0000\u0000\u0000j\u054d\u0001\u0000\u0000"+
		"\u0000l\u054f\u0001\u0000\u0000\u0000n\u0556\u0001\u0000\u0000\u0000p"+
		"\u055b\u0001\u0000\u0000\u0000r\u0577\u0001\u0000\u0000\u0000tv\u0003"+
		"\u0004\u0002\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u00ad\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0003\u0004\u0002\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u00a3\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u00a4\u0003\u0006\u0003\u0000\u0081\u00a4"+
		"\u0003\f\u0006\u0000\u0082\u00a4\u0003\u0010\b\u0000\u0083\u00a4\u0003"+
		"\u0014\n\u0000\u0084\u00a4\u0003\u0018\f\u0000\u0085\u00a4\u0003\u001c"+
		"\u000e\u0000\u0086\u00a4\u0003d2\u0000\u0087\u00a4\u0003 \u0010\u0000"+
		"\u0088\u00a4\u0003$\u0012\u0000\u0089\u00a4\u0003(\u0014\u0000\u008a\u00a4"+
		"\u0003\u0002\u0001\u0000\u008b\u00a4\u00036\u001b\u0000\u008c\u008e\u0003"+
		"\u0004\u0002\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0003@ \u0000\u0093\u008f\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u00a4\u0003:\u001d\u0000"+
		"\u0099\u00a4\u0003B!\u0000\u009a\u00a4\u0003F#\u0000\u009b\u00a4\u0003"+
		"J%\u0000\u009c\u00a4\u0003,\u0016\u0000\u009d\u00a4\u0003N\'\u0000\u009e"+
		"\u00a4\u0003R)\u0000\u009f\u00a4\u0003b1\u0000\u00a0\u00a4\u0003`0\u0000"+
		"\u00a1\u00a4\u0003\n\u0005\u0000\u00a2\u00a4\u0003V+\u0000\u00a3\u0080"+
		"\u0001\u0000\u0000\u0000\u00a3\u0081\u0001\u0000\u0000\u0000\u00a3\u0082"+
		"\u0001\u0000\u0000\u0000\u00a3\u0083\u0001\u0000\u0000\u0000\u00a3\u0084"+
		"\u0001\u0000\u0000\u0000\u00a3\u0085\u0001\u0000\u0000\u0000\u00a3\u0086"+
		"\u0001\u0000\u0000\u0000\u00a3\u0087\u0001\u0000\u0000\u0000\u00a3\u0088"+
		"\u0001\u0000\u0000\u0000\u00a3\u0089\u0001\u0000\u0000\u0000\u00a3\u008a"+
		"\u0001\u0000\u0000\u0000\u00a3\u008b\u0001\u0000\u0000\u0000\u00a3\u0095"+
		"\u0001\u0000\u0000\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a3\u009a"+
		"\u0001\u0000\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3\u009c"+
		"\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009e"+
		"\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0003\u0004\u0002\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab}\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b3\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0003\u0004\u0002\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003"+
		"^/\u0000\u00b7\u00b9\u0003\u0004\u0002\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c1\u0003\n\u0005\u0000"+
		"\u00be\u00c0\u0003\u0004\u0002\u0000\u00bf\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003Z-\u0000\u00c5\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003\u0004\u0002\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0000\u0000\u0001\u00cd\u0001\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0003\u0004\u0002\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\b\u0000\u0000\u00d5\u00d7\u0003"+
		"\u0004\u0002\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0005"+
		"\u0005\u0000\u0000\u00db\u00dd\u0003\u0004\u0002\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0003f3\u0000\u00e1\u00e3\b\u0000\u0000"+
		"\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u00053\u0000\u0000"+
		"\u00e7\u0003\u0001\u0000\u0000\u0000\u00e8\u00e9\u0007\u0001\u0000\u0000"+
		"\u00e9\u0005\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\u0004\u0002\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0003\b\u0004\u0000\u00f1\u0007\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0005\u0001\u0000\u0000\u00f3\u00f5\u0003\u0004\u0002\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\u0002\u0000\u0000\u00f9"+
		"\u00fb\u0003\u0004\u0002\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u0102\u0003f3\u0000\u00ff\u0101\u0003\u0004\u0002\u0000\u0100\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"3\u0000\u0000\u0106\t\u0001\u0000\u0000\u0000\u0107\u0109\u0003\u0004"+
		"\u0002\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0111\u0005\u0001\u0000\u0000\u010e\u0110\u0003\u0004"+
		"\u0002\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0114\u0118\u0005\u001c\u0000\u0000\u0115\u0117\u0003\u0004"+
		"\u0002\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u00053\u0000\u0000\u011c\u000b\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0003\u0004\u0002\u0000\u011e\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0003\u000e\u0007"+
		"\u0000\u0124\r\u0001\u0000\u0000\u0000\u0125\u0127\u0005\u0006\u0000\u0000"+
		"\u0126\u0128\u0003\u0004\u0002\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0005\u0016\u0000\u0000\u012c\u012e\u0003\u0004\u0002\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0005\u0017\u0000\u0000"+
		"\u0132\u0134\u0003\u0004\u0002\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0005\u0018\u0000\u0000\u0138\u013a\b\u0000\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u00053\u0000\u0000\u013e\u000f"+
		"\u0001\u0000\u0000\u0000\u013f\u0141\u0003\u0004\u0002\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145"+
		"\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0003\u0012\t\u0000\u0146\u0011\u0001\u0000\u0000\u0000\u0147\u0149\u0005"+
		"\u0006\u0000\u0000\u0148\u014a\u0003\u0004\u0002\u0000\u0149\u0148\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0005!\u0000\u0000\u014e\u0150\u0003\u0004"+
		"\u0002\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0003f3\u0000"+
		"\u0154\u0156\b\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u00053\u0000\u0000\u015a\u0013\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0003\u0004\u0002\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0160"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0003\u0016\u000b\u0000\u0162\u0015"+
		"\u0001\u0000\u0000\u0000\u0163\u0165\u0005\b\u0000\u0000\u0164\u0166\u0003"+
		"\u0004\u0002\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016d\u0005"+
		"\"\u0000\u0000\u016a\u016c\b\u0000\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0170\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0171\u00053\u0000"+
		"\u0000\u0171\u0017\u0001\u0000\u0000\u0000\u0172\u0174\u0003\u0004\u0002"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0003\u001a\r\u0000\u0179\u0019\u0001\u0000\u0000\u0000"+
		"\u017a\u017e\u0005\u0006\u0000\u0000\u017b\u017d\u0003\u0004\u0002\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0181\u0183\u0005\r\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0187\u0001\u0000\u0000\u0000\u0184"+
		"\u0186\u0003\u0004\u0002\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u018a\u018e\u0007\u0002\u0000\u0000\u018b"+
		"\u018d\u0003\u0004\u0002\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d"+
		"\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190"+
		"\u018e\u0001\u0000\u0000\u0000\u0191\u0193\b\u0003\u0000\u0000\u0192\u0191"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0198\u0005\u000f\u0000\u0000\u0197\u0199"+
		"\b\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"3\u0000\u0000\u019d\u001b\u0001\u0000\u0000\u0000\u019e\u01a0\u0003\u0004"+
		"\u0002\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0003\u001e\u000f\u0000\u01a5\u001d\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0005\b\u0000\u0000\u01a7\u01a9\u0003\u0004\u0002"+
		"\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005\u000f\u0000"+
		"\u0000\u01ad\u01af\b\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u00053\u0000\u0000\u01b3\u001f\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b6\u0003\u0004\u0002\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003\"\u0011\u0000\u01bb!"+
		"\u0001\u0000\u0000\u0000\u01bc\u01be\u0005\u0006\u0000\u0000\u01bd\u01bf"+
		"\u0003\u0004\u0002\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4"+
		"\u0005\u0010\u0000\u0000\u01c3\u01c5\b\u0000\u0000\u0000\u01c4\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u00053\u0000\u0000\u01c9#\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cc\u0003\u0004\u0002\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003@ \u0000\u01d1"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0003\u0004\u0002\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"\u01db\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db"+
		"\u01d9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003&\u0013\u0000\u01dd%\u0001"+
		"\u0000\u0000\u0000\u01de\u01e0\u0005\u0006\u0000\u0000\u01df\u01e1\u0003"+
		"\u0004\u0002\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005"+
		"\u0004\u0000\u0000\u01e5\u01e7\u0003\u0004\u0002\u0000\u01e6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ec\u0003f3\u0000\u01eb\u01ed\b\u0000\u0000"+
		"\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u00053\u0000\u0000"+
		"\u01f1\'\u0001\u0000\u0000\u0000\u01f2\u01f4\u0003\u0004\u0002\u0000\u01f3"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f9\u0003*\u0015\u0000\u01f9)\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005"+
		"\u0006\u0000\u0000\u01fb\u01fd\u0003\u0004\u0002\u0000\u01fc\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0005\u0005\u0000\u0000\u0201\u0203\u0003"+
		"\u0004\u0002\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001"+
		"\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0003"+
		"f3\u0000\u0207\u0209\b\u0000\u0000\u0000\u0208\u0207\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u00053\u0000\u0000\u020d+\u0001\u0000\u0000\u0000\u020e"+
		"\u0210\u0003\u0004\u0002\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210"+
		"\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0001\u0000\u0000\u0000\u0212\u021d\u0001\u0000\u0000\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u0003\u0004\u0002\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217"+
		"\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u021a\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a"+
		"\u021c\u0003@ \u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021c\u021f\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021e\u0223\u0001\u0000\u0000\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u0220\u0222\u0003\u0004\u0002\u0000\u0221\u0220\u0001"+
		"\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001"+
		"\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0249\u0003"+
		"0\u0018\u0000\u0227\u0229\u0003\u0004\u0002\u0000\u0228\u0227\u0001\u0000"+
		"\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000"+
		"\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u0245\u0001\u0000"+
		"\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u0246\u0003.\u0017"+
		"\u0000\u022e\u0246\u00032\u0019\u0000\u022f\u0246\u00034\u001a\u0000\u0230"+
		"\u0246\u00038\u001c\u0000\u0231\u0246\u0003<\u001e\u0000\u0232\u0234\u0003"+
		"\u0004\u0002\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234\u0237\u0001"+
		"\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u0235\u0001"+
		"\u0000\u0000\u0000\u0238\u023a\u0003@ \u0000\u0239\u0235\u0001\u0000\u0000"+
		"\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u0241\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0240\u0003\u0004\u0002"+
		"\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243\u0001\u0000\u0000"+
		"\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000"+
		"\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0244\u0246\u0003>\u001f\u0000\u0245\u022d\u0001\u0000\u0000\u0000"+
		"\u0245\u022e\u0001\u0000\u0000\u0000\u0245\u022f\u0001\u0000\u0000\u0000"+
		"\u0245\u0230\u0001\u0000\u0000\u0000\u0245\u0231\u0001\u0000\u0000\u0000"+
		"\u0245\u023b\u0001\u0000\u0000\u0000\u0246\u0248\u0001\u0000\u0000\u0000"+
		"\u0247\u022a\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000"+
		"\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000"+
		"\u024a-\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024c"+
		"\u024e\u0005\'\u0000\u0000\u024d\u024f\b\u0000\u0000\u0000\u024e\u024d"+
		"\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u024e"+
		"\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u00053\u0000\u0000\u0253/\u0001\u0000"+
		"\u0000\u0000\u0254\u0256\u0005\u0006\u0000\u0000\u0255\u0257\u0003\u0004"+
		"\u0002\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000"+
		"\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259\u0260\u0001\u0000\u0000\u0000\u025a\u025c\u0005\u0003"+
		"\u0000\u0000\u025b\u025d\u0003\u0004\u0002\u0000\u025c\u025b\u0001\u0000"+
		"\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261\u0001\u0000"+
		"\u0000\u0000\u0260\u025a\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0264\u0005\u0012"+
		"\u0000\u0000\u0263\u0265\b\u0004\u0000\u0000\u0264\u0263\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u00053\u0000\u0000\u02691\u0001\u0000\u0000\u0000\u026a"+
		"\u026c\u0005\b\u0000\u0000\u026b\u026d\u0003\u0004\u0002\u0000\u026c\u026b"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026c"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0001\u0000\u0000\u0000\u0270\u0272\u0005\u0012\u0000\u0000\u0271\u0273"+
		"\u0003\u0004\u0002\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278"+
		"\u0003f3\u0000\u0277\u0279\u0003\u0004\u0002\u0000\u0278\u0277\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027c\u028b\u0005\u0013\u0000\u0000\u027d\u027f\u0003\u0004"+
		"\u0002\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000"+
		"\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000"+
		"\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000"+
		"\u0000\u0000\u0283\u0287\u0005+\u0000\u0000\u0284\u0286\u0003\u0004\u0002"+
		"\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000"+
		"\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000"+
		"\u0000\u028a\u028c\u0003f3\u0000\u028b\u0280\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d"+
		"\u028f\u0003\u0004\u0002\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028f"+
		"\u0290\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292"+
		"\u0296\u0005\u0014\u0000\u0000\u0293\u0295\u0003\u0004\u0002\u0000\u0294"+
		"\u0293\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296"+
		"\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297"+
		"\u0299\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0299"+
		"\u029d\u0005/\u0000\u0000\u029a\u029c\b\u0005\u0000\u0000\u029b\u029a"+
		"\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u02a0"+
		"\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a4"+
		"\u00050\u0000\u0000\u02a1\u02a3\b\u0000\u0000\u0000\u02a2\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005"+
		"3\u0000\u0000\u02a83\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005\u0011\u0000"+
		"\u0000\u02aa\u02ac\u0003\u0004\u0002\u0000\u02ab\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000"+
		"\u0000\u02af\u02b1\u0005\u0012\u0000\u0000\u02b0\u02b2\b\u0000\u0000\u0000"+
		"\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u00053\u0000\u0000\u02b6"+
		"5\u0001\u0000\u0000\u0000\u02b7\u02b9\u0003\u0004\u0002\u0000\u02b8\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02bf"+
		"\u0005\b\u0000\u0000\u02be\u02c0\u0003\u0004\u0002\u0000\u02bf\u02be\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c5\u0005\u0012\u0000\u0000\u02c4\u02c6\u0003"+
		"\u0004\u0002\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003"+
		"f3\u0000\u02ca\u02cc\u0003\u0004\u0002\u0000\u02cb\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d1\u0005\u0013\u0000\u0000\u02d0\u02d2\u0003\u0004\u0002"+
		"\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0005+\u0000\u0000"+
		"\u02d6\u02d8\u0003\u0004\u0002\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000"+
		"\u02db\u02df\u0003f3\u0000\u02dc\u02de\u0003\u0004\u0002\u0000\u02dd\u02dc"+
		"\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e6"+
		"\u0005\u0015\u0000\u0000\u02e3\u02e5\u0003\u0004\u0002\u0000\u02e4\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02ea"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02eb"+
		"\b\u0000\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0005"+
		"3\u0000\u0000\u02ef7\u0001\u0000\u0000\u0000\u02f0\u02f2\u0005\b\u0000"+
		"\u0000\u02f1\u02f3\u0003\u0004\u0002\u0000\u02f2\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f8\u0005\u0012\u0000\u0000\u02f7\u02f9\u0003\u0004\u0002"+
		"\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe\u0003f3\u0000\u02fd"+
		"\u02ff\u0003\u0004\u0002\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300"+
		"\u0301\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302"+
		"\u0311\u0005\u0013\u0000\u0000\u0303\u0305\u0003\u0004\u0002\u0000\u0304"+
		"\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306"+
		"\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0001\u0000\u0000\u0000\u0308\u030c\u0005+\u0000\u0000\u0309\u030b"+
		"\u0003\u0004\u0002\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030b\u030e"+
		"\u0001\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0001\u0000\u0000\u0000\u030d\u030f\u0001\u0000\u0000\u0000\u030e\u030c"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0003f3\u0000\u0310\u0312\u0001\u0000"+
		"\u0000\u0000\u0311\u0304\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000"+
		"\u0000\u0000\u0312\u0316\u0001\u0000\u0000\u0000\u0313\u0315\u0003\u0004"+
		"\u0002\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000"+
		"\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000"+
		"\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000"+
		"\u0000\u0000\u0319\u031b\u0005\u0019\u0000\u0000\u031a\u031c\b\u0000\u0000"+
		"\u0000\u031b\u031a\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000"+
		"\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0320\u00053\u0000\u0000"+
		"\u03209\u0001\u0000\u0000\u0000\u0321\u0323\u0003\u0004\u0002\u0000\u0322"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324"+
		"\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325"+
		"\u0327\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327"+
		"\u0329\u0005\b\u0000\u0000\u0328\u032a\u0003\u0004\u0002\u0000\u0329\u0328"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032d"+
		"\u0001\u0000\u0000\u0000\u032d\u032f\u0005\u0012\u0000\u0000\u032e\u0330"+
		"\u0003\u0004\u0002\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335"+
		"\u0003f3\u0000\u0334\u0336\u0003\u0004\u0002\u0000\u0335\u0334\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000"+
		"\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000"+
		"\u0000\u0000\u0339\u033b\u0005\u0013\u0000\u0000\u033a\u033c\u0003\u0004"+
		"\u0002\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000"+
		"\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0343\u0005+\u0000"+
		"\u0000\u0340\u0342\u0003\u0004\u0002\u0000\u0341\u0340\u0001\u0000\u0000"+
		"\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000\u0000"+
		"\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0346\u0001\u0000\u0000"+
		"\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u034a\u0003f3\u0000\u0347"+
		"\u0349\u0003\u0004\u0002\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0349"+
		"\u034c\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a"+
		"\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000\u034c"+
		"\u034a\u0001\u0000\u0000\u0000\u034d\u034f\u0005\u001a\u0000\u0000\u034e"+
		"\u0350\b\u0006\u0000\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354"+
		"\u00053\u0000\u0000\u0354;\u0001\u0000\u0000\u0000\u0355\u0357\u0003\u0004"+
		"\u0002\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0357\u035a\u0001\u0000"+
		"\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000"+
		"\u0000\u0000\u0359\u035b\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000"+
		"\u0000\u0000\u035b\u035d\u0005\b\u0000\u0000\u035c\u035e\u0003\u0004\u0002"+
		"\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000"+
		"\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0363\u0005\u0012\u0000"+
		"\u0000\u0362\u0364\u0003\u0004\u0002\u0000\u0363\u0362\u0001\u0000\u0000"+
		"\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000"+
		"\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000"+
		"\u0000\u0367\u0369\u0003f3\u0000\u0368\u036a\u0003\u0004\u0002\u0000\u0369"+
		"\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b"+
		"\u0369\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c"+
		"\u036e\u0001\u0000\u0000\u0000\u036d\u036f\b\u0007\u0000\u0000\u036e\u036d"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u036e"+
		"\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0001\u0000\u0000\u0000\u0372\u0373\u00053\u0000\u0000\u0373=\u0001\u0000"+
		"\u0000\u0000\u0374\u0376\u0005\u0006\u0000\u0000\u0375\u0377\u0003\u0004"+
		"\u0002\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000"+
		"\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000"+
		"\u0000\u0000\u0379\u0382\u0001\u0000\u0000\u0000\u037a\u037c\u0005\u0019"+
		"\u0000\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000"+
		"\u0000\u0000\u037c\u037e\u0001\u0000\u0000\u0000\u037d\u037f\u0003\u0004"+
		"\u0002\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000"+
		"\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000"+
		"\u0000\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u037b\u0001\u0000"+
		"\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000"+
		"\u0000\u0000\u0384\u0386\u0005\t\u0000\u0000\u0385\u0387\u0003\u0004\u0002"+
		"\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000"+
		"\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000"+
		"\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u038c\u0003f3\u0000\u038b"+
		"\u038d\b\u0000\u0000\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391"+
		"\u00053\u0000\u0000\u0391?\u0001\u0000\u0000\u0000\u0392\u0394\u0003\u0004"+
		"\u0002\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0394\u0397\u0001\u0000"+
		"\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000"+
		"\u0000\u0000\u0396\u0398\u0001\u0000\u0000\u0000\u0397\u0395\u0001\u0000"+
		"\u0000\u0000\u0398\u039a\u0005\u001d\u0000\u0000\u0399\u039b\b\u0000\u0000"+
		"\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000"+
		"\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000"+
		"\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039f\u00053\u0000\u0000"+
		"\u039fA\u0001\u0000\u0000\u0000\u03a0\u03a2\u0003\u0004\u0002\u0000\u03a1"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a8\u0003@ \u0000\u03a7\u03a3\u0001\u0000\u0000\u0000\u03a8\u03ab\u0001"+
		"\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001"+
		"\u0000\u0000\u0000\u03aa\u03af\u0001\u0000\u0000\u0000\u03ab\u03a9\u0001"+
		"\u0000\u0000\u0000\u03ac\u03ae\u0003\u0004\u0002\u0000\u03ad\u03ac\u0001"+
		"\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3\u0003"+
		"D\"\u0000\u03b3C\u0001\u0000\u0000\u0000\u03b4\u03b6\u0005\u0006\u0000"+
		"\u0000\u03b5\u03b7\u0003\u0004\u0002\u0000\u03b6\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bc\u0005&\u0000\u0000\u03bb\u03bd\u0003\u0004\u0002\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000"+
		"\u03be\u03bc\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c4\u0003f3\u0000\u03c1\u03c3"+
		"\u0003\u0004\u0002\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c7\u0001\u0000\u0000\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c7\u03cb\u0005/\u0000\u0000\u03c8\u03ca\b"+
		"\u0005\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cd\u0001"+
		"\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd\u03cb\u0001"+
		"\u0000\u0000\u0000\u03ce\u03d2\u00050\u0000\u0000\u03cf\u03d1\t\u0000"+
		"\u0000\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d9\u00053\u0000\u0000\u03d6\u03d8\u0003\u0004\u0002"+
		"\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d8\u03db\u0001\u0000\u0000"+
		"\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000"+
		"\u0000\u03da\u03dc\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000"+
		"\u0000\u03dc\u03e0\u0005*\u0000\u0000\u03dd\u03df\u0003\u0004\u0002\u0000"+
		"\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e4\u00053\u0000\u0000\u03e4\u03e6\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e7\u0003\u0004\u0002\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e7"+
		"\u03e8\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e8"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e9E\u0001\u0000\u0000\u0000\u03ea\u03ec"+
		"\u0003\u0004\u0002\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ef"+
		"\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee"+
		"\u0001\u0000\u0000\u0000\u03ee\u03f0\u0001\u0000\u0000\u0000\u03ef\u03ed"+
		"\u0001\u0000\u0000\u0000\u03f0\u03f2\u0003@ \u0000\u03f1\u03ed\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f9\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f8\u0003\u0004"+
		"\u0002\u0000\u03f7\u03f6\u0001\u0000\u0000\u0000\u03f8\u03fb\u0001\u0000"+
		"\u0000\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000"+
		"\u0000\u0000\u03fa\u03fc\u0001\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000"+
		"\u0000\u0000\u03fc\u03fd\u0003H$\u0000\u03fdG\u0001\u0000\u0000\u0000"+
		"\u03fe\u0400\u0005\u0006\u0000\u0000\u03ff\u0401\u0003\u0004\u0002\u0000"+
		"\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000"+
		"\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000"+
		"\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0406\u0005$\u0000\u0000\u0405"+
		"\u0407\u0003\u0004\u0002\u0000\u0406\u0405\u0001\u0000\u0000\u0000\u0407"+
		"\u0408\u0001\u0000\u0000\u0000\u0408\u0406\u0001\u0000\u0000\u0000\u0408"+
		"\u0409\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a"+
		"\u040c\u0003f3\u0000\u040b\u040d\b\u0000\u0000\u0000\u040c\u040b\u0001"+
		"\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040c\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0410\u0001"+
		"\u0000\u0000\u0000\u0410\u0411\u00053\u0000\u0000\u0411I\u0001\u0000\u0000"+
		"\u0000\u0412\u0414\u0003\u0004\u0002\u0000\u0413\u0412\u0001\u0000\u0000"+
		"\u0000\u0414\u0417\u0001\u0000\u0000\u0000\u0415\u0413\u0001\u0000\u0000"+
		"\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0418\u0001\u0000\u0000"+
		"\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0418\u0419\u0003L&\u0000\u0419"+
		"K\u0001\u0000\u0000\u0000\u041a\u041c\u0005\u0006\u0000\u0000\u041b\u041d"+
		"\u0003\u0004\u0002\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0001\u0000\u0000\u0000\u041e\u041c\u0001\u0000\u0000\u0000\u041e\u041f"+
		"\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422"+
		"\u0005\u0007\u0000\u0000\u0421\u0423\u0003\u0004\u0002\u0000\u0422\u0421"+
		"\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424\u0422"+
		"\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0426"+
		"\u0001\u0000\u0000\u0000\u0426\u0428\u0003f3\u0000\u0427\u0429\b\u0000"+
		"\u0000\u0000\u0428\u0427\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000"+
		"\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000"+
		"\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042d\u00053\u0000"+
		"\u0000\u042dM\u0001\u0000\u0000\u0000\u042e\u0430\u0003\u0004\u0002\u0000"+
		"\u042f\u042e\u0001\u0000\u0000\u0000\u0430\u0433\u0001\u0000\u0000\u0000"+
		"\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000"+
		"\u0432\u0434\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000"+
		"\u0434\u0436\u0003@ \u0000\u0435\u0431\u0001\u0000\u0000\u0000\u0436\u0439"+
		"\u0001\u0000\u0000\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0437\u0438"+
		"\u0001\u0000\u0000\u0000\u0438\u043d\u0001\u0000\u0000\u0000\u0439\u0437"+
		"\u0001\u0000\u0000\u0000\u043a\u043c\u0003\u0004\u0002\u0000\u043b\u043a"+
		"\u0001\u0000\u0000\u0000\u043c\u043f\u0001\u0000\u0000\u0000\u043d\u043b"+
		"\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u0440"+
		"\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u0440\u0441"+
		"\u0003P(\u0000\u0441O\u0001\u0000\u0000\u0000\u0442\u0444\u0005\u0006"+
		"\u0000\u0000\u0443\u0445\u0003\u0004\u0002\u0000\u0444\u0443\u0001\u0000"+
		"\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000"+
		"\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000"+
		"\u0000\u0000\u0448\u044a\u0005%\u0000\u0000\u0449\u044b\u0003\u0004\u0002"+
		"\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000"+
		"\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u0452\u0003f3\u0000\u044f"+
		"\u0451\u0003\u0004\u0002\u0000\u0450\u044f\u0001\u0000\u0000\u0000\u0451"+
		"\u0454\u0001\u0000\u0000\u0000\u0452\u0450\u0001\u0000\u0000\u0000\u0452"+
		"\u0453\u0001\u0000\u0000\u0000\u0453\u0458\u0001\u0000\u0000\u0000\u0454"+
		"\u0452\u0001\u0000\u0000\u0000\u0455\u0457\b\b\u0000\u0000\u0456\u0455"+
		"\u0001\u0000\u0000\u0000\u0457\u045a\u0001\u0000\u0000\u0000\u0458\u0456"+
		"\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045b"+
		"\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000\u0000\u045b\u045f"+
		"\u0005)\u0000\u0000\u045c\u045e\u0003\u0004\u0002\u0000\u045d\u045c\u0001"+
		"\u0000\u0000\u0000\u045e\u0461\u0001\u0000\u0000\u0000\u045f\u045d\u0001"+
		"\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0463\u0001"+
		"\u0000\u0000\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0462\u0464\b\t"+
		"\u0000\u0000\u0463\u0462\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000"+
		"\u0000\u0000\u0466\u046a\u0001\u0000\u0000\u0000\u0467\u0469\u0003\u0004"+
		"\u0002\u0000\u0468\u0467\u0001\u0000\u0000\u0000\u0469\u046c\u0001\u0000"+
		"\u0000\u0000\u046a\u0468\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000"+
		"\u0000\u0000\u046b\u046d\u0001\u0000\u0000\u0000\u046c\u046a\u0001\u0000"+
		"\u0000\u0000\u046d\u0471\u0005*\u0000\u0000\u046e\u0470\u0003\u0004\u0002"+
		"\u0000\u046f\u046e\u0001\u0000\u0000\u0000\u0470\u0473\u0001\u0000\u0000"+
		"\u0000\u0471\u046f\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000"+
		"\u0000\u0472\u0474\u0001\u0000\u0000\u0000\u0473\u0471\u0001\u0000\u0000"+
		"\u0000\u0474\u0475\u00053\u0000\u0000\u0475Q\u0001\u0000\u0000\u0000\u0476"+
		"\u0478\u0003\u0004\u0002\u0000\u0477\u0476\u0001\u0000\u0000\u0000\u0478"+
		"\u047b\u0001\u0000\u0000\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u0479"+
		"\u047a\u0001\u0000\u0000\u0000\u047a\u047c\u0001\u0000\u0000\u0000\u047b"+
		"\u0479\u0001\u0000\u0000\u0000\u047c\u047e\u0003@ \u0000\u047d\u0479\u0001"+
		"\u0000\u0000\u0000\u047e\u0481\u0001\u0000\u0000\u0000\u047f\u047d\u0001"+
		"\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u0485\u0001"+
		"\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000\u0000\u0482\u0484\u0003"+
		"\u0004\u0002\u0000\u0483\u0482\u0001\u0000\u0000\u0000\u0484\u0487\u0001"+
		"\u0000\u0000\u0000\u0485\u0483\u0001\u0000\u0000\u0000\u0485\u0486\u0001"+
		"\u0000\u0000\u0000\u0486\u0488\u0001\u0000\u0000\u0000\u0487\u0485\u0001"+
		"\u0000\u0000\u0000\u0488\u0489\u0003T*\u0000\u0489S\u0001\u0000\u0000"+
		"\u0000\u048a\u048c\u0005\u0006\u0000\u0000\u048b\u048d\u0003\u0004\u0002"+
		"\u0000\u048c\u048b\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000"+
		"\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000"+
		"\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0492\u0005(\u0000\u0000"+
		"\u0491\u0493\u0003\u0004\u0002\u0000\u0492\u0491\u0001\u0000\u0000\u0000"+
		"\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u0492\u0001\u0000\u0000\u0000"+
		"\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000\u0000"+
		"\u0496\u049a\u0003f3\u0000\u0497\u0499\t\u0000\u0000\u0000\u0498\u0497"+
		"\u0001\u0000\u0000\u0000\u0499\u049c\u0001\u0000\u0000\u0000\u049a\u049b"+
		"\u0001\u0000\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049b\u04a0"+
		"\u0001\u0000\u0000\u0000\u049c\u049a\u0001\u0000\u0000\u0000\u049d\u049f"+
		"\u0003\u0004\u0002\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049f\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a0\u049e\u0001\u0000\u0000\u0000\u04a0\u04a1"+
		"\u0001\u0000\u0000\u0000\u04a1\u04a3\u0001\u0000\u0000\u0000\u04a2\u04a0"+
		"\u0001\u0000\u0000\u0000\u04a3\u04a4\u0005*\u0000\u0000\u04a4\u04a5\u0005"+
		"3\u0000\u0000\u04a5U\u0001\u0000\u0000\u0000\u04a6\u04a8\u0003\u0004\u0002"+
		"\u0000\u04a7\u04a6\u0001\u0000\u0000\u0000\u04a8\u04ab\u0001\u0000\u0000"+
		"\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000"+
		"\u0000\u04aa\u04ac\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000"+
		"\u0000\u04ac\u04ad\u0003X,\u0000\u04adW\u0001\u0000\u0000\u0000\u04ae"+
		"\u04b0\u0005\u001b\u0000\u0000\u04af\u04b1\b\u0000\u0000\u0000\u04b0\u04af"+
		"\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b4"+
		"\u0001\u0000\u0000\u0000\u04b4\u04b5\u00053\u0000\u0000\u04b5Y\u0001\u0000"+
		"\u0000\u0000\u04b6\u04b8\u0003\u0004\u0002\u0000\u04b7\u04b6\u0001\u0000"+
		"\u0000\u0000\u04b8\u04bb\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000"+
		"\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bc\u0001\u0000"+
		"\u0000\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bc\u04c0\u0005 \u0000"+
		"\u0000\u04bd\u04bf\u0003\u0004\u0002\u0000\u04be\u04bd\u0001\u0000\u0000"+
		"\u0000\u04bf\u04c2\u0001\u0000\u0000\u0000\u04c0\u04be\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c3\u04c5\u00053\u0000\u0000"+
		"\u04c4\u04c3\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000"+
		"\u04c5\u04c7\u0001\u0000\u0000\u0000\u04c6\u04c8\b\n\u0000\u0000\u04c7"+
		"\u04c6\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca"+
		"[\u0001\u0000\u0000\u0000\u04cb\u04cc\u0003\u0004\u0002\u0000\u04cc]\u0001"+
		"\u0000\u0000\u0000\u04cd\u04cf\u0003\u0004\u0002\u0000\u04ce\u04cd\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d2\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d3\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d5\u0005"+
		"\u001f\u0000\u0000\u04d4\u04d6\b\u0000\u0000\u0000\u04d5\u04d4\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000"+
		"\u0000\u0000\u04d9\u04da\u00053\u0000\u0000\u04da_\u0001\u0000\u0000\u0000"+
		"\u04db\u04dd\u0003\u0004\u0002\u0000\u04dc\u04db\u0001\u0000\u0000\u0000"+
		"\u04dd\u04e0\u0001\u0000\u0000\u0000\u04de\u04dc\u0001\u0000\u0000\u0000"+
		"\u04de\u04df\u0001\u0000\u0000\u0000\u04df\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e0\u04de\u0001\u0000\u0000\u0000\u04e1\u04e5\u0005\u0006\u0000\u0000"+
		"\u04e2\u04e4\u0003\\.\u0000\u04e3\u04e2\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e7\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5"+
		"\u04e6\u0001\u0000\u0000\u0000\u04e6\u04e8\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e8\u04ea\u0005\u001e\u0000\u0000\u04e9"+
		"\u04eb\b\u0000\u0000\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ed"+
		"\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000\u0000\u04ee\u04ef"+
		"\u00053\u0000\u0000\u04efa\u0001\u0000\u0000\u0000\u04f0\u04f2\u0003\u0004"+
		"\u0002\u0000\u04f1\u04f0\u0001\u0000\u0000\u0000\u04f2\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f3\u04f1\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f6\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f6\u04fa\u0005\u0006\u0000\u0000\u04f7\u04f9\u0003\u0004"+
		"\u0002\u0000\u04f8\u04f7\u0001\u0000\u0000\u0000\u04f9\u04fc\u0001\u0000"+
		"\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fa\u04fb\u0001\u0000"+
		"\u0000\u0000\u04fb\u04fd\u0001\u0000\u0000\u0000\u04fc\u04fa\u0001\u0000"+
		"\u0000\u0000\u04fd\u0501\u0005,\u0000\u0000\u04fe\u0500\u0003\u0004\u0002"+
		"\u0000\u04ff\u04fe\u0001\u0000\u0000\u0000\u0500\u0503\u0001\u0000\u0000"+
		"\u0000\u0501\u04ff\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000"+
		"\u0000\u0502\u0504\u0001\u0000\u0000\u0000\u0503\u0501\u0001\u0000\u0000"+
		"\u0000\u0504\u0506\u0005-\u0000\u0000\u0505\u0507\b\u0000\u0000\u0000"+
		"\u0506\u0505\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000\u0000\u0000"+
		"\u0508\u0506\u0001\u0000\u0000\u0000\u0508\u0509\u0001\u0000\u0000\u0000"+
		"\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u050b\u00053\u0000\u0000\u050b"+
		"c\u0001\u0000\u0000\u0000\u050c\u050e\u0003\u0004\u0002\u0000\u050d\u050c"+
		"\u0001\u0000\u0000\u0000\u050e\u0511\u0001\u0000\u0000\u0000\u050f\u050d"+
		"\u0001\u0000\u0000\u0000\u050f\u0510\u0001\u0000\u0000\u0000\u0510\u0512"+
		"\u0001\u0000\u0000\u0000\u0511\u050f\u0001\u0000\u0000\u0000\u0512\u0516"+
		"\u0005\u0006\u0000\u0000\u0513\u0515\u0003\u0004\u0002\u0000\u0514\u0513"+
		"\u0001\u0000\u0000\u0000\u0515\u0518\u0001\u0000\u0000\u0000\u0516\u0514"+
		"\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000\u0000\u0517\u0519"+
		"\u0001\u0000\u0000\u0000\u0518\u0516\u0001\u0000\u0000\u0000\u0519\u051d"+
		"\u0005.\u0000\u0000\u051a\u051c\u0003\u0004\u0002\u0000\u051b\u051a\u0001"+
		"\u0000\u0000\u0000\u051c\u051f\u0001\u0000\u0000\u0000\u051d\u051b\u0001"+
		"\u0000\u0000\u0000\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u0521\u0001"+
		"\u0000\u0000\u0000\u051f\u051d\u0001\u0000\u0000\u0000\u0520\u0522\b\u0000"+
		"\u0000\u0000\u0521\u0520\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000"+
		"\u0000\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0523\u0524\u0001\u0000"+
		"\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0526\u00053\u0000"+
		"\u0000\u0526e\u0001\u0000\u0000\u0000\u0527\u052b\u0003h4\u0000\u0528"+
		"\u052a\u0003\\.\u0000\u0529\u0528\u0001\u0000\u0000\u0000\u052a\u052d"+
		"\u0001\u0000\u0000\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052b\u052c"+
		"\u0001\u0000\u0000\u0000\u052c\u052e\u0001\u0000\u0000\u0000\u052d\u052b"+
		"\u0001\u0000\u0000\u0000\u052e\u052f\u0005@\u0000\u0000\u052f\u0531\u0001"+
		"\u0000\u0000\u0000\u0530\u0527\u0001\u0000\u0000\u0000\u0530\u0531\u0001"+
		"\u0000\u0000\u0000\u0531\u0535\u0001\u0000\u0000\u0000\u0532\u0534\u0003"+
		"\\.\u0000\u0533\u0532\u0001\u0000\u0000\u0000\u0534\u0537\u0001\u0000"+
		"\u0000\u0000\u0535\u0533\u0001\u0000\u0000\u0000\u0535\u0536\u0001\u0000"+
		"\u0000\u0000\u0536\u0538\u0001\u0000\u0000\u0000\u0537\u0535\u0001\u0000"+
		"\u0000\u0000\u0538\u053c\u0003j5\u0000\u0539\u053b\u0003\\.\u0000\u053a"+
		"\u0539\u0001\u0000\u0000\u0000\u053b\u053e\u0001\u0000\u0000\u0000\u053c"+
		"\u053a\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000\u0000\u053d"+
		"\u053f\u0001\u0000\u0000\u0000\u053e\u053c\u0001\u0000\u0000\u0000\u053f"+
		"\u0540\u0005@\u0000\u0000\u0540\u0542\u0001\u0000\u0000\u0000\u0541\u0530"+
		"\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u0546"+
		"\u0001\u0000\u0000\u0000\u0543\u0545\u0003\\.\u0000\u0544\u0543\u0001"+
		"\u0000\u0000\u0000\u0545\u0548\u0001\u0000\u0000\u0000\u0546\u0544\u0001"+
		"\u0000\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547\u0549\u0001"+
		"\u0000\u0000\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0549\u054a\u0003"+
		"l6\u0000\u054ag\u0001\u0000\u0000\u0000\u054b\u054c\u0003n7\u0000\u054c"+
		"i\u0001\u0000\u0000\u0000\u054d\u054e\u0003n7\u0000\u054ek\u0001\u0000"+
		"\u0000\u0000\u054f\u0550\u0003n7\u0000\u0550m\u0001\u0000\u0000\u0000"+
		"\u0551\u0557\u0003r9\u0000\u0552\u0553\u00054\u0000\u0000\u0553\u0554"+
		"\u0003p8\u0000\u0554\u0555\u00054\u0000\u0000\u0555\u0557\u0001\u0000"+
		"\u0000\u0000\u0556\u0551\u0001\u0000\u0000\u0000\u0556\u0552\u0001\u0000"+
		"\u0000\u0000\u0557o\u0001\u0000\u0000\u0000\u0558\u055a\u0003\\.\u0000"+
		"\u0559\u0558\u0001\u0000\u0000\u0000\u055a\u055d\u0001\u0000\u0000\u0000"+
		"\u055b\u0559\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000"+
		"\u055c\u055e\u0001\u0000\u0000\u0000\u055d\u055b\u0001\u0000\u0000\u0000"+
		"\u055e\u0562\u0003r9\u0000\u055f\u0561\u0003\\.\u0000\u0560\u055f\u0001"+
		"\u0000\u0000\u0000\u0561\u0564\u0001\u0000\u0000\u0000\u0562\u0560\u0001"+
		"\u0000\u0000\u0000\u0562\u0563\u0001\u0000\u0000\u0000\u0563\u0574\u0001"+
		"\u0000\u0000\u0000\u0564\u0562\u0001\u0000\u0000\u0000\u0565\u0567\u0003"+
		"\\.\u0000\u0566\u0565\u0001\u0000\u0000\u0000\u0567\u056a\u0001\u0000"+
		"\u0000\u0000\u0568\u0566\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000"+
		"\u0000\u0000\u0569\u056b\u0001\u0000\u0000\u0000\u056a\u0568\u0001\u0000"+
		"\u0000\u0000\u056b\u056f\u0003r9\u0000\u056c\u056e\u0003\\.\u0000\u056d"+
		"\u056c\u0001\u0000\u0000\u0000\u056e\u0571\u0001\u0000\u0000\u0000\u056f"+
		"\u056d\u0001\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570"+
		"\u0573\u0001\u0000\u0000\u0000\u0571\u056f\u0001\u0000\u0000\u0000\u0572"+
		"\u0568\u0001\u0000\u0000\u0000\u0573\u0576\u0001\u0000\u0000\u0000\u0574"+
		"\u0572\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000\u0575"+
		"q\u0001\u0000\u0000\u0000\u0576\u0574\u0001\u0000\u0000\u0000\u0577\u0578"+
		"\u0007\u000b\u0000\u0000\u0578s\u0001\u0000\u0000\u0000\u00c0w}\u008f"+
		"\u0095\u00a3\u00a8\u00ad\u00b3\u00ba\u00c1\u00c9\u00d1\u00d8\u00de\u00e4"+
		"\u00ed\u00f6\u00fc\u0102\u010a\u0111\u0118\u0120\u0129\u012f\u0135\u013b"+
		"\u0142\u014b\u0151\u0157\u015e\u0167\u016d\u0175\u017e\u0182\u0187\u018e"+
		"\u0194\u019a\u01a1\u01aa\u01b0\u01b7\u01c0\u01c6\u01cd\u01d3\u01d9\u01e2"+
		"\u01e8\u01ee\u01f5\u01fe\u0204\u020a\u0211\u0217\u021d\u0223\u022a\u0235"+
		"\u023b\u0241\u0245\u0249\u0250\u0258\u025e\u0260\u0266\u026e\u0274\u027a"+
		"\u0280\u0287\u028b\u0290\u0296\u029d\u02a4\u02ad\u02b3\u02ba\u02c1\u02c7"+
		"\u02cd\u02d3\u02d9\u02df\u02e6\u02ec\u02f4\u02fa\u0300\u0306\u030c\u0311"+
		"\u0316\u031d\u0324\u032b\u0331\u0337\u033d\u0343\u034a\u0351\u0358\u035f"+
		"\u0365\u036b\u0370\u0378\u037b\u0380\u0382\u0388\u038e\u0395\u039c\u03a3"+
		"\u03a9\u03af\u03b8\u03be\u03c4\u03cb\u03d2\u03d9\u03e0\u03e8\u03ed\u03f3"+
		"\u03f9\u0402\u0408\u040e\u0415\u041e\u0424\u042a\u0431\u0437\u043d\u0446"+
		"\u044c\u0452\u0458\u045f\u0465\u046a\u0471\u0479\u047f\u0485\u048e\u0494"+
		"\u049a\u04a0\u04a9\u04b2\u04b9\u04c0\u04c4\u04c9\u04d0\u04d7\u04de\u04e5"+
		"\u04ec\u04f3\u04fa\u0501\u0508\u050f\u0516\u051d\u0523\u052b\u0530\u0535"+
		"\u053c\u0541\u0546\u0556\u055b\u0562\u0568\u056f\u0574";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}