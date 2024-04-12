package com.yourcompany.patterns.factorymethod.solution;

// Factory Method Pattern

import com.yourcompany.patterns.decorator.solution.Consultation;
import com.yourcompany.patterns.factorymethod.BillableItem;

interface BillableItemFactory {
    BillableItem createBillableItem();
}

class ConsultationFactory implements BillableItemFactory {
    @Override
    public BillableItem createBillableItem() {
        return new Consultation(2); // Default duration is 2 hours
    }
}

class LabTestFactory implements BillableItemFactory {
    @Override
    public BillableItem createBillableItem() {
        return (BillableItem) new LabTest();
    }
}

class PharmacyItemFactory implements BillableItemFactory {
    @Override
    public BillableItem createBillableItem() {
        return (BillableItem) new PharmacyItem(); // Default quantity is 5
    }
}

// Refactor Main class to use factory methods
public class Main {
    public static void main(String[] args) {
        // Use factory methods to create billable items
        BillableItemFactory consultationFactory = new ConsultationFactory();
        BillableItem consultation = consultationFactory.createBillableItem();

        BillableItemFactory labTestFactory = new LabTestFactory();
        BillableItem labTest = labTestFactory.createBillableItem();

        BillableItemFactory pharmacyItemFactory = new PharmacyItemFactory();
        BillableItem pharmacyItem = pharmacyItemFactory.createBillableItem();

        // Display costs
        System.out.println("Cost of consultation: $" + consultation.calculateCost());
        System.out.println("Cost of lab test: $" + labTest.calculateCost());
        System.out.println("Cost of pharmacy item: $" + pharmacyItem.calculateCost());
    }
}
