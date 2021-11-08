package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.NonVenicles;
import com.intend.spring.interfaces.StatusMarker;
import org.springframework.stereotype.Component;

@Component
public class Paraglider  implements MachineInter {

    public String sayYourName() {
        return "Paraglider";
    }
    @NonVenicles
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }
}
