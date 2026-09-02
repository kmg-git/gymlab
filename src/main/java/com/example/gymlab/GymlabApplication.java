package com.example.gymlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class GymlabApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(GymlabApplication.class, args);

        //BattlePokemon battlePokemon1 = context.getBean(Ivysaur.class);
        //BattlePokemon battlePokemon2 = context.getBean(Snorlax.class);
        //BattlePokemon battlePokemon3 = context.getBean(Geodude.class);

        GymLeaderService leader = context.getBean(GymLeaderService.class);

        //leader.openGymBattle();


        context.close();
    }


}
