package com.intend.spring.services;

import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlaneService {
    public void readyToFly(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the plane : ");
        Plane plane = (Plane) context.getBean("plane");
        plane.loadFuel();
        System.out.println(plane.getStatus());

    }
}
