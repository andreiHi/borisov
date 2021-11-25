package com.patterns.controllers;

import com.patterns.services.Hospital;
import lombok.RequiredArgsConstructor;
import org.corona.model.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corona")
@RequiredArgsConstructor
public class HospitalController {

    private final Hospital hospital;

    @PostMapping("/treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }
}
