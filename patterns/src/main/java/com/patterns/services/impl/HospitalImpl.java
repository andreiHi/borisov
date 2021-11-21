package com.patterns.services.impl;

import com.patterns.doctors.Healer;
import com.patterns.services.Hospital;
import lombok.extern.slf4j.Slf4j;
import org.corona.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
public class HospitalImpl implements Hospital {

    private Map<String, Healer>healerMap;

    public HospitalImpl(List<Healer>healers) {
        healerMap = healers.stream().collect(Collectors.toMap(Healer::getType, Function.identity()));
    }

    @Override
    public void processPatient(Patient patient) {
        healerMap.get(patient.getMethod()).heal(patient);
    }
}
