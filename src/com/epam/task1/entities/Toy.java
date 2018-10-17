package com.epam.task1.entities;

public abstract class Toy {
    private String name;
    private String material;
    private double price;
    private double weight;


    public Toy(String name, String material, double price, double weight) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ". It is " + this.name + ": material - " + this.material +
                ", price - " + this.price + " $, weight - " + this.weight + " kg, ";
    }
}

