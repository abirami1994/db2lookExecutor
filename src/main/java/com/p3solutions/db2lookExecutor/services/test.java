package com.p3solutions.db2lookExecutor.services;

import java.sql.*;
import java.util.Map;
import java.util.Objects;

public class test {
    public static  void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        Connection connection = DriverManager.getConnection("jdbc:db2://" + "192.168.1.39" + ":" + "25000" + "/" + "U10162W5", "p3admin",
                "p3solutions");
        if (Objects.nonNull(connection)) {
            String query =
                    "CREATE FUNCTION EXPLAIN_GET_MSGS( EXPLAIN_REQUESTER VARCHAR(128 OCTETS),\n" +
                    "                                  EXPLAIN_TIME      TIMESTAMP,\n" +
                    "                                  SOURCE_NAME       VARCHAR(128 OCTETS),\n" +
                    "                                  SOURCE_SCHEMA     VARCHAR(128 OCTETS),\n" +
                    "                                  SOURCE_VERSION    VARCHAR(64 OCTETS),\n" +
                    "                                  EXPLAIN_LEVEL     CHAR(1 OCTETS),\n" +
                    "                                  STMTNO            INTEGER,\n" +
                    "                                  SECTNO            INTEGER,\n" +
                    "                                  INLOCALE          VARCHAR(33 OCTETS) )\n" +
                    "  RETURNS TABLE ( EXPLAIN_REQUESTER VARCHAR(128 OCTETS),\n" +
                    "                  EXPLAIN_TIME      TIMESTAMP,\n" +
                    "                  SOURCE_NAME       VARCHAR(128 OCTETS),\n" +
                    "                  SOURCE_SCHEMA     VARCHAR(128 OCTETS),\n" +
                    "                  SOURCE_VERSION    VARCHAR(64 OCTETS),\n" +
                    "                  EXPLAIN_LEVEL     CHAR(1 OCTETS),\n" +
                    "                  STMTNO            INTEGER,\n" +
                    "                  SECTNO            INTEGER,\n" +
                    "                  DIAGNOSTIC_ID     INTEGER,\n" +
                    "                  LOCALE            VARCHAR(33 OCTETS),\n" +
                    "                  MSG               VARCHAR(4096 OCTETS) )\n" +
                    "  SPECIFIC EXPLAIN_GET_MSGS\n" +
                    "  LANGUAGE SQL\n" +
                    "  DETERMINISTIC\n" +
                    "  NO EXTERNAL ACTION\n" +
                    "  READS SQL DATA\n" +
                    "  RETURN SELECT A.A_EXPLAIN_REQUESTER,\n" +
                    "                A.A_EXPLAIN_TIME,\n" +
                    "                A.A_SOURCE_NAME,\n" +
                    "                A.A_SOURCE_SCHEMA,\n" +
                    "                A.A_SOURCE_VERSION,\n" +
                    "                A.A_EXPLAIN_LEVEL,\n" +
                    "                A.A_STMTNO,\n" +
                    "                A.A_SECTNO,\n" +
                    "                A.A_DIAGNOSTIC_ID,\n" +
                    "                F.LOCALE,\n" +
                    "                F.MSG\n" +
                    "         FROM EXPLAIN_DIAGNOSTIC A( A_EXPLAIN_REQUESTER,\n" +
                    "                                    A_EXPLAIN_TIME,\n" +
                    "                                    A_SOURCE_NAME,\n" +
                    "                                    A_SOURCE_SCHEMA,\n" +
                    "                                    A_SOURCE_VERSION,\n" +
                    "                                    A_EXPLAIN_LEVEL,\n" +
                    "                                    A_STMTNO,\n" +
                    "                                    A_SECTNO,\n" +
                    "                                    A_DIAGNOSTIC_ID,\n" +
                    "                                    A_CODE ),\n" +
                    "              TABLE( SYSPROC.EXPLAIN_GET_MSG2(\n" +
                    "                       INLOCALE,\n" +
                    "                       A.A_CODE,\n" +
                    "                       ( SELECT TOKEN FROM EXPLAIN_DIAGNOSTIC_DATA B\n" +
                    "                         WHERE A.A_EXPLAIN_REQUESTER = B.EXPLAIN_REQUESTER\n" +
                    "                           AND A.A_EXPLAIN_TIME      = B.EXPLAIN_TIME\n" +
                    "                           AND A.A_SOURCE_NAME       = B.SOURCE_NAME\n" +
                    "                           AND A.A_SOURCE_SCHEMA     = B.SOURCE_SCHEMA\n" +
                    "                           AND A.A_SOURCE_VERSION    = B.SOURCE_VERSION\n" +
                    "                           AND A.A_EXPLAIN_LEVEL     = B.EXPLAIN_LEVEL\n" +
                    "                           AND A.A_STMTNO            = B.STMTNO\n" +
                    "                           AND A.A_SECTNO            = B.SECTNO\n" +
                    "                           AND A.A_DIAGNOSTIC_ID     = B.DIAGNOSTIC_ID\n" +
                    "                           AND B.ORDINAL=1 ),\n" +
                    "                       ( SELECT TOKEN FROM EXPLAIN_DIAGNOSTIC_DATA B\n" +
                    "                         WHERE A.A_EXPLAIN_REQUESTER = B.EXPLAIN_REQUESTER\n" +
                    "                           AND A.A_EXPLAIN_TIME      = B.EXPLAIN_TIME\n" +
                    "                           AND A.A_SOURCE_NAME       = B.SOURCE_NAME\n" +
                    "                           AND A.A_SOURCE_SCHEMA     = B.SOURCE_SCHEMA\n" +
                    "\n" +
                    "                           AND A.A_SOURCE_VERSION    = B.SOURCE_VERSION\n" +
                    "                           AND A.A_EXPLAIN_LEVEL     = B.EXPLAIN_LEVEL\n" +
                    "                           AND A.A_STMTNO            = B.STMTNO\n" +
                    "                           AND A.A_SECTNO            = B.SECTNO\n" +
                    "                           AND A.A_DIAGNOSTIC_ID     = B.DIAGNOSTIC_ID\n" +
                    "                           AND B.ORDINAL=2 ),\n" +
                    "                       ( SELECT TOKEN FROM EXPLAIN_DIAGNOSTIC_DATA B\n" +
                    "                         WHERE A.A_EXPLAIN_REQUESTER = B.EXPLAIN_REQUESTER\n" +
                    "                           AND A.A_EXPLAIN_TIME      = B.EXPLAIN_TIME\n" +
                    "                           AND A.A_SOURCE_NAME       = B.SOURCE_NAME\n" +
                    "                           AND A.A_SOURCE_SCHEMA     = B.SOURCE_SCHEMA\n" +
                    "                           AND A.A_SOURCE_VERSION    = B.SOURCE_VERSION\n" +
                    "                           AND A.A_EXPLAIN_LEVEL     = B.EXPLAIN_LEVEL\n" +
                    "                           AND A.A_STMTNO            = B.STMTNO\n" +
                    "                           AND A.A_SECTNO            = B.SECTNO\n" +
                    "                           AND A.A_DIAGNOSTIC_ID     = B.DIAGNOSTIC_ID\n" +
                    "                           AND B.ORDINAL=3 ) ) ) F\n" +
                    "         WHERE ( EXPLAIN_REQUESTER IS NULL OR\n" +
                    "                 EXPLAIN_REQUESTER = A.A_EXPLAIN_REQUESTER )\n" +
                    "           AND ( EXPLAIN_TIME      IS NULL OR\n" +
                    "                 EXPLAIN_TIME      = A.A_EXPLAIN_TIME      )\n" +
                    "           AND ( SOURCE_NAME       IS NULL OR\n" +
                    "                 SOURCE_NAME       = A.A_SOURCE_NAME       )\n" +
                    "           AND ( SOURCE_SCHEMA     IS NULL OR\n" +
                    "                 SOURCE_SCHEMA     = A.A_SOURCE_SCHEMA     )\n" +
                    "           AND ( SOURCE_VERSION    IS NULL OR\n" +
                    "                 SOURCE_VERSION    = A.A_SOURCE_VERSION    )\n" +
                    "           AND ( EXPLAIN_LEVEL     IS NULL OR\n" +
                    "                 EXPLAIN_LEVEL     = A.A_EXPLAIN_LEVEL     )\n" +
                    "           AND ( STMTNO            IS NULL OR\n" +
                    "                 STMTNO            = A.A_STMTNO            )\n" +
                    "           AND ( SECTNO            IS NULL OR\n" +
                    "                 SECTNO            = A.A_SECTNO            )\n" +
                    "\n" +
                    "\n" +
                    "----------------------------\n";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                System.out.println(statement.executeUpdate());
                System.out.println("executed..");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
