package com.starters.reader;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AutowireCandidateQualifier;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import javax.inject.Singleton;
import java.beans.Introspector;
import java.util.Set;

/**
 * Ищет старую аннотацию Singleton
 * создает бинДифенишены и регистрирует их как бины
 */
@Slf4j
public class LegacyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * Данный класс не является Бином так как он сам создает биндифинишены из которых создадутся бины
     * registry занимается регистрацией бинов,
     * Сканирует пакет org.corona.model и находит все классы помеченные аннотацией Singleton
     * и создает из них бины
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        final Reflections scanner = new Reflections("org.corona.model");
        final Set<Class<?>> classes = scanner.getTypesAnnotatedWith(Singleton.class);
        for (Class<?> aClass : classes) {
            log.info(aClass.getSimpleName());
            final GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
            beanDefinition.setBeanClass(aClass);
            beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
            // устанавливает Qualifier бину
            beanDefinition.addQualifier(new AutowireCandidateQualifier(Legacy.class));
            registry.registerBeanDefinition(Introspector.decapitalize(aClass.getSimpleName()), beanDefinition);
        }
    }
}
