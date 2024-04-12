package com.yourcompany.patterns.observer;

// Concrete observer for EHR system
public class EHRSystem implements Observer {
    @Override
    public void update() {
        System.out.println("Updating billing records...");
    }
}
