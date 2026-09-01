package com.example.gymlab;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Snorlax implements BattlePokemon{
    @Override
    public void useSkill() {
        System.out.println("몸통박치기");
    }
}
