package org.corona.model;

import javax.inject.Singleton;

/**
 * Молитва
 */
@Singleton
public class Prayer implements Therapy {
    public Prayer() {
    }

    @Override
    public void apply(Patient patient) {
        System.out.println("Молимся за спасение...");
    }
}
