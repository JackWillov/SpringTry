package com.intend.spring.services;

import com.intend.spring.machines.Dirigible;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DirigibleService {
    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the Dirigible  : ");
        Dirigible dirigible = (Dirigible) context.getBean("dirigible");
        dirigible.loadFuel();
        System.out.println(dirigible.getStatus());
        System.out.println();

    }
}
