package com.intend.spring.personal;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Revisor {

    @Pointcut("@annotation(com.intend.spring.interfaces.StatusMarker)")
    private void allaparatsPointcut() {

    }

    @After("allaparatsPointcut()")
    public void revisorOption() {
        System.out.print("Revisor opinion about this machine : ");
    }

}
