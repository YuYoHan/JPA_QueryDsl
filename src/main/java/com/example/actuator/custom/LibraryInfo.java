package com.example.actuator.custom;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class LibraryInfo {
    private String name;
    private String version;

    @Builder
    public LibraryInfo(String name, String version) {
        this.name = name;
        this.version = version;
    }
}
