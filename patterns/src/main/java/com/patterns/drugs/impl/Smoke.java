package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Дым
 */
@Slf4j
@Component
public class Smoke implements Therapy {
    @Override
    public void apply(Patient patient) {
        log.info("Нюхать дым, стучать в барабан до полного исцеления");
    }
}
