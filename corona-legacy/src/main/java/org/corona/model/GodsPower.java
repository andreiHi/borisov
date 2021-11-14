package org.corona.model;

import javax.inject.Singleton;

/**
 * Божья сила
 */
@Singleton
public class GodsPower {
    public GodsPower() {
    }

    public void apply(Patient patient) {
        System.out.println("Все ты здоров проходи ...");
    }
}
