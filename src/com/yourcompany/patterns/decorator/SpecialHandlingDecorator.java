package com.yourcompany.patterns.decorator;

import com.yourcompany.patterns.factorymethod.BillableItem;

// Concrete decorator for adding special handling to billable items
public class SpecialHandlingDecorator implements BillableItemDecorator {
    private BillableItem billableItem;

    public SpecialHandlingDecorator(BillableItem billableItem) {
        this.billableItem = billableItem;
    }

    @Override
    public double calculateCost() {
        return billableItem.calculateCost() + 50; // Add $50 for special handling
    }
}
