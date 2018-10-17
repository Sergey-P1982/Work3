package com.epam.task1.entities;

public class SoftToy extends Toy {

    private double height;

        public SoftToy(String name, String material, double price, double weight, int height) {
        super(name, material, price, weight);
        this.height=height;
    }

    public double getHeight() {
            return height;
    }

    @Override
    public String toString() {
        return super.toString() + this.height + " mm";
    }
}
