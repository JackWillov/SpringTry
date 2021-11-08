package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.StatusMarker;
import org.springframework.stereotype.Component;

@Component
public class Paraglider  implements MachineInter {

    public String sayYourName() {
        return "Paraglider";
    }
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }
}
