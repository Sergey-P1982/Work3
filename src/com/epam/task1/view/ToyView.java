package com.epam.task1.view;

import com.epam.task1.entities.Toy;

public class ToyView {

    public void printMenu() {
        System.out.println("Welcome to the toy menu:");
        System.out.println("1. Print all toys from nursery.");
        System.out.println("2. Calculate the total price of all toys.");
        System.out.println("3. Sorting toys by its name.");
        System.out.println("4. Finding toys in weight range (<< 0.5 kg):");
        System.out.println("5. Exit.");
    }

    public void printToys(String message, Toy[] toys) {
        System.out.println(message);
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String message, double result) {
        System.out.println(message + result);
    }
}
