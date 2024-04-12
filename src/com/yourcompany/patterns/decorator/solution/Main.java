package com.yourcompany.patterns.decorator.solution;

// Decorator Pattern

import com.yourcompany.patterns.factorymethod.BillableItem;

abstract class BillableItemDecorator implements BillableItem {
    protected BillableItem billableItem;

    public BillableItemDecorator(BillableItem billableItem) {
        this.billableItem = billableItem;
    }

    @Override
    public double calculateCost() {
        return billableItem.calculateCost();
    }
}

class UrgencyDecorator extends BillableItemDecorator {
    public UrgencyDecorator(BillableItem billableItem) {
        super(billableItem);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() * 1.2; // Increase cost by 20% for urgency
    }
}

class SpecialHandlingDecorator extends BillableItemDecorator {
    public SpecialHandlingDecorator(BillableItem billableItem) {
        super(billableItem);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 50; // Add $50 for special handling
    }
}

// Update Main class to demonstrate Decorator Pattern
public class Main {
    public static void main(String[] args) {
        // Create a consultation and decorate it with urgency and special handling
        BillableItem consultation = new Consultation(0);
        consultation = new UrgencyDecorator(consultation);
        consultation = new SpecialHandlingDecorator(consultation);

        // Display cost of decorated consultation
        System.out.println("Cost of decorated consultation: $" + consultation.calculateCost());
    }
}
