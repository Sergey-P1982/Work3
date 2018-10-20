package com.epam.task3.controller;

import com.epam.task3.model.DemoEnum;
import com.epam.task3.view.View;

public class Controller {
    View view = new View();

    public void run() {
        new DemoEnum();
        view.printEnumDemo();

    }
}
