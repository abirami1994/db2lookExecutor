package com.p3solutions.db2lookExecutor.services;

import java.sql.*;
import java.util.Map;
import java.util.Objects;

public class test {
    public static  void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        Connection connection = DriverManager.getConnection("jdbc:db2://" + "192.168.1.23" + ":" + "25000" + "/" + "GSDB", "p3admin",
                "p3solutions");
        if (Objects.nonNull(connection)) {
            String query1  = "   CREATE FUNCTION GOSALES.REVERSE(INSTR VARCHAR(4000))\n" +
                    "     RETURNS VARCHAR(4000)\n" +
                    "     DETERMINISTIC NO EXTERNAL ACTION CONTAINS SQL\n" +
                    "     BEGIN ATOMIC\n" +
                    "     DECLARE REVSTR, RESTSTR VARCHAR(4000) DEFAULT '';\n" +
                    "     DECLARE LEN INT;\n" +
                    "     IF INSTR IS NULL THEN\n" +
                    "     RETURN NULL;\n" +
                    "     END IF;\n" +
                    "     SET (RESTSTR, LEN) = (INSTR, LENGTH(INSTR));\n" +
                    "     WHILE LEN > 0 DO\n" +
                    "     SET (REVSTR, RESTSTR, LEN) \n" +
                    "       = (SUBSTR(RESTSTR, 1, 1) CONCAT REVSTR, \n" +
                    "       SUBSTR(RESTSTR, 2, LEN - 1),\n" +
                    "       LEN - 1);\n" +
                    "     END WHILE;\n" +
                    "     RETURN REVSTR;\n" +
                    "   END ;\n\n\n";

            String query = query1.trim().endsWith(";") ? deleteSemicolon(query1) : query1;
//            try (PreparedStatement statement = connection.prepareStatement(query1)) {
//                System.out.println(statement.executeUpdate());
//                System.out.println("executed1..");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }
    }

    private static String deleteSemicolon(String query) {
        StringBuilder sb= new StringBuilder(query.trim());
//invoking the method
        sb = sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
