package com.p3solutions.db2lookExecutor.services;

import com.p3solutions.db2lookExecutor.beans.DirectoryMeta;
import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;
import com.p3solutions.db2lookExecutor.parser.Db2LookLexer;
import com.p3solutions.db2lookExecutor.parser.Db2LookParser;
import com.p3solutions.db2lookExecutor.parser.syntax.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class Db2LookFileProcessor {

    private final QueryExecutor queryExecutor;
    private final FileHandlers fileHandlers;

    public Db2LookFileProcessor() {
        this.queryExecutor = new QueryExecutor();
        this.fileHandlers = new FileHandlers();
    }
    public  String readFileAsString(String fileName)throws Exception {
        String query = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            query = sb.toString();
        }
        return query.trim();
    }
    public InputStream getInputStream(String query) {
        return  new ByteArrayInputStream(query.getBytes(StandardCharsets.UTF_8));
    }
    public void processFile(File file, String host,  String port, String userName, String password, String outputDirectory) throws Exception {
        System.out.println("processing " + file.getAbsolutePath());
        Db2LookLexer lexer = new Db2LookLexer(CharStreams.fromStream(getInputStream(readFileAsString(file.getAbsolutePath()))));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        Db2LookParser parser = new Db2LookParser(tokens);
        Db2LookParser.FileHandlerContext fileHandlerContext = parser.fileHandler();
        try {
            startProcessing(fileHandlerContext, host, port, userName, password, outputDirectory);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void processValidateFile(File file, String host,  String port, String userName, String password, String outputDirectory) throws Exception {
        System.out.println("validating " + file.getAbsolutePath());
        Db2LookLexer lexer = new Db2LookLexer(CharStreams.fromStream(getInputStream(readFileAsString(file.getAbsolutePath()))));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        Db2LookParser parser = new Db2LookParser(tokens);
        Db2LookParser.FileHandlerContext fileHandlerContext = parser.fileHandler();
    }
    private void startProcessing(Db2LookParser.FileHandlerContext tree, String host, String port, String userName, String password, String outputDirectory) throws SQLException, ClassNotFoundException, AnalyzerException, IOException {
      String dbName = null;
      Map<String , String> failedQueryReasonsMap = new LinkedHashMap<>();
        Connection connection = null;
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
          if(child instanceof Db2LookParser.ConnectStatementContext && connection == null){
                String[] split = child.getText().split(" ");
               dbName =  split[split.length-1]
                        .replaceAll("\"","")
                        .replaceAll(";","")
                        .trim();
               connection = queryExecutor.getConnection(host, port, userName, password, dbName);
            }
            if(child instanceof Db2LookParser.CreateDatabasePartitionGroupStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateBufferPoolQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.MimicStorageGroupStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }

            else if(child instanceof Db2LookParser.MimicTableSpaceStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateRoleStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateSchemaStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateTypeStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree typechild = child.getChild(i1);
                    if(typechild instanceof Db2LookParser.CreateTableQueryContext){
                        queryExecutor.executeQuery(typechild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateSequenceStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.AlterSequenceContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CommentQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.TableSegmentContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree tablechild = child.getChild(i1);
                    if(tablechild instanceof Db2LookParser.CreateTableQueryContext ||
                      tablechild instanceof Db2LookParser.CommentQueryContext ||
                      tablechild instanceof Db2LookParser.AlterTableAddPrimaryKeyQueryContext ||
                      tablechild instanceof Db2LookParser.AlterTableAddUniqueConstraintQueryContext ||
                      tablechild instanceof Db2LookParser.OtherAlterQueryContext ||
                      tablechild instanceof Db2LookParser.CreateIndexQueryContext){
                        queryExecutor.executeQuery(tablechild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.AlterTableAddForeignKeyQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.SetStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.AlterTableAddCheckConstraintQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.UserDefinedFunctionsContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree udfChild = child.getChild(i1);
                    if(udfChild instanceof Db2LookParser.CreateUDFQueryContext){
                        queryExecutor.executeQuery(udfChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateViewStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree viewChild = child.getChild(i1);
                    if(viewChild instanceof Db2LookParser.CreateViewQueryContext){
                        queryExecutor.executeQuery(viewChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.AliasStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateStoredProcedureStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree procedureChild = child.getChild(i1);
                    if(procedureChild instanceof Db2LookParser.CreateProcedureQueryContext){
                        queryExecutor.executeQuery(procedureChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateIndexQueryContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.AlterViewStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateServerStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateWrapperStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateNickStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateUserMappingStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.AlterNickNameStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.CreateTriggerStatementContext){
                for (int i1 = 0; i1 < child.getChildCount(); i1++) {
                    ParseTree triggerChild = child.getChild(i1);
                    if(triggerChild instanceof Db2LookParser.CreateTriggerQueryContext){
                        queryExecutor.executeQuery(triggerChild.getText(), connection, failedQueryReasonsMap);
                    }
                }
            }
            else if(child instanceof Db2LookParser.CreateAuditStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof  Db2LookParser.TrustedContextStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }
            else if(child instanceof Db2LookParser.GrantStatementContext){
                queryExecutor.executeQuery(child.getText(), connection, failedQueryReasonsMap);
            }

            if(child instanceof Db2LookParser.CreateTableSpaceStatementContext){
                String newQuery = alterTablespaceQuery(child.getText());
                queryExecutor.executeQuery(newQuery, connection, failedQueryReasonsMap);
            }
        }
        fileHandlers.writeLogs(failedQueryReasonsMap, outputDirectory ,dbName);

        connection.close();
    }

    private String alterTablespaceQuery(String query) {
        if(query.contains("(") && query.contains(")")) {
            String locationPart =  StringUtils.substringBetween(query, "(", ")");
            if(locationPart.contains(",")){
                String[] locationSplit = locationPart.split(",");
                String oldValue = "";
                String newValue = "";
                for (int i = 0; i < locationPart.split(",").length; i++) {
                    if(i==1){

                        String newLocationValue = processLocationAndMakeDir(locationSplit[i].trim().replaceAll("'", "").replace(oldValue, newValue), Boolean.FALSE);
                        String newLocation1 = "'" + newLocationValue + "'";
                        query = query.replace(locationSplit[i].trim(), newLocation1);


                    }
                    else{
                        String[] split = locationSplit[i].split("/");
                         oldValue = split[split.length-3];
                        String newLocation1 = processLocationAndMakeDir(locationSplit[i].trim().replaceAll("'", ""), Boolean.TRUE);
                        String newLocation = "'" + newLocation1 + "'";
                        query = query.replace(locationSplit[i].trim(), newLocation);
                        String[] split1 = newLocation1.split("\\\\");
                         newValue = split[split1.length-2];
                    }
                }
            }
            else{
                String newLocation = "'" + processLocationAndMakeDir(locationPart, Boolean.TRUE) + "'";
                query = query.replace(locationPart, newLocation);
            }
        }
        query = query.replaceAll("\\\\","\\\\\\\\");
        return query;
    }


    private String processLocationAndMakeDir(String location, Boolean outerDirectoryValidation){
        String[] split = location.split("/");
        List<String> dirList = new ArrayList<>();
        for (int i = split.length-2 ,  j=1 ; j<=2; i--,j++) {
            dirList.add(split[i]);
        }
        String dirLocation = "";
        String outderDirectory = "";
        if(!outerDirectoryValidation){
            dirLocation = "C:\\Program Files\\IBM" + "\\" + dirList.get(dirList.size()-1);
            dirList.remove(dirList.size()-1);
        }
        else{
            Collections.reverse(dirList);
             dirLocation = "C:\\Program Files\\IBM";
        }
        for (int i = 0; i < dirList.size(); i++) {
            DirectoryMeta directoryMeta = DirectoryMeta.builder().directoryPath(dirLocation).build();
            validateDirectory(directoryMeta, dirList.get(i));
            dirLocation = directoryMeta.getDirectoryPath();
            File f1 = new File(directoryMeta.getDirectoryPath());
            //Creating a folder using mkdir() method
            boolean bool = f1.mkdir();
            if(bool){
                System.out.println("firectory created" + f1.getAbsolutePath());
            }
            else{
                System.out.println("directory not  created" + f1.getAbsolutePath());
            }
        }
        return  dirLocation;
    }

    private void validateDirectory(DirectoryMeta dirLocation, String possibleDirName) {
        String dirLocTemp = dirLocation.getDirectoryPath() + "\\" + possibleDirName;
        File file = new File(dirLocTemp);
        if (!file.exists()){//not present
           dirLocation.setDirectoryPath(dirLocTemp);
        }
        //find other alternative
        else{
          validateDirectory(dirLocation, possibleDirName + "1");
        }
    }

    public Boolean isCorrect (Db2LookParser parser) {
        SyntaxErrorListener listener = new SyntaxErrorListener();
        parser.addErrorListener(listener);
        parser.fileHandler();
        return listener.getSyntaxErrors().isEmpty();
    }

}
