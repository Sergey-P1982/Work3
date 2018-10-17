package com.epam.task1.controller;

import com.epam.task1.dataSource.ToyStorage;
import com.epam.task1.entities.Toy;
import com.epam.task1.model.ChildRoom;
import com.epam.task1.view.ToyView;

import java.util.Scanner;

public class Controller {
    private ChildRoom<? extends Toy> modelToy = new ChildRoom<>();
    private ToyView view = new ToyView();
    Scanner scan = new Scanner(System.in);

    public void run() {
        modelToy.setToys(ToyStorage.getToys());
        String moreMenu = "Y";
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (1-5):");
            int menuItem = getMenuItem();
            while (menuItem > 5 || menuItem < 1) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getMenuItem();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu? Y/N");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();
    }

    private void executeMenuItem(int number) {
        switch (number) {
            case (1):
                view.printToys("All toys:", modelToy.getToys());
                break;
            case (2):
                view.printResult("The total price of all toys =  ", modelToy.getTotalPrice());
                break;
            case (3):
                view.printToys("Sorting by name:  ", modelToy.sortToysByName());
                break;
            case (4):
                view.printToys("Find all toys with the weight <=0.5 kg:",
                        modelToy.findToysInWeightRange(0, 0.5));
                break;
            case (5):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number. Try again. ");
                break;
        }
    }
}
