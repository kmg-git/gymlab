package com.example.gymlab;

import org.springframework.stereotype.Component;

@Component
public class SubReferee {
    private MainReferee mainReferee;
    public void setMainReferee(MainReferee mainReferee){
        this.mainReferee=mainReferee;
    }
}
