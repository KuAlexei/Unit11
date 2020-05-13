package com.epam.ld.javabasics30.unit11.skils.consolidation;

import com.epam.ld.javabasics30.unit11.skils.consolidation.task01.Item;
import com.epam.ld.javabasics30.unit11.skils.consolidation.task01.Payment;

public class Task01 {

    public static void main(String[] args) {
        Payment payment = new Payment();
        System.out.println("New Payment is created: " + payment);
        payment.addItem(new Item("Item1"));
        System.out.println("Item1 is added to payment: " + payment);
        payment.addItem(new Item("Item1"), 2);
        System.out.println("Append to payment 2 Item1: " + payment);
        payment.removeItem(new Item("Item2"), 2);
        System.out.println("Try to remove not existing Item2: " + payment);
        payment.addItem(new Item("Item3"), 3);
        System.out.println("Item3(qty:3) is added to payment: " + payment);
        payment.removeItem(new Item("Item3"), 5);
        System.out.println("Try to remove Item3(qty:5) more than payment has: " + payment);
        payment.clearPayment();
        System.out.println("Clear payment: " + payment);
    }
}
