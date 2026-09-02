package com.example.gymlab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class GymNoticeService {
    @Value("${gym.info.name}")
    private String name;


    @Value("#{${gym.info.entry-fee} * 2}")
    private int doubleEntry;

    public void printNotice(){
        System.out.println("test1");
        System.out.println(name +" : "+ doubleEntry);
        System.out.println("test2");
    }




}
