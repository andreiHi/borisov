package com.patterns.drugs.impl;


import lombok.extern.slf4j.Slf4j;
import org.corona.model.Patient;
import org.corona.model.Therapy;
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
