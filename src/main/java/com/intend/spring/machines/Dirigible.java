package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.StatusMarker;
import com.intend.spring.interfaces.Venicle;
import com.intend.spring.interfaces.VenicleMarker;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Component
public class Dirigible implements MachineInter, Venicle {

    public String sayYourName() {
        return "Dirigible";
    }
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }
    @VenicleMarker
    public void loadFuel() {
        System.out.println("Load 130l helium");
    }
}
