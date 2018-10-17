package com.epam.task1.entities;

public class Constructor extends Toy {
    private int numberOfParts;

    public Constructor(String name, String material, double price, double weight, int numberOfParts) {
        super(name, material, price, weight);
        this.numberOfParts = numberOfParts;
    }

    public int getNumberOfParst() {
        return numberOfParts;
    }

    @Override
    public String toString() {
        return super.toString() + this.numberOfParts + " units";

    }
}