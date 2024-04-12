package com.yourcompany.patterns.observer.solution;

// Observer Pattern

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}

class EHRSystem implements Observer {
    @Override
    public void update() {
        System.out.println("Updating billing records...");
    }
}

class BillingSystem {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to trigger update when EHR changes
    public void ehrChanged() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Update Main class to demonstrate Observer Pattern
public class Main {
    public static void main(String[] args) {
        // Set up Observer pattern
        BillingSystem billingSystem = new BillingSystem();
        Observer ehrSystem = new EHRSystem();
        billingSystem.addObserver(ehrSystem);

        // Simulate change in EHR triggering update in billing system
        billingSystem.ehrChanged();
    }
}
