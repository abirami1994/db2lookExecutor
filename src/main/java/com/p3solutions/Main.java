package com.p3solutions;

import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;
import com.p3solutions.db2lookExecutor.services.Db2LookExecutorController;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {
        Db2LookExecutorController db2LookExecutorController = new Db2LookExecutorController();
        db2LookExecutorController.startProcessing();
    }
}