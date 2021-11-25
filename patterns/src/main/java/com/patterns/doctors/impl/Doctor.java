package com.patterns.doctors.impl;

import com.patterns.doctors.Healer;
import org.corona.model.Patient;
import org.corona.model.Therapy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Doctor implements Healer {

    private int currentTreatment;

    @Autowired
    private List<Therapy>  therapies;

    @Override
    public void heal(Patient patient) {
        if (currentTreatment == therapies.size()) {
            currentTreatment = 0;
        }
        final Therapy therapy = therapies.get(currentTreatment++);
        therapy.apply(patient);
    }

    @Override
    public String getType() {
        return "врач";
    }
}
