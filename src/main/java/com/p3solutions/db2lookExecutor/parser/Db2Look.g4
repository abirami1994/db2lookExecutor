grammar Db2Look;
CONNECT:                                C O N N E C T;
TO:                                     T O;
SUMMARY:                                S U M M A R Y;
TYPE:                                   T Y P E;
WRAPPER:                                W R A P P E R;
SEQUENCE:                               S E Q U E N C E;
CREATE:                                 C R E A T E;
ALIAS:                                  A L I A S;
ALTER:                                  A L T E R;
INDEX:                                  I N D E X;
LARGE:                                  L A R G E;
REGULAR:                                R E G U L A R;
SYSTEM:                                 S Y S T E M;
USER:                                   U S E R;
TEMPORARY:                             T E M P O R A R Y;
TABLESPACE:                            T A B L E S P A C E;
SCHEMA:                                S C H E M A;
REFRESH:                                R E F R E S H;
TABLE:                                 T A B L E;
ADD:                                   A D D;
PRIMARY_KEY:                           P R I M A R Y SPACE* K E Y;
FOREIGN_KEY:                           F O R E I G N SPACE* K E Y;
DATABASE:                              D A T A B A S E;
PARTITION:                             P A R T I T I O N;
GROUP:                                 G R O U P;
UNIQUE:                                U N I Q U E;
CHECK:                                 C H E C K;
GRANT:                                 G R A N T;
RESET:                                 R E S E T;
SET:                                   S E T;
TRUSTED_CONTEXT:                       T R U S T E D SPACE C O N T E X T;
COMMIT:                                C O M M I T;
TERMINATE:                             T E R M I N A T E;
BUFFERPOOL:                            B U F F E R P O O L;
STOGROUP:                              S T O G R O U P;
OR_REPLACE:                            O R SPACE R E P L A C E;
VIEW:                                  V I E W;
PROCEDURE:                             P R O C E D U R E;
FUNCTION:                              F U N C T I O N;
COMMENT:                               C O M M E N T;
TRIGGER:                               T R I G G E R;
BEGIN:                                 B E G I N;
END:                                   E N D;
CONSTRAINT:                            C O N S T R A I N T;
AUDIT:                                 A U D I T;
POLICY:                                P O L I C Y;
ROLE:                                  R O L E;
SERVER:                                 S E R V E R;
MAPPING:                                M A P P I N G;
NICKNAME:                               N I C K N A M E;
fragment A:                                     [aA];
fragment B:                                     [bB];
fragment C:                                     [cC];
fragment D:                                     [dD];
fragment E:                                     [eE];
fragment F:                                     [fF];
fragment G:                                     [gG];
fragment H:                                     [hH];
fragment I:                                     [iI];
fragment J:                                     [jJ];
fragment K:                                     [kK];
fragment L:                                     [lL];
fragment M:                                     [mM];
fragment N:                                     [nN];
fragment O:                                     [oO];
fragment P:                                     [pP];
fragment Q:                                     [qQ];
fragment R:                                     [rR];
fragment S:                                     [sS];
fragment T:                                     [tT];
fragment U:                                     [uU];
fragment V:                                     [vV];
fragment W:                                     [wW];
fragment X:                                     [xX];
fragment Y:                                     [yY];
fragment Z:                                     [zZ];

fragment ZERO:                                  [0];
fragment ONE:                                   [1];
fragment TWO:                                   [2];
fragment THREE:                                 [3];
fragment FOUR:                                  [4];
fragment FIVE:                                  [5];
fragment SIX:                                   [6];
fragment SEVEN:                                 [7];
fragment EIGHT:                                 [8];
fragment NINE:                                  [9];

TERMINATOR:                      ([;] [ ]? [\n]+) | (RT_BRACKET [ ]? [;] [\n]+) | (END [ ]? [;] [\n]+);
//SYMBOL
fragment UNDERSCORE:                            [_];

LT_BRACKET:                             '(';
RT_BRACKET:                             ')';

SYMBOL9:                                [_]|[/]|[-];
SLASH:                                  '/' |  '\\' ;
SEMI_COLON:                             ';';
QUOTATION:                              ["]|['];
COMMA:                                  [,];
SPACE:                                  [ ];
TAB:                                    [\n];
TAB1:                                   [\t];
TAB3:                                   [\r];
CURLY_BRACKET1:                            [{];
CURLY_BRACKET2:                            [}];
COMMENTS:                              '/*' .*? '*/'->skip;
SINGLE_COMMENTS:                        '--'  .*? [\n]->skip;

HASH_SKIPPER:                            '#' .*? [\n]->skip;
POINTER_SYMBOL:                           '=>';
DOT:                                    '.';
NUMS:                                   DIGIT+;
NUMBER:                                 (DIGIT | '+' | '-'|'.')+;
EQUAL:                                  '=';
OR_OPERATOR:                            '|';
LT_SET_BRACKET:                         '[';
RT_SET_BRACKET:                         ']';
ASTRIEK:                                '*';
SMALLER_THAN:                           '<';
GREATER_THAN:                           '>';
PERCENTAGE:                             '%';
PLUS:                                   '+';
SUB:                                    '-';
DOLLAR:                                 '$';
DECLARE:                                D E C L A R E;
ASTERIK:                            '&';
EXCLAMATION:                            '!';
WORD:                                   (LOWERCASE | UPPERCASE | SYMBOL9 |NUMS)+  ;
DIGIT:                                  [0-9]+;
LOWERCASE:                              [a-z]+;
UPPERCASE:                              [A-Z]+;
COLON:                                  ':';
QUESTION_MARK:                          '?';

fileHandler:                             (tabSpace*  (tabSpace*   (connectStatement|
                                          createDatabasePartitionGroupStatement|
                                          createBufferPoolStatement|
                                          mimicStorageGroupStatement|
                                          createTableSpaceStatement|
                                          mimicTableSpaceStatement|
                                          createRoleStatement|
                                          createSchemaStatement|
                                          createTypeStatement|
                                          createSequenceStatement|
                                          alterSequence |
                                          commentQuery|
                                          alterTableAddForeignKeyQuery|
                                          ((tabSpace* setStatement)* (alterTableAddCheckConstraintQuery))|
                                          userDefinedFunctions|
                                          createViewStatement|
                                          aliasStatement|
                                          tableSegment |
                                          createStoredProcedureStatement|
                                          createTriggerStatement|
                                          createAuditStatement|
                                          trustedContextStatement|
                                          connectResetQuery |
                                          createIndexQuery|
                                          alterViewStatement|
                                          createServerStatement|
                                          createViewStatement|
                                          createWrapperStatement|
                                          createNickStatement|
                                          createUserMappingStatement|
                                          alterNickNameStatement|
                                         grantStatement
                                         ) tabSpace*)*
                                         tabSpace*
                                         commitStatement tabSpace*
                                         connectResetQuery tabSpace*
                                         terminateStatement) EOF;
alterNickNameStatement:                 tabSpace* ALTER tabSpace+ NICKNAME ~(TERMINATOR)+ TERMINATOR;
createNickStatement:                    tabSpace* CREATE tabSpace+ NICKNAME ~(TERMINATOR)+ TERMINATOR;
createUserMappingStatement:             tabSpace* CREATE tabSpace+ USER tabSpace+ MAPPING ~(TERMINATOR)+ TERMINATOR;
alterViewStatement:                     tabSpace* ALTER tabSpace+ VIEW ~(TERMINATOR)+ TERMINATOR;
createServerStatement:                  tabSpace* CREATE tabSpace+ SERVER ~(TERMINATOR)+ TERMINATOR;
alterSequence:                          tabSpace* ALTER tabSpace+ SEQUENCE tabSpace+ fullNameModel ~(TERMINATOR)+ TERMINATOR;
createWrapperStatement:                 tabSpace* CREATE tabSpace+ WRAPPER ~(TERMINATOR)+ TERMINATOR;

tabSpace:                            (SPACE|TAB|TAB1|TAB3);

connectStatement:                      tabSpace* connectDbQuery;
connectDbQuery:                        (CONNECT tabSpace+ TO tabSpace+ fullNameModel tabSpace* TERMINATOR);
connectResetQuery:                    tabSpace* (CONNECT tabSpace* RESET tabSpace* TERMINATOR);
createDatabasePartitionGroupStatement: tabSpace* createDbPartitionGroupQuery;
createDbPartitionGroupQuery:           CREATE tabSpace+ DATABASE tabSpace+ PARTITION tabSpace+ GROUP ~(TERMINATOR)+ TERMINATOR;

createBufferPoolStatement:             tabSpace* createBufferPoolQuery;
createBufferPoolQuery:                 CREATE tabSpace+ BUFFERPOOL  ~(TERMINATOR)+ TERMINATOR;

mimicStorageGroupStatement:            tabSpace* mimicStorageGroupQuery;
mimicStorageGroupQuery:                ALTER tabSpace+ STOGROUP ~(TERMINATOR)* TERMINATOR;

createTableSpaceStatement:             tabSpace*  createTableSpaceQuery;
createTableSpaceQuery:                 CREATE  tabSpace* USER? tabSpace* (REGULAR|LARGE|TEMPORARY) tabSpace* ~(TABLESPACE)+  TABLESPACE ~(TERMINATOR)+ TERMINATOR;

mimicTableSpaceStatement:              tabSpace* mimicTableSpaceQuery;
mimicTableSpaceQuery:                  ALTER tabSpace+ TABLESPACE ~(TERMINATOR)+ TERMINATOR;

createSchemaStatement:                 tabSpace* createSchemaQuery;
createSchemaQuery:                     CREATE  tabSpace+ SCHEMA ~(TERMINATOR)+ TERMINATOR;

createTypeStatement:                   (tabSpace* setStatement)* tabSpace* createTypeQuery;
createTypeQuery:                       CREATE tabSpace+ TYPE tabSpace+ fullNameModel ~(TERMINATOR)+ TERMINATOR;

createSequenceStatement:               tabSpace* createSequenceQuery;
createSequenceQuery:                   CREATE tabSpace+ SEQUENCE tabSpace+ fullNameModel ~(TERMINATOR)+ TERMINATOR;
tableSegment:                          tabSpace* (tabSpace* setStatement)* tabSpace* createTableQuery (tabSpace* (commentQuery|
                                                                                alterTableAddPrimaryKeyQuery|
                                                                                refreshTableQuery|
                                                                                alterTableAddUniqueConstraintQuery|
                                                                                otherAlterQuery|
                                                                                ((tabSpace* setStatement)* tabSpace*
                                                                                createIndexQuery)) )*;

commentQuery:                          tabSpace* COMMENT ~(TERMINATOR)+ TERMINATOR;

createTableQuery:                      tabSpace* CREATE tabSpace+ (SUMMARY tabSpace+)? TABLE  ~(TERMINATOR)+ TERMINATOR;

alterTableAddPrimaryKeyQuery:          tabSpace* ALTER tabSpace+ TABLE tabSpace+ fullNameModel tabSpace+ ADD (tabSpace* CONSTRAINT tabSpace* fullNameModel)? tabSpace+  PRIMARY_KEY tabSpace*   ~(TERMINATOR)+ TERMINATOR;
refreshTableQuery:                     tabSpace*  REFRESH tabSpace+ TABLE ~(TERMINATOR)+ TERMINATOR;
alterTableAddForeignKeyQuery:          tabSpace* ALTER tabSpace+ TABLE tabSpace+ fullNameModel tabSpace+ ADD tabSpace+ CONSTRAINT tabSpace+ fullNameModel tabSpace* FOREIGN_KEY  tabSpace* ~(TERMINATOR)+ TERMINATOR;

alterTableAddUniqueConstraintQuery:    tabSpace* ALTER tabSpace+ TABLE tabSpace+ fullNameModel tabSpace+ ADD (tabSpace+ CONSTRAINT tabSpace* fullNameModel)? tabSpace* UNIQUE ~(TERMINATOR)+ TERMINATOR;

alterTableAddCheckConstraintQuery:     tabSpace* ALTER tabSpace+ TABLE tabSpace+ fullNameModel tabSpace+ ADD tabSpace+ CONSTRAINT tabSpace* fullNameModel tabSpace*  CHECK ~(TERMINATOR)+ TERMINATOR;

otherAlterQuery:                       tabSpace* ALTER  tabSpace+ TABLE tabSpace+ fullNameModel tabSpace+  ~(PRIMARY_KEY|FOREIGN_KEY|CHECK|UNIQUE|TERMINATOR)+ TERMINATOR;

createIndexQuery:                     tabSpace* CREATE tabSpace+ (UNIQUE? tabSpace+ )? INDEX tabSpace+ fullNameModel ~(TERMINATOR)+ TERMINATOR;

setStatement:                          tabSpace* SET  ~(TERMINATOR)+ TERMINATOR;

userDefinedFunctions:                  (tabSpace* setStatement)* tabSpace* createUDFQuery;
createUDFQuery:                        CREATE tabSpace+ FUNCTION tabSpace+ fullNameModel tabSpace*   (tabSpace* ~(TERMINATOR)+ tabSpace* TERMINATOR ) tabSpace*;

createViewStatement:                   (tabSpace* setStatement)* tabSpace* createViewQuery;
createViewQuery:                       CREATE tabSpace+ VIEW tabSpace+ fullNameModel ~(TERMINATOR)+ TERMINATOR;

aliasStatement:                        tabSpace* aliasQuery;
aliasQuery:                            CREATE tabSpace+ ALIAS tabSpace+ fullNameModel ~(TERMINATOR)+ TERMINATOR;

createStoredProcedureStatement:        (tabSpace* setStatement)* tabSpace* createProcedureQuery;
createProcedureQuery:                  CREATE tabSpace+ PROCEDURE tabSpace+ fullNameModel ~(TERMINATOR)+ tabSpace*  TERMINATOR;

createTriggerStatement:                (tabSpace* setStatement)* tabSpace* createTriggerQuery;
createTriggerQuery:                    CREATE tabSpace+ TRIGGER tabSpace+ fullNameModel .*?   (tabSpace* END TERMINATOR);

grantStatement:                        tabSpace* grantQuery;
grantQuery:                            GRANT ~(TERMINATOR)+ TERMINATOR;


terminateStatement:                    tabSpace* TERMINATE  ~(EOF)+;
space:                                 tabSpace;
commitStatement:                       tabSpace* COMMIT ~(TERMINATOR)+ TERMINATOR;
trustedContextStatement:               tabSpace* CREATE space* TRUSTED_CONTEXT  ~(TERMINATOR)+ TERMINATOR;

createAuditStatement:                   tabSpace* CREATE tabSpace* AUDIT tabSpace* POLICY ~(TERMINATOR)+ TERMINATOR;

createRoleStatement:                    tabSpace* CREATE tabSpace* ROLE tabSpace*  ~(TERMINATOR)+ TERMINATOR;

fullNameModel:                         ((databaseName space* DOT)? space* schemaName space* DOT)? space* tableName;
databaseName:                          name;
schemaName:                            name;
tableName:                             name;
name:                                  handle | (QUOTATION variable QUOTATION) ;
variable:                              space* handle space* (space* handle space*)* ;
handle:                                WORD|SPACE|TAB|TAB1|TAB|USER|SCHEMA|GROUP;
