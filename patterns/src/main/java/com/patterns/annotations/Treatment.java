package com.patterns.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Component
@Qualifier
@Autowired
@Retention(RetentionPolicy.RUNTIME)
public @interface Treatment {
    String type();
}

