package com.intend.spring.services;

import com.intend.spring.machines.HangGlider;
import com.intend.spring.machines.Paraglider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParagliderService {
    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the  Paraglider : ");
        Paraglider paraglider = (Paraglider) context.getBean("paraglider");
        System.out.println(paraglider.getStatus());
        System.out.println();
    }
}
