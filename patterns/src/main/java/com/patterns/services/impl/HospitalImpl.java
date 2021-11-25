package com.patterns.services.impl;

import com.patterns.doctors.Healer;
import com.patterns.services.Hospital;
import lombok.extern.slf4j.Slf4j;
import org.corona.model.Patient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class HospitalImpl implements Hospital {

    private Map<String, Healer>healerMap = new HashMap<>();

    @Override
    public void register(String type, Healer healer) {
        healerMap.put(type, healer);
    }

    @Override
    public void processPatient(Patient patient) {
        healerMap.get(patient.getMethod()).heal(patient);
    }
}
