package com.epam.task3;

public class EnumDemoRunner {

    public static void main(String[] args) {

        DemoEnum demoEnum = DemoEnum.getInstance("JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY");

        System.out.println(demoEnum);
        System.out.println(DemoEnum.values());

        System.out.println(DemoEnum.valueOf("APRIL"));
        System.out.println(DemoEnum.valueOf("aPRIL"));

        System.out.println(DemoEnum.ordinal("MARCH"));
        System.out.println(DemoEnum.ordinal("MAY"));
        System.out.println(DemoEnum.ordinal("mAY"));

        System.out.println(DemoEnum.name("MAY"));
        System.out.println(DemoEnum.name("mAY"));


    }
}


//OUTPUT:
//        DemoEnum: Name=JANUARY, ordinal=0; Name=FEBRUARY, ordinal=1; Name=MARCH, ordinal=2; Name=APRIL, ordinal=3; Name=MAY, ordinal=4;
//        [JANUARY, FEBRUARY, MARCH, APRIL, MAY]
//        {APRIL=3}
//        null
//        2
//        4
//        -1
//        MAY
//        null
