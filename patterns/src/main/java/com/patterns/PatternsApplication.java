package com.patterns;

import com.patterns.doctors.Healer;
import com.patterns.doctors.impl.Priest;
import com.patterns.doctors.impl.Witch;
import lombok.RequiredArgsConstructor;
import org.corona.model.Patient;
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
    private final Witch healer;
    private final Priest priest;
    @Override
    public void run(String... args) throws Exception {
        healer.heal(new Patient());
        priest.heal(new Patient());
    }
}
