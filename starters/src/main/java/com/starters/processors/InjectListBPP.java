package com.starters.processors;

import com.starters.annotations.InjectList;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;

import java.beans.Introspector;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InjectListBPP implements BeanPostProcessor {

    @Autowired
    private ApplicationContext context;


    @Override
    @SneakyThrows()
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Set<Field> fields = ReflectionUtils.getAllFields(bean.getClass(), field -> field.isAnnotationPresent(InjectList.class));
        for (Field field : fields) {
            final InjectList annotation = field.getAnnotation(InjectList.class);
            final List<Object> list = Arrays.stream(annotation.value())
                    .map(aClass -> Introspector.decapitalize(aClass.getSimpleName()))
                    .map(name -> context.getBean(name))
                    .collect(Collectors.toList());
            field.setAccessible(true);
            field.set(bean, list);
        }
        return bean;
    }
}
