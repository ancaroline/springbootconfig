package com.digitalinnovationone.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${app.message}")//vamos injetar todos os valores com esta anotação cujo o seja valor app.message
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }
}
