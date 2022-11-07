// Generated from /Users/p3inm035/IdeaProjects/a360-migrator-service/src/main/java/com/p3solutions/db2lookExecutor/parser/Db2Look.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					tabSpace();
					}
					} 
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(824);
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
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(829);
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
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(831);
				tabSpace();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(837);
			match(REFRESH);
			setState(839); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(838);
				tabSpace();
				}
				}
				setState(841); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(843);
			match(TABLE);
			setState(845); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(844);
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
				setState(847); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(849);
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
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(851);
				tabSpace();
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
			match(ALTER);
			setState(859); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(858);
				tabSpace();
				}
				}
				setState(861); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(863);
			match(TABLE);
			setState(865); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(864);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(867); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(869);
			fullNameModel();
			setState(871); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(870);
				tabSpace();
				}
				}
				setState(873); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(875);
			match(ADD);
			setState(877); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(876);
				tabSpace();
				}
				}
				setState(879); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(881);
			match(CONSTRAINT);
			setState(883); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(882);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(885); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(887);
			fullNameModel();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(888);
				tabSpace();
				}
				}
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(894);
			match(FOREIGN_KEY);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					tabSpace();
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(902); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(901);
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
				setState(904); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(906);
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
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(908);
				tabSpace();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(914);
			match(ALTER);
			setState(916); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(915);
				tabSpace();
				}
				}
				setState(918); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(920);
			match(TABLE);
			setState(922); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(921);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(924); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(926);
			fullNameModel();
			setState(928); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(927);
				tabSpace();
				}
				}
				setState(930); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(932);
			match(ADD);
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(934); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(933);
					tabSpace();
					}
					}
					setState(936); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				setState(938);
				match(CONSTRAINT);
				setState(942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(939);
						tabSpace();
						}
						} 
					}
					setState(944);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(945);
				fullNameModel();
				}
				break;
			}
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(949);
				tabSpace();
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(955);
			match(UNIQUE);
			setState(957); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(956);
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
				setState(959); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(961);
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
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(963);
				tabSpace();
				}
				}
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(969);
			match(ALTER);
			setState(971); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(970);
				tabSpace();
				}
				}
				setState(973); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(975);
			match(TABLE);
			setState(977); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(976);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(979); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(981);
			fullNameModel();
			setState(983); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(982);
				tabSpace();
				}
				}
				setState(985); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(987);
			match(ADD);
			setState(989); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(988);
				tabSpace();
				}
				}
				setState(991); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(993);
			match(CONSTRAINT);
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(994);
					tabSpace();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1000);
			fullNameModel();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1001);
				tabSpace();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007);
			match(CHECK);
			setState(1009); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1008);
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
				setState(1011); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1013);
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
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1015);
				tabSpace();
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
			match(ALTER);
			setState(1023); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1022);
				tabSpace();
				}
				}
				setState(1025); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1027);
			match(TABLE);
			setState(1029); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1028);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1031); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1033);
			fullNameModel();
			setState(1035); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1034);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1037); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1040); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039);
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
				setState(1042); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1044);
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
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1046);
				tabSpace();
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
			match(CREATE);
			setState(1054); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1053);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1056); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIQUE) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(1058);
					match(UNIQUE);
					}
				}

				setState(1062); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1061);
					tabSpace();
					}
					}
					setState(1064); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
				}
			}

			setState(1068);
			match(INDEX);
			setState(1070); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1069);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1072); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1074);
			fullNameModel();
			setState(1076); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1075);
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
				setState(1078); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1080);
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
			match(SET);
			setState(1090); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1089);
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
				setState(1092); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1094);
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
			setState(1105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1099);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1096);
							tabSpace();
							}
							} 
						}
						setState(1101);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					}
					setState(1102);
					setStatement();
					}
					} 
				}
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1108);
				tabSpace();
				}
				}
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
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
			setState(1116);
			match(CREATE);
			setState(1118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1117);
				tabSpace();
				}
				}
				setState(1120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1122);
			match(FUNCTION);
			setState(1124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1123);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1128);
			fullNameModel();
			setState(1132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1129);
					tabSpace();
					}
					} 
				}
				setState(1134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			{
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1135);
					tabSpace();
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			setState(1142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1141);
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
				setState(1144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1146);
				tabSpace();
				}
				}
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1152);
			match(TERMINATOR);
			}
			setState(1157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1154);
					tabSpace();
					}
					} 
				}
				setState(1159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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
			setState(1169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1160);
							tabSpace();
							}
							} 
						}
						setState(1165);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
					}
					setState(1166);
					setStatement();
					}
					} 
				}
				setState(1171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1172);
				tabSpace();
				}
				}
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1178);
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
			setState(1180);
			match(CREATE);
			setState(1182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1181);
				tabSpace();
				}
				}
				setState(1184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1186);
			match(VIEW);
			setState(1188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1187);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1192);
			fullNameModel();
			setState(1194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1193);
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
				setState(1196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1198);
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
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1200);
				tabSpace();
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1206);
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
			setState(1208);
			match(CREATE);
			setState(1210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1209);
				tabSpace();
				}
				}
				setState(1212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1214);
			match(ALIAS);
			setState(1216); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1215);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1220);
			fullNameModel();
			setState(1222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1221);
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
				setState(1224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1226);
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
			setState(1237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1228);
							tabSpace();
							}
							} 
						}
						setState(1233);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
					}
					setState(1234);
					setStatement();
					}
					} 
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1240);
				tabSpace();
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1246);
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
			setState(1248);
			match(CREATE);
			setState(1250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1249);
				tabSpace();
				}
				}
				setState(1252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1254);
			match(PROCEDURE);
			setState(1256); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1255);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1258); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1260);
			fullNameModel();
			setState(1262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1261);
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
				setState(1264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1266);
				tabSpace();
				}
				}
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1272);
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
			setState(1283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1274);
							tabSpace();
							}
							} 
						}
						setState(1279);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					}
					setState(1280);
					setStatement();
					}
					} 
				}
				setState(1285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1286);
				tabSpace();
				}
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1292);
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
			setState(1294);
			match(CREATE);
			setState(1296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1295);
				tabSpace();
				}
				}
				setState(1298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) );
			setState(1300);
			match(TRIGGER);
			setState(1302); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1301);
					tabSpace();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1304); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1306);
			fullNameModel();
			setState(1310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1307);
					matchWildcard();
					}
					} 
				}
				setState(1312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			{
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1313);
				tabSpace();
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1319);
			match(END);
			setState(1320);
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
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1322);
				tabSpace();
				}
				}
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1328);
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
			setState(1330);
			match(GRANT);
			setState(1332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1331);
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
				setState(1334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1336);
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
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1338);
				tabSpace();
				}
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1344);
			match(TERMINATE);
			setState(1346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1345);
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
				setState(1348); 
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
			setState(1350);
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
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1352);
				tabSpace();
				}
				}
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1358);
			match(COMMIT);
			setState(1360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1359);
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
				setState(1362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1364);
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
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1366);
				tabSpace();
				}
				}
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1372);
			match(CREATE);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1373);
				space();
				}
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1379);
			match(TRUSTED_CONTEXT);
			setState(1381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1380);
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
				setState(1383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1385);
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
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1387);
				tabSpace();
				}
				}
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1393);
			match(CREATE);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1394);
				tabSpace();
				}
				}
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1400);
			match(AUDIT);
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1401);
				tabSpace();
				}
				}
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1407);
			match(POLICY);
			setState(1409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1408);
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
				setState(1411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1413);
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
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1415);
				tabSpace();
				}
				}
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1421);
			match(CREATE);
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
				{
				{
				setState(1422);
				tabSpace();
				}
				}
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1428);
			match(ROLE);
			setState(1432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1429);
					tabSpace();
					}
					} 
				}
				setState(1434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			setState(1436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1435);
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
				setState(1438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONNECT) | (1L << TO) | (1L << SUMMARY) | (1L << TYPE) | (1L << WRAPPER) | (1L << SEQUENCE) | (1L << CREATE) | (1L << ALIAS) | (1L << ALTER) | (1L << INDEX) | (1L << LARGE) | (1L << REGULAR) | (1L << SYSTEM) | (1L << USER) | (1L << TEMPORARY) | (1L << TABLESPACE) | (1L << SCHEMA) | (1L << REFRESH) | (1L << TABLE) | (1L << ADD) | (1L << PRIMARY_KEY) | (1L << FOREIGN_KEY) | (1L << DATABASE) | (1L << PARTITION) | (1L << GROUP) | (1L << UNIQUE) | (1L << CHECK) | (1L << GRANT) | (1L << RESET) | (1L << SET) | (1L << TRUSTED_CONTEXT) | (1L << COMMIT) | (1L << TERMINATE) | (1L << BUFFERPOOL) | (1L << STOGROUP) | (1L << OR_REPLACE) | (1L << VIEW) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << COMMENT) | (1L << TRIGGER) | (1L << BEGIN) | (1L << END) | (1L << CONSTRAINT) | (1L << AUDIT) | (1L << POLICY) | (1L << ROLE) | (1L << SERVER) | (1L << MAPPING) | (1L << NICKNAME) | (1L << LT_BRACKET) | (1L << RT_BRACKET) | (1L << SYMBOL9) | (1L << SLASH) | (1L << SEMI_COLON) | (1L << QUOTATION) | (1L << COMMA) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3) | (1L << CURLY_BRACKET1))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURLY_BRACKET2 - 64)) | (1L << (COMMENTS - 64)) | (1L << (SINGLE_COMMENTS - 64)) | (1L << (HASH_SKIPPER - 64)) | (1L << (POINTER_SYMBOL - 64)) | (1L << (DOT - 64)) | (1L << (NUMS - 64)) | (1L << (NUMBER - 64)) | (1L << (EQUAL - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (LT_SET_BRACKET - 64)) | (1L << (RT_SET_BRACKET - 64)) | (1L << (ASTRIEK - 64)) | (1L << (SMALLER_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (PERCENTAGE - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (DOLLAR - 64)) | (1L << (DECLARE - 64)) | (1L << (ASTERIK - 64)) | (1L << (EXCLAMATION - 64)) | (1L << (WORD - 64)) | (1L << (DIGIT - 64)) | (1L << (LOWERCASE - 64)) | (1L << (UPPERCASE - 64)) | (1L << (COLON - 64)) | (1L << (QUESTION_MARK - 64)))) != 0) );
			setState(1440);
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
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1442);
					databaseName();
					setState(1446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
						{
						{
						setState(1443);
						space();
						}
						}
						setState(1448);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1449);
					match(DOT);
					}
					break;
				}
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1453);
						space();
						}
						} 
					}
					setState(1458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				setState(1459);
				schemaName();
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0)) {
					{
					{
					setState(1460);
					space();
					}
					}
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1466);
				match(DOT);
				}
				break;
			}
			setState(1473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1470);
					space();
					}
					} 
				}
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1476);
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
			setState(1478);
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
			setState(1480);
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
			setState(1482);
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
			setState(1489);
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
				setState(1484);
				handle();
				}
				break;
			case QUOTATION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1485);
				match(QUOTATION);
				setState(1486);
				variable();
				setState(1487);
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
			setState(1494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1491);
					space();
					}
					} 
				}
				setState(1496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1497);
			handle();
			setState(1501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1498);
					space();
					}
					} 
				}
				setState(1503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << USER) | (1L << SCHEMA) | (1L << GROUP) | (1L << SPACE) | (1L << TAB) | (1L << TAB1) | (1L << TAB3))) != 0) || _la==WORD) {
				{
				{
				setState(1507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1504);
						space();
						}
						} 
					}
					setState(1509);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1510);
				handle();
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1511);
						space();
						}
						} 
					}
					setState(1516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				}
				}
				setState(1521);
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
			setState(1522);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u05f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\7\2"+
		"\u008a\n\2\f\2\16\2\u008d\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2\u009d\n\2\f\2\16\2\u00a0\13\2\3\2\7\2\u00a3\n\2\f"+
		"\2\16\2\u00a6\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00bb\n\2\3\2\7\2\u00be\n\2\f\2\16\2\u00c1"+
		"\13\2\7\2\u00c3\n\2\f\2\16\2\u00c6\13\2\3\2\7\2\u00c9\n\2\f\2\16\2\u00cc"+
		"\13\2\3\2\3\2\7\2\u00d0\n\2\f\2\16\2\u00d3\13\2\3\2\3\2\7\2\u00d7\n\2"+
		"\f\2\16\2\u00da\13\2\3\2\3\2\3\2\3\2\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4"+
		"\13\3\3\3\3\3\6\3\u00e8\n\3\r\3\16\3\u00e9\3\3\3\3\6\3\u00ee\n\3\r\3\16"+
		"\3\u00ef\3\3\3\3\3\4\7\4\u00f5\n\4\f\4\16\4\u00f8\13\4\3\4\3\4\6\4\u00fc"+
		"\n\4\r\4\16\4\u00fd\3\4\3\4\6\4\u0102\n\4\r\4\16\4\u0103\3\4\3\4\3\5\7"+
		"\5\u0109\n\5\f\5\16\5\u010c\13\5\3\5\3\5\6\5\u0110\n\5\r\5\16\5\u0111"+
		"\3\5\3\5\6\5\u0116\n\5\r\5\16\5\u0117\3\5\3\5\6\5\u011c\n\5\r\5\16\5\u011d"+
		"\3\5\3\5\3\6\7\6\u0123\n\6\f\6\16\6\u0126\13\6\3\6\3\6\6\6\u012a\n\6\r"+
		"\6\16\6\u012b\3\6\3\6\6\6\u0130\n\6\r\6\16\6\u0131\3\6\3\6\3\7\7\7\u0137"+
		"\n\7\f\7\16\7\u013a\13\7\3\7\3\7\6\7\u013e\n\7\r\7\16\7\u013f\3\7\3\7"+
		"\6\7\u0144\n\7\r\7\16\7\u0145\3\7\3\7\3\b\7\b\u014b\n\b\f\b\16\b\u014e"+
		"\13\b\3\b\3\b\6\b\u0152\n\b\r\b\16\b\u0153\3\b\3\b\6\b\u0158\n\b\r\b\16"+
		"\b\u0159\3\b\3\b\6\b\u015e\n\b\r\b\16\b\u015f\3\b\3\b\3\t\7\t\u0165\n"+
		"\t\f\t\16\t\u0168\13\t\3\t\3\t\6\t\u016c\n\t\r\t\16\t\u016d\3\t\3\t\6"+
		"\t\u0172\n\t\r\t\16\t\u0173\3\t\3\t\3\n\3\n\3\13\7\13\u017b\n\13\f\13"+
		"\16\13\u017e\13\13\3\13\3\13\3\f\3\f\6\f\u0184\n\f\r\f\16\f\u0185\3\f"+
		"\3\f\6\f\u018a\n\f\r\f\16\f\u018b\3\f\3\f\7\f\u0190\n\f\f\f\16\f\u0193"+
		"\13\f\3\f\3\f\3\r\7\r\u0198\n\r\f\r\16\r\u019b\13\r\3\r\3\r\7\r\u019f"+
		"\n\r\f\r\16\r\u01a2\13\r\3\r\3\r\7\r\u01a6\n\r\f\r\16\r\u01a9\13\r\3\r"+
		"\3\r\3\16\7\16\u01ae\n\16\f\16\16\16\u01b1\13\16\3\16\3\16\3\17\3\17\6"+
		"\17\u01b7\n\17\r\17\16\17\u01b8\3\17\3\17\6\17\u01bd\n\17\r\17\16\17\u01be"+
		"\3\17\3\17\6\17\u01c3\n\17\r\17\16\17\u01c4\3\17\3\17\6\17\u01c9\n\17"+
		"\r\17\16\17\u01ca\3\17\3\17\3\20\7\20\u01d0\n\20\f\20\16\20\u01d3\13\20"+
		"\3\20\3\20\3\21\3\21\6\21\u01d9\n\21\r\21\16\21\u01da\3\21\3\21\6\21\u01df"+
		"\n\21\r\21\16\21\u01e0\3\21\3\21\6\21\u01e5\n\21\r\21\16\21\u01e6\3\21"+
		"\3\21\3\22\7\22\u01ec\n\22\f\22\16\22\u01ef\13\22\3\22\3\22\3\23\3\23"+
		"\6\23\u01f5\n\23\r\23\16\23\u01f6\3\23\3\23\7\23\u01fb\n\23\f\23\16\23"+
		"\u01fe\13\23\3\23\3\23\3\24\7\24\u0203\n\24\f\24\16\24\u0206\13\24\3\24"+
		"\3\24\3\25\3\25\7\25\u020c\n\25\f\25\16\25\u020f\13\25\3\25\5\25\u0212"+
		"\n\25\3\25\7\25\u0215\n\25\f\25\16\25\u0218\13\25\3\25\3\25\7\25\u021c"+
		"\n\25\f\25\16\25\u021f\13\25\3\25\6\25\u0222\n\25\r\25\16\25\u0223\3\25"+
		"\3\25\6\25\u0228\n\25\r\25\16\25\u0229\3\25\3\25\3\26\7\26\u022f\n\26"+
		"\f\26\16\26\u0232\13\26\3\26\3\26\3\27\3\27\6\27\u0238\n\27\r\27\16\27"+
		"\u0239\3\27\3\27\6\27\u023e\n\27\r\27\16\27\u023f\3\27\3\27\3\30\7\30"+
		"\u0245\n\30\f\30\16\30\u0248\13\30\3\30\3\30\3\31\3\31\6\31\u024e\n\31"+
		"\r\31\16\31\u024f\3\31\3\31\6\31\u0254\n\31\r\31\16\31\u0255\3\31\3\31"+
		"\3\32\7\32\u025b\n\32\f\32\16\32\u025e\13\32\3\32\7\32\u0261\n\32\f\32"+
		"\16\32\u0264\13\32\3\32\7\32\u0267\n\32\f\32\16\32\u026a\13\32\3\32\3"+
		"\32\3\33\3\33\6\33\u0270\n\33\r\33\16\33\u0271\3\33\3\33\6\33\u0276\n"+
		"\33\r\33\16\33\u0277\3\33\3\33\6\33\u027c\n\33\r\33\16\33\u027d\3\33\3"+
		"\33\3\34\7\34\u0283\n\34\f\34\16\34\u0286\13\34\3\34\3\34\3\35\3\35\6"+
		"\35\u028c\n\35\r\35\16\35\u028d\3\35\3\35\6\35\u0292\n\35\r\35\16\35\u0293"+
		"\3\35\3\35\6\35\u0298\n\35\r\35\16\35\u0299\3\35\3\35\3\36\7\36\u029f"+
		"\n\36\f\36\16\36\u02a2\13\36\3\36\7\36\u02a5\n\36\f\36\16\36\u02a8\13"+
		"\36\3\36\7\36\u02ab\n\36\f\36\16\36\u02ae\13\36\3\36\7\36\u02b1\n\36\f"+
		"\36\16\36\u02b4\13\36\3\36\3\36\7\36\u02b8\n\36\f\36\16\36\u02bb\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02c3\n\36\f\36\16\36\u02c6\13\36"+
		"\3\36\7\36\u02c9\n\36\f\36\16\36\u02cc\13\36\3\36\7\36\u02cf\n\36\f\36"+
		"\16\36\u02d2\13\36\3\36\5\36\u02d5\n\36\7\36\u02d7\n\36\f\36\16\36\u02da"+
		"\13\36\3\37\7\37\u02dd\n\37\f\37\16\37\u02e0\13\37\3\37\3\37\6\37\u02e4"+
		"\n\37\r\37\16\37\u02e5\3\37\3\37\3 \7 \u02eb\n \f \16 \u02ee\13 \3 \3"+
		" \6 \u02f2\n \r \16 \u02f3\3 \3 \6 \u02f8\n \r \16 \u02f9\5 \u02fc\n "+
		"\3 \3 \6 \u0300\n \r \16 \u0301\3 \3 \3!\7!\u0307\n!\f!\16!\u030a\13!"+
		"\3!\3!\6!\u030e\n!\r!\16!\u030f\3!\3!\6!\u0314\n!\r!\16!\u0315\3!\3!\6"+
		"!\u031a\n!\r!\16!\u031b\3!\3!\7!\u0320\n!\f!\16!\u0323\13!\3!\3!\7!\u0327"+
		"\n!\f!\16!\u032a\13!\3!\5!\u032d\n!\3!\6!\u0330\n!\r!\16!\u0331\3!\3!"+
		"\7!\u0336\n!\f!\16!\u0339\13!\3!\6!\u033c\n!\r!\16!\u033d\3!\3!\3\"\7"+
		"\"\u0343\n\"\f\"\16\"\u0346\13\"\3\"\3\"\6\"\u034a\n\"\r\"\16\"\u034b"+
		"\3\"\3\"\6\"\u0350\n\"\r\"\16\"\u0351\3\"\3\"\3#\7#\u0357\n#\f#\16#\u035a"+
		"\13#\3#\3#\6#\u035e\n#\r#\16#\u035f\3#\3#\6#\u0364\n#\r#\16#\u0365\3#"+
		"\3#\6#\u036a\n#\r#\16#\u036b\3#\3#\6#\u0370\n#\r#\16#\u0371\3#\3#\6#\u0376"+
		"\n#\r#\16#\u0377\3#\3#\7#\u037c\n#\f#\16#\u037f\13#\3#\3#\7#\u0383\n#"+
		"\f#\16#\u0386\13#\3#\6#\u0389\n#\r#\16#\u038a\3#\3#\3$\7$\u0390\n$\f$"+
		"\16$\u0393\13$\3$\3$\6$\u0397\n$\r$\16$\u0398\3$\3$\6$\u039d\n$\r$\16"+
		"$\u039e\3$\3$\6$\u03a3\n$\r$\16$\u03a4\3$\3$\6$\u03a9\n$\r$\16$\u03aa"+
		"\3$\3$\7$\u03af\n$\f$\16$\u03b2\13$\3$\3$\5$\u03b6\n$\3$\7$\u03b9\n$\f"+
		"$\16$\u03bc\13$\3$\3$\6$\u03c0\n$\r$\16$\u03c1\3$\3$\3%\7%\u03c7\n%\f"+
		"%\16%\u03ca\13%\3%\3%\6%\u03ce\n%\r%\16%\u03cf\3%\3%\6%\u03d4\n%\r%\16"+
		"%\u03d5\3%\3%\6%\u03da\n%\r%\16%\u03db\3%\3%\6%\u03e0\n%\r%\16%\u03e1"+
		"\3%\3%\7%\u03e6\n%\f%\16%\u03e9\13%\3%\3%\7%\u03ed\n%\f%\16%\u03f0\13"+
		"%\3%\3%\6%\u03f4\n%\r%\16%\u03f5\3%\3%\3&\7&\u03fb\n&\f&\16&\u03fe\13"+
		"&\3&\3&\6&\u0402\n&\r&\16&\u0403\3&\3&\6&\u0408\n&\r&\16&\u0409\3&\3&"+
		"\6&\u040e\n&\r&\16&\u040f\3&\6&\u0413\n&\r&\16&\u0414\3&\3&\3\'\7\'\u041a"+
		"\n\'\f\'\16\'\u041d\13\'\3\'\3\'\6\'\u0421\n\'\r\'\16\'\u0422\3\'\5\'"+
		"\u0426\n\'\3\'\6\'\u0429\n\'\r\'\16\'\u042a\5\'\u042d\n\'\3\'\3\'\6\'"+
		"\u0431\n\'\r\'\16\'\u0432\3\'\3\'\6\'\u0437\n\'\r\'\16\'\u0438\3\'\3\'"+
		"\3(\7(\u043e\n(\f(\16(\u0441\13(\3(\3(\6(\u0445\n(\r(\16(\u0446\3(\3("+
		"\3)\7)\u044c\n)\f)\16)\u044f\13)\3)\7)\u0452\n)\f)\16)\u0455\13)\3)\7"+
		")\u0458\n)\f)\16)\u045b\13)\3)\3)\3*\3*\6*\u0461\n*\r*\16*\u0462\3*\3"+
		"*\6*\u0467\n*\r*\16*\u0468\3*\3*\7*\u046d\n*\f*\16*\u0470\13*\3*\7*\u0473"+
		"\n*\f*\16*\u0476\13*\3*\6*\u0479\n*\r*\16*\u047a\3*\7*\u047e\n*\f*\16"+
		"*\u0481\13*\3*\3*\3*\7*\u0486\n*\f*\16*\u0489\13*\3+\7+\u048c\n+\f+\16"+
		"+\u048f\13+\3+\7+\u0492\n+\f+\16+\u0495\13+\3+\7+\u0498\n+\f+\16+\u049b"+
		"\13+\3+\3+\3,\3,\6,\u04a1\n,\r,\16,\u04a2\3,\3,\6,\u04a7\n,\r,\16,\u04a8"+
		"\3,\3,\6,\u04ad\n,\r,\16,\u04ae\3,\3,\3-\7-\u04b4\n-\f-\16-\u04b7\13-"+
		"\3-\3-\3.\3.\6.\u04bd\n.\r.\16.\u04be\3.\3.\6.\u04c3\n.\r.\16.\u04c4\3"+
		".\3.\6.\u04c9\n.\r.\16.\u04ca\3.\3.\3/\7/\u04d0\n/\f/\16/\u04d3\13/\3"+
		"/\7/\u04d6\n/\f/\16/\u04d9\13/\3/\7/\u04dc\n/\f/\16/\u04df\13/\3/\3/\3"+
		"\60\3\60\6\60\u04e5\n\60\r\60\16\60\u04e6\3\60\3\60\6\60\u04eb\n\60\r"+
		"\60\16\60\u04ec\3\60\3\60\6\60\u04f1\n\60\r\60\16\60\u04f2\3\60\7\60\u04f6"+
		"\n\60\f\60\16\60\u04f9\13\60\3\60\3\60\3\61\7\61\u04fe\n\61\f\61\16\61"+
		"\u0501\13\61\3\61\7\61\u0504\n\61\f\61\16\61\u0507\13\61\3\61\7\61\u050a"+
		"\n\61\f\61\16\61\u050d\13\61\3\61\3\61\3\62\3\62\6\62\u0513\n\62\r\62"+
		"\16\62\u0514\3\62\3\62\6\62\u0519\n\62\r\62\16\62\u051a\3\62\3\62\7\62"+
		"\u051f\n\62\f\62\16\62\u0522\13\62\3\62\7\62\u0525\n\62\f\62\16\62\u0528"+
		"\13\62\3\62\3\62\3\62\3\63\7\63\u052e\n\63\f\63\16\63\u0531\13\63\3\63"+
		"\3\63\3\64\3\64\6\64\u0537\n\64\r\64\16\64\u0538\3\64\3\64\3\65\7\65\u053e"+
		"\n\65\f\65\16\65\u0541\13\65\3\65\3\65\6\65\u0545\n\65\r\65\16\65\u0546"+
		"\3\66\3\66\3\67\7\67\u054c\n\67\f\67\16\67\u054f\13\67\3\67\3\67\6\67"+
		"\u0553\n\67\r\67\16\67\u0554\3\67\3\67\38\78\u055a\n8\f8\168\u055d\13"+
		"8\38\38\78\u0561\n8\f8\168\u0564\138\38\38\68\u0568\n8\r8\168\u0569\3"+
		"8\38\39\79\u056f\n9\f9\169\u0572\139\39\39\79\u0576\n9\f9\169\u0579\13"+
		"9\39\39\79\u057d\n9\f9\169\u0580\139\39\39\69\u0584\n9\r9\169\u0585\3"+
		"9\39\3:\7:\u058b\n:\f:\16:\u058e\13:\3:\3:\7:\u0592\n:\f:\16:\u0595\13"+
		":\3:\3:\7:\u0599\n:\f:\16:\u059c\13:\3:\6:\u059f\n:\r:\16:\u05a0\3:\3"+
		":\3;\3;\7;\u05a7\n;\f;\16;\u05aa\13;\3;\3;\5;\u05ae\n;\3;\7;\u05b1\n;"+
		"\f;\16;\u05b4\13;\3;\3;\7;\u05b8\n;\f;\16;\u05bb\13;\3;\3;\5;\u05bf\n"+
		";\3;\7;\u05c2\n;\f;\16;\u05c5\13;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?"+
		"\3?\5?\u05d4\n?\3@\7@\u05d7\n@\f@\16@\u05da\13@\3@\3@\7@\u05de\n@\f@\16"+
		"@\u05e1\13@\3@\7@\u05e4\n@\f@\16@\u05e7\13@\3@\3@\7@\u05eb\n@\f@\16@\u05ee"+
		"\13@\7@\u05f0\n@\f@\16@\u05f3\13@\3A\3A\3A\3\u0520\2B\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\2\t\3\2\65\65\3\2=@\4\2\r\16\21\21\3\2\22\22\5\2\27\30"+
		"\34\35\65\65\2\3\7\2\20\20\23\23\33\33=?XX\2\u06a8\2\u0085\3\2\2\2\4\u00e2"+
		"\3\2\2\2\6\u00f6\3\2\2\2\b\u010a\3\2\2\2\n\u0124\3\2\2\2\f\u0138\3\2\2"+
		"\2\16\u014c\3\2\2\2\20\u0166\3\2\2\2\22\u0177\3\2\2\2\24\u017c\3\2\2\2"+
		"\26\u0181\3\2\2\2\30\u0199\3\2\2\2\32\u01af\3\2\2\2\34\u01b4\3\2\2\2\36"+
		"\u01d1\3\2\2\2 \u01d6\3\2\2\2\"\u01ed\3\2\2\2$\u01f2\3\2\2\2&\u0204\3"+
		"\2\2\2(\u0209\3\2\2\2*\u0230\3\2\2\2,\u0235\3\2\2\2.\u0246\3\2\2\2\60"+
		"\u024b\3\2\2\2\62\u0262\3\2\2\2\64\u026d\3\2\2\2\66\u0284\3\2\2\28\u0289"+
		"\3\2\2\2:\u02a0\3\2\2\2<\u02de\3\2\2\2>\u02ec\3\2\2\2@\u0308\3\2\2\2B"+
		"\u0344\3\2\2\2D\u0358\3\2\2\2F\u0391\3\2\2\2H\u03c8\3\2\2\2J\u03fc\3\2"+
		"\2\2L\u041b\3\2\2\2N\u043f\3\2\2\2P\u0453\3\2\2\2R\u045e\3\2\2\2T\u0493"+
		"\3\2\2\2V\u049e\3\2\2\2X\u04b5\3\2\2\2Z\u04ba\3\2\2\2\\\u04d7\3\2\2\2"+
		"^\u04e2\3\2\2\2`\u0505\3\2\2\2b\u0510\3\2\2\2d\u052f\3\2\2\2f\u0534\3"+
		"\2\2\2h\u053f\3\2\2\2j\u0548\3\2\2\2l\u054d\3\2\2\2n\u055b\3\2\2\2p\u0570"+
		"\3\2\2\2r\u058c\3\2\2\2t\u05be\3\2\2\2v\u05c8\3\2\2\2x\u05ca\3\2\2\2z"+
		"\u05cc\3\2\2\2|\u05d3\3\2\2\2~\u05d8\3\2\2\2\u0080\u05f4\3\2\2\2\u0082"+
		"\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u00c4\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\5\22\n\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u00ba\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u00bb\5\24\13\2\u008f\u00bb\5\32\16\2\u0090\u00bb\5\36\20\2\u0091\u00bb"+
		"\5\"\22\2\u0092\u00bb\5&\24\2\u0093\u00bb\5*\26\2\u0094\u00bb\5r:\2\u0095"+
		"\u00bb\5.\30\2\u0096\u00bb\5\62\32\2\u0097\u00bb\5\66\34\2\u0098\u00bb"+
		"\5\16\b\2\u0099\u00bb\5<\37\2\u009a\u00bb\5D#\2\u009b\u009d\5\22\n\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5N(\2\u00a2\u009e"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00bb\5H%\2\u00a8\u00bb\5P)\2"+
		"\u00a9\u00bb\5T+\2\u00aa\u00bb\5X-\2\u00ab\u00bb\5:\36\2\u00ac\u00bb\5"+
		"\\/\2\u00ad\u00bb\5`\61\2\u00ae\u00bb\5p9\2\u00af\u00bb\5n8\2\u00b0\u00bb"+
		"\5\30\r\2\u00b1\u00bb\5L\'\2\u00b2\u00bb\5\n\6\2\u00b3\u00bb\5\f\7\2\u00b4"+
		"\u00bb\5T+\2\u00b5\u00bb\5\20\t\2\u00b6\u00bb\5\6\4\2\u00b7\u00bb\5\b"+
		"\5\2\u00b8\u00bb\5\4\3\2\u00b9\u00bb\5d\63\2\u00ba\u008e\3\2\2\2\u00ba"+
		"\u008f\3\2\2\2\u00ba\u0090\3\2\2\2\u00ba\u0091\3\2\2\2\u00ba\u0092\3\2"+
		"\2\2\u00ba\u0093\3\2\2\2\u00ba\u0094\3\2\2\2\u00ba\u0095\3\2\2\2\u00ba"+
		"\u0096\3\2\2\2\u00ba\u0097\3\2\2\2\u00ba\u0098\3\2\2\2\u00ba\u0099\3\2"+
		"\2\2\u00ba\u009a\3\2\2\2\u00ba\u00a4\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba"+
		"\u00a9\3\2\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba\u00ac\3\2"+
		"\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba"+
		"\u00b0\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2"+
		"\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bf\3\2"+
		"\2\2\u00bc\u00be\5\22\n\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u008b\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\5\22"+
		"\n\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\5l"+
		"\67\2\u00ce\u00d0\5\22\n\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d8\5\30\r\2\u00d5\u00d7\5\22\n\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5h\65\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7\2\2\3\u00de\3\3\2\2\2\u00df\u00e1\5\22\n\2\u00e0\u00df\3\2\2"+
		"\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7\13\2\2\u00e6\u00e8\5\22\n\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\7\64\2\2\u00ec\u00ee\n\2\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\65\2\2\u00f2\5\3\2\2\2\u00f3"+
		"\u00f5\5\22\n\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\7\t\2\2\u00fa\u00fc\5\22\n\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\7\64\2\2\u0100\u0102\n\2\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\65\2\2\u0106\7\3\2\2\2\u0107\u0109\5\22\n\2\u0108\u0107\3\2\2"+
		"\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\7\t\2\2\u010e\u0110\5\22\n\2"+
		"\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\20\2\2\u0114\u0116\5\22\n\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\63\2\2\u011a\u011c\n\2\2\2"+
		"\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\65\2\2\u0120\t\3\2\2\2\u0121"+
		"\u0123\5\22\n\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0129\7\13\2\2\u0128\u012a\5\22\n\2\u0129\u0128\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\7\'\2\2\u012e\u0130\n\2\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7\65\2\2\u0134\13\3\2\2\2\u0135\u0137\5\22\n\2\u0136\u0135\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\t\2\2\u013c\u013e\5\22"+
		"\n\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\7\62\2\2\u0142\u0144\n"+
		"\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\65\2\2\u0148\r\3\2\2"+
		"\2\u0149\u014b\5\22\n\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0151\7\13\2\2\u0150\u0152\5\22\n\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\7\b\2\2\u0156\u0158\5\22\n\2\u0157\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\5t;\2\u015c\u015e\n\2\2\2\u015d\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\7\65\2\2\u0162\17\3\2\2\2\u0163\u0165\5\22\n\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\7\t\2\2\u016a\u016c\5\22"+
		"\n\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\7\7\2\2\u0170\u0172\n\2"+
		"\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\65\2\2\u0176\21\3\2\2"+
		"\2\u0177\u0178\t\3\2\2\u0178\23\3\2\2\2\u0179\u017b\5\22\n\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\5\26\f\2\u0180\25\3\2\2"+
		"\2\u0181\u0183\7\3\2\2\u0182\u0184\5\22\n\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\7\4\2\2\u0188\u018a\5\22\n\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0191\5t;\2\u018e\u0190\5\22\n\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\65\2\2\u0195\27\3\2\2\2\u0196\u0198"+
		"\5\22\n\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a0"+
		"\7\3\2\2\u019d\u019f\5\22\n\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a3\u01a7\7\37\2\2\u01a4\u01a6\5\22\n\2\u01a5\u01a4\3\2\2\2"+
		"\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\65\2\2\u01ab\31\3\2\2\2\u01ac"+
		"\u01ae\5\22\n\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b3\5\34\17\2\u01b3\33\3\2\2\2\u01b4\u01b6\7\t\2\2\u01b5\u01b7\5\22"+
		"\n\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\7\31\2\2\u01bb\u01bd\5"+
		"\22\n\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7\32\2\2\u01c1\u01c3\5"+
		"\22\n\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\7\33\2\2\u01c7\u01c9\n"+
		"\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\65\2\2\u01cd\35\3\2\2"+
		"\2\u01ce\u01d0\5\22\n\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d5\5 \21\2\u01d5\37\3\2\2\2\u01d6\u01d8\7\t\2\2\u01d7\u01d9"+
		"\5\22\n\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2"+
		"\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\7$\2\2\u01dd\u01df"+
		"\5\22\n\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\5t;\2\u01e3\u01e5"+
		"\n\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\65\2\2\u01e9!\3\2\2\2"+
		"\u01ea\u01ec\5\22\n\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f1\5$\23\2\u01f1#\3\2\2\2\u01f2\u01f4\7\13\2\2\u01f3\u01f5\5\22\n"+
		"\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fc\7%\2\2\u01f9\u01fb\n\2\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\65\2\2\u0200"+
		"%\3\2\2\2\u0201\u0203\5\22\n\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2"+
		"\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0207\u0208\5(\25\2\u0208\'\3\2\2\2\u0209\u020d\7\t\2\2\u020a"+
		"\u020c\5\22\n\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3"+
		"\2\2\2\u020d\u020e\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0212\7\20\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0216\3"+
		"\2\2\2\u0213\u0215\5\22\n\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0219\u021d\t\4\2\2\u021a\u021c\5\22\n\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0221\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u0220\u0222\n\5\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0227\7\22\2\2\u0226\u0228\n\2\2\2\u0227\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022c\7\65\2\2\u022c)\3\2\2\2\u022d\u022f\5\22\n\2\u022e\u022d"+
		"\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\5,\27\2\u0234+\3\2\2\2"+
		"\u0235\u0237\7\13\2\2\u0236\u0238\5\22\n\2\u0237\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023d\7\22\2\2\u023c\u023e\n\2\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3"+
		"\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\7\65\2\2\u0242-\3\2\2\2\u0243\u0245\5\22\n\2\u0244\u0243\3\2\2"+
		"\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249"+
		"\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\5\60\31\2\u024a/\3\2\2\2\u024b"+
		"\u024d\7\t\2\2\u024c\u024e\5\22\n\2\u024d\u024c\3\2\2\2\u024e\u024f\3"+
		"\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0253\7\23\2\2\u0252\u0254\n\2\2\2\u0253\u0252\3\2\2\2\u0254\u0255\3"+
		"\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0258\7\65\2\2\u0258\61\3\2\2\2\u0259\u025b\5\22\n\2\u025a\u0259\3\2"+
		"\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0261\5N(\2\u0260\u025c\3\2\2"+
		"\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0268"+
		"\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\5\22\n\2\u0266\u0265\3\2\2\2"+
		"\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b"+
		"\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\5\64\33\2\u026c\63\3\2\2\2\u026d"+
		"\u026f\7\t\2\2\u026e\u0270\5\22\n\2\u026f\u026e\3\2\2\2\u0270\u0271\3"+
		"\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0275\7\6\2\2\u0274\u0276\5\22\n\2\u0275\u0274\3\2\2\2\u0276\u0277\3"+
		"\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027b\5t;\2\u027a\u027c\n\2\2\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280"+
		"\7\65\2\2\u0280\65\3\2\2\2\u0281\u0283\5\22\n\2\u0282\u0281\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0287\u0288\58\35\2\u0288\67\3\2\2\2\u0289\u028b"+
		"\7\t\2\2\u028a\u028c\5\22\n\2\u028b\u028a\3\2\2\2\u028c\u028d\3\2\2\2"+
		"\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291"+
		"\7\b\2\2\u0290\u0292\5\22\n\2\u0291\u0290\3\2\2\2\u0292\u0293\3\2\2\2"+
		"\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297"+
		"\5t;\2\u0296\u0298\n\2\2\2\u0297\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7\65"+
		"\2\2\u029c9\3\2\2\2\u029d\u029f\5\22\n\2\u029e\u029d\3\2\2\2\u029f\u02a2"+
		"\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02ac\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a5\5\22\n\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3"+
		"\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u02ab\5N(\2\u02aa\u02a6\3\2\2\2\u02ab\u02ae\3\2\2"+
		"\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b2\3\2\2\2\u02ae\u02ac"+
		"\3\2\2\2\u02af\u02b1\5\22\n\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2"+
		"\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b5\u02d8\5> \2\u02b6\u02b8\5\22\n\2\u02b7\u02b6\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02d4\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02d5\5<\37\2\u02bd\u02d5\5@!\2\u02be\u02d5"+
		"\5B\"\2\u02bf\u02d5\5F$\2\u02c0\u02d5\5J&\2\u02c1\u02c3\5\22\n\2\u02c2"+
		"\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\5N(\2\u02c8\u02c4"+
		"\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02d0\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02cf\5\22\n\2\u02ce\u02cd\3"+
		"\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d3\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d5\5L\'\2\u02d4\u02bc\3\2"+
		"\2\2\u02d4\u02bd\3\2\2\2\u02d4\u02be\3\2\2\2\u02d4\u02bf\3\2\2\2\u02d4"+
		"\u02c0\3\2\2\2\u02d4\u02ca\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02b9\3\2"+
		"\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		";\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dd\5\22\n\2\u02dc\u02db\3\2\2\2"+
		"\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\7*\2\2\u02e2\u02e4\n\2\2\2\u02e3"+
		"\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\7\65\2\2\u02e8=\3\2\2\2\u02e9\u02eb"+
		"\5\22\n\2\u02ea\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2"+
		"\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f1"+
		"\7\t\2\2\u02f0\u02f2\5\22\n\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fb\3\2\2\2\u02f5\u02f7"+
		"\7\5\2\2\u02f6\u02f8\5\22\n\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2"+
		"\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f5"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7\25\2\2"+
		"\u02fe\u0300\n\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7\65\2\2"+
		"\u0304?\3\2\2\2\u0305\u0307\5\22\n\2\u0306\u0305\3\2\2\2\u0307\u030a\3"+
		"\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030b\u030d\7\13\2\2\u030c\u030e\5\22\n\2\u030d\u030c\3"+
		"\2\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0313\7\25\2\2\u0312\u0314\5\22\n\2\u0313\u0312\3"+
		"\2\2\2\u0314\u0315\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u0319\5t;\2\u0318\u031a\5\22\n\2\u0319\u0318\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u032c\7\26\2\2\u031e\u0320\5\22\n\2\u031f\u031e\3"+
		"\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0328\7.\2\2\u0325\u0327\5\22"+
		"\n\2\u0326\u0325\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032d\5t"+
		";\2\u032c\u0321\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e"+
		"\u0330\5\22\n\2\u032f\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3"+
		"\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0337\7\27\2\2\u0334"+
		"\u0336\5\22\n\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3"+
		"\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033c\n\2\2\2\u033b\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033b\3\2"+
		"\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\7\65\2\2\u0340"+
		"A\3\2\2\2\u0341\u0343\5\22\n\2\u0342\u0341\3\2\2\2\u0343\u0346\3\2\2\2"+
		"\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0344"+
		"\3\2\2\2\u0347\u0349\7\24\2\2\u0348\u034a\5\22\n\2\u0349\u0348\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034f\7\25\2\2\u034e\u0350\n\2\2\2\u034f\u034e\3\2\2\2"+
		"\u0350\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0354\7\65\2\2\u0354C\3\2\2\2\u0355\u0357\5\22\n\2\u0356"+
		"\u0355\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035b\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035d\7\13\2\2\u035c"+
		"\u035e\5\22\n\2\u035d\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u035d\3"+
		"\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\7\25\2\2\u0362"+
		"\u0364\5\22\n\2\u0363\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0363\3"+
		"\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\5t;\2\u0368"+
		"\u036a\5\22\n\2\u0369\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0369\3"+
		"\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\7\26\2\2\u036e"+
		"\u0370\5\22\n\2\u036f\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u036f\3"+
		"\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\7.\2\2\u0374"+
		"\u0376\5\22\n\2\u0375\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0375\3"+
		"\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037d\5t;\2\u037a"+
		"\u037c\5\22\n\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3"+
		"\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u037d\3\2\2\2\u0380"+
		"\u0384\7\30\2\2\u0381\u0383\5\22\n\2\u0382\u0381\3\2\2\2\u0383\u0386\3"+
		"\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0388\3\2\2\2\u0386"+
		"\u0384\3\2\2\2\u0387\u0389\n\2\2\2\u0388\u0387\3\2\2\2\u0389\u038a\3\2"+
		"\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\7\65\2\2\u038dE\3\2\2\2\u038e\u0390\5\22\n\2\u038f\u038e\3\2\2"+
		"\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394"+
		"\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0396\7\13\2\2\u0395\u0397\5\22\n\2"+
		"\u0396\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\7\25\2\2\u039b\u039d\5\22\n\2"+
		"\u039c\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\5t;\2\u03a1\u03a3\5\22\n\2\u03a2"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03b5\7\26\2\2\u03a7\u03a9\5\22\n\2\u03a8"+
		"\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b0\7.\2\2\u03ad\u03af\5\22\n\2\u03ae"+
		"\u03ad\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\5t;\2\u03b4\u03b6"+
		"\3\2\2\2\u03b5\u03a8\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03ba\3\2\2\2\u03b7"+
		"\u03b9\5\22\n\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3"+
		"\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd"+
		"\u03bf\7\34\2\2\u03be\u03c0\n\2\2\2\u03bf\u03be\3\2\2\2\u03c0\u03c1\3"+
		"\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c4\7\65\2\2\u03c4G\3\2\2\2\u03c5\u03c7\5\22\n\2\u03c6\u03c5\3\2\2"+
		"\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb"+
		"\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cd\7\13\2\2\u03cc\u03ce\5\22\n\2"+
		"\u03cd\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\7\25\2\2\u03d2\u03d4\5\22\n\2"+
		"\u03d3\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\5t;\2\u03d8\u03da\5\22\n\2\u03d9"+
		"\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\7\26\2\2\u03de\u03e0\5\22\n\2\u03df"+
		"\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2"+
		"\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\7.\2\2\u03e4\u03e6\5\22\n\2\u03e5"+
		"\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2"+
		"\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03ee\5t;\2\u03eb\u03ed"+
		"\5\22\n\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2"+
		"\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f3"+
		"\7\35\2\2\u03f2\u03f4\n\2\2\2\u03f3\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2"+
		"\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8"+
		"\7\65\2\2\u03f8I\3\2\2\2\u03f9\u03fb\5\22\n\2\u03fa\u03f9\3\2\2\2\u03fb"+
		"\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2"+
		"\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0401\7\13\2\2\u0400\u0402\5\22\n\2\u0401"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0407\7\25\2\2\u0406\u0408\5\22\n\2\u0407"+
		"\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u040d\5t;\2\u040c\u040e\5\22\n\2\u040d"+
		"\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0412\3\2\2\2\u0411\u0413\n\6\2\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2"+
		"\2\2\u0416\u0417\7\65\2\2\u0417K\3\2\2\2\u0418\u041a\5\22\n\2\u0419\u0418"+
		"\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0420\7\t\2\2\u041f\u0421\5\22"+
		"\n\2\u0420\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u042c\3\2\2\2\u0424\u0426\7\34\2\2\u0425\u0424\3"+
		"\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0429\5\22\n\2\u0428"+
		"\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b\u042d\3\2\2\2\u042c\u0425\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0430\7\f\2\2\u042f\u0431\5\22\n\2\u0430\u042f\3"+
		"\2\2\2\u0431\u0432\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0436\5t;\2\u0435\u0437\n\2\2\2\u0436\u0435\3\2\2"+
		"\2\u0437\u0438\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a"+
		"\3\2\2\2\u043a\u043b\7\65\2\2\u043bM\3\2\2\2\u043c\u043e\5\22\n\2\u043d"+
		"\u043c\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0442\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0444\7 \2\2\u0443"+
		"\u0445\n\2\2\2\u0444\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0444\3\2"+
		"\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\7\65\2\2\u0449"+
		"O\3\2\2\2\u044a\u044c\5\22\n\2\u044b\u044a\3\2\2\2\u044c\u044f\3\2\2\2"+
		"\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u044d"+
		"\3\2\2\2\u0450\u0452\5N(\2\u0451\u044d\3\2\2\2\u0452\u0455\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0459\3\2\2\2\u0455\u0453\3\2"+
		"\2\2\u0456\u0458\5\22\n\2\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459"+
		"\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0459\3\2"+
		"\2\2\u045c\u045d\5R*\2\u045dQ\3\2\2\2\u045e\u0460\7\t\2\2\u045f\u0461"+
		"\5\22\n\2\u0460\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0460\3\2\2\2"+
		"\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\7)\2\2\u0465\u0467"+
		"\5\22\n\2\u0466\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0466\3\2\2\2"+
		"\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046e\5t;\2\u046b\u046d"+
		"\5\22\n\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2"+
		"\u046e\u046f\3\2\2\2\u046f\u0474\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0473"+
		"\5\22\n\2\u0472\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2"+
		"\u0474\u0475\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0479"+
		"\n\2\2\2\u0478\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047f\3\2\2\2\u047c\u047e\5\22\n\2\u047d\u047c\3"+
		"\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483\7\65\2\2\u0483\u0487\3"+
		"\2\2\2\u0484\u0486\5\22\n\2\u0485\u0484\3\2\2\2\u0486\u0489\3\2\2\2\u0487"+
		"\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488S\3\2\2\2\u0489\u0487\3\2\2\2"+
		"\u048a\u048c\5\22\n\2\u048b\u048a\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b"+
		"\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u048d\3\2\2\2\u0490"+
		"\u0492\5N(\2\u0491\u048d\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2"+
		"\2\u0493\u0494\3\2\2\2\u0494\u0499\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0498"+
		"\5\22\n\2\u0497\u0496\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2\2"+
		"\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u049d"+
		"\5V,\2\u049dU\3\2\2\2\u049e\u04a0\7\t\2\2\u049f\u04a1\5\22\n\2\u04a0\u049f"+
		"\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u04a4\3\2\2\2\u04a4\u04a6\7\'\2\2\u04a5\u04a7\5\22\n\2\u04a6\u04a5\3"+
		"\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04ac\5t;\2\u04ab\u04ad\n\2\2\2\u04ac\u04ab\3\2\2"+
		"\2\u04ad\u04ae\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0"+
		"\3\2\2\2\u04b0\u04b1\7\65\2\2\u04b1W\3\2\2\2\u04b2\u04b4\5\22\n\2\u04b3"+
		"\u04b2\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2"+
		"\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04b9\5Z.\2\u04b9Y"+
		"\3\2\2\2\u04ba\u04bc\7\t\2\2\u04bb\u04bd\5\22\n\2\u04bc\u04bb\3\2\2\2"+
		"\u04bd\u04be\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04c2\7\n\2\2\u04c1\u04c3\5\22\n\2\u04c2\u04c1\3\2\2\2"+
		"\u04c3\u04c4\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c8\5t;\2\u04c7\u04c9\n\2\2\2\u04c8\u04c7\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2"+
		"\2\2\u04cc\u04cd\7\65\2\2\u04cd[\3\2\2\2\u04ce\u04d0\5\22\n\2\u04cf\u04ce"+
		"\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d6\5N(\2\u04d5\u04d1\3\2\2"+
		"\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04dd"+
		"\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04dc\5\22\n\2\u04db\u04da\3\2\2\2"+
		"\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0"+
		"\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e1\5^\60\2\u04e1]\3\2\2\2\u04e2"+
		"\u04e4\7\t\2\2\u04e3\u04e5\5\22\n\2\u04e4\u04e3\3\2\2\2\u04e5\u04e6\3"+
		"\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u04ea\7(\2\2\u04e9\u04eb\5\22\n\2\u04ea\u04e9\3\2\2\2\u04eb\u04ec\3\2"+
		"\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee"+
		"\u04f0\5t;\2\u04ef\u04f1\n\2\2\2\u04f0\u04ef\3\2\2\2\u04f1\u04f2\3\2\2"+
		"\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f7\3\2\2\2\u04f4\u04f6"+
		"\5\22\n\2\u04f5\u04f4\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2"+
		"\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fb"+
		"\7\65\2\2\u04fb_\3\2\2\2\u04fc\u04fe\5\22\n\2\u04fd\u04fc\3\2\2\2\u04fe"+
		"\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2"+
		"\2\2\u0501\u04ff\3\2\2\2\u0502\u0504\5N(\2\u0503\u04ff\3\2\2\2\u0504\u0507"+
		"\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u050b\3\2\2\2\u0507"+
		"\u0505\3\2\2\2\u0508\u050a\5\22\n\2\u0509\u0508\3\2\2\2\u050a\u050d\3"+
		"\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d"+
		"\u050b\3\2\2\2\u050e\u050f\5b\62\2\u050fa\3\2\2\2\u0510\u0512\7\t\2\2"+
		"\u0511\u0513\5\22\n\2\u0512\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0512"+
		"\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\7+\2\2\u0517"+
		"\u0519\5\22\n\2\u0518\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0518\3"+
		"\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u0520\5t;\2\u051d"+
		"\u051f\13\2\2\2\u051e\u051d\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u0521\3"+
		"\2\2\2\u0520\u051e\3\2\2\2\u0521\u0526\3\2\2\2\u0522\u0520\3\2\2\2\u0523"+
		"\u0525\5\22\n\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3"+
		"\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u0526\3\2\2\2\u0529"+
		"\u052a\7-\2\2\u052a\u052b\7\65\2\2\u052bc\3\2\2\2\u052c\u052e\5\22\n\2"+
		"\u052d\u052c\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u052f\3\2\2\2\u0532\u0533\5f\64\2\u0533"+
		"e\3\2\2\2\u0534\u0536\7\36\2\2\u0535\u0537\n\2\2\2\u0536\u0535\3\2\2\2"+
		"\u0537\u0538\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a"+
		"\3\2\2\2\u053a\u053b\7\65\2\2\u053bg\3\2\2\2\u053c\u053e\5\22\n\2\u053d"+
		"\u053c\3\2\2\2\u053e\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2"+
		"\2\2\u0540\u0542\3\2\2\2\u0541\u053f\3\2\2\2\u0542\u0544\7#\2\2\u0543"+
		"\u0545\n\7\2\2\u0544\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0544\3\2"+
		"\2\2\u0546\u0547\3\2\2\2\u0547i\3\2\2\2\u0548\u0549\5\22\n\2\u0549k\3"+
		"\2\2\2\u054a\u054c\5\22\n\2\u054b\u054a\3\2\2\2\u054c\u054f\3\2\2\2\u054d"+
		"\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f\u054d\3\2"+
		"\2\2\u0550\u0552\7\"\2\2\u0551\u0553\n\2\2\2\u0552\u0551\3\2\2\2\u0553"+
		"\u0554\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0557\7\65\2\2\u0557m\3\2\2\2\u0558\u055a\5\22\n\2\u0559\u0558"+
		"\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c"+
		"\u055e\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0562\7\t\2\2\u055f\u0561\5j"+
		"\66\2\u0560\u055f\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0567\7!"+
		"\2\2\u0566\u0568\n\2\2\2\u0567\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569"+
		"\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\7\65"+
		"\2\2\u056co\3\2\2\2\u056d\u056f\5\22\n\2\u056e\u056d\3\2\2\2\u056f\u0572"+
		"\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0573\u0577\7\t\2\2\u0574\u0576\5\22\n\2\u0575\u0574\3"+
		"\2\2\2\u0576\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u057a\3\2\2\2\u0579\u0577\3\2\2\2\u057a\u057e\7/\2\2\u057b\u057d\5\22"+
		"\n\2\u057c\u057b\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0583\7\60"+
		"\2\2\u0582\u0584\n\2\2\2\u0583\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\7\65"+
		"\2\2\u0588q\3\2\2\2\u0589\u058b\5\22\n\2\u058a\u0589\3\2\2\2\u058b\u058e"+
		"\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e"+
		"\u058c\3\2\2\2\u058f\u0593\7\t\2\2\u0590\u0592\5\22\n\2\u0591\u0590\3"+
		"\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0596\3\2\2\2\u0595\u0593\3\2\2\2\u0596\u059a\7\61\2\2\u0597\u0599\5"+
		"\22\n\2\u0598\u0597\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u059f\n\2"+
		"\2\2\u059e\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\7\65\2\2\u05a3s\3\2\2\2"+
		"\u05a4\u05a8\5v<\2\u05a5\u05a7\5j\66\2\u05a6\u05a5\3\2\2\2\u05a7\u05aa"+
		"\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab\3\2\2\2\u05aa"+
		"\u05a8\3\2\2\2\u05ab\u05ac\7G\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05a4\3\2"+
		"\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b2\3\2\2\2\u05af\u05b1\5j\66\2\u05b0"+
		"\u05af\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2"+
		"\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b9\5x=\2\u05b6\u05b8"+
		"\5j\66\2\u05b7\u05b6\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05bd\7G"+
		"\2\2\u05bd\u05bf\3\2\2\2\u05be\u05ad\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05c3\3\2\2\2\u05c0\u05c2\5j\66\2\u05c1\u05c0\3\2\2\2\u05c2\u05c5\3\2"+
		"\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5"+
		"\u05c3\3\2\2\2\u05c6\u05c7\5z>\2\u05c7u\3\2\2\2\u05c8\u05c9\5|?\2\u05c9"+
		"w\3\2\2\2\u05ca\u05cb\5|?\2\u05cby\3\2\2\2\u05cc\u05cd\5|?\2\u05cd{\3"+
		"\2\2\2\u05ce\u05d4\5\u0080A\2\u05cf\u05d0\7;\2\2\u05d0\u05d1\5~@\2\u05d1"+
		"\u05d2\7;\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05ce\3\2\2\2\u05d3\u05cf\3\2"+
		"\2\2\u05d4}\3\2\2\2\u05d5\u05d7\5j\66\2\u05d6\u05d5\3\2\2\2\u05d7\u05da"+
		"\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da"+
		"\u05d8\3\2\2\2\u05db\u05df\5\u0080A\2\u05dc\u05de\5j\66\2\u05dd\u05dc"+
		"\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0"+
		"\u05f1\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e4\5j\66\2\u05e3\u05e2\3\2"+
		"\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6"+
		"\u05e8\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05ec\5\u0080A\2\u05e9\u05eb"+
		"\5j\66\2\u05ea\u05e9\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec"+
		"\u05ed\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05e5\3\2"+
		"\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2"+
		"\177\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05f5\t\b\2\2\u05f5\u0081\3\2\2"+
		"\2\u00d2\u0085\u008b\u009e\u00a4\u00ba\u00bf\u00c4\u00ca\u00d1\u00d8\u00e2"+
		"\u00e9\u00ef\u00f6\u00fd\u0103\u010a\u0111\u0117\u011d\u0124\u012b\u0131"+
		"\u0138\u013f\u0145\u014c\u0153\u0159\u015f\u0166\u016d\u0173\u017c\u0185"+
		"\u018b\u0191\u0199\u01a0\u01a7\u01af\u01b8\u01be\u01c4\u01ca\u01d1\u01da"+
		"\u01e0\u01e6\u01ed\u01f6\u01fc\u0204\u020d\u0211\u0216\u021d\u0223\u0229"+
		"\u0230\u0239\u023f\u0246\u024f\u0255\u025c\u0262\u0268\u0271\u0277\u027d"+
		"\u0284\u028d\u0293\u0299\u02a0\u02a6\u02ac\u02b2\u02b9\u02c4\u02ca\u02d0"+
		"\u02d4\u02d8\u02de\u02e5\u02ec\u02f3\u02f9\u02fb\u0301\u0308\u030f\u0315"+
		"\u031b\u0321\u0328\u032c\u0331\u0337\u033d\u0344\u034b\u0351\u0358\u035f"+
		"\u0365\u036b\u0371\u0377\u037d\u0384\u038a\u0391\u0398\u039e\u03a4\u03aa"+
		"\u03b0\u03b5\u03ba\u03c1\u03c8\u03cf\u03d5\u03db\u03e1\u03e7\u03ee\u03f5"+
		"\u03fc\u0403\u0409\u040f\u0414\u041b\u0422\u0425\u042a\u042c\u0432\u0438"+
		"\u043f\u0446\u044d\u0453\u0459\u0462\u0468\u046e\u0474\u047a\u047f\u0487"+
		"\u048d\u0493\u0499\u04a2\u04a8\u04ae\u04b5\u04be\u04c4\u04ca\u04d1\u04d7"+
		"\u04dd\u04e6\u04ec\u04f2\u04f7\u04ff\u0505\u050b\u0514\u051a\u0520\u0526"+
		"\u052f\u0538\u053f\u0546\u054d\u0554\u055b\u0562\u0569\u0570\u0577\u057e"+
		"\u0585\u058c\u0593\u059a\u05a0\u05a8\u05ad\u05b2\u05b9\u05be\u05c3\u05d3"+
		"\u05d8\u05df\u05e5\u05ec\u05f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}