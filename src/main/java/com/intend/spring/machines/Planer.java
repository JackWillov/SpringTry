package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.NonVenicles;
import com.intend.spring.interfaces.StatusMarker;
import com.intend.spring.interfaces.VenicleMarker;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Planer implements MachineInter {

    public String sayYourName() {
        return "Planer";
    }
    @NonVenicles
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }
}
