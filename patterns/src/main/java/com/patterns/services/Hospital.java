package com.patterns.services;

import com.patterns.doctors.Healer;
import org.corona.model.Patient;

public interface Hospital {

    void register(String type, Healer healer);

    void processPatient(Patient patient);
}
