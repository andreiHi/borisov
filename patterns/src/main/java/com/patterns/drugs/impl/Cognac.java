package com.patterns.drugs.impl;

import com.patterns.annotations.Treatment;
import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;

/**
 * Коньяк
 */
@Slf4j
@Treatment(type = Therapy.ALCOHOL)
public class Cognac implements Therapy {

    @Override
    public void apply(Patient patient) {
        log.info("Дышать над коньяком...");
    }
}

