package com.patterns;

import com.patterns.doctors.Healer;
import com.patterns.patient.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
    }

}

@Component
@RequiredArgsConstructor
class Runner implements CommandLineRunner {
    private final Healer healer;
    @Override
    public void run(String... args) throws Exception {
        healer.heal(new Patient());
    }
}
