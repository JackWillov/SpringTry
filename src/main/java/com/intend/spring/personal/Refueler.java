package com.intend.spring.personal;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class Refueler {

    @Pointcut("@annotation(com.intend.spring.interfaces.VenicleMarker)")
    private void haveVeniclePointcut() {
        // nothing here
    }


    @After("haveVeniclePointcut()")
    public void fuelAdvice() {
        System.out.println("Fueler load fuel to MAX");
    }

}

