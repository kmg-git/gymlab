package com.example.gymlab;


import org.springframework.stereotype.Component;

@Component
public class MainReferee {
    private SubReferee subReferee;

    public void setSubReferee(SubReferee subReferee){
        this.subReferee=subReferee;
    }
}
