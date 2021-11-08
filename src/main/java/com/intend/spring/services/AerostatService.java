package com.intend.spring.services;

import com.intend.spring.machines.Aerostat;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AerostatService {
    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the Aerostat : ");
        Aerostat aerostat = (Aerostat) context.getBean("aerostat");
        aerostat.loadFuel();
        System.out.println(aerostat.getStatus());
        System.out.println();

    }
}
