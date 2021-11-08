package com.intend.spring;


import com.intend.spring.machines.HangGlider;
import com.intend.spring.machines.Helicopter;
import com.intend.spring.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("App Start");
        System.out.println("Write number of planers : ");
        int num = scanner.nextInt();
        System.out.println();
        PlaneService planeServ = new PlaneService();
        AerostatService aerostatService = new AerostatService();
        DirigibleService dirigibleService = new DirigibleService();
        HangGliderService hangGliderService = new HangGliderService();
        HelicopterService helicopter = new HelicopterService();
        ParagliderService paragliderService = new ParagliderService();
        PlanerService planerService = new PlanerService(num);


        planeServ.readyToFly();
        aerostatService.readyToFly();
        dirigibleService.readyToFly();
        hangGliderService.readyToFly();
        helicopter.readyToFly();
        paragliderService.readyToFly();
        planerService.readyToFly();

        System.out.println();
        System.out.println("App End");
    }
}
