package com.patterns.controllers;

import com.patterns.dto.BeanMd;
import com.patterns.services.CCL;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;

@RestController
public class BeanRegistratratorController {

    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;

    @SneakyThrows
    @PostMapping("/regBean")
    public String regBean(@RequestBody BeanMd beanMd) {
        final Class<?> beanClass = ccl.findClass(beanMd.getBeanClassName());
        // первый способ регистрации бина
//        final Constructor<?> constructor = beanClass.getConstructor();
//        final Object o = constructor.newInstance();
//        final ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//        beanFactory.registerSingleton(beanMd.getBeanName(), o);
 //        context.getBean(beanMd.getBeanName());
        // второй способ регистрации бина
        final BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();
        final GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        beanDefinition.setBeanClass(beanClass);
        beanFactory.registerBeanDefinition(beanMd.getBeanName(), beanDefinition);
        context.getBean(beanMd.getBeanName());
        return "registered";
    }
}
