package com.intend.spring.services;

import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlaneService {
    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the Plane : ");
        Plane plane = (Plane) context.getBean("plane");
        plane.loadFuel();
        System.out.println(plane.getStatus());
        System.out.println();
    }
}
