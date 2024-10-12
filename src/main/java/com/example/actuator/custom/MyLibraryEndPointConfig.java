package com.example.actuator.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryEndPointConfig {
    @Bean
    public MyLibraryInfoEndPoint myLibraryInfoEndPoint() {
        return new MyLibraryInfoEndPoint();
    }
}
