package com.epam.task3.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class ClassLikeEnum<T> {

    private String name;
    private T argument;
    private static int ordinalIndex;
    private final static Map<ClassLikeEnum, Integer> demoEnum = new LinkedHashMap<>();

    public ClassLikeEnum() {
        this.name = null;
        this.argument = null;
    }

    public ClassLikeEnum(String name, T argument) {
        this.name = name;
        this.argument = argument;

        demoEnum.put(this, ordinalIndex);
        ordinalIndex++;
    }

    public final String name() {
        return name;

    }

    public final int ordinal() {
        return demoEnum.get(this);
    }

    public final T getArgument() {
        return argument;
    }


    public final static Map<ClassLikeEnum, Integer> valueOf(String name) {
        Map<ClassLikeEnum, Integer> temp = new HashMap<>();
        for (Map.Entry<ClassLikeEnum, Integer> likeEnum : demoEnum.entrySet()) {
            ClassLikeEnum classLikeEnum = likeEnum.getKey();
            Integer arg = likeEnum.getValue();
            if (classLikeEnum.name().equals(name)) {
                temp.put(classLikeEnum, arg);

            }
        }
        return temp;
    }

    public final static Collection<ClassLikeEnum> values() {
        return demoEnum.keySet();
    }

    public static Map<ClassLikeEnum, Integer> getDemoEnum() {
        return demoEnum;
    }


    public String toString() {

        return this.getClass().getSimpleName() + ": " + this.name() +
                ", argument " + this.argument;
    }

}