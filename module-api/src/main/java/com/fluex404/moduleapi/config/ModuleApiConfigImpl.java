package com.fluex404.moduleapi.config;

import com.fluex404.moduleservice.config.ServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fluex404.moduleapi")
@ServiceConfig
public class ModuleApiConfigImpl {
}
