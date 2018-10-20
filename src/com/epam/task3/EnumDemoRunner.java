package com.epam.task3;

import com.epam.task3.controller.Controller;

public class EnumDemoRunner {

    public static void main(String[] args) {

        new Controller().run();

    }
}


//OUTPUT:
//        All values of DemoEnum:
//        [ClassLikeEnum: JANUARY, argument 31, ClassLikeEnum: FEBRUARY, argument 28, ClassLikeEnum: MARCH, argument 31,
//                                                   ClassLikeEnum: APRIL, argument 30, ClassLikeEnum: MAY, argument 31]
//        Value of 'APRIL': [ClassLikeEnum: APRIL, argument 30], ordinal = [3]
//        Value of 'aPRIL': Enum with this name not found
//        ClassLikeEnum: MAY, argument 31
//        ClassLikeEnum: FEBRUARY, argument 28
//        ClassLikeEnum: MARCH, argument 31, ordinal is 2
