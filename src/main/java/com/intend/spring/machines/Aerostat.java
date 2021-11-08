package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.StatusMarker;
import com.intend.spring.interfaces.Venicle;
import com.intend.spring.interfaces.VenicleMarker;
import org.springframework.stereotype.Component;



@Component
public class Aerostat implements MachineInter, Venicle {

    public String sayYourName() {
       return "Aerostat";
    }
@StatusMarker
    public String getStatus() {
        return "READY";
    }

    @VenicleMarker
    public void loadFuel() {
        System.out.println("Load 110l water , 50l gas");
    }
}
