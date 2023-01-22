package com.fluex404.moduleapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(ModuleApiConfigImpl.class)
@Configuration
public @interface ModuleApiConfig {
}
