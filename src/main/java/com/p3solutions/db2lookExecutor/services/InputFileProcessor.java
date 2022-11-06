package com.p3solutions.db2lookExecutor.services;


import com.p3solutions.db2lookExecutor.beans.Dto;
import com.p3solutions.db2lookExecutor.exception_handler.AnalyzerException;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Objects;


public class InputFileProcessor {

    private final Db2LookFileProcessor db2LookFileProcessor;
    public InputFileProcessor() {
        this.db2LookFileProcessor =  new Db2LookFileProcessor();
    }

    public void processDirectory(Dto dto) throws Exception {
        File file = new File(dto.getInputDir());
        if (validateDirectory(file)) {
            processFiles(file, dto);
        }
    }

    public void processFiles(File directory, Dto migrationRequestDTO) throws Exception {
    for (File fileInDir : Objects.requireNonNull(directory.listFiles())) {
        //ignore subDir
        if (!fileInDir.isFile()) {
           if(Objects.requireNonNull(fileInDir.listFiles()).length == 0) {
              throw new IllegalArgumentException("empty.subDirectory");
           }
            processFiles(fileInDir, migrationRequestDTO);
        }
        else{
                db2LookFileProcessor.processFile(fileInDir
                        , migrationRequestDTO.host
                        , migrationRequestDTO.port
                        , migrationRequestDTO.username
                        , migrationRequestDTO.password
                        , migrationRequestDTO.outputDir);
        }
      }
    }

    public boolean validateDirectory(File dir) {


        if (!dir.exists()){
            throw new IllegalArgumentException("invalid.directory");
        }
        else {
            int length = Objects.requireNonNull(dir.listFiles()).length;
            if (length == 0) {
                throw new IllegalArgumentException("empty.directory");
            }
        }
        return true;
    }

}
