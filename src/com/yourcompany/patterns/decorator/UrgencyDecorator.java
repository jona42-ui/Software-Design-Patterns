package com.yourcompany.patterns.decorator;

import com.yourcompany.patterns.factorymethod.BillableItem;

// Concrete decorator for adding urgency to billable items
public class UrgencyDecorator implements BillableItemDecorator {
    private BillableItem billableItem;

    public UrgencyDecorator(BillableItem billableItem) {
        this.billableItem = billableItem;
    }

    @Override
    public double calculateCost() {
        return billableItem.calculateCost() * 1.2; // Increase cost by 20% for urgency
    }
}
