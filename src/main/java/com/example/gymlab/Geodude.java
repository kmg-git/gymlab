package com.example.gymlab;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Geodude implements BattlePokemon{
    @Override
    public void useSkill() {
        System.out.println("돌떨구기");
    }
}
