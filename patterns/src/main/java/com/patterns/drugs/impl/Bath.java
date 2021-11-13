package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Баня
 */
@Slf4j
@Component
public class Bath implements Therapy {

    @Override
    public void apply(Patient patient) {
        log.info("Три захода в баню, по 10 минут при температуре в три раза превышающей температуру тела.");
    }
}
