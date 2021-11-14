package com.starters.reader;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация согласно которой инжектятся нужные бины
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Legacy {
}
