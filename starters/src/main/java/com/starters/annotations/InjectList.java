package com.starters.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация которую, будет обрабатывать БинПостПроцессор
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectList {
    Class[] value();
}
