package com.patterns.doctors.impl;

import com.patterns.doctors.Healer;
import org.corona.model.Patient;

public class Shaman implements Healer {

    @Override
    public void heal(Patient patient) {
        System.out.println("Бей в бубен громче!!!");
    }

    @Override
    public String getType() {
        return "магия";
    }
}
