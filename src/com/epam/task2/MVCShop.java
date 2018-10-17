package com.epam.task2;

import com.epam.task2.controller.Controller;

public class MVCShop {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.run();

    }
}
//OUTPUT:
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        1
//        Enter the name of the new department:
//        A
//        Enter a type of products or services of department:
//        sales
//        Enter a number of workers:
//        10
//        Enter a number of the floor:
//        1
//        Enter the department area:
//        100
//        You have added a new department in the 'Universal Store'
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Back to menu? Y/N
//        y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        1
//        Enter the name of the new department:
//        B
//        Enter a type of products or services of department:
//        finance
//        Enter a number of workers:
//        3
//        Enter a number of the floor:
//
//        2
//        Enter the department area:
//        250
//        You have added a new department in the 'Universal Store'
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Department{B', productOrService='finance', workersNumber=3, locationFloor=2, area=250.0}
//        Back to menu? Y/N
//        y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        1
//        Enter the name of the new department:
//        C
//        Enter a type of products or services of department:
//        storage
//        Enter a number of workers:
//        5
//        Enter a number of the floor:
//        1
//        Enter the department area:
//        300
//        You have added a new department in the 'Universal Store'
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Department{B', productOrService='finance', workersNumber=3, locationFloor=2, area=250.0}
//        Department{C', productOrService='storage', workersNumber=5, locationFloor=1, area=300.0}
//        Back to menu? Y/N
//        y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        1
//        Enter the name of the new department:
//        D
//        Enter a type of products or services of department:
//        cleaning
//        Enter a number of workers:
//        3
//        Enter a number of the floor:
//        3
//        Enter the department area:
//        50
//        You have added a new department in the 'Universal Store'
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Department{B', productOrService='finance', workersNumber=3, locationFloor=2, area=250.0}
//        Department{C', productOrService='storage', workersNumber=5, locationFloor=1, area=300.0}
//        Department{D', productOrService='cleaning', workersNumber=3, locationFloor=3, area=50.0}
//        Back to menu? Y/N
//        y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        2
//        Identify the name of department to delete from the list of departments:
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Department{B', productOrService='finance', workersNumber=3, locationFloor=2, area=250.0}
//        Department{C', productOrService='storage', workersNumber=5, locationFloor=1, area=300.0}
//        Department{D', productOrService='cleaning', workersNumber=3, locationFloor=3, area=50.0}
//        Enter the department name to delete:
//        B
//        The department with the name 'B' was deleted
//        New list of departments:
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Department{C', productOrService='storage', workersNumber=5, locationFloor=1, area=300.0}
//        Department{D', productOrService='cleaning', workersNumber=3, locationFloor=3, area=50.0}
//        Back to menu? Y/N
//        y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        4
//        Sorting departments by name:
//        Department{D', productOrService='cleaning', workersNumber=3, locationFloor=3, area=50.0}
//        Department{C', productOrService='storage', workersNumber=5, locationFloor=1, area=300.0}
//        Department{A', productOrService='sales', workersNumber=10, locationFloor=1, area=100.0}
//        Back to menu? Y/N
//        y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        5
//        Enter the name of the donor department:
//        A
//        Enter the name of the destination department:
//        C
//        Enter a number of workers to redirect:
//        5
//        Transfering employees between departments in the 'Universal Store'
//        Department{A', productOrService='sales', workersNumber=5, locationFloor=1, area=100.0}
//        Department{C', productOrService='storage', workersNumber=10, locationFloor=1, area=300.0}
//        Department{D', productOrService='cleaning', workersNumber=3, locationFloor=3, area=50.0}
//        Back to menu? Y/N
//        Y
//        Welcome to the shop menu:
//        1. Create a new department.
//        2. Liquidate a department.
//        3. Print all departments.
//        4. Sorting departments by number of workers
//        5. Redirect some workers between departments
//        6. Exit.
//        Choose a menu item (1-6):
//        5
//        Enter the name of the donor department:
//        D
//        Enter the name of the destination department:
//        C
//        Enter a number of workers to redirect:
//        4
//        Transfering employees between departments in the 'Universal Store'
//        Department{A', productOrService='sales', workersNumber=5, locationFloor=1, area=100.0}
//        Department{C', productOrService='storage', workersNumber=10, locationFloor=1, area=300.0}
//        Department{D', productOrService='cleaning', workersNumber=3, locationFloor=3, area=50.0}
//        Back to menu? Y/N