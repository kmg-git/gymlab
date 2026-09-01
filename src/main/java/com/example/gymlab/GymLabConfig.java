package com.example.gymlab;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.example.gymlab")
public class GymLabConfig {

    @Bean
    public Geodude geodude() {
        return new Geodude();
    }
}
