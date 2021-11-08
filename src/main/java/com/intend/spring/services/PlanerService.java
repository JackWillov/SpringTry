package com.intend.spring.services;

import com.intend.spring.machines.HangGlider;
import com.intend.spring.machines.Plane;
import com.intend.spring.machines.Planer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlanerService {
    static int num;

    public PlanerService(int i) {
        num=i;
    }

    public void readyToFly(){
        System.out.println();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        System.out.println("We check the Planers : ");
        for ( int i=1; i <=num ; i++) {
            Planer planer = (Planer) context.getBean("planer");
            System.out.println("Planer number : "+ i);
            System.out.println(planer.getStatus());
            System.out.println();
        }

    }

}
