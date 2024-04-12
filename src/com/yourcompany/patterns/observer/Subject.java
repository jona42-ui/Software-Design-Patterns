package com.yourcompany.patterns.observer;

// Interface for subjects
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
