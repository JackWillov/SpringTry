package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.StatusMarker;
import com.intend.spring.interfaces.VenicleMarker;
import org.springframework.stereotype.Component;

@Component
public class Planer implements MachineInter {

    public String sayYourName() {
        return "Planer";
    }
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }
}
