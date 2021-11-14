package com.patterns.drugs.impl;

import com.patterns.annotations.Treatment;
import lombok.extern.slf4j.Slf4j;
import org.corona.model.Patient;
import org.corona.model.Therapy;

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

