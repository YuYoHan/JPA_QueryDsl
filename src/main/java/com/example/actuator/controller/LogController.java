package com.example.actuator.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class LogController {
    @GetMapping("/log")
    public String log() {
        log.trace("trace log");
        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");
        return "ok";
    }
}
