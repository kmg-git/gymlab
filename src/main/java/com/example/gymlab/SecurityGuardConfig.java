package com.example.gymlab;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityGuardConfig {

    @Bean(initMethod = "standby",destroyMethod = "leave")
    public SecurityGuard securityGuard(){
        return new SecurityGuard();
    }
}
