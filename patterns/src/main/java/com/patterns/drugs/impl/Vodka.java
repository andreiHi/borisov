package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Vodka implements Therapy {

    @Override
    public void apply(Patient patient) {
        log.info("100 грамм внутрь, три раза перед каждой едой.");
    }
}
