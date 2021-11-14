package com.patterns.drugs.impl;

import lombok.extern.slf4j.Slf4j;
import org.corona.model.Patient;
import org.corona.model.Therapy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Aspirin implements Therapy {
    @Override
    public void apply(Patient patient) {
        log.info("Пить три раза в день после еды.");
    }
}
