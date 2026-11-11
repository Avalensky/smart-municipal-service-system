package com.municipality.smartmunicipalservicesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ServletComponentScan(basePackages = {"servlet", "com.municipality.smartmunicipalservicesystem"})
@ComponentScan(basePackages = {
    "com.municipality.smartmunicipalservicesystem",
    "controller",
    "service",
    "model",
    "repository"
})
@EntityScan(basePackages = {"com.municipality.smartmunicipalservicesystem", "model"})
@EnableJpaRepositories(basePackages = {"com.municipality.smartmunicipalservicesystem", "repository"})
public class SmartMunicipalServiceSystem {

    public static void main(String[] args) {
        SpringApplication.run(SmartMunicipalServiceSystem.class, args);
    }
}


