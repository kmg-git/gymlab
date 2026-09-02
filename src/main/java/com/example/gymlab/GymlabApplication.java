package com.example.gymlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class GymlabApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(GymlabApplication.class, args);

        context.getBean(GymNoticeService.class).printNotice();

        GymInfoProperties info = context.getBean(GymInfoProperties.class);
        System.out.println("배지 이름: " + info.getBadge().getType() + " (난이도 " + info.getBadge().getDifficulty() + ")");

        //context.getBean(GymEnvironmentChecker.class).printActiveProfile();

        context.close();
    }


}
