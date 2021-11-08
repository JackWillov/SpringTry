package com.intend.spring.machines;

import com.intend.spring.interfaces.MachineInter;
import com.intend.spring.interfaces.StatusMarker;
import com.intend.spring.interfaces.Venicle;
import com.intend.spring.interfaces.VenicleMarker;
import org.springframework.stereotype.Component;


@Component
public class HangGlider implements MachineInter, Venicle {

    public String sayYourName() {
        return "HangGlider";
    }
    @StatusMarker
    public String getStatus() {
        return "ready to work";
    }

    @VenicleMarker
    public void loadFuel() {

    }
}
