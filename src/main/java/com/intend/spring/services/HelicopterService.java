package com.intend.spring.services;

import com.intend.spring.machines.Helicopter;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelicopterService {
    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the Helicopter : ");
        Helicopter helicopter = (Helicopter) context.getBean("helicopter");
        helicopter.loadFuel();
        System.out.println(helicopter.getStatus());
        System.out.println();
    }
}
