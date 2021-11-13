package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Амулет
 */
@Slf4j
@Component
public class Amulet implements Therapy {

    @Override
    public void apply(Patient patient) {
        log.info("Носить на шее маску. Не снимать ни в душе ни во сне.");
    }
}
