package com.fluex404.moduleservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(ServiceConfigImpl.class)
@Configuration
public @interface ServiceConfig {
}
