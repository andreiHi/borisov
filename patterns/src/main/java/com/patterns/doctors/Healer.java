package com.patterns.doctors;

import org.corona.model.Patient;

/**
 * Целитель, который может исцелять пациентов.
 * Разные реализации (Народная медицина, Китайская медицина, традиционная медицина, ...)
 */
public interface Healer {

    String FOLK = "folk";
    String TRADITIONAL = "traditional";

    void heal(Patient patient);

    String getType();
}
