package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Instructor {

    @Pointcut("@annotation(com.intend.spring.interfaces.NonVenicles)")
    private void haveNotVeniclePointcut() {
        // nothing here
    }

    @Before("haveNotVeniclePointcut()")
    public void fuelAdvice() {
        System.out.println("Instructor check this machine and he is ready to fly");
    }

}
