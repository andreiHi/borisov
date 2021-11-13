package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Aspirin implements Therapy {
    @Override
    public void apply(Patient patient) {
        log.info("Пить три раза в день после еды.");
    }
}
