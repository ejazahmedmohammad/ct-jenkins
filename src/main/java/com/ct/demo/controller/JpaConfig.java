package com.ct.demo.controller;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.ct.demo.data")
public class JpaConfig {
    // Additional JPA configurations...
}
