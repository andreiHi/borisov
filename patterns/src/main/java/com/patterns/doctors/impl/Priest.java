package com.patterns.doctors.impl;

import com.patterns.doctors.Healer;
import com.starters.reader.Legacy;
import org.corona.model.Patient;
import org.corona.model.Therapy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Священник
 */
@Component
public class Priest implements Healer {
    /**
    *Устаревшие методы лечения
     */
    @Autowired
    @Legacy //указываем что тут нужно заинжектить бины из другого проэкта
    private List<Therapy> outdatedTreatments;

    @Override
    public void heal(Patient patient) {
        outdatedTreatments.forEach(therapy -> therapy.apply(patient));
    }

    @Override
    public String getType() {
        return Healer.FOLK;
    }
}
