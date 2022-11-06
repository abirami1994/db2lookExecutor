// Generated from /Users/p3inm035/IdeaProjects/a360-migrator-service/src/main/java/com/p3solutions/db2lookExecutor/parser/Db2Look.g4 by ANTLR 4.10.1
package com.p3solutions.db2lookExecutor.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Db2LookParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONNECT=1, TO=2, SUMMARY=3, TYPE=4, WRAPPER=5, SEQUENCE=6, CREATE=7, ALIAS=8, 
		ALTER=9, INDEX=10, LARGE=11, REGULAR=12, SYSTEM=13, USER=14, TEMPORARY=15, 
		TABLESPACE=16, SCHEMA=17, REFRESH=18, TABLE=19, ADD=20, PRIMARY_KEY=21, 
		FOREIGN_KEY=22, DATABASE=23, PARTITION=24, GROUP=25, UNIQUE=26, CHECK=27, 
		GRANT=28, RESET=29, SET=30, TRUSTED_CONTEXT=31, COMMIT=32, TERMINATE=33, 
		BUFFERPOOL=34, STOGROUP=35, OR_REPLACE=36, VIEW=37, PROCEDURE=38, FUNCTION=39, 
		COMMENT=40, TRIGGER=41, BEGIN=42, END=43, CONSTRAINT=44, AUDIT=45, POLICY=46, 
		ROLE=47, SERVER=48, MAPPING=49, NICKNAME=50, TERMINATOR=51, LT_BRACKET=52, 
		RT_BRACKET=53, SYMBOL9=54, SLASH=55, SEMI_COLON=56, QUOTATION=57, COMMA=58, 
		SPACE=59, TAB=60, TAB1=61, TAB3=62, CURLY_BRACKET1=63, CURLY_BRACKET2=64, 
		COMMENTS=65, SINGLE_COMMENTS=66, HASH_SKIPPER=67, POINTER_SYMBOL=68, DOT=69, 
		NUMS=70, NUMBER=71, EQUAL=72, OR_OPERATOR=73, LT_SET_BRACKET=74, RT_SET_BRACKET=75, 
		ASTRIEK=76, SMALLER_THAN=77, GREATER_THAN=78, PERCENTAGE=79, PLUS=80, 
		SUB=81, DOLLAR=82, DECLARE=83, ASTERIK=84, EXCLAMATION=85, WORD=86, DIGIT=87, 
		LOWERCASE=88, UPPERCASE=89, COLON=90, QUESTION_MARK=91;
	public static final int
		RULE_fileHandler = 0, RULE_alterNickNameStatement = 1, RULE_createNickStatement = 2, 
		RULE_createUserMappingStatement = 3, RULE_alterViewStatement = 4, RULE_createServerStatement = 5, 
		RULE_alterSequence = 6, RULE_createWrapperStatement = 7, RULE_tabSpace = 8, 
		RULE_connectStatement = 9, RULE_connectDbQuery = 10, RULE_connectResetQuery = 11, 
		RULE_createDatabasePartitionGroupStatement = 12, RULE_createDbPartitionGroupQuery = 13, 
		RULE_createBufferPoolStatement = 14, RULE_createBufferPoolQuery = 15, 
		RULE_mimicStorageGroupStatement = 16, RULE_mimicStorageGroupQuery = 17, 
		RULE_createTableSpaceStatement = 18, RULE_createTableSpaceQuery = 19, 
		RULE_mimicTableSpaceStatement = 20, RULE_mimicTableSpaceQuery = 21, RULE_createSchemaStatement = 22, 
		RULE_createSchemaQuery = 23, RULE_createTypeStatement = 24, RULE_createTypeQuery = 25, 
		RULE_createSequenceStatement = 26, RULE_createSequenceQuery = 27, RULE_tableSegment = 28, 
		RULE_commentQuery = 29, RULE_createTableQuery = 30, RULE_alterTableAddPrimaryKeyQuery = 31, 
		RULE_refreshTableQuery = 32, RULE_alterTableAddForeignKeyQuery = 33, RULE_alterTableAddUniqueConstraintQuery = 34, 
		RULE_alterTableAddCheckConstraintQuery = 35, RULE_otherAlterQuery = 36, 
		RULE_createIndexQuery = 37, RULE_setStatement = 38, RULE_userDefinedFunctions = 39, 
		RULE_createUDFQuery = 40, RULE_createViewStatement = 41, RULE_createViewQuery = 42, 
		RULE_aliasStatement = 43, RULE_aliasQuery = 44, RULE_createStoredProcedureStatement = 45, 
		RULE_createProcedureQuery = 46, RULE_createTriggerStatement = 47, RULE_createTriggerQuery = 48, 
		RULE_grantStatement = 49, RULE_grantQuery = 50, RULE_terminateStatement = 51, 
		RULE_space = 52, RULE_commitStatement = 53, RULE_trustedContextStatement = 54, 
		RULE_createAuditStatement = 55, RULE_createRoleStatement = 56, RULE_fullNameModel = 57, 
		RULE_databaseName = 58, RULE_schemaName = 59, RULE_tableName = 60, RULE_name = 61, 
		RULE_variable = 62, RULE_handle = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileHandler", "alterNickNameStatement", "createNickStatement", "createUserMappingStatement", 
			"alterViewStatement", "createServerStatement", "alterSequence", "createWrapperStatement", 
			"tabSpace", "connectStatement", "connectDbQuery", "connectResetQuery", 
			"createDatabasePartitionGroupStatement", "createDbPartitionGroupQuery", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'('", "')'", null, null, "';'", null, null, 
			null, null, null, null, null, null, null, null, null, "'=>'", "'.'", 
			null, null, "'='", "'|'", "'['", "']'", "'*'", "'<'", "'>'", "'%'", "'+'", 
			"'-'", "'$'", null, "'&'", "'!'", null, null, null, null, "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONNECT", "TO", "SUMMARY", "TYPE", "WRAPPER", "SEQUENCE", "CREATE", 
			"ALIAS", "ALTER", "INDEX", "LARGE", "REGULAR", "SYSTEM", "USER", "TEMPORARY", 
			"TABLESPACE", "SCHEMA", "REFRESH", "TABLE", "ADD", "PRIMARY_KEY", "FOREIGN_KEY", 
			"DATABASE", "PARTITION", "GROUP", "UNIQUE", "CHECK", "GRANT", "RESET", 
			"SET", "TRUSTED_CONTEXT", "COMMIT", "TERMINATE", "BUFFERPOOL", "STOGROUP", 
			"OR_REPLACE", "VIEW", "PROCEDURE", "FUNCTION", "COMMENT", "TRIGGER", 
			"BEGIN", "END", "CONSTRAINT", "AUDIT", "POLICY", "ROLE", "SERVER", "MAPPING", 
			"NICKNAME", "TERMINATOR", "LT_BRACKET", "RT_BRACKET", "SYMBOL9", "SLASH", 
			"SEMI_COLON", "QUOTATION", "COMMA", "SPACE", "TAB", "TAB1", "TAB3", "CURLY_BRACKET1", 
			"CURLY_BRACKET2", "COMMENTS", "SINGLE_COMMENTS", "HASH_SKIPPER", "POINTER_SYMBOL", 
			"DOT", "NUMS", "NUMBER", "EQUAL", "OR_OPERATOR", "LT_SET_BRACKET", "RT_SET_BRACKET", 
			"ASTRIEK", "SMALLER_THAN", "GREATER_THAN", "PERCENTAGE", "PLUS", "SUB", 
			"DOLLAR", "DECLARE", "ASTERIK", "EXCLAMATION", "WORD", "DIGIT", "LOWERCASE", 
			"UPPERCASE", "COLON", "QUESTION_MARK"
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
		public List<CommentQueryContext> commentQuery() {
			return getRuleContexts(CommentQueryContext.class);
		}
		public CommentQueryContext commentQuery(int i) {
			return getRuleContext(CommentQueryContext.class,i);
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
		public List<CreateIndexQueryContext> createIndexQuery() {
			return getRuleContexts(CreateIndexQueryContext.class);
		}
		public CreateIndexQueryContext createIndexQuery(int i) {
			return getRuleContext(CreateIndexQueryContext.class,i);
		}
		public List<AlterViewStatementContext> alterViewStatement() {
			return getRuleContexts(AlterViewStatementContext.class);
		}
		public AlterViewStatementContext alterViewStatement(int i) {
			return getRuleContext(AlterViewStatementContext.class,i);
		}
		public List<CreateServerStatementContext> createServerStatement() {
			return getRuleContexts(CreateServerStatementContext.class);
		}
		public CreateServerStatementContext createServerStatement(int i) {
			return getRuleContext(CreateServerStatementContext.class,i);
		}
		public List<CreateWrapperStatementContext> createWrapperStatement() {
			return getRuleContexts(CreateWrapperStatementContext.class);
		}
		public CreateWrapperStatementContext createWrapperStatement(int i) {
			return getRuleContext(CreateWrapperStatementContext.class,i);
		}
		public List<CreateNickStatementContext> createNickStatement() {
			return getRuleContexts(CreateNickStatementContext.class);
		}
		public CreateNickStatementContext createNickStatement(int i) {
			return getRuleContext(CreateNickStatementContext.class,i);
		}
		public List<CreateUserMappingStatementContext> createUserMappingStatement() {
			return getRuleContexts(CreateUserMappingStatementContext.class);
		}
		public CreateUserMappingStatementContext createUserMappingStatement(int i) {
			return getRuleContext(CreateUserMappingStatementContext.class,i);
		}
		public List<AlterNickNameStatementContext> alterNickNameStatement() {
			return getRuleContexts(AlterNickNameStatementContext.class);
		}
		public AlterNickNameStatementContext alterNickNameStatement(int i) {
			return getRuleContext(AlterNickNameStatementContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					tabSpace();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(134);
							tabSpace();
							}
							} 
						}
						setState(139);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(140);
						connectStatement();
						}
						break;
					case 2:
						{
						setState(141);
						createDatabasePartitionGroupStatement();
						}
						break;
					case 3:
						{
						setState(142);
						createBufferPoolStatement();
						}
						break;
					case 4:
						{
						setState(143);
						mimicStorageGroupStatement();
						}
						break;
					case 5:
						{
						setState(144);
						createTableSpaceStatement();
						}
						break;
					case 6:
						{
						setState(145);
						mimicTableSpaceStatement();
						}
						break;
					case 7:
						{
						setState(146);
						createRoleStatement();
						}
						break;
					case 8:
						{
						setState(147);
						createSchemaStatement();
						}
						break;
					case 9:
						{
						setState(148);
						createTypeStatement();
						}
						break;
					case 10:
						{
						setState(149);
						createSequenceStatement();
						}
						break;
					case 11:
						{
						setState(150);
						alterSequence();
						}
						break;
					case 12:
						{
						setState(151);
						commentQuery();
						}
						break;
					case 13:
						{
						setState(152);
						alterTableAddForeignKeyQuery();
						}
						break;
					case 14:
						{
						{
						setState(162);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(156);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(153);
										tabSpace();
										}
										} 
									}
									setState(158);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
								}
								setState(159);
								setStatement();
								}
								} 
							}
							setState(164);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						}
						{
						setState(165);
						alterTableAddCheckConstraintQuery();
						}
						}
						}
						break;
					case 15:
						{
						setState(166);
						userDefinedFunctions();
						}
						break;
					case 16:
						{
						setState(167);
						createViewStatement();
						}
						break;
					case 17:
						{
						setState(168);
						aliasStatement();
						}
						break;
					case 18:
						{
						setState(169);
						tableSegment();
						}
						break;
					case 19:
						{
						setState(170);
						createStoredProcedureStatement();
						}
						break;
					case 20:
						{
						setState(171);
						createTriggerStatement();
						}
						break;
					case 21:
						{
						setState(172);
						createAuditStatement();
						}
						break;
					case 22:
						{
						setState(173);
						trustedContextStatement();
						}
						break;
					case 23:
						{
						setState(174);
						connectResetQuery();
						}
						break;
					case 24:
						{
						setState(175);
						createIndexQuery();
						}
						break;
					case 25:
						{
						setState(176);
						alterViewStatement();
						}
						break;
					case 26:
						{
						setState(177);
						createServerStatement();
						}
						break;
					case 27:
						{
						setState(178);
						createViewStatement();
						}
						break;
					case 28:
						{
						setState(179);
						createWrapperStatement();
						}
						break;
					case 29:
						{
						setState(180);
						createNickStatement();
						}
						break;
					case 30:
						{
						setState(181);
						createUserMappingStatement();
						}
						break;
					case 31:
						{
						setState(182);
						alterNickNameStatement();
						}
						break;
					case 32:
						{
						setState(183);
						grantStatement();
						}
						break;
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(186);
							tabSpace();
							}
							} 
						}
						setState(191);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					tabSpace();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(203);
			commitStatement();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					tabSpace();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(210);
			connectResetQuery();
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					tabSpace();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(217);
			terminateStatement();
			}
			setState(219);
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

	public static class AlterNickNameStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode NICKNAME() { return getToken(Db2LookParser.NICKNAME, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AlterNickNameStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterNickNameStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterNickNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterNickNameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterNickNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterNickNameStatementContext alterNickNameStatement() throws RecognitionException {
		AlterNickNameStatementContext _localctx = new AlterNickNameStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alterNickNameStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(221);
				tabSpace();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(ALTER);
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				tabSpace();
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(233);
			match(NICKNAME);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(239);
			match(TERMINATOR);
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

	public static class CreateNickStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode NICKNAME() { return getToken(Db2LookParser.NICKNAME, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateNickStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createNickStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateNickStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateNickStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateNickStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateNickStatementContext createNickStatement() throws RecognitionException {
		CreateNickStatementContext _localctx = new CreateNickStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createNickStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(241);
				tabSpace();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(CREATE);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				tabSpace();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(253);
			match(NICKNAME);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(259);
			match(TERMINATOR);
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

	public static class CreateUserMappingStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(Db2LookParser.USER, 0); }
		public TerminalNode MAPPING() { return getToken(Db2LookParser.MAPPING, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateUserMappingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUserMappingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateUserMappingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateUserMappingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateUserMappingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserMappingStatementContext createUserMappingStatement() throws RecognitionException {
		CreateUserMappingStatementContext _localctx = new CreateUserMappingStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createUserMappingStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(261);
				tabSpace();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(CREATE);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				tabSpace();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(273);
			match(USER);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				tabSpace();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(279);
			match(MAPPING);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(285);
			match(TERMINATOR);
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

	public static class AlterViewStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(Db2LookParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(Db2LookParser.VIEW, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public AlterViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterViewStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterAlterViewStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitAlterViewStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitAlterViewStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterViewStatementContext alterViewStatement() throws RecognitionException {
		AlterViewStatementContext _localctx = new AlterViewStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alterViewStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(287);
				tabSpace();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(ALTER);
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
			match(VIEW);
			setState(301); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(305);
			match(TERMINATOR);
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

	public static class CreateServerStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode SERVER() { return getToken(Db2LookParser.SERVER, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateServerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createServerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateServerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateServerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateServerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateServerStatementContext createServerStatement() throws RecognitionException {
		CreateServerStatementContext _localctx = new CreateServerStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createServerStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(307);
				tabSpace();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(CREATE);
			setState(315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(314);
				tabSpace();
				}
				}
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(319);
			match(SERVER);
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(320);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(325);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 12, RULE_alterSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(327);
				tabSpace();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(ALTER);
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				tabSpace();
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(339);
			match(SEQUENCE);
			setState(341); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(340);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(343); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(345);
			fullNameModel();
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(351);
			match(TERMINATOR);
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

	public static class CreateWrapperStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Db2LookParser.CREATE, 0); }
		public TerminalNode WRAPPER() { return getToken(Db2LookParser.WRAPPER, 0); }
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public CreateWrapperStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createWrapperStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).enterCreateWrapperStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Db2LookListener ) ((Db2LookListener)listener).exitCreateWrapperStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Db2LookVisitor ) return ((Db2LookVisitor<? extends T>)visitor).visitCreateWrapperStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateWrapperStatementContext createWrapperStatement() throws RecognitionException {
		CreateWrapperStatementContext _localctx = new CreateWrapperStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createWrapperStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(353);
				tabSpace();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(CREATE);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				tabSpace();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(365);
			match(WRAPPER);
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(371);
			match(TERMINATOR);
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
		enterRule(_localctx, 16, RULE_tabSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 18, RULE_connectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(375);
				tabSpace();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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
		public TerminalNode TERMINATOR() { return getToken(Db2LookParser.TERMINATOR, 0); }
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
		enterRule(_localctx, 20, RULE_connectDbQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383);
			match(CONNECT);
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				tabSpace();
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(389);
			match(TO);
			setState(391); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(390);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(393); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(395);
			fullNameModel();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(396);
				tabSpace();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(TERMINATOR);
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
		public TerminalNode TERMINATOR() { return getToken(Db2LookParser.TERMINATOR, 0); }
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
		enterRule(_localctx, 22, RULE_connectResetQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(404);
				tabSpace();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(410);
			match(CONNECT);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(411);
				tabSpace();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(RESET);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(418);
				tabSpace();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(TERMINATOR);
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
		enterRule(_localctx, 24, RULE_createDatabasePartitionGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(426);
				tabSpace();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 26, RULE_createDbPartitionGroupQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(CREATE);
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435);
				tabSpace();
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(440);
			match(DATABASE);
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(441);
				tabSpace();
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(446);
			match(PARTITION);
			setState(448); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(447);
				tabSpace();
				}
				}
				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(452);
			match(GROUP);
			setState(454); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(453);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(458);
			match(TERMINATOR);
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
		enterRule(_localctx, 28, RULE_createBufferPoolStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(460);
				tabSpace();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 30, RULE_createBufferPoolQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(CREATE);
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(469);
				tabSpace();
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(474);
			match(BUFFERPOOL);
			setState(476); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(475);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(478); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(480);
			fullNameModel();
			setState(482); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(481);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(486);
			match(TERMINATOR);
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
		enterRule(_localctx, 32, RULE_mimicStorageGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(488);
				tabSpace();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 34, RULE_mimicStorageGroupQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(ALTER);
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(497);
				tabSpace();
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(502);
			match(STOGROUP);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(503);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(TERMINATOR);
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
		enterRule(_localctx, 36, RULE_createTableSpaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(511);
				tabSpace();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 38, RULE_createTableSpaceQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(CREATE);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					tabSpace();
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USER) {
				{
				setState(526);
				match(USER);
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(529);
				tabSpace();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LARGE) | (1L << REGULAR) | (1L << TEMPORARY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					tabSpace();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(543); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(542);
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
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << TERMINATOR) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(547);
			match(TABLESPACE);
			setState(549); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(548);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(553);
			match(TERMINATOR);
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
		enterRule(_localctx, 40, RULE_mimicTableSpaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(555);
				tabSpace();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 42, RULE_mimicTableSpaceQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(ALTER);
			setState(565); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(564);
				tabSpace();
				}
				}
				setState(567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(569);
			match(TABLESPACE);
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(575);
			match(TERMINATOR);
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
		enterRule(_localctx, 44, RULE_createSchemaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(577);
				tabSpace();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 46, RULE_createSchemaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(CREATE);
			setState(587); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586);
				tabSpace();
				}
				}
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(591);
			match(SCHEMA);
			setState(593); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(592);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(595); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(597);
			match(TERMINATOR);
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
		enterRule(_localctx, 48, RULE_createTypeStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(599);
							tabSpace();
							}
							} 
						}
						setState(604);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					}
					setState(605);
					setStatement();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(611);
				tabSpace();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 50, RULE_createTypeQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(CREATE);
			setState(621); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(620);
				tabSpace();
				}
				}
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(625);
			match(TYPE);
			setState(627); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(626);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(629); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(631);
			fullNameModel();
			setState(633); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(632);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(637);
			match(TERMINATOR);
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
		enterRule(_localctx, 52, RULE_createSequenceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(639);
				tabSpace();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 54, RULE_createSequenceQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(CREATE);
			setState(649); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(648);
				tabSpace();
				}
				}
				setState(651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(653);
			match(SEQUENCE);
			setState(655); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(654);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(657); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(659);
			fullNameModel();
			setState(661); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(660);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(665);
			match(TERMINATOR);
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
		enterRule(_localctx, 56, RULE_tableSegment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					tabSpace();
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(673);
							tabSpace();
							}
							} 
						}
						setState(678);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
					setState(679);
					setStatement();
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(685);
					tabSpace();
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(691);
			createTableQuery();
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(692);
							tabSpace();
							}
							} 
						}
						setState(697);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					}
					setState(722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(698);
						commentQuery();
						}
						break;
					case 2:
						{
						setState(699);
						alterTableAddPrimaryKeyQuery();
						}
						break;
					case 3:
						{
						setState(700);
						refreshTableQuery();
						}
						break;
					case 4:
						{
						setState(701);
						alterTableAddUniqueConstraintQuery();
						}
						break;
					case 5:
						{
						setState(702);
						otherAlterQuery();
						}
						break;
					case 6:
						{
						{
						setState(712);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(706);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(703);
										tabSpace();
										}
										} 
									}
									setState(708);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
								}
								setState(709);
								setStatement();
								}
								} 
							}
							setState(714);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
						}
						setState(718);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(715);
								tabSpace();
								}
								} 
							}
							setState(720);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
						}
						setState(721);
						createIndexQuery();
						}
						}
						break;
					}
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
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
		enterRule(_localctx, 58, RULE_commentQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(729);
				tabSpace();
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(735);
			match(COMMENT);
			setState(737); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(736);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(739); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(741);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
		public List<TabSpaceContext> tabSpace() {
			return getRuleContexts(TabSpaceContext.class);
		}
		public TabSpaceContext tabSpace(int i) {
			return getRuleContext(TabSpaceContext.class,i);
		}
		public TerminalNode SUMMARY() { return getToken(Db2LookParser.SUMMARY, 0); }
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
		enterRule(_localctx, 60, RULE_createTableQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(743);
				tabSpace();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			match(CREATE);
			setState(751); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(750);
				tabSpace();
				}
				}
				setState(753); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUMMARY) {
				{
				setState(755);
				match(SUMMARY);
				setState(757); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(756);
					tabSpace();
					}
					}
					setState(759); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				}
			}

			setState(763);
			match(TABLE);
			setState(765); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(764);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(769);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 62, RULE_alterTableAddPrimaryKeyQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(771);
				tabSpace();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(ALTER);
			setState(779); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(778);
				tabSpace();
				}
				}
				setState(781); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(783);
			match(TABLE);
			setState(785); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(784);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(787); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(789);
			fullNameModel();
			setState(791); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(790);
				tabSpace();
				}
				}
				setState(793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(795);
			match(ADD);
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(796);
					tabSpace();
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(802);
				match(CONSTRAINT);
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(803);
						tabSpace();
						}
						} 
					}
					setState(808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(809);
				fullNameModel();
				}
				break;
			}
			setState(813); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(812);
				tabSpace();
				}
				}
				setState(815); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(817);
			match(PRIMARY_KEY);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(818);
				tabSpace();
				}
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(824);
			match(LT_BRACKET);
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << TERMINATOR) | (1L << LT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0)) {
				{
				{
				setState(825);
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
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(831);
			match(RT_BRACKET);
			setState(833); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(832);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(835); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(837);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 64, RULE_refreshTableQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(REFRESH);
			setState(847); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(846);
				tabSpace();
				}
				}
				setState(849); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(851);
			match(TABLE);
			setState(853); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(852);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(855); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(857);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 66, RULE_alterTableAddForeignKeyQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(859);
				tabSpace();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			match(ALTER);
			setState(867); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(866);
				tabSpace();
				}
				}
				setState(869); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(871);
			match(TABLE);
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
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(877);
			fullNameModel();
			setState(879); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(878);
				tabSpace();
				}
				}
				setState(881); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(883);
			match(ADD);
			setState(885); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(884);
				tabSpace();
				}
				}
				setState(887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(889);
			match(CONSTRAINT);
			setState(891); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(890);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(893); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(895);
			fullNameModel();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(896);
				tabSpace();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			match(FOREIGN_KEY);
			setState(906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(903);
					tabSpace();
					}
					} 
				}
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(910); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(909);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(914);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 68, RULE_alterTableAddUniqueConstraintQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(916);
				tabSpace();
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922);
			match(ALTER);
			setState(924); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(923);
				tabSpace();
				}
				}
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(928);
			match(TABLE);
			setState(930); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(929);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(932); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(934);
			fullNameModel();
			setState(936); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(935);
				tabSpace();
				}
				}
				setState(938); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(940);
			match(ADD);
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(942); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(941);
					tabSpace();
					}
					}
					setState(944); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				setState(946);
				match(CONSTRAINT);
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(947);
						tabSpace();
						}
						} 
					}
					setState(952);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(953);
				fullNameModel();
				}
				break;
			}
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(957);
				tabSpace();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
			match(UNIQUE);
			setState(965); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(964);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(967); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(969);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 70, RULE_alterTableAddCheckConstraintQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(971);
				tabSpace();
				}
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(977);
			match(ALTER);
			setState(979); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(978);
				tabSpace();
				}
				}
				setState(981); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(983);
			match(TABLE);
			setState(985); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(984);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(987); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(989);
			fullNameModel();
			setState(991); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(990);
				tabSpace();
				}
				}
				setState(993); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(995);
			match(ADD);
			setState(997); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(996);
				tabSpace();
				}
				}
				setState(999); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1001);
			match(CONSTRAINT);
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1008);
			fullNameModel();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1009);
				tabSpace();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
			match(CHECK);
			setState(1017); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1016);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CREATE || _la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1019); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1021);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 72, RULE_otherAlterQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1023);
				tabSpace();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1029);
			match(ALTER);
			setState(1031); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1030);
				tabSpace();
				}
				}
				setState(1033); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1035);
			match(TABLE);
			setState(1037); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1036);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1039); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1041);
			fullNameModel();
			setState(1043); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1042);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1045); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1048); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1047);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << UNIQUE) | (1L << CHECK) | (1L << TERMINATOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1052);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 74, RULE_createIndexQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1054);
				tabSpace();
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			match(CREATE);
			setState(1062); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1061);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1064); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(1066);
					match(UNIQUE);
					}
				}

				setState(1070); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1069);
					tabSpace();
					}
					}
					setState(1072); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				}
			}

			setState(1076);
			match(INDEX);
			setState(1078); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1077);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1080); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1082);
			fullNameModel();
			setState(1084); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1083);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1086); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1088);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 76, RULE_setStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1090);
				tabSpace();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1096);
			match(SET);
			setState(1098); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1097);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1102);
			match(TERMINATOR);
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
		enterRule(_localctx, 78, RULE_userDefinedFunctions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1104);
							tabSpace();
							}
							} 
						}
						setState(1109);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
					}
					setState(1110);
					setStatement();
					}
					} 
				}
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1116);
				tabSpace();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
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
		enterRule(_localctx, 80, RULE_createUDFQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(CREATE);
			setState(1126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1125);
				tabSpace();
				}
				}
				setState(1128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1130);
			match(FUNCTION);
			setState(1132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1131);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1136);
			fullNameModel();
			setState(1140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1137);
					tabSpace();
					}
					} 
				}
				setState(1142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			{
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1143);
					tabSpace();
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1149);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==TERMINATOR) ) {
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
				setState(1152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			match(TERMINATOR);
			}
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1162);
					tabSpace();
					}
					} 
				}
				setState(1167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		enterRule(_localctx, 82, RULE_createViewStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1168);
							tabSpace();
							}
							} 
						}
						setState(1173);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
					}
					setState(1174);
					setStatement();
					}
					} 
				}
				setState(1179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1180);
				tabSpace();
				}
				}
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1186);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 84, RULE_createViewQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(CREATE);
			setState(1190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1189);
				tabSpace();
				}
				}
				setState(1192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1194);
			match(VIEW);
			setState(1196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1195);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1200);
			fullNameModel();
			setState(1202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1201);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1206);
			match(TERMINATOR);
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
		enterRule(_localctx, 86, RULE_aliasStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1208);
				tabSpace();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1214);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 88, RULE_aliasQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(CREATE);
			setState(1218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1217);
				tabSpace();
				}
				}
				setState(1220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1222);
			match(ALIAS);
			setState(1224); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1223);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1226); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1228);
			fullNameModel();
			setState(1230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1229);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1234);
			match(TERMINATOR);
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
		enterRule(_localctx, 90, RULE_createStoredProcedureStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1236);
							tabSpace();
							}
							} 
						}
						setState(1241);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
					}
					setState(1242);
					setStatement();
					}
					} 
				}
				setState(1247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1248);
				tabSpace();
				}
				}
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1254);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
		}
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
		enterRule(_localctx, 92, RULE_createProcedureQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(CREATE);
			setState(1258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1257);
				tabSpace();
				}
				}
				setState(1260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1262);
			match(PROCEDURE);
			setState(1264); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1263);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1266); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1268);
			fullNameModel();
			setState(1270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1269);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==TERMINATOR) ) {
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
				setState(1272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1274);
				tabSpace();
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1280);
			match(TERMINATOR);
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
		enterRule(_localctx, 94, RULE_createTriggerStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1282);
							tabSpace();
							}
							} 
						}
						setState(1287);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
					}
					setState(1288);
					setStatement();
					}
					} 
				}
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1294);
				tabSpace();
				}
				}
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1300);
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
		public TerminalNode TERMINATOR() { return getToken(Db2LookParser.TERMINATOR, 0); }
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
		enterRule(_localctx, 96, RULE_createTriggerQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(CREATE);
			setState(1304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1303);
				tabSpace();
				}
				}
				setState(1306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1308);
			match(TRIGGER);
			setState(1310); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1309);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1312); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1314);
			fullNameModel();
			setState(1318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1315);
					matchWildcard();
					}
					} 
				}
				setState(1320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			{
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1321);
				tabSpace();
				}
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1327);
			match(END);
			setState(1328);
			match(TERMINATOR);
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
		enterRule(_localctx, 98, RULE_grantStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1330);
				tabSpace();
				}
				}
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1336);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 100, RULE_grantQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(GRANT);
			setState(1340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1339);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1344);
			match(TERMINATOR);
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
		enterRule(_localctx, 102, RULE_terminateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1346);
				tabSpace();
				}
				}
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1352);
			match(TERMINATE);
			setState(1354); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1353);
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
				setState(1356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << TERMINATOR) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
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
		enterRule(_localctx, 104, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 106, RULE_commitStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1360);
				tabSpace();
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1366);
			match(COMMIT);
			setState(1368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1367);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1372);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 108, RULE_trustedContextStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1374);
				tabSpace();
				}
				}
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1380);
			match(CREATE);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1381);
				space();
				}
				}
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1387);
			match(TRUSTED_CONTEXT);
			setState(1389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1388);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1393);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 110, RULE_createAuditStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1395);
				tabSpace();
				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1401);
			match(CREATE);
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1402);
				tabSpace();
				}
				}
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1408);
			match(AUDIT);
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1409);
				tabSpace();
				}
				}
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1415);
			match(POLICY);
			setState(1417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1416);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1421);
			match(TERMINATOR);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(Db2LookParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(Db2LookParser.TERMINATOR, i);
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
		enterRule(_localctx, 112, RULE_createRoleStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1423);
				tabSpace();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
			match(CREATE);
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1430);
				tabSpace();
				}
				}
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1436);
			match(ROLE);
			setState(1440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1437);
					tabSpace();
					}
					} 
				}
				setState(1442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1444); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1443);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TERMINATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1446); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1448);
			match(TERMINATOR);
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
		enterRule(_localctx, 114, RULE_fullNameModel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1450);
					databaseName();
					setState(1454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
						{
						{
						setState(1451);
						space();
						}
						}
						setState(1456);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1457);
					match(DOT);
					}
					break;
				}
				setState(1464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1461);
						space();
						}
						} 
					}
					setState(1466);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				setState(1467);
				schemaName();
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1468);
					space();
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				match(DOT);
				}
				break;
			}
			setState(1481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1478);
					space();
					}
					} 
				}
				setState(1483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			setState(1484);
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
		enterRule(_localctx, 116, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
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
		enterRule(_localctx, 118, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
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
		enterRule(_localctx, 120, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
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
		enterRule(_localctx, 122, RULE_name);
		try {
			setState(1497);
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
				setState(1492);
				handle();
				}
				break;
			case QUOTATION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1493);
				match(QUOTATION);
				setState(1494);
				variable();
				setState(1495);
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
		enterRule(_localctx, 124, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1499);
					space();
					}
					} 
				}
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(1505);
			handle();
			setState(1509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1506);
					space();
					}
					} 
				}
				setState(1511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USER) | (1L << SCHEMA) | (1L << GROUP) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) || _la==WORD) {
				{
				{
				setState(1515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1512);
						space();
						}
						} 
					}
					setState(1517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				setState(1518);
				handle();
				setState(1522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1519);
						space();
						}
						} 
					}
					setState(1524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				}
				setState(1529);
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
		enterRule(_localctx, 126, RULE_handle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
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
		"\u0004\u0001[\u05fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0005\u0000"+
		"\u0082\b\u0000\n\u0000\f\u0000\u0085\t\u0000\u0001\u0000\u0005\u0000\u0088"+
		"\b\u0000\n\u0000\f\u0000\u008b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u009b\b\u0000\n\u0000\f\u0000\u009e\t\u0000\u0001\u0000\u0005\u0000\u00a1"+
		"\b\u0000\n\u0000\f\u0000\u00a4\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00b9\b\u0000"+
		"\u0001\u0000\u0005\u0000\u00bc\b\u0000\n\u0000\f\u0000\u00bf\t\u0000\u0005"+
		"\u0000\u00c1\b\u0000\n\u0000\f\u0000\u00c4\t\u0000\u0001\u0000\u0005\u0000"+
		"\u00c7\b\u0000\n\u0000\f\u0000\u00ca\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u00ce\b\u0000\n\u0000\f\u0000\u00d1\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00d5\b\u0000\n\u0000\f\u0000\u00d8\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u00df\b\u0001\n"+
		"\u0001\f\u0001\u00e2\t\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u00e6"+
		"\b\u0001\u000b\u0001\f\u0001\u00e7\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u00ec\b\u0001\u000b\u0001\f\u0001\u00ed\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0005\u0002\u00f3\b\u0002\n\u0002\f\u0002\u00f6\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u00fa\b\u0002\u000b\u0002\f\u0002\u00fb\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\u0100\b\u0002\u000b\u0002\f\u0002\u0101"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003\u0107\b\u0003\n\u0003"+
		"\f\u0003\u010a\t\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u010e\b\u0003"+
		"\u000b\u0003\f\u0003\u010f\u0001\u0003\u0001\u0003\u0004\u0003\u0114\b"+
		"\u0003\u000b\u0003\f\u0003\u0115\u0001\u0003\u0001\u0003\u0004\u0003\u011a"+
		"\b\u0003\u000b\u0003\f\u0003\u011b\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0005\u0004\u0121\b\u0004\n\u0004\f\u0004\u0124\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004\u0128\b\u0004\u000b\u0004\f\u0004\u0129\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u012e\b\u0004\u000b\u0004\f\u0004\u012f\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u0135\b\u0005\n\u0005\f\u0005"+
		"\u0138\t\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u013c\b\u0005\u000b"+
		"\u0005\f\u0005\u013d\u0001\u0005\u0001\u0005\u0004\u0005\u0142\b\u0005"+
		"\u000b\u0005\f\u0005\u0143\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006"+
		"\u0149\b\u0006\n\u0006\f\u0006\u014c\t\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0150\b\u0006\u000b\u0006\f\u0006\u0151\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u0156\b\u0006\u000b\u0006\f\u0006\u0157\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u015c\b\u0006\u000b\u0006\f\u0006\u015d\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0005\u0007\u0163\b\u0007\n\u0007\f\u0007\u0166"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u016a\b\u0007\u000b\u0007"+
		"\f\u0007\u016b\u0001\u0007\u0001\u0007\u0004\u0007\u0170\b\u0007\u000b"+
		"\u0007\f\u0007\u0171\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0005"+
		"\t\u0179\b\t\n\t\f\t\u017c\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n"+
		"\u0182\b\n\u000b\n\f\n\u0183\u0001\n\u0001\n\u0004\n\u0188\b\n\u000b\n"+
		"\f\n\u0189\u0001\n\u0001\n\u0005\n\u018e\b\n\n\n\f\n\u0191\t\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0005\u000b\u0196\b\u000b\n\u000b\f\u000b\u0199\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u019d\b\u000b\n\u000b\f\u000b"+
		"\u01a0\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01a4\b\u000b\n\u000b"+
		"\f\u000b\u01a7\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u01ac\b"+
		"\f\n\f\f\f\u01af\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u01b5\b\r"+
		"\u000b\r\f\r\u01b6\u0001\r\u0001\r\u0004\r\u01bb\b\r\u000b\r\f\r\u01bc"+
		"\u0001\r\u0001\r\u0004\r\u01c1\b\r\u000b\r\f\r\u01c2\u0001\r\u0001\r\u0004"+
		"\r\u01c7\b\r\u000b\r\f\r\u01c8\u0001\r\u0001\r\u0001\u000e\u0005\u000e"+
		"\u01ce\b\u000e\n\u000e\f\u000e\u01d1\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u01d7\b\u000f\u000b\u000f\f\u000f\u01d8"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u01dd\b\u000f\u000b\u000f\f\u000f"+
		"\u01de\u0001\u000f\u0001\u000f\u0004\u000f\u01e3\b\u000f\u000b\u000f\f"+
		"\u000f\u01e4\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010\u01ea\b\u0010"+
		"\n\u0010\f\u0010\u01ed\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0004\u0011\u01f3\b\u0011\u000b\u0011\f\u0011\u01f4\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u01f9\b\u0011\n\u0011\f\u0011\u01fc\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0005\u0012\u0201\b\u0012\n\u0012\f\u0012"+
		"\u0204\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u020a\b\u0013\n\u0013\f\u0013\u020d\t\u0013\u0001\u0013\u0003\u0013\u0210"+
		"\b\u0013\u0001\u0013\u0005\u0013\u0213\b\u0013\n\u0013\f\u0013\u0216\t"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u021a\b\u0013\n\u0013\f\u0013"+
		"\u021d\t\u0013\u0001\u0013\u0004\u0013\u0220\b\u0013\u000b\u0013\f\u0013"+
		"\u0221\u0001\u0013\u0001\u0013\u0004\u0013\u0226\b\u0013\u000b\u0013\f"+
		"\u0013\u0227\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u022d\b\u0014"+
		"\n\u0014\f\u0014\u0230\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0004\u0015\u0236\b\u0015\u000b\u0015\f\u0015\u0237\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u023c\b\u0015\u000b\u0015\f\u0015\u023d\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0005\u0016\u0243\b\u0016\n\u0016\f\u0016"+
		"\u0246\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u024c\b\u0017\u000b\u0017\f\u0017\u024d\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u0252\b\u0017\u000b\u0017\f\u0017\u0253\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0005\u0018\u0259\b\u0018\n\u0018\f\u0018\u025c\t\u0018\u0001"+
		"\u0018\u0005\u0018\u025f\b\u0018\n\u0018\f\u0018\u0262\t\u0018\u0001\u0018"+
		"\u0005\u0018\u0265\b\u0018\n\u0018\f\u0018\u0268\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0004\u0019\u026e\b\u0019\u000b\u0019\f"+
		"\u0019\u026f\u0001\u0019\u0001\u0019\u0004\u0019\u0274\b\u0019\u000b\u0019"+
		"\f\u0019\u0275\u0001\u0019\u0001\u0019\u0004\u0019\u027a\b\u0019\u000b"+
		"\u0019\f\u0019\u027b\u0001\u0019\u0001\u0019\u0001\u001a\u0005\u001a\u0281"+
		"\b\u001a\n\u001a\f\u001a\u0284\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u028a\b\u001b\u000b\u001b\f\u001b\u028b\u0001"+
		"\u001b\u0001\u001b\u0004\u001b\u0290\b\u001b\u000b\u001b\f\u001b\u0291"+
		"\u0001\u001b\u0001\u001b\u0004\u001b\u0296\b\u001b\u000b\u001b\f\u001b"+
		"\u0297\u0001\u001b\u0001\u001b\u0001\u001c\u0005\u001c\u029d\b\u001c\n"+
		"\u001c\f\u001c\u02a0\t\u001c\u0001\u001c\u0005\u001c\u02a3\b\u001c\n\u001c"+
		"\f\u001c\u02a6\t\u001c\u0001\u001c\u0005\u001c\u02a9\b\u001c\n\u001c\f"+
		"\u001c\u02ac\t\u001c\u0001\u001c\u0005\u001c\u02af\b\u001c\n\u001c\f\u001c"+
		"\u02b2\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02b6\b\u001c\n\u001c"+
		"\f\u001c\u02b9\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u02c1\b\u001c\n\u001c\f\u001c\u02c4"+
		"\t\u001c\u0001\u001c\u0005\u001c\u02c7\b\u001c\n\u001c\f\u001c\u02ca\t"+
		"\u001c\u0001\u001c\u0005\u001c\u02cd\b\u001c\n\u001c\f\u001c\u02d0\t\u001c"+
		"\u0001\u001c\u0003\u001c\u02d3\b\u001c\u0005\u001c\u02d5\b\u001c\n\u001c"+
		"\f\u001c\u02d8\t\u001c\u0001\u001d\u0005\u001d\u02db\b\u001d\n\u001d\f"+
		"\u001d\u02de\t\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u02e2\b\u001d"+
		"\u000b\u001d\f\u001d\u02e3\u0001\u001d\u0001\u001d\u0001\u001e\u0005\u001e"+
		"\u02e9\b\u001e\n\u001e\f\u001e\u02ec\t\u001e\u0001\u001e\u0001\u001e\u0004"+
		"\u001e\u02f0\b\u001e\u000b\u001e\f\u001e\u02f1\u0001\u001e\u0001\u001e"+
		"\u0004\u001e\u02f6\b\u001e\u000b\u001e\f\u001e\u02f7\u0003\u001e\u02fa"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u02fe\b\u001e\u000b\u001e"+
		"\f\u001e\u02ff\u0001\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u0305\b"+
		"\u001f\n\u001f\f\u001f\u0308\t\u001f\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u030c\b\u001f\u000b\u001f\f\u001f\u030d\u0001\u001f\u0001\u001f\u0004"+
		"\u001f\u0312\b\u001f\u000b\u001f\f\u001f\u0313\u0001\u001f\u0001\u001f"+
		"\u0004\u001f\u0318\b\u001f\u000b\u001f\f\u001f\u0319\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u031e\b\u001f\n\u001f\f\u001f\u0321\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0325\b\u001f\n\u001f\f\u001f\u0328\t\u001f\u0001"+
		"\u001f\u0003\u001f\u032b\b\u001f\u0001\u001f\u0004\u001f\u032e\b\u001f"+
		"\u000b\u001f\f\u001f\u032f\u0001\u001f\u0001\u001f\u0005\u001f\u0334\b"+
		"\u001f\n\u001f\f\u001f\u0337\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u033b\b\u001f\n\u001f\f\u001f\u033e\t\u001f\u0001\u001f\u0001\u001f\u0004"+
		"\u001f\u0342\b\u001f\u000b\u001f\f\u001f\u0343\u0001\u001f\u0001\u001f"+
		"\u0001 \u0005 \u0349\b \n \f \u034c\t \u0001 \u0001 \u0004 \u0350\b \u000b"+
		" \f \u0351\u0001 \u0001 \u0004 \u0356\b \u000b \f \u0357\u0001 \u0001"+
		" \u0001!\u0005!\u035d\b!\n!\f!\u0360\t!\u0001!\u0001!\u0004!\u0364\b!"+
		"\u000b!\f!\u0365\u0001!\u0001!\u0004!\u036a\b!\u000b!\f!\u036b\u0001!"+
		"\u0001!\u0004!\u0370\b!\u000b!\f!\u0371\u0001!\u0001!\u0004!\u0376\b!"+
		"\u000b!\f!\u0377\u0001!\u0001!\u0004!\u037c\b!\u000b!\f!\u037d\u0001!"+
		"\u0001!\u0005!\u0382\b!\n!\f!\u0385\t!\u0001!\u0001!\u0005!\u0389\b!\n"+
		"!\f!\u038c\t!\u0001!\u0004!\u038f\b!\u000b!\f!\u0390\u0001!\u0001!\u0001"+
		"\"\u0005\"\u0396\b\"\n\"\f\"\u0399\t\"\u0001\"\u0001\"\u0004\"\u039d\b"+
		"\"\u000b\"\f\"\u039e\u0001\"\u0001\"\u0004\"\u03a3\b\"\u000b\"\f\"\u03a4"+
		"\u0001\"\u0001\"\u0004\"\u03a9\b\"\u000b\"\f\"\u03aa\u0001\"\u0001\"\u0004"+
		"\"\u03af\b\"\u000b\"\f\"\u03b0\u0001\"\u0001\"\u0005\"\u03b5\b\"\n\"\f"+
		"\"\u03b8\t\"\u0001\"\u0001\"\u0003\"\u03bc\b\"\u0001\"\u0005\"\u03bf\b"+
		"\"\n\"\f\"\u03c2\t\"\u0001\"\u0001\"\u0004\"\u03c6\b\"\u000b\"\f\"\u03c7"+
		"\u0001\"\u0001\"\u0001#\u0005#\u03cd\b#\n#\f#\u03d0\t#\u0001#\u0001#\u0004"+
		"#\u03d4\b#\u000b#\f#\u03d5\u0001#\u0001#\u0004#\u03da\b#\u000b#\f#\u03db"+
		"\u0001#\u0001#\u0004#\u03e0\b#\u000b#\f#\u03e1\u0001#\u0001#\u0004#\u03e6"+
		"\b#\u000b#\f#\u03e7\u0001#\u0001#\u0005#\u03ec\b#\n#\f#\u03ef\t#\u0001"+
		"#\u0001#\u0005#\u03f3\b#\n#\f#\u03f6\t#\u0001#\u0001#\u0004#\u03fa\b#"+
		"\u000b#\f#\u03fb\u0001#\u0001#\u0001$\u0005$\u0401\b$\n$\f$\u0404\t$\u0001"+
		"$\u0001$\u0004$\u0408\b$\u000b$\f$\u0409\u0001$\u0001$\u0004$\u040e\b"+
		"$\u000b$\f$\u040f\u0001$\u0001$\u0004$\u0414\b$\u000b$\f$\u0415\u0001"+
		"$\u0004$\u0419\b$\u000b$\f$\u041a\u0001$\u0001$\u0001%\u0005%\u0420\b"+
		"%\n%\f%\u0423\t%\u0001%\u0001%\u0004%\u0427\b%\u000b%\f%\u0428\u0001%"+
		"\u0003%\u042c\b%\u0001%\u0004%\u042f\b%\u000b%\f%\u0430\u0003%\u0433\b"+
		"%\u0001%\u0001%\u0004%\u0437\b%\u000b%\f%\u0438\u0001%\u0001%\u0004%\u043d"+
		"\b%\u000b%\f%\u043e\u0001%\u0001%\u0001&\u0005&\u0444\b&\n&\f&\u0447\t"+
		"&\u0001&\u0001&\u0004&\u044b\b&\u000b&\f&\u044c\u0001&\u0001&\u0001\'"+
		"\u0005\'\u0452\b\'\n\'\f\'\u0455\t\'\u0001\'\u0005\'\u0458\b\'\n\'\f\'"+
		"\u045b\t\'\u0001\'\u0005\'\u045e\b\'\n\'\f\'\u0461\t\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0004(\u0467\b(\u000b(\f(\u0468\u0001(\u0001(\u0004(\u046d"+
		"\b(\u000b(\f(\u046e\u0001(\u0001(\u0005(\u0473\b(\n(\f(\u0476\t(\u0001"+
		"(\u0005(\u0479\b(\n(\f(\u047c\t(\u0001(\u0004(\u047f\b(\u000b(\f(\u0480"+
		"\u0001(\u0005(\u0484\b(\n(\f(\u0487\t(\u0001(\u0001(\u0001(\u0005(\u048c"+
		"\b(\n(\f(\u048f\t(\u0001)\u0005)\u0492\b)\n)\f)\u0495\t)\u0001)\u0005"+
		")\u0498\b)\n)\f)\u049b\t)\u0001)\u0005)\u049e\b)\n)\f)\u04a1\t)\u0001"+
		")\u0001)\u0001*\u0001*\u0004*\u04a7\b*\u000b*\f*\u04a8\u0001*\u0001*\u0004"+
		"*\u04ad\b*\u000b*\f*\u04ae\u0001*\u0001*\u0004*\u04b3\b*\u000b*\f*\u04b4"+
		"\u0001*\u0001*\u0001+\u0005+\u04ba\b+\n+\f+\u04bd\t+\u0001+\u0001+\u0001"+
		",\u0001,\u0004,\u04c3\b,\u000b,\f,\u04c4\u0001,\u0001,\u0004,\u04c9\b"+
		",\u000b,\f,\u04ca\u0001,\u0001,\u0004,\u04cf\b,\u000b,\f,\u04d0\u0001"+
		",\u0001,\u0001-\u0005-\u04d6\b-\n-\f-\u04d9\t-\u0001-\u0005-\u04dc\b-"+
		"\n-\f-\u04df\t-\u0001-\u0005-\u04e2\b-\n-\f-\u04e5\t-\u0001-\u0001-\u0001"+
		".\u0001.\u0004.\u04eb\b.\u000b.\f.\u04ec\u0001.\u0001.\u0004.\u04f1\b"+
		".\u000b.\f.\u04f2\u0001.\u0001.\u0004.\u04f7\b.\u000b.\f.\u04f8\u0001"+
		".\u0005.\u04fc\b.\n.\f.\u04ff\t.\u0001.\u0001.\u0001/\u0005/\u0504\b/"+
		"\n/\f/\u0507\t/\u0001/\u0005/\u050a\b/\n/\f/\u050d\t/\u0001/\u0005/\u0510"+
		"\b/\n/\f/\u0513\t/\u0001/\u0001/\u00010\u00010\u00040\u0519\b0\u000b0"+
		"\f0\u051a\u00010\u00010\u00040\u051f\b0\u000b0\f0\u0520\u00010\u00010"+
		"\u00050\u0525\b0\n0\f0\u0528\t0\u00010\u00050\u052b\b0\n0\f0\u052e\t0"+
		"\u00010\u00010\u00010\u00011\u00051\u0534\b1\n1\f1\u0537\t1\u00011\u0001"+
		"1\u00012\u00012\u00042\u053d\b2\u000b2\f2\u053e\u00012\u00012\u00013\u0005"+
		"3\u0544\b3\n3\f3\u0547\t3\u00013\u00013\u00043\u054b\b3\u000b3\f3\u054c"+
		"\u00014\u00014\u00015\u00055\u0552\b5\n5\f5\u0555\t5\u00015\u00015\u0004"+
		"5\u0559\b5\u000b5\f5\u055a\u00015\u00015\u00016\u00056\u0560\b6\n6\f6"+
		"\u0563\t6\u00016\u00016\u00056\u0567\b6\n6\f6\u056a\t6\u00016\u00016\u0004"+
		"6\u056e\b6\u000b6\f6\u056f\u00016\u00016\u00017\u00057\u0575\b7\n7\f7"+
		"\u0578\t7\u00017\u00017\u00057\u057c\b7\n7\f7\u057f\t7\u00017\u00017\u0005"+
		"7\u0583\b7\n7\f7\u0586\t7\u00017\u00017\u00047\u058a\b7\u000b7\f7\u058b"+
		"\u00017\u00017\u00018\u00058\u0591\b8\n8\f8\u0594\t8\u00018\u00018\u0005"+
		"8\u0598\b8\n8\f8\u059b\t8\u00018\u00018\u00058\u059f\b8\n8\f8\u05a2\t"+
		"8\u00018\u00048\u05a5\b8\u000b8\f8\u05a6\u00018\u00018\u00019\u00019\u0005"+
		"9\u05ad\b9\n9\f9\u05b0\t9\u00019\u00019\u00039\u05b4\b9\u00019\u00059"+
		"\u05b7\b9\n9\f9\u05ba\t9\u00019\u00019\u00059\u05be\b9\n9\f9\u05c1\t9"+
		"\u00019\u00019\u00039\u05c5\b9\u00019\u00059\u05c8\b9\n9\f9\u05cb\t9\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u05da\b=\u0001>\u0005>\u05dd\b>\n>\f>\u05e0\t>"+
		"\u0001>\u0001>\u0005>\u05e4\b>\n>\f>\u05e7\t>\u0001>\u0005>\u05ea\b>\n"+
		">\f>\u05ed\t>\u0001>\u0001>\u0005>\u05f1\b>\n>\f>\u05f4\t>\u0005>\u05f6"+
		"\b>\n>\f>\u05f9\t>\u0001?\u0001?\u0001?\u0001\u0526\u0000@\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000\t\u0001\u0000"+
		"33\u0001\u0000;>\u0002\u0000\u000b\f\u000f\u000f\u0001\u0000\u0010\u0010"+
		"\u0001\u000055\u0002\u0000\u0007\u000733\u0003\u0000\u0015\u0016\u001a"+
		"\u001b33\u0000\u0001\u0005\u0000\u000e\u000e\u0011\u0011\u0019\u0019;"+
		"=VV\u06af\u0000\u0083\u0001\u0000\u0000\u0000\u0002\u00e0\u0001\u0000"+
		"\u0000\u0000\u0004\u00f4\u0001\u0000\u0000\u0000\u0006\u0108\u0001\u0000"+
		"\u0000\u0000\b\u0122\u0001\u0000\u0000\u0000\n\u0136\u0001\u0000\u0000"+
		"\u0000\f\u014a\u0001\u0000\u0000\u0000\u000e\u0164\u0001\u0000\u0000\u0000"+
		"\u0010\u0175\u0001\u0000\u0000\u0000\u0012\u017a\u0001\u0000\u0000\u0000"+
		"\u0014\u017f\u0001\u0000\u0000\u0000\u0016\u0197\u0001\u0000\u0000\u0000"+
		"\u0018\u01ad\u0001\u0000\u0000\u0000\u001a\u01b2\u0001\u0000\u0000\u0000"+
		"\u001c\u01cf\u0001\u0000\u0000\u0000\u001e\u01d4\u0001\u0000\u0000\u0000"+
		" \u01eb\u0001\u0000\u0000\u0000\"\u01f0\u0001\u0000\u0000\u0000$\u0202"+
		"\u0001\u0000\u0000\u0000&\u0207\u0001\u0000\u0000\u0000(\u022e\u0001\u0000"+
		"\u0000\u0000*\u0233\u0001\u0000\u0000\u0000,\u0244\u0001\u0000\u0000\u0000"+
		".\u0249\u0001\u0000\u0000\u00000\u0260\u0001\u0000\u0000\u00002\u026b"+
		"\u0001\u0000\u0000\u00004\u0282\u0001\u0000\u0000\u00006\u0287\u0001\u0000"+
		"\u0000\u00008\u029e\u0001\u0000\u0000\u0000:\u02dc\u0001\u0000\u0000\u0000"+
		"<\u02ea\u0001\u0000\u0000\u0000>\u0306\u0001\u0000\u0000\u0000@\u034a"+
		"\u0001\u0000\u0000\u0000B\u035e\u0001\u0000\u0000\u0000D\u0397\u0001\u0000"+
		"\u0000\u0000F\u03ce\u0001\u0000\u0000\u0000H\u0402\u0001\u0000\u0000\u0000"+
		"J\u0421\u0001\u0000\u0000\u0000L\u0445\u0001\u0000\u0000\u0000N\u0459"+
		"\u0001\u0000\u0000\u0000P\u0464\u0001\u0000\u0000\u0000R\u0499\u0001\u0000"+
		"\u0000\u0000T\u04a4\u0001\u0000\u0000\u0000V\u04bb\u0001\u0000\u0000\u0000"+
		"X\u04c0\u0001\u0000\u0000\u0000Z\u04dd\u0001\u0000\u0000\u0000\\\u04e8"+
		"\u0001\u0000\u0000\u0000^\u050b\u0001\u0000\u0000\u0000`\u0516\u0001\u0000"+
		"\u0000\u0000b\u0535\u0001\u0000\u0000\u0000d\u053a\u0001\u0000\u0000\u0000"+
		"f\u0545\u0001\u0000\u0000\u0000h\u054e\u0001\u0000\u0000\u0000j\u0553"+
		"\u0001\u0000\u0000\u0000l\u0561\u0001\u0000\u0000\u0000n\u0576\u0001\u0000"+
		"\u0000\u0000p\u0592\u0001\u0000\u0000\u0000r\u05c4\u0001\u0000\u0000\u0000"+
		"t\u05ce\u0001\u0000\u0000\u0000v\u05d0\u0001\u0000\u0000\u0000x\u05d2"+
		"\u0001\u0000\u0000\u0000z\u05d9\u0001\u0000\u0000\u0000|\u05de\u0001\u0000"+
		"\u0000\u0000~\u05fa\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0010\b"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u00c2\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0003\u0010\b\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u00b8\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u00b9\u0003\u0012\t\u0000\u008d"+
		"\u00b9\u0003\u0018\f\u0000\u008e\u00b9\u0003\u001c\u000e\u0000\u008f\u00b9"+
		"\u0003 \u0010\u0000\u0090\u00b9\u0003$\u0012\u0000\u0091\u00b9\u0003("+
		"\u0014\u0000\u0092\u00b9\u0003p8\u0000\u0093\u00b9\u0003,\u0016\u0000"+
		"\u0094\u00b9\u00030\u0018\u0000\u0095\u00b9\u00034\u001a\u0000\u0096\u00b9"+
		"\u0003\f\u0006\u0000\u0097\u00b9\u0003:\u001d\u0000\u0098\u00b9\u0003"+
		"B!\u0000\u0099\u009b\u0003\u0010\b\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a1\u0003L&\u0000\u00a0"+
		"\u009c\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00b9\u0003F#\u0000\u00a6\u00b9\u0003N\'\u0000\u00a7\u00b9\u0003R)\u0000"+
		"\u00a8\u00b9\u0003V+\u0000\u00a9\u00b9\u00038\u001c\u0000\u00aa\u00b9"+
		"\u0003Z-\u0000\u00ab\u00b9\u0003^/\u0000\u00ac\u00b9\u0003n7\u0000\u00ad"+
		"\u00b9\u0003l6\u0000\u00ae\u00b9\u0003\u0016\u000b\u0000\u00af\u00b9\u0003"+
		"J%\u0000\u00b0\u00b9\u0003\b\u0004\u0000\u00b1\u00b9\u0003\n\u0005\u0000"+
		"\u00b2\u00b9\u0003R)\u0000\u00b3\u00b9\u0003\u000e\u0007\u0000\u00b4\u00b9"+
		"\u0003\u0004\u0002\u0000\u00b5\u00b9\u0003\u0006\u0003\u0000\u00b6\u00b9"+
		"\u0003\u0002\u0001\u0000\u00b7\u00b9\u0003b1\u0000\u00b8\u008c\u0001\u0000"+
		"\u0000\u0000\u00b8\u008d\u0001\u0000\u0000\u0000\u00b8\u008e\u0001\u0000"+
		"\u0000\u0000\u00b8\u008f\u0001\u0000\u0000\u0000\u00b8\u0090\u0001\u0000"+
		"\u0000\u0000\u00b8\u0091\u0001\u0000\u0000\u0000\u00b8\u0092\u0001\u0000"+
		"\u0000\u0000\u00b8\u0093\u0001\u0000\u0000\u0000\u00b8\u0094\u0001\u0000"+
		"\u0000\u0000\u00b8\u0095\u0001\u0000\u0000\u0000\u00b8\u0096\u0001\u0000"+
		"\u0000\u0000\u00b8\u0097\u0001\u0000\u0000\u0000\u00b8\u0098\u0001\u0000"+
		"\u0000\u0000\u00b8\u00a2\u0001\u0000\u0000\u0000\u00b8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00a7\u0001\u0000\u0000\u0000\u00b8\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00a9\u0001\u0000\u0000\u0000\u00b8\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ab\u0001\u0000\u0000\u0000\u00b8\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ad\u0001\u0000\u0000\u0000\u00b8\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b1\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b3\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bd\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0003\u0010\b\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u0089\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\u0010\b\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cf\u0003j5\u0000\u00cc\u00ce\u0003\u0010\b\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d6"+
		"\u0003\u0016\u000b\u0000\u00d3\u00d5\u0003\u0010\b\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0003"+
		"f3\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0000\u0000"+
		"\u0001\u00dc\u0001\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\u0010\b\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0005\t\u0000\u0000\u00e4\u00e6\u0003\u0010\b\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u00052\u0000\u0000\u00ea\u00ec"+
		"\b\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"3\u0000\u0000\u00f0\u0003\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003\u0010"+
		"\b\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0005\u0007\u0000\u0000\u00f8\u00fa\u0003\u0010\b\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u00052\u0000\u0000\u00fe"+
		"\u0100\b\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u00053\u0000\u0000\u0104\u0005\u0001\u0000\u0000\u0000\u0105\u0107\u0003"+
		"\u0010\b\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0005\u0007\u0000\u0000\u010c\u010e\u0003\u0010"+
		"\b\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0005\u000e\u0000"+
		"\u0000\u0112\u0114\u0003\u0010\b\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u00051\u0000\u0000\u0118\u011a\b\u0000\u0000\u0000\u0119"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u00053\u0000\u0000\u011e\u0007"+
		"\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0010\b\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0127\u0005"+
		"\t\u0000\u0000\u0126\u0128\u0003\u0010\b\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012d\u0005%\u0000\u0000\u012c\u012e\b\u0000\u0000"+
		"\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u00053\u0000\u0000"+
		"\u0132\t\u0001\u0000\u0000\u0000\u0133\u0135\u0003\u0010\b\u0000\u0134"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0005\u0007\u0000\u0000\u013a\u013c\u0003\u0010\b\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0141\u00050\u0000\u0000\u0140\u0142\b"+
		"\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"3\u0000\u0000\u0146\u000b\u0001\u0000\u0000\u0000\u0147\u0149\u0003\u0010"+
		"\b\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u014f\u0005\t\u0000\u0000\u014e\u0150\u0003\u0010\b\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0005\u0006\u0000\u0000"+
		"\u0154\u0156\u0003\u0010\b\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u0003r9\u0000\u015a\u015c\b\u0000\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u00053\u0000\u0000\u0160\r\u0001\u0000"+
		"\u0000\u0000\u0161\u0163\u0003\u0010\b\u0000\u0162\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000"+
		"\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0169\u0005\u0007\u0000"+
		"\u0000\u0168\u016a\u0003\u0010\b\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0005\u0005\u0000\u0000\u016e\u0170\b\u0000\u0000\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u00053\u0000\u0000\u0174\u000f"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0007\u0001\u0000\u0000\u0176\u0011"+
		"\u0001\u0000\u0000\u0000\u0177\u0179\u0003\u0010\b\u0000\u0178\u0177\u0001"+
		"\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d\u0001"+
		"\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e\u0003"+
		"\u0014\n\u0000\u017e\u0013\u0001\u0000\u0000\u0000\u017f\u0181\u0005\u0001"+
		"\u0000\u0000\u0180\u0182\u0003\u0010\b\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u0005\u0002\u0000\u0000\u0186\u0188\u0003\u0010\b\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018f\u0003r9\u0000\u018c\u018e"+
		"\u0003\u0010\b\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u00053\u0000\u0000\u0193\u0015\u0001\u0000"+
		"\u0000\u0000\u0194\u0196\u0003\u0010\b\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019e\u0005\u0001\u0000"+
		"\u0000\u019b\u019d\u0003\u0010\b\u0000\u019c\u019b\u0001\u0000\u0000\u0000"+
		"\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a5\u0005\u001d\u0000\u0000"+
		"\u01a2\u01a4\u0003\u0010\b\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u00053\u0000\u0000\u01a9\u0017"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ac\u0003\u0010\b\u0000\u01ab\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003"+
		"\u001a\r\u0000\u01b1\u0019\u0001\u0000\u0000\u0000\u01b2\u01b4\u0005\u0007"+
		"\u0000\u0000\u01b3\u01b5\u0003\u0010\b\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01ba\u0005\u0017\u0000\u0000\u01b9\u01bb\u0003\u0010\b\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0005\u0018\u0000\u0000"+
		"\u01bf\u01c1\u0003\u0010\b\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c6\u0005\u0019\u0000\u0000\u01c5\u01c7\b\u0000\u0000\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u00053\u0000\u0000\u01cb\u001b\u0001"+
		"\u0000\u0000\u0000\u01cc\u01ce\u0003\u0010\b\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3\u0003\u001e"+
		"\u000f\u0000\u01d3\u001d\u0001\u0000\u0000\u0000\u01d4\u01d6\u0005\u0007"+
		"\u0000\u0000\u01d5\u01d7\u0003\u0010\b\u0000\u01d6\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01dc\u0005\"\u0000\u0000\u01db\u01dd\u0003\u0010\b\u0000"+
		"\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003r9\u0000\u01e1\u01e3"+
		"\b\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005"+
		"3\u0000\u0000\u01e7\u001f\u0001\u0000\u0000\u0000\u01e8\u01ea\u0003\u0010"+
		"\b\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0003\"\u0011\u0000\u01ef!\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f2\u0005\t\u0000\u0000\u01f1\u01f3\u0003\u0010\b\u0000\u01f2"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f6\u01fa\u0005#\u0000\u0000\u01f7\u01f9"+
		"\b\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u00053\u0000\u0000\u01fe#\u0001\u0000\u0000"+
		"\u0000\u01ff\u0201\u0003\u0010\b\u0000\u0200\u01ff\u0001\u0000\u0000\u0000"+
		"\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000"+
		"\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0003&\u0013\u0000\u0206"+
		"%\u0001\u0000\u0000\u0000\u0207\u020b\u0005\u0007\u0000\u0000\u0208\u020a"+
		"\u0003\u0010\b\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001"+
		"\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001"+
		"\u0000\u0000\u0000\u020e\u0210\u0005\u000e\u0000\u0000\u020f\u020e\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0214\u0001"+
		"\u0000\u0000\u0000\u0211\u0213\u0003\u0010\b\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000"+
		"\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217\u021b\u0007\u0002"+
		"\u0000\u0000\u0218\u021a\u0003\u0010\b\u0000\u0219\u0218\u0001\u0000\u0000"+
		"\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000"+
		"\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0220\b\u0003\u0000\u0000"+
		"\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0005\u0010\u0000\u0000"+
		"\u0224\u0226\b\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u00053\u0000\u0000\u022a\'\u0001\u0000\u0000\u0000\u022b\u022d"+
		"\u0003\u0010\b\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001"+
		"\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0003*\u0015\u0000\u0232)\u0001\u0000\u0000"+
		"\u0000\u0233\u0235\u0005\t\u0000\u0000\u0234\u0236\u0003\u0010\b\u0000"+
		"\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0005\u0010\u0000\u0000"+
		"\u023a\u023c\b\u0000\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f"+
		"\u0240\u00053\u0000\u0000\u0240+\u0001\u0000\u0000\u0000\u0241\u0243\u0003"+
		"\u0010\b\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000"+
		"\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0003.\u0017\u0000\u0248-\u0001\u0000\u0000\u0000"+
		"\u0249\u024b\u0005\u0007\u0000\u0000\u024a\u024c\u0003\u0010\b\u0000\u024b"+
		"\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0251\u0005\u0011\u0000\u0000\u0250"+
		"\u0252\b\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u00053\u0000\u0000\u0256/\u0001\u0000\u0000\u0000\u0257\u0259\u0003\u0010"+
		"\b\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025b\u025d\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025d\u025f\u0003L&\u0000\u025e\u025a\u0001\u0000\u0000\u0000\u025f"+
		"\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u0266\u0001\u0000\u0000\u0000\u0262"+
		"\u0260\u0001\u0000\u0000\u0000\u0263\u0265\u0003\u0010\b\u0000\u0264\u0263"+
		"\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0264"+
		"\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0269"+
		"\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u00032\u0019\u0000\u026a1\u0001\u0000\u0000\u0000\u026b\u026d\u0005\u0007"+
		"\u0000\u0000\u026c\u026e\u0003\u0010\b\u0000\u026d\u026c\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u0273\u0005\u0004\u0000\u0000\u0272\u0274\u0003\u0010\b\u0000"+
		"\u0273\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0003r9\u0000\u0278\u027a"+
		"\b\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001"+
		"\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001"+
		"\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e\u0005"+
		"3\u0000\u0000\u027e3\u0001\u0000\u0000\u0000\u027f\u0281\u0003\u0010\b"+
		"\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000"+
		"\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000"+
		"\u0000\u0285\u0286\u00036\u001b\u0000\u02865\u0001\u0000\u0000\u0000\u0287"+
		"\u0289\u0005\u0007\u0000\u0000\u0288\u028a\u0003\u0010\b\u0000\u0289\u0288"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u0289"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0001\u0000\u0000\u0000\u028d\u028f\u0005\u0006\u0000\u0000\u028e\u0290"+
		"\u0003\u0010\b\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u0290\u0291\u0001"+
		"\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0292\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0295\u0003"+
		"r9\u0000\u0294\u0296\b\u0000\u0000\u0000\u0295\u0294\u0001\u0000\u0000"+
		"\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000"+
		"\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u00053\u0000\u0000\u029a7\u0001\u0000\u0000\u0000\u029b"+
		"\u029d\u0003\u0010\b\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u02a0"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02aa\u0001\u0000\u0000\u0000\u02a0\u029e"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a3\u0003\u0010\b\u0000\u02a2\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a9\u0003"+
		"L&\u0000\u02a8\u02a4\u0001\u0000\u0000\u0000\u02a9\u02ac\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ab\u02b0\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ad\u02af\u0003\u0010\b\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000"+
		"\u02af\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3\u02d6\u0003<\u001e\u0000\u02b4"+
		"\u02b6\u0003\u0010\b\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b9"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b8\u02d2\u0001\u0000\u0000\u0000\u02b9\u02b7"+
		"\u0001\u0000\u0000\u0000\u02ba\u02d3\u0003:\u001d\u0000\u02bb\u02d3\u0003"+
		">\u001f\u0000\u02bc\u02d3\u0003@ \u0000\u02bd\u02d3\u0003D\"\u0000\u02be"+
		"\u02d3\u0003H$\u0000\u02bf\u02c1\u0003\u0010\b\u0000\u02c0\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c7\u0003"+
		"L&\u0000\u02c6\u02c2\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ce\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0003\u0010\b\u0000\u02cc\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d3\u0003J%\u0000\u02d2\u02ba"+
		"\u0001\u0000\u0000\u0000\u02d2\u02bb\u0001\u0000\u0000\u0000\u02d2\u02bc"+
		"\u0001\u0000\u0000\u0000\u02d2\u02bd\u0001\u0000\u0000\u0000\u02d2\u02be"+
		"\u0001\u0000\u0000\u0000\u02d2\u02c8\u0001\u0000\u0000\u0000\u02d3\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d4\u02b7\u0001\u0000\u0000\u0000\u02d5\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d79\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d9\u02db\u0003\u0010\b\u0000\u02da\u02d9\u0001\u0000"+
		"\u0000\u0000\u02db\u02de\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02df\u0001\u0000"+
		"\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e1\u0005(\u0000"+
		"\u0000\u02e0\u02e2\b\u0000\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e6\u00053\u0000\u0000\u02e6;\u0001\u0000\u0000\u0000\u02e7\u02e9"+
		"\u0003\u0010\b\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ed\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ef\u0005\u0007\u0000\u0000\u02ee\u02f0\u0003"+
		"\u0010\b\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f9\u0001\u0000\u0000\u0000\u02f3\u02f5\u0005\u0003"+
		"\u0000\u0000\u02f4\u02f6\u0003\u0010\b\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f3\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd\u0005\u0013\u0000"+
		"\u0000\u02fc\u02fe\b\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u00053\u0000\u0000\u0302=\u0001\u0000\u0000\u0000\u0303\u0305"+
		"\u0003\u0010\b\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305\u0308\u0001"+
		"\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0307\u0001"+
		"\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308\u0306\u0001"+
		"\u0000\u0000\u0000\u0309\u030b\u0005\t\u0000\u0000\u030a\u030c\u0003\u0010"+
		"\b\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000"+
		"\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0311\u0005\u0013\u0000"+
		"\u0000\u0310\u0312\u0003\u0010\b\u0000\u0311\u0310\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000"+
		"\u0315\u0317\u0003r9\u0000\u0316\u0318\u0003\u0010\b\u0000\u0317\u0316"+
		"\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u0317"+
		"\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b"+
		"\u0001\u0000\u0000\u0000\u031b\u032a\u0005\u0014\u0000\u0000\u031c\u031e"+
		"\u0003\u0010\b\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u0321\u0001"+
		"\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001"+
		"\u0000\u0000\u0000\u0320\u0322\u0001\u0000\u0000\u0000\u0321\u031f\u0001"+
		"\u0000\u0000\u0000\u0322\u0326\u0005,\u0000\u0000\u0323\u0325\u0003\u0010"+
		"\b\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0325\u0328\u0001\u0000\u0000"+
		"\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000"+
		"\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000"+
		"\u0000\u0329\u032b\u0003r9\u0000\u032a\u031f\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0001\u0000\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c"+
		"\u032e\u0003\u0010\b\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032e\u032f"+
		"\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0335"+
		"\u0005\u0015\u0000\u0000\u0332\u0334\u0003\u0010\b\u0000\u0333\u0332\u0001"+
		"\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0333\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0338\u0001"+
		"\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u033c\u0005"+
		"4\u0000\u0000\u0339\u033b\b\u0004\u0000\u0000\u033a\u0339\u0001\u0000"+
		"\u0000\u0000\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033f\u0001\u0000"+
		"\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0341\u00055\u0000"+
		"\u0000\u0340\u0342\b\u0000\u0000\u0000\u0341\u0340\u0001\u0000\u0000\u0000"+
		"\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000\u0000\u0000"+
		"\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000"+
		"\u0345\u0346\u00053\u0000\u0000\u0346?\u0001\u0000\u0000\u0000\u0347\u0349"+
		"\u0003\u0010\b\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0349\u034c\u0001"+
		"\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000\u034c\u034a\u0001"+
		"\u0000\u0000\u0000\u034d\u034f\u0005\u0012\u0000\u0000\u034e\u0350\u0003"+
		"\u0010\b\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000"+
		"\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0355\u0005\u0013"+
		"\u0000\u0000\u0354\u0356\b\u0000\u0000\u0000\u0355\u0354\u0001\u0000\u0000"+
		"\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000"+
		"\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000"+
		"\u0000\u0359\u035a\u00053\u0000\u0000\u035aA\u0001\u0000\u0000\u0000\u035b"+
		"\u035d\u0003\u0010\b\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035d\u0360"+
		"\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035e\u035f"+
		"\u0001\u0000\u0000\u0000\u035f\u0361\u0001\u0000\u0000\u0000\u0360\u035e"+
		"\u0001\u0000\u0000\u0000\u0361\u0363\u0005\t\u0000\u0000\u0362\u0364\u0003"+
		"\u0010\b\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000"+
		"\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0369\u0005\u0013"+
		"\u0000\u0000\u0368\u036a\u0003\u0010\b\u0000\u0369\u0368\u0001\u0000\u0000"+
		"\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000\u0000"+
		"\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000"+
		"\u0000\u036d\u036f\u0003r9\u0000\u036e\u0370\u0003\u0010\b\u0000\u036f"+
		"\u036e\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371"+
		"\u036f\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372"+
		"\u0373\u0001\u0000\u0000\u0000\u0373\u0375\u0005\u0014\u0000\u0000\u0374"+
		"\u0376\u0003\u0010\b\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0376\u0377"+
		"\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0377\u0378"+
		"\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037b"+
		"\u0005,\u0000\u0000\u037a\u037c\u0003\u0010\b\u0000\u037b\u037a\u0001"+
		"\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037b\u0001"+
		"\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u037f\u0001"+
		"\u0000\u0000\u0000\u037f\u0383\u0003r9\u0000\u0380\u0382\u0003\u0010\b"+
		"\u0000\u0381\u0380\u0001\u0000\u0000\u0000\u0382\u0385\u0001\u0000\u0000"+
		"\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000"+
		"\u0000\u0384\u0386\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000"+
		"\u0000\u0386\u038a\u0005\u0016\u0000\u0000\u0387\u0389\u0003\u0010\b\u0000"+
		"\u0388\u0387\u0001\u0000\u0000\u0000\u0389\u038c\u0001\u0000\u0000\u0000"+
		"\u038a\u0388\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000"+
		"\u038b\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000"+
		"\u038d\u038f\b\u0000\u0000\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038f"+
		"\u0390\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390"+
		"\u0391\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0393\u00053\u0000\u0000\u0393C\u0001\u0000\u0000\u0000\u0394\u0396\u0003"+
		"\u0010\b\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0396\u0399\u0001\u0000"+
		"\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000"+
		"\u0000\u0000\u0398\u039a\u0001\u0000\u0000\u0000\u0399\u0397\u0001\u0000"+
		"\u0000\u0000\u039a\u039c\u0005\t\u0000\u0000\u039b\u039d\u0003\u0010\b"+
		"\u0000\u039c\u039b\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000"+
		"\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000"+
		"\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a2\u0005\u0013\u0000"+
		"\u0000\u03a1\u03a3\u0003\u0010\b\u0000\u03a2\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a8\u0003r9\u0000\u03a7\u03a9\u0003\u0010\b\u0000\u03a8\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03a8"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ac\u03bb\u0005\u0014\u0000\u0000\u03ad\u03af"+
		"\u0003\u0010\b\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b6\u0005"+
		",\u0000\u0000\u03b3\u03b5\u0003\u0010\b\u0000\u03b4\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b8\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b9\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03ba\u0003r9\u0000"+
		"\u03ba\u03bc\u0001\u0000\u0000\u0000\u03bb\u03ae\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03c0\u0001\u0000\u0000\u0000"+
		"\u03bd\u03bf\u0003\u0010\b\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c5\u0005\u001a\u0000\u0000\u03c4"+
		"\u03c6\b\u0000\u0000\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03ca"+
		"\u00053\u0000\u0000\u03caE\u0001\u0000\u0000\u0000\u03cb\u03cd\u0003\u0010"+
		"\b\u0000\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd\u03d0\u0001\u0000\u0000"+
		"\u0000\u03ce\u03cc\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000"+
		"\u0000\u03cf\u03d1\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d3\u0005\t\u0000\u0000\u03d2\u03d4\u0003\u0010\b\u0000"+
		"\u03d3\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d9\u0005\u0013\u0000\u0000"+
		"\u03d8\u03da\u0003\u0010\b\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03da"+
		"\u03db\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db"+
		"\u03dc\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd"+
		"\u03df\u0003r9\u0000\u03de\u03e0\u0003\u0010\b\u0000\u03df\u03de\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03df\u0001"+
		"\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e5\u0005\u0014\u0000\u0000\u03e4\u03e6\u0003"+
		"\u0010\b\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000"+
		"\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ed\u0005,\u0000"+
		"\u0000\u03ea\u03ec\u0003\u0010\b\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ef\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000"+
		"\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03f0\u0001\u0000\u0000\u0000"+
		"\u03ef\u03ed\u0001\u0000\u0000\u0000\u03f0\u03f4\u0003r9\u0000\u03f1\u03f3"+
		"\u0003\u0010\b\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f7\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f7\u03f9\u0005\u001b\u0000\u0000\u03f8\u03fa\b\u0005"+
		"\u0000\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000"+
		"\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000"+
		"\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03fe\u00053\u0000"+
		"\u0000\u03feG\u0001\u0000\u0000\u0000\u03ff\u0401\u0003\u0010\b\u0000"+
		"\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000"+
		"\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000"+
		"\u0403\u0405\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000\u0000\u0000"+
		"\u0405\u0407\u0005\t\u0000\u0000\u0406\u0408\u0003\u0010\b\u0000\u0407"+
		"\u0406\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409"+
		"\u0407\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a"+
		"\u040b\u0001\u0000\u0000\u0000\u040b\u040d\u0005\u0013\u0000\u0000\u040c"+
		"\u040e\u0003\u0010\b\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0413"+
		"\u0003r9\u0000\u0412\u0414\u0003\u0010\b\u0000\u0413\u0412\u0001\u0000"+
		"\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0413\u0001\u0000"+
		"\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0418\u0001\u0000"+
		"\u0000\u0000\u0417\u0419\b\u0006\u0000\u0000\u0418\u0417\u0001\u0000\u0000"+
		"\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000"+
		"\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000"+
		"\u0000\u041c\u041d\u00053\u0000\u0000\u041dI\u0001\u0000\u0000\u0000\u041e"+
		"\u0420\u0003\u0010\b\u0000\u041f\u041e\u0001\u0000\u0000\u0000\u0420\u0423"+
		"\u0001\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0421\u0422"+
		"\u0001\u0000\u0000\u0000\u0422\u0424\u0001\u0000\u0000\u0000\u0423\u0421"+
		"\u0001\u0000\u0000\u0000\u0424\u0426\u0005\u0007\u0000\u0000\u0425\u0427"+
		"\u0003\u0010\b\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0427\u0428\u0001"+
		"\u0000\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0428\u0429\u0001"+
		"\u0000\u0000\u0000\u0429\u0432\u0001\u0000\u0000\u0000\u042a\u042c\u0005"+
		"\u001a\u0000\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042b\u042c\u0001"+
		"\u0000\u0000\u0000\u042c\u042e\u0001\u0000\u0000\u0000\u042d\u042f\u0003"+
		"\u0010\b\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000"+
		"\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000"+
		"\u0000\u0000\u0431\u0433\u0001\u0000\u0000\u0000\u0432\u042b\u0001\u0000"+
		"\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000"+
		"\u0000\u0000\u0434\u0436\u0005\n\u0000\u0000\u0435\u0437\u0003\u0010\b"+
		"\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000"+
		"\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000"+
		"\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043c\u0003r9\u0000\u043b"+
		"\u043d\b\u0000\u0000\u0000\u043c\u043b\u0001\u0000\u0000\u0000\u043d\u043e"+
		"\u0001\u0000\u0000\u0000\u043e\u043c\u0001\u0000\u0000\u0000\u043e\u043f"+
		"\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0441"+
		"\u00053\u0000\u0000\u0441K\u0001\u0000\u0000\u0000\u0442\u0444\u0003\u0010"+
		"\b\u0000\u0443\u0442\u0001\u0000\u0000\u0000\u0444\u0447\u0001\u0000\u0000"+
		"\u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000"+
		"\u0000\u0446\u0448\u0001\u0000\u0000\u0000\u0447\u0445\u0001\u0000\u0000"+
		"\u0000\u0448\u044a\u0005\u001e\u0000\u0000\u0449\u044b\b\u0000\u0000\u0000"+
		"\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000"+
		"\u044c\u044a\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000"+
		"\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u044f\u00053\u0000\u0000\u044f"+
		"M\u0001\u0000\u0000\u0000\u0450\u0452\u0003\u0010\b\u0000\u0451\u0450"+
		"\u0001\u0000\u0000\u0000\u0452\u0455\u0001\u0000\u0000\u0000\u0453\u0451"+
		"\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0456"+
		"\u0001\u0000\u0000\u0000\u0455\u0453\u0001\u0000\u0000\u0000\u0456\u0458"+
		"\u0003L&\u0000\u0457\u0453\u0001\u0000\u0000\u0000\u0458\u045b\u0001\u0000"+
		"\u0000\u0000\u0459\u0457\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000"+
		"\u0000\u0000\u045a\u045f\u0001\u0000\u0000\u0000\u045b\u0459\u0001\u0000"+
		"\u0000\u0000\u045c\u045e\u0003\u0010\b\u0000\u045d\u045c\u0001\u0000\u0000"+
		"\u0000\u045e\u0461\u0001\u0000\u0000\u0000\u045f\u045d\u0001\u0000\u0000"+
		"\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0462\u0001\u0000\u0000"+
		"\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0462\u0463\u0003P(\u0000\u0463"+
		"O\u0001\u0000\u0000\u0000\u0464\u0466\u0005\u0007\u0000\u0000\u0465\u0467"+
		"\u0003\u0010\b\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001"+
		"\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0468\u0469\u0001"+
		"\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000\u0000\u046a\u046c\u0005"+
		"\'\u0000\u0000\u046b\u046d\u0003\u0010\b\u0000\u046c\u046b\u0001\u0000"+
		"\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u046c\u0001\u0000"+
		"\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000"+
		"\u0000\u0000\u0470\u0474\u0003r9\u0000\u0471\u0473\u0003\u0010\b\u0000"+
		"\u0472\u0471\u0001\u0000\u0000\u0000\u0473\u0476\u0001\u0000\u0000\u0000"+
		"\u0474\u0472\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000"+
		"\u0475\u047a\u0001\u0000\u0000\u0000\u0476\u0474\u0001\u0000\u0000\u0000"+
		"\u0477\u0479\u0003\u0010\b\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0479"+
		"\u047c\u0001\u0000\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a"+
		"\u047b\u0001\u0000\u0000\u0000\u047b\u047e\u0001\u0000\u0000\u0000\u047c"+
		"\u047a\u0001\u0000\u0000\u0000\u047d\u047f\b\u0000\u0000\u0000\u047e\u047d"+
		"\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u047e"+
		"\u0001\u0000\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0485"+
		"\u0001\u0000\u0000\u0000\u0482\u0484\u0003\u0010\b\u0000\u0483\u0482\u0001"+
		"\u0000\u0000\u0000\u0484\u0487\u0001\u0000\u0000\u0000\u0485\u0483\u0001"+
		"\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u0488\u0001"+
		"\u0000\u0000\u0000\u0487\u0485\u0001\u0000\u0000\u0000\u0488\u0489\u0005"+
		"3\u0000\u0000\u0489\u048d\u0001\u0000\u0000\u0000\u048a\u048c\u0003\u0010"+
		"\b\u0000\u048b\u048a\u0001\u0000\u0000\u0000\u048c\u048f\u0001\u0000\u0000"+
		"\u0000\u048d\u048b\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000"+
		"\u0000\u048eQ\u0001\u0000\u0000\u0000\u048f\u048d\u0001\u0000\u0000\u0000"+
		"\u0490\u0492\u0003\u0010\b\u0000\u0491\u0490\u0001\u0000\u0000\u0000\u0492"+
		"\u0495\u0001\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0493"+
		"\u0494\u0001\u0000\u0000\u0000\u0494\u0496\u0001\u0000\u0000\u0000\u0495"+
		"\u0493\u0001\u0000\u0000\u0000\u0496\u0498\u0003L&\u0000\u0497\u0493\u0001"+
		"\u0000\u0000\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u0497\u0001"+
		"\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u049f\u0001"+
		"\u0000\u0000\u0000\u049b\u0499\u0001\u0000\u0000\u0000\u049c\u049e\u0003"+
		"\u0010\b\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04a1\u0001\u0000"+
		"\u0000\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a2\u0001\u0000\u0000\u0000\u04a1\u049f\u0001\u0000"+
		"\u0000\u0000\u04a2\u04a3\u0003T*\u0000\u04a3S\u0001\u0000\u0000\u0000"+
		"\u04a4\u04a6\u0005\u0007\u0000\u0000\u04a5\u04a7\u0003\u0010\b\u0000\u04a6"+
		"\u04a5\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8"+
		"\u04a6\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9"+
		"\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ac\u0005%\u0000\u0000\u04ab\u04ad"+
		"\u0003\u0010\b\u0000\u04ac\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001"+
		"\u0000\u0000\u0000\u04ae\u04ac\u0001\u0000\u0000\u0000\u04ae\u04af\u0001"+
		"\u0000\u0000\u0000\u04af\u04b0\u0001\u0000\u0000\u0000\u04b0\u04b2\u0003"+
		"r9\u0000\u04b1\u04b3\b\u0000\u0000\u0000\u04b2\u04b1\u0001\u0000\u0000"+
		"\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b2\u0001\u0000\u0000"+
		"\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000"+
		"\u0000\u04b6\u04b7\u00053\u0000\u0000\u04b7U\u0001\u0000\u0000\u0000\u04b8"+
		"\u04ba\u0003\u0010\b\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc"+
		"\u0001\u0000\u0000\u0000\u04bc\u04be\u0001\u0000\u0000\u0000\u04bd\u04bb"+
		"\u0001\u0000\u0000\u0000\u04be\u04bf\u0003X,\u0000\u04bfW\u0001\u0000"+
		"\u0000\u0000\u04c0\u04c2\u0005\u0007\u0000\u0000\u04c1\u04c3\u0003\u0010"+
		"\b\u0000\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c4\u04c2\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000"+
		"\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c8\u0005\b\u0000\u0000"+
		"\u04c7\u04c9\u0003\u0010\b\u0000\u04c8\u04c7\u0001\u0000\u0000\u0000\u04c9"+
		"\u04ca\u0001\u0000\u0000\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04ca"+
		"\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc"+
		"\u04ce\u0003r9\u0000\u04cd\u04cf\b\u0000\u0000\u0000\u04ce\u04cd\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d3\u00053\u0000\u0000\u04d3Y\u0001\u0000\u0000"+
		"\u0000\u04d4\u04d6\u0003\u0010\b\u0000\u04d5\u04d4\u0001\u0000\u0000\u0000"+
		"\u04d6\u04d9\u0001\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000"+
		"\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8\u04da\u0001\u0000\u0000\u0000"+
		"\u04d9\u04d7\u0001\u0000\u0000\u0000\u04da\u04dc\u0003L&\u0000\u04db\u04d7"+
		"\u0001\u0000\u0000\u0000\u04dc\u04df\u0001\u0000\u0000\u0000\u04dd\u04db"+
		"\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04e3"+
		"\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04e0\u04e2"+
		"\u0003\u0010\b\u0000\u04e1\u04e0\u0001\u0000\u0000\u0000\u04e2\u04e5\u0001"+
		"\u0000\u0000\u0000\u04e3\u04e1\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e6\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e7\u0003\\.\u0000\u04e7[\u0001\u0000\u0000"+
		"\u0000\u04e8\u04ea\u0005\u0007\u0000\u0000\u04e9\u04eb\u0003\u0010\b\u0000"+
		"\u04ea\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000\u0000"+
		"\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000"+
		"\u04ed\u04ee\u0001\u0000\u0000\u0000\u04ee\u04f0\u0005&\u0000\u0000\u04ef"+
		"\u04f1\u0003\u0010\b\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f2"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f0\u0001\u0000\u0000\u0000\u04f2\u04f3"+
		"\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f6"+
		"\u0003r9\u0000\u04f5\u04f7\b\u0000\u0000\u0000\u04f6\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fd\u0001\u0000"+
		"\u0000\u0000\u04fa\u04fc\u0003\u0010\b\u0000\u04fb\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fc\u04ff\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000"+
		"\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u0500\u0001\u0000\u0000"+
		"\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u0500\u0501\u00053\u0000\u0000"+
		"\u0501]\u0001\u0000\u0000\u0000\u0502\u0504\u0003\u0010\b\u0000\u0503"+
		"\u0502\u0001\u0000\u0000\u0000\u0504\u0507\u0001\u0000\u0000\u0000\u0505"+
		"\u0503\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506"+
		"\u0508\u0001\u0000\u0000\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0508"+
		"\u050a\u0003L&\u0000\u0509\u0505\u0001\u0000\u0000\u0000\u050a\u050d\u0001"+
		"\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b\u050c\u0001"+
		"\u0000\u0000\u0000\u050c\u0511\u0001\u0000\u0000\u0000\u050d\u050b\u0001"+
		"\u0000\u0000\u0000\u050e\u0510\u0003\u0010\b\u0000\u050f\u050e\u0001\u0000"+
		"\u0000\u0000\u0510\u0513\u0001\u0000\u0000\u0000\u0511\u050f\u0001\u0000"+
		"\u0000\u0000\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u0514\u0001\u0000"+
		"\u0000\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0514\u0515\u0003`0\u0000"+
		"\u0515_\u0001\u0000\u0000\u0000\u0516\u0518\u0005\u0007\u0000\u0000\u0517"+
		"\u0519\u0003\u0010\b\u0000\u0518\u0517\u0001\u0000\u0000\u0000\u0519\u051a"+
		"\u0001\u0000\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051a\u051b"+
		"\u0001\u0000\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051e"+
		"\u0005)\u0000\u0000\u051d\u051f\u0003\u0010\b\u0000\u051e\u051d\u0001"+
		"\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u051e\u0001"+
		"\u0000\u0000\u0000\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0522\u0001"+
		"\u0000\u0000\u0000\u0522\u0526\u0003r9\u0000\u0523\u0525\t\u0000\u0000"+
		"\u0000\u0524\u0523\u0001\u0000\u0000\u0000\u0525\u0528\u0001\u0000\u0000"+
		"\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0526\u0524\u0001\u0000\u0000"+
		"\u0000\u0527\u052c\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000"+
		"\u0000\u0529\u052b\u0003\u0010\b\u0000\u052a\u0529\u0001\u0000\u0000\u0000"+
		"\u052b\u052e\u0001\u0000\u0000\u0000\u052c\u052a\u0001\u0000\u0000\u0000"+
		"\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u052f\u0001\u0000\u0000\u0000"+
		"\u052e\u052c\u0001\u0000\u0000\u0000\u052f\u0530\u0005+\u0000\u0000\u0530"+
		"\u0531\u00053\u0000\u0000\u0531a\u0001\u0000\u0000\u0000\u0532\u0534\u0003"+
		"\u0010\b\u0000\u0533\u0532\u0001\u0000\u0000\u0000\u0534\u0537\u0001\u0000"+
		"\u0000\u0000\u0535\u0533\u0001\u0000\u0000\u0000\u0535\u0536\u0001\u0000"+
		"\u0000\u0000\u0536\u0538\u0001\u0000\u0000\u0000\u0537\u0535\u0001\u0000"+
		"\u0000\u0000\u0538\u0539\u0003d2\u0000\u0539c\u0001\u0000\u0000\u0000"+
		"\u053a\u053c\u0005\u001c\u0000\u0000\u053b\u053d\b\u0000\u0000\u0000\u053c"+
		"\u053b\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000\u0000\u053e"+
		"\u053c\u0001\u0000\u0000\u0000\u053e\u053f\u0001\u0000\u0000\u0000\u053f"+
		"\u0540\u0001\u0000\u0000\u0000\u0540\u0541\u00053\u0000\u0000\u0541e\u0001"+
		"\u0000\u0000\u0000\u0542\u0544\u0003\u0010\b\u0000\u0543\u0542\u0001\u0000"+
		"\u0000\u0000\u0544\u0547\u0001\u0000\u0000\u0000\u0545\u0543\u0001\u0000"+
		"\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0548\u0001\u0000"+
		"\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0548\u054a\u0005!\u0000"+
		"\u0000\u0549\u054b\b\u0007\u0000\u0000\u054a\u0549\u0001\u0000\u0000\u0000"+
		"\u054b\u054c\u0001\u0000\u0000\u0000\u054c\u054a\u0001\u0000\u0000\u0000"+
		"\u054c\u054d\u0001\u0000\u0000\u0000\u054dg\u0001\u0000\u0000\u0000\u054e"+
		"\u054f\u0003\u0010\b\u0000\u054fi\u0001\u0000\u0000\u0000\u0550\u0552"+
		"\u0003\u0010\b\u0000\u0551\u0550\u0001\u0000\u0000\u0000\u0552\u0555\u0001"+
		"\u0000\u0000\u0000\u0553\u0551\u0001\u0000\u0000\u0000\u0553\u0554\u0001"+
		"\u0000\u0000\u0000\u0554\u0556\u0001\u0000\u0000\u0000\u0555\u0553\u0001"+
		"\u0000\u0000\u0000\u0556\u0558\u0005 \u0000\u0000\u0557\u0559\b\u0000"+
		"\u0000\u0000\u0558\u0557\u0001\u0000\u0000\u0000\u0559\u055a\u0001\u0000"+
		"\u0000\u0000\u055a\u0558\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000"+
		"\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c\u055d\u00053\u0000"+
		"\u0000\u055dk\u0001\u0000\u0000\u0000\u055e\u0560\u0003\u0010\b\u0000"+
		"\u055f\u055e\u0001\u0000\u0000\u0000\u0560\u0563\u0001\u0000\u0000\u0000"+
		"\u0561\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000\u0000\u0000"+
		"\u0562\u0564\u0001\u0000\u0000\u0000\u0563\u0561\u0001\u0000\u0000\u0000"+
		"\u0564\u0568\u0005\u0007\u0000\u0000\u0565\u0567\u0003h4\u0000\u0566\u0565"+
		"\u0001\u0000\u0000\u0000\u0567\u056a\u0001\u0000\u0000\u0000\u0568\u0566"+
		"\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056b"+
		"\u0001\u0000\u0000\u0000\u056a\u0568\u0001\u0000\u0000\u0000\u056b\u056d"+
		"\u0005\u001f\u0000\u0000\u056c\u056e\b\u0000\u0000\u0000\u056d\u056c\u0001"+
		"\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056f\u056d\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u0571\u0001"+
		"\u0000\u0000\u0000\u0571\u0572\u00053\u0000\u0000\u0572m\u0001\u0000\u0000"+
		"\u0000\u0573\u0575\u0003\u0010\b\u0000\u0574\u0573\u0001\u0000\u0000\u0000"+
		"\u0575\u0578\u0001\u0000\u0000\u0000\u0576\u0574\u0001\u0000\u0000\u0000"+
		"\u0576\u0577\u0001\u0000\u0000\u0000\u0577\u0579\u0001\u0000\u0000\u0000"+
		"\u0578\u0576\u0001\u0000\u0000\u0000\u0579\u057d\u0005\u0007\u0000\u0000"+
		"\u057a\u057c\u0003\u0010\b\u0000\u057b\u057a\u0001\u0000\u0000\u0000\u057c"+
		"\u057f\u0001\u0000\u0000\u0000\u057d\u057b\u0001\u0000\u0000\u0000\u057d"+
		"\u057e\u0001\u0000\u0000\u0000\u057e\u0580\u0001\u0000\u0000\u0000\u057f"+
		"\u057d\u0001\u0000\u0000\u0000\u0580\u0584\u0005-\u0000\u0000\u0581\u0583"+
		"\u0003\u0010\b\u0000\u0582\u0581\u0001\u0000\u0000\u0000\u0583\u0586\u0001"+
		"\u0000\u0000\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0584\u0585\u0001"+
		"\u0000\u0000\u0000\u0585\u0587\u0001\u0000\u0000\u0000\u0586\u0584\u0001"+
		"\u0000\u0000\u0000\u0587\u0589\u0005.\u0000\u0000\u0588\u058a\b\u0000"+
		"\u0000\u0000\u0589\u0588\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000"+
		"\u0000\u0000\u058b\u0589\u0001\u0000\u0000\u0000\u058b\u058c\u0001\u0000"+
		"\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u058e\u00053\u0000"+
		"\u0000\u058eo\u0001\u0000\u0000\u0000\u058f\u0591\u0003\u0010\b\u0000"+
		"\u0590\u058f\u0001\u0000\u0000\u0000\u0591\u0594\u0001\u0000\u0000\u0000"+
		"\u0592\u0590\u0001\u0000\u0000\u0000\u0592\u0593\u0001\u0000\u0000\u0000"+
		"\u0593\u0595\u0001\u0000\u0000\u0000\u0594\u0592\u0001\u0000\u0000\u0000"+
		"\u0595\u0599\u0005\u0007\u0000\u0000\u0596\u0598\u0003\u0010\b\u0000\u0597"+
		"\u0596\u0001\u0000\u0000\u0000\u0598\u059b\u0001\u0000\u0000\u0000\u0599"+
		"\u0597\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a"+
		"\u059c\u0001\u0000\u0000\u0000\u059b\u0599\u0001\u0000\u0000\u0000\u059c"+
		"\u05a0\u0005/\u0000\u0000\u059d\u059f\u0003\u0010\b\u0000\u059e\u059d"+
		"\u0001\u0000\u0000\u0000\u059f\u05a2\u0001\u0000\u0000\u0000\u05a0\u059e"+
		"\u0001\u0000\u0000\u0000\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u05a4"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a3\u05a5"+
		"\b\u0000\u0000\u0000\u05a4\u05a3\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001"+
		"\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05a9\u0005"+
		"3\u0000\u0000\u05a9q\u0001\u0000\u0000\u0000\u05aa\u05ae\u0003t:\u0000"+
		"\u05ab\u05ad\u0003h4\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000\u05ad\u05b0"+
		"\u0001\u0000\u0000\u0000\u05ae\u05ac\u0001\u0000\u0000\u0000\u05ae\u05af"+
		"\u0001\u0000\u0000\u0000\u05af\u05b1\u0001\u0000\u0000\u0000\u05b0\u05ae"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b2\u0005E\u0000\u0000\u05b2\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b3\u05aa\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b8\u0001\u0000\u0000\u0000\u05b5\u05b7\u0003"+
		"h4\u0000\u05b6\u05b5\u0001\u0000\u0000\u0000\u05b7\u05ba\u0001\u0000\u0000"+
		"\u0000\u05b8\u05b6\u0001\u0000\u0000\u0000\u05b8\u05b9\u0001\u0000\u0000"+
		"\u0000\u05b9\u05bb\u0001\u0000\u0000\u0000\u05ba\u05b8\u0001\u0000\u0000"+
		"\u0000\u05bb\u05bf\u0003v;\u0000\u05bc\u05be\u0003h4\u0000\u05bd\u05bc"+
		"\u0001\u0000\u0000\u0000\u05be\u05c1\u0001\u0000\u0000\u0000\u05bf\u05bd"+
		"\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c2"+
		"\u0001\u0000\u0000\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c3"+
		"\u0005E\u0000\u0000\u05c3\u05c5\u0001\u0000\u0000\u0000\u05c4\u05b3\u0001"+
		"\u0000\u0000\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u05c9\u0001"+
		"\u0000\u0000\u0000\u05c6\u05c8\u0003h4\u0000\u05c7\u05c6\u0001\u0000\u0000"+
		"\u0000\u05c8\u05cb\u0001\u0000\u0000\u0000\u05c9\u05c7\u0001\u0000\u0000"+
		"\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cc\u0001\u0000\u0000"+
		"\u0000\u05cb\u05c9\u0001\u0000\u0000\u0000\u05cc\u05cd\u0003x<\u0000\u05cd"+
		"s\u0001\u0000\u0000\u0000\u05ce\u05cf\u0003z=\u0000\u05cfu\u0001\u0000"+
		"\u0000\u0000\u05d0\u05d1\u0003z=\u0000\u05d1w\u0001\u0000\u0000\u0000"+
		"\u05d2\u05d3\u0003z=\u0000\u05d3y\u0001\u0000\u0000\u0000\u05d4\u05da"+
		"\u0003~?\u0000\u05d5\u05d6\u00059\u0000\u0000\u05d6\u05d7\u0003|>\u0000"+
		"\u05d7\u05d8\u00059\u0000\u0000\u05d8\u05da\u0001\u0000\u0000\u0000\u05d9"+
		"\u05d4\u0001\u0000\u0000\u0000\u05d9\u05d5\u0001\u0000\u0000\u0000\u05da"+
		"{\u0001\u0000\u0000\u0000\u05db\u05dd\u0003h4\u0000\u05dc\u05db\u0001"+
		"\u0000\u0000\u0000\u05dd\u05e0\u0001\u0000\u0000\u0000\u05de\u05dc\u0001"+
		"\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000\u05df\u05e1\u0001"+
		"\u0000\u0000\u0000\u05e0\u05de\u0001\u0000\u0000\u0000\u05e1\u05e5\u0003"+
		"~?\u0000\u05e2\u05e4\u0003h4\u0000\u05e3\u05e2\u0001\u0000\u0000\u0000"+
		"\u05e4\u05e7\u0001\u0000\u0000\u0000\u05e5\u05e3\u0001\u0000\u0000\u0000"+
		"\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05f7\u0001\u0000\u0000\u0000"+
		"\u05e7\u05e5\u0001\u0000\u0000\u0000\u05e8\u05ea\u0003h4\u0000\u05e9\u05e8"+
		"\u0001\u0000\u0000\u0000\u05ea\u05ed\u0001\u0000\u0000\u0000\u05eb\u05e9"+
		"\u0001\u0000\u0000\u0000\u05eb\u05ec\u0001\u0000\u0000\u0000\u05ec\u05ee"+
		"\u0001\u0000\u0000\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ee\u05f2"+
		"\u0003~?\u0000\u05ef\u05f1\u0003h4\u0000\u05f0\u05ef\u0001\u0000\u0000"+
		"\u0000\u05f1\u05f4\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001\u0000\u0000"+
		"\u0000\u05f2\u05f3\u0001\u0000\u0000\u0000\u05f3\u05f6\u0001\u0000\u0000"+
		"\u0000\u05f4\u05f2\u0001\u0000\u0000\u0000\u05f5\u05eb\u0001\u0000\u0000"+
		"\u0000\u05f6\u05f9\u0001\u0000\u0000\u0000\u05f7\u05f5\u0001\u0000\u0000"+
		"\u0000\u05f7\u05f8\u0001\u0000\u0000\u0000\u05f8}\u0001\u0000\u0000\u0000"+
		"\u05f9\u05f7\u0001\u0000\u0000\u0000\u05fa\u05fb\u0007\b\u0000\u0000\u05fb"+
		"\u007f\u0001\u0000\u0000\u0000\u00d1\u0083\u0089\u009c\u00a2\u00b8\u00bd"+
		"\u00c2\u00c8\u00cf\u00d6\u00e0\u00e7\u00ed\u00f4\u00fb\u0101\u0108\u010f"+
		"\u0115\u011b\u0122\u0129\u012f\u0136\u013d\u0143\u014a\u0151\u0157\u015d"+
		"\u0164\u016b\u0171\u017a\u0183\u0189\u018f\u0197\u019e\u01a5\u01ad\u01b6"+
		"\u01bc\u01c2\u01c8\u01cf\u01d8\u01de\u01e4\u01eb\u01f4\u01fa\u0202\u020b"+
		"\u020f\u0214\u021b\u0221\u0227\u022e\u0237\u023d\u0244\u024d\u0253\u025a"+
		"\u0260\u0266\u026f\u0275\u027b\u0282\u028b\u0291\u0297\u029e\u02a4\u02aa"+
		"\u02b0\u02b7\u02c2\u02c8\u02ce\u02d2\u02d6\u02dc\u02e3\u02ea\u02f1\u02f7"+
		"\u02f9\u02ff\u0306\u030d\u0313\u0319\u031f\u0326\u032a\u032f\u0335\u033c"+
		"\u0343\u034a\u0351\u0357\u035e\u0365\u036b\u0371\u0377\u037d\u0383\u038a"+
		"\u0390\u0397\u039e\u03a4\u03aa\u03b0\u03b6\u03bb\u03c0\u03c7\u03ce\u03d5"+
		"\u03db\u03e1\u03e7\u03ed\u03f4\u03fb\u0402\u0409\u040f\u0415\u041a\u0421"+
		"\u0428\u042b\u0430\u0432\u0438\u043e\u0445\u044c\u0453\u0459\u045f\u0468"+
		"\u046e\u0474\u047a\u0480\u0485\u048d\u0493\u0499\u049f\u04a8\u04ae\u04b4"+
		"\u04bb\u04c4\u04ca\u04d0\u04d7\u04dd\u04e3\u04ec\u04f2\u04f8\u04fd\u0505"+
		"\u050b\u0511\u051a\u0520\u0526\u052c\u0535\u053e\u0545\u054c\u0553\u055a"+
		"\u0561\u0568\u056f\u0576\u057d\u0584\u058b\u0592\u0599\u05a0\u05a6\u05ae"+
		"\u05b3\u05b8\u05bf\u05c4\u05c9\u05d9\u05de\u05e5\u05eb\u05f2\u05f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}