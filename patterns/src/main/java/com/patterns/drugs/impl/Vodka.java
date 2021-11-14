package com.patterns.drugs.impl;

import lombok.extern.slf4j.Slf4j;
import org.corona.model.Therapy;
import org.corona.model.Patient;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Vodka implements Therapy {

    @Override
    public void apply(Patient patient) {
        log.info("100 грамм внутрь, три раза перед каждой едой.");
    }
}
