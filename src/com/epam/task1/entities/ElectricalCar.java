package com.epam.task1.entities;

public class ElectricalCar extends Toy {

    private int numberOfBatteries;

    public ElectricalCar(String name, String material, double price, double weight, int numberOfBatteries) {
        super(name, material, price, weight);
        this.numberOfBatteries = numberOfBatteries;
    }

    @Override
    public String toString() {
        return super.toString() + this.numberOfBatteries + " batteries ";

    }
}
