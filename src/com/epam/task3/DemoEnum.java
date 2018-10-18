package com.epam.task3;

public class DemoEnum extends ClassLikeEnum {
    private static DemoEnum instance;

    private DemoEnum(String ... args) {
        super(args);
    }
    public static DemoEnum getInstance(String ... args) {
        if (instance == null) {
            instance = new DemoEnum(args);
        }
        return instance;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

