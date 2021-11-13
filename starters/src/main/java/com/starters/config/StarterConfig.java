package com.starters.config;

import com.starters.processors.InjectListBPP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfig {

    @Bean
    InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }
}
