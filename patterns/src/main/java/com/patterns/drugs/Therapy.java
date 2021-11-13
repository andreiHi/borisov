package com.patterns.drugs;

import com.patterns.patient.Patient;

/**
 * Виды лечения
 */
public interface Therapy {
    String ALCOHOL = "alcohol";

    void apply(Patient patient);
}
