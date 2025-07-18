package com.ttn.Spring_Boot.Assingments;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Check {

    @Value("${myapp.greeting}")//getting value from application.properties file as asked in Q2
    private  String greeting;

    public String getGreeting() {
        return greeting;
    }
}
