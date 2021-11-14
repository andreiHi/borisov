package org.corona.model;

import javax.inject.Singleton;

/**
 * Святая вода
 */
@Singleton
public class HolyWater implements Therapy {
    public HolyWater() {
    }

    @Override
    public void apply(Patient patient) {
        System.out.println("Стакан святой воды запивать спиртом три стакана в сутки ");
    }
}
