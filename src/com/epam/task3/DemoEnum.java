package com.epam.task3;

import java.util.Arrays;

public class DemoEnum extends ClassLikeEnum {

    private static final String[] enumStrings = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY"};

    public DemoEnum() {
        super(enumStrings);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}

