package com.epam.task3;

public class DemoEnum extends ClassLikeEnum {

    private static final String[] enumDemo = {"JANUARY","FEBRUARY","MARCH", "APRIL", "MAY"};
    static {
        new DemoEnum(enumDemo);
    }

    private DemoEnum(String... enumDemo) {
        super(enumDemo);
    }
}

