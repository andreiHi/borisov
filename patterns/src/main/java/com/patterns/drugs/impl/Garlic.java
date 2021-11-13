package com.patterns.drugs.impl;

import com.patterns.drugs.Therapy;
import com.patterns.patient.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Чеснок
 */
@Slf4j
@Component
public class Garlic implements Therapy {

    @Override
    public void apply(Patient patient) {
        log.info("Вставить чеснок в уши, нос и рот, крутить по часовой стрелке во время еды, до конца пандемии");
    }
}
