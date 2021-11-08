package com.intend.spring.machines;

import com.intend.spring.interfaces.*;
import org.springframework.stereotype.Component;


@Component
public class HangGlider implements MachineInter {

    public String sayYourName() {
        return "HangGlider";
    }

    @NonVenicles
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }


}
