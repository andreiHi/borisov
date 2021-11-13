package com.patterns.doctors.impl;

import com.patterns.doctors.Healer;
import com.patterns.drugs.Therapy;
import com.patterns.drugs.impl.Banks;
import com.patterns.drugs.impl.Bath;
import com.patterns.drugs.impl.Garlic;
import com.patterns.drugs.impl.Vodka;
import com.patterns.patient.Patient;
import com.starters.annotations.InjectList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Witch implements Healer {

    @InjectList({Vodka.class, Bath.class, Banks.class, Garlic.class})
    private List<Therapy> therapies;

    @Override
    public void heal(Patient patient) {
        log.info("Определяю лечение...");
        therapies.forEach(t -> t.apply(patient));
    }
}
