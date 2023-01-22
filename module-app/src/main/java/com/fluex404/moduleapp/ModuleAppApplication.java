package com.fluex404.moduleapp;

import com.fluex404.moduleapi.config.ModuleApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ModuleApiConfig
public class ModuleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleAppApplication.class, args);
    }

}
