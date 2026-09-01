package com.example.gymlab;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@NoArgsConstructor
public class GymLeaderService {
    private final BattlePokemon battlePokemon1;
    private final BattlePokemon battlePokemon2;


    private final List<BattlePokemon> pokemonList;

    public GymLeaderService(BattlePokemon battlePokemon1,
                            @Qualifier("snorlax") BattlePokemon battlePokemon2,
                            List<BattlePokemon> pokemonList){
        this.battlePokemon1=battlePokemon1;
        this.battlePokemon2=battlePokemon2;
        this.pokemonList=pokemonList;
    }

    public void openGymBattle(){

        battlePokemon1.useSkill();
        battlePokemon2.useSkill();
        for (BattlePokemon battlePokemon : pokemonList){
            battlePokemon.useSkill();
        }
    }
}
