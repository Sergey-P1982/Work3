package com.epam.task2.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShopManager {
    private Shop shop = new Shop("Universal Store");

    public Shop getShop() {
        return shop;
    }

    public List<Shop.Department> createDepartment(String name, String productOrService, int workersNumber,
                                                  int locationFloor, double area) {
        shop.shopDepartments.add(shop.new Department(name, productOrService, workersNumber, locationFloor, area));
        return shop.shopDepartments;
    }

    public List<Shop.Department> deleteDepartment(List<Shop.Department> temp, String nameToDelete) {
        int index = -1, tempCount = 0;
        for (Shop.Department dep : temp) {
            if (dep.getName().equalsIgnoreCase(nameToDelete)) {
                index = tempCount;
            }
            tempCount++;
        }
        if (index >= 0) {
            temp.remove(index);
        }

        return temp;
    }

    public List<Shop.Department> sortDepByName() {
        List<Shop.Department> temp = new ArrayList<>(shop.shopDepartments);
        temp.sort(new Comparator<Shop.Department>() {
            @Override
            public int compare(Shop.Department o1, Shop.Department o2) {
                return o1.getWorkersNumber() - o2.getWorkersNumber();
            }
        });

        return temp;
    }

    public List<Shop.Department> transferEmployees(List<Shop.Department> temp, String donorDepName, String destinationDepName,
                                                   int workersNumber) {
        int donorDepIndex = -1, destinDepIndex = -1, tempCount = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getName().equalsIgnoreCase(donorDepName)) {
                donorDepIndex = tempCount;
            }
            if (temp.get(i).getName().equalsIgnoreCase(destinationDepName)) {
                destinDepIndex = tempCount;
            }
            tempCount++;
        }
        if ((donorDepIndex!=destinDepIndex)&&(donorDepIndex >= 0)&&(destinDepIndex>=0)&&
                (temp.get(donorDepIndex).getWorkersNumber()>=workersNumber)) {
            temp.get(donorDepIndex).setWorkersNumber(temp.get(donorDepIndex).getWorkersNumber()-workersNumber);
            temp.get(destinDepIndex).setWorkersNumber(temp.get(destinDepIndex).getWorkersNumber()+workersNumber);
            return temp;
        }
        return temp;
    }

}

