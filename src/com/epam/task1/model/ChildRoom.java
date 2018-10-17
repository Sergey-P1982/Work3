package com.epam.task1.model;

import com.epam.task1.dataSource.ToyStorage;
import com.epam.task1.entities.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class ChildRoom<T extends Toy> {
    private Toy[] toys;

    public Toy[] getToys() {
        return toys;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < toys.length; i++) {
            totalPrice += toys[i].getPrice();
        }

        return totalPrice;
    }

    public Toy[] sortToysByName() {
        Toy[] temp = ToyStorage.getToys();
        Arrays.sort(temp, new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return temp;
    }

    public Toy[] findToysInWeightRange(double weightBegin, double weightEnd) {
        int count = 0, count2 = 0;
        for (Toy elem : toys) {
            if (elem.getWeight() <= weightEnd && elem.getWeight() >= weightBegin) count++;
        }
        Toy[] temp = new Toy[count];
        for (Toy elem : toys) {
            if (elem.getWeight() <= weightEnd && elem.getWeight() >= weightBegin) {
                temp[count2] = elem;
                count2++;
            }
        }

        return temp;
    }

    public void showToys() {
        for (int i = 0; i < toys.length; i++) {
            System.out.println(toys[i].toString());
        }
    }

}
