package com.epam.task3;

public class DemoEnum extends ClassLikeEnum {
    public DemoEnum(String... a) {
        super(a);
    }

    public static void main(String[] args) {
        DemoEnum demo = new DemoEnum("MARCH", "APRIL", "MAY");
        System.out.println(demo.demoEnum);
        System.out.println(demo.ordinal("MARCH"));
        System.out.println(demo.ordinal("MAY"));
        System.out.println(demo.name("MAY"));
        System.out.println(demo.name("mAY"));

    }
}

//OUTPUT:
//{MARCH=0, APRIL=1, MAY=2}
//        0
//        2
//        MAY
//        null

