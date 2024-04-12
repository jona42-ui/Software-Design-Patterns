package com.yourcompany.patterns.observer;

import java.util.ArrayList;
import java.util.List;

// Concrete subject for billing system
public class BillingSystem implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Method to trigger update when EHR changes
    public void ehrChanged() {
        notifyObservers();
    }
}
