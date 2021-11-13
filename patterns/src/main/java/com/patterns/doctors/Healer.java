package com.patterns.doctors;

import com.patterns.patient.Patient;

/**
 * Целитель, который может исцелять пациентов.
 * Разные реализации (Народная медицина, Китайская медицина, традиционная медицина, ...)
 */
public interface Healer {

    String FOLK = "folk";
    String TRADITIONAL = "traditional";

    void heal(Patient patient);
}
