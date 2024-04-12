package com.yourcompany.patterns.factorymethod.initialproblem;

class Consultation {
    private int duration; // in hours

    public Consultation(int duration) {
        this.duration = duration;
    }

    // Method to calculate cost for consultation
    public double calculateConsultationCost() {
        return duration * 100; // $100 per hour for consultation
    }
}

// Main class directly instantiates billable items
public class Main {
    public static void main(String[] args) {
        // Direct instantiation of Consultation
        Consultation consultation = new Consultation(2);
        System.out.println("Cost of consultation: $" + consultation.calculateConsultationCost());

        // Similar direct instantiation for LabTest and PharmacyItem
    }
}
