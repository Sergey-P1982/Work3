package com.epam.task2.entities.view;

import com.epam.task2.entities.Shop;

import java.util.List;

public class ShopView {
    public void printMessage (String message) {
        System.out.println(message);
    }

    public void printMenu () {
        System.out.println("Welcome to the shop menu:");
        System.out.println("1. Create a new department.");
        System.out.println("2. Liquidate a department.");
        System.out.println("3. Print all departments.");
        System.out.println("4. Sorting departments by number of workers");
        System.out.println("5. Redirect some workers between departments");
        System.out.println("6. Exit.");
    }

    public void printDepartments (String message, List<Shop.Department> departments) {
        System.out.println(message);
        if (!departments.isEmpty()) {
            for (Shop.Department dep : departments) {
                System.out.println(dep);
            }
        } else {
            System.out.println("Sorry, there is no departments in the shop");
        }

    }
}
