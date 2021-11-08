package com.intend.spring;

import com.intend.spring.machines.Plane;
import com.intend.spring.services.PlaneService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.intend.spring");
        PlaneService planeServ = new PlaneService();
        planeServ.readyToFly();







    }
}
