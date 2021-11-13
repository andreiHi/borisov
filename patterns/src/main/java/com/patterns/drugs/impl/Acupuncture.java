package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Acupuncture implements Therapy {
    @Override
    public void apply(Patient patient) {
        log.info("Вставлять иголки за уши и в лоб.");
    }
}
