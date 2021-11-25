package com.patterns.doctors;

import com.patterns.services.Hospital;
import org.corona.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Целитель, который может исцелять пациентов.
 * Разные реализации (Народная медицина, Китайская медицина, традиционная медицина, ...)
 */
public interface Healer {

    String FOLK = "folk";
    String TRADITIONAL = "traditional";

    @Autowired
    default void regMe(Hospital hospital) {
        hospital.register(getType(), this);
    }

    void heal(Patient patient);

    String getType();
}
