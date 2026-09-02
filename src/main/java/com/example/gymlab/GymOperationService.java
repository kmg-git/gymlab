package com.example.gymlab;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class GymOperationService implements InitializingBean, DisposableBean {

    @PostConstruct
    public void openGym(){
        System.out.println("체육관 오픈");

    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("오픈 준비 정검");

    }

    @PreDestroy
    public void closeGym(){
        System.out.println("체육관 닫기");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("체육관 정산, 정리");
    }
}
