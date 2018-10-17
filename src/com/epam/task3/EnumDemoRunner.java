package com.epam.task3;

public class EnumDemoRunner {

    public static void main(String[] args) {
        new DemoEnum(DemoEnum.enumStrings);
        System.out.println(DemoEnum.valuesOf());
        System.out.println(DemoEnum.ordinal("MARCH"));
        System.out.println(DemoEnum.ordinal("MAY"));
        System.out.println(DemoEnum.ordinal("mAY"));
        System.out.println(DemoEnum.name("MAY"));
        System.out.println(DemoEnum.name("mAY"));


    }
}

//OUTPUT:
//        {JANUARY=0, FEBRUARY=1, MARCH=2, APRIL=3, MAY=4}
//        2
//        4
//        -1
//        MAY
//        null

