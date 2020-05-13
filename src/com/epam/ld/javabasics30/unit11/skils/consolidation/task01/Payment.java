package com.epam.ld.javabasics30.unit11.skils.consolidation.task01;

import java.util.HashMap;
import java.util.Map;

public class Payment {
    private final Map<Item, Integer> items = new HashMap<>();

    public void addItem(Item item) {
        addItem(item, 1);
    }

    public void addItem(Item item, int quantity) {
        if (quantity > 0) {
            addOrRemoveItem(item, quantity);
        }
    }

    public void dropItem(Item item) {
        items.remove(item);
    }

    public void removeItem(Item item) {
        removeItem(item, 1);
    }

    public void removeItem(Item item, int quantity) {
        if (quantity > 0) {
            addOrRemoveItem(item, -quantity);
        }
    }

    private void addOrRemoveItem(Item item, int quantity) {
        Integer oldQty = items.get(item);
        if (oldQty != null) {
            quantity += oldQty;
        }
        if (quantity > 0) {
            items.put(item, quantity);
        } else {
            items.remove(item);
        }
    }

    public void clearPayment() {
        items.clear();
    }

    @Override
    public String toString() {
        return "Payment{" + "items=" + items + '}';
    }
}
