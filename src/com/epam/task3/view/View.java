package com.epam.task3.view;

import com.epam.task3.model.ClassLikeEnum;
import com.epam.task3.model.DemoEnum;

import java.util.Map;

public class View {

    public void printValueOf(Map<ClassLikeEnum, Integer> mapValueOf) {
        if (mapValueOf.size()>0) {
        System.out.println(mapValueOf.keySet() + ", ordinal = " + mapValueOf.values());
        } else System.out.println("Enum with this name not found" );

    }

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printEnumDemo() {

        printMessage("All values of DemoEnum: \n");
        System.out.println(DemoEnum.values().toString());

        printMessage("Value of 'APRIL': ");
        printValueOf(DemoEnum.valueOf("APRIL"));
        printMessage("Value of 'aPRIL': ");
        printValueOf(DemoEnum.valueOf("aPRIL"));
        System.out.println(DemoEnum.MAY);
        System.out.println(DemoEnum.FEBRUARY);
        System.out.println(DemoEnum.MARCH+ ", ordinal is " + DemoEnum.MARCH.ordinal());


    }
}
