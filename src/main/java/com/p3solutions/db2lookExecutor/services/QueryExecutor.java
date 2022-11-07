package com.p3solutions.db2lookExecutor.services;

import org.modelmapper.internal.util.Lists;

import java.sql.*;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class QueryExecutor {


    public Connection getConnection(String host, String port, String userName, String password, String dbName) throws ClassNotFoundException, SQLException {
        Class.forName("com.ibm.db2.jcc.DB2Driver");
        return DriverManager.getConnection("jdbc:db2://" + host + ":" + port + "/" + dbName, userName,
                password);
    }

    public void executeQuery(String query, Connection connection, Map<String, String> failedQueryReasonMap) {
        if(Objects.nonNull(connection)){
            System.out.println("starting to execute");
            System.out.println(query);
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                int i = statement.executeUpdate();
            } catch (Exception e) {
                if(!(e.getMessage().contains("-601") || e.getMessage().contains("-624") || query.toUpperCase(Locale.ROOT).contains("GRANT"))) {
                    failedQueryReasonMap.put(
                            query,
                            "\"" + (Objects.nonNull(e.getMessage()) ? e.getMessage().replace("\n", " ").replace("\t", " ") : "Some exception occurred") + "\""
                    );
                }

            }
            System.out.println("execution completed");
        }

    }
}
