package com.epam.task2.entities;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    public List<Department> shopDepartments = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }


    public class Department {


        private String name;
        private String productOrService;
        private int workersNumber;
        private int locationFloor;
        private double area;

        public Department(String name, String productOrService, int workersNumber, int locationFloor, double area) {
            this.name = name;
            this.productOrService = productOrService;
            this.workersNumber = workersNumber;
            this.locationFloor = locationFloor;
            this.area = area;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProductOrService() {
            return productOrService;
        }

        public void setProductOrService(String productOrService) {
            this.productOrService = productOrService;
        }

        public int getWorkersNumber() {
            return workersNumber;
        }

        public void setWorkersNumber(int workersNumber) {
            this.workersNumber = workersNumber;
        }

        public int getLocationFloor() {
            return locationFloor;
        }

        public void setLocationFloor(int locationFloor) {
            this.locationFloor = locationFloor;
        }
        public double getArea() {
            return locationFloor;
        }

        public void setArea(double area) {
            this.area = area;
        }
        @Override
        public String toString() {
            return "Department{" + name + '\'' +
                    ", productOrService='" + productOrService + '\'' +
                    ", workersNumber=" + workersNumber +
                    ", locationFloor=" + locationFloor +
                    ", area=" + area +
                    '}';
        }
    }

    @Override
    public String toString() {
        return '\''  + this.name + '\'';
    }
}
