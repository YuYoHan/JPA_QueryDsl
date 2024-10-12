package com.example.actuator.custom;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.util.Arrays;
import java.util.List;

@Endpoint(id = "myLibraryInfo")
public class MyLibraryInfoEndPoint {
    @ReadOperation
    public List<LibraryInfo> getLibraryInfos(String name, boolean includeVersion) {
        LibraryInfo libraryInfo = LibraryInfo.builder()
                .name("logback")
                .version("1.0.0")
                .build();

        LibraryInfo libraryInfo2 = LibraryInfo.builder()
                .name("jackson")
                .version("2.0.0")
                .build();

        List<LibraryInfo> libraryInfos = Arrays.asList(libraryInfo, libraryInfo2);
        return libraryInfos;

    }
}
