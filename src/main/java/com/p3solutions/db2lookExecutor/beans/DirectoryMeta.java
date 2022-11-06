package com.p3solutions.db2lookExecutor.beans;

import lombok.*;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class DirectoryMeta {
    private String directoryPath;
}
