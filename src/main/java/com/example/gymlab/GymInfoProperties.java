package com.example.gymlab;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "gym.info")
public class GymInfoProperties {

    private String name;
    private int entryFee;
    private final Badge badge = new Badge();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEntryFee() { return entryFee; }
    public void setEntryFee(int entryFee) { this.entryFee = entryFee; }

    public Badge getBadge() { return badge; }

    public static class Badge {
        private String type;
        private int difficulty;

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public int getDifficulty() { return difficulty; }
        public void setDifficulty(int difficulty) { this.difficulty = difficulty; }
    }
}
