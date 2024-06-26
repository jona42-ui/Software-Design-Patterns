package com.yourcompany.patterns.observer.initialproblem;

// Simulate changes in EHR
class EHRSystem {
    public void updateBillingRecords() {
        // Logic to update billing records when EHR changes
        System.out.println("Updating billing records...");
    }
}

// Main class manually triggers update in billing system
public class observer {
    public static void main(String[] args) {
        // Simulate change in EHR triggering update in billing system
        EHRSystem ehrSystem = new EHRSystem();
        ehrSystem.updateBillingRecords();
    }
}
