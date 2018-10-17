package com.epam.task2.controller;

import com.epam.task2.entities.Shop;
import com.epam.task2.entities.ShopManager;
import com.epam.task2.entities.view.ShopView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    ShopManager model = new ShopManager();
    ShopView view = new ShopView();
    Scanner scan = new Scanner(System.in);

    public void run() {
        String moreMenu = "Y";
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (1-6):");
            int menuItem = getInteger();
            while (menuItem > 6 || menuItem < 1) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getInteger();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu? Y/N");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private int getInteger() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();
    }

    private double getDoubleArea() {
        while (!scan.hasNextDouble()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextDouble();
    }

    private void executeMenuItem(int number) {
        switch (number) {
            case (1):
                readDepartmentInfo();
                break;
            case (2):
                removeDepartment();
                break;
            case (3):
                view.printDepartments("All Departments of the shop " + model.getShop().toString() + ": ",
                        model.getShop().shopDepartments);
                break;
            case (4):
                view.printDepartments("Sorting departments by name:", model.sortDepByName());
                break;
            case (5):
                redirectWorkers();
                break;
            case (6):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number. Try again. ");
                break;
        }

    }

    private void readDepartmentInfo() {
        view.printMessage("Enter the name of the new department:");
        String depName = scan.next();

        view.printMessage("Enter a type of products or services of department:");
        String productOrService = scan.next();

        view.printMessage("Enter a number of workers:");
        int workersNumber = getInteger();
        checkPositiveNumber(workersNumber);

        view.printMessage("Enter a number of the floor:");
        int floor = getInteger();
        checkPositiveNumber(floor);

        view.printMessage("Enter the department area:");
        double depArea = getDoubleArea();
        checkPositiveArea(depArea);

        view.printDepartments("You have added a new department in the " + model.getShop().toString(),
                model.createDepartment(depName, productOrService, workersNumber, floor, depArea));

    }

    private int checkPositiveNumber(int number) {
        do {
            if (number <= 0) {
                System.out.println("Not positive area.");
                number = getInteger();
            }
        } while (number <= 0);
        return number;
    }

    private double checkPositiveArea(double area) {
        do {
            if (area <= 0) {
                System.out.println("Not positive area.");
                area = getDoubleArea();
            }
        } while (area <= 0);
        return area;
    }

    private void removeDepartment() {
        List<Shop.Department> temp = model.getShop().shopDepartments;
        int beginSize = temp.size();
        view.printDepartments("Identify the name of department to delete from the list of departments:", temp);
        if (!temp.isEmpty()) {
            view.printMessage("Enter the department name to delete: ");
            String nameToDelete = scan.next();
            List<Shop.Department> newList = new ArrayList<>(model.deleteDepartment(temp, nameToDelete));
            if (beginSize > newList.size()) {
                System.out.println("The department with the name '" + nameToDelete + "' was deleted");
                view.printDepartments("New list of departments: ", newList);
            } else {
                System.out.println("The department with the name '" + nameToDelete + "' not found");
            }
        }
    }

    private void redirectWorkers() {
        List<Shop.Department> temp = model.getShop().shopDepartments;
        if (temp.size() > 1) {
            view.printMessage("Enter the name of the donor department:");
            String donorDepName = scan.next();


            view.printMessage("Enter the name of the destination department:");
            String destinationDepName = scan.next();

            view.printMessage("Enter a number of workers to redirect:");
            int workersNumber = getInteger();
            checkPositiveNumber(workersNumber);

            view.printDepartments("Transfering employees between departments in the " + model.getShop().toString(),
                    model.transferEmployees(temp, donorDepName, destinationDepName, workersNumber));
        } else {
            view.printMessage("Sorry, the number of departments is less than 2. Please, add more departments ");
        }
    }

}
