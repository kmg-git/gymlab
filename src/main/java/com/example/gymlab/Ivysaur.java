package com.example.gymlab;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ivysaur implements BattlePokemon{

    @Override
    public void useSkill() {
        System.out.println("덩굴채찍");
    }
}
