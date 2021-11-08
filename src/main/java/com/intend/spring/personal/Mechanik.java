package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Mechanik {


    @Pointcut("@annotation(com.intend.spring.interfaces.VenicleMarker)")
    private void haveVeniclePointcut() {
        // nothing here
    }


    @After("haveVeniclePointcut()")
    public void MechanicOpinion() {
        System.out.println("Mechanik  -  Ready to fly");
    }
}
