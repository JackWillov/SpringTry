package com.intend.spring.services;

import com.intend.spring.machines.HangGlider;
import com.intend.spring.machines.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HangGliderService {
    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the Hang Glider : ");
        HangGlider hangGlider = (HangGlider) context.getBean("hangGlider");
        System.out.println(hangGlider.getStatus());
        System.out.println();
    }
}
