package com.starters.config;

import com.starters.processors.InjectListBPP;
import com.starters.reader.LegacyBeanDefinitionRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LegacyBeanDefinitionRegistrar.class) // Регистрируем для загрузки
public class StarterConfig {

    @Bean
    InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }
}
