package com.epam.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ClassLikeEnum {
    private int index;

    protected final static Map<String, Integer> demoEnum = new LinkedHashMap<>();

    ClassLikeEnum(String... stringsArray) {
        for (String key : stringsArray) {
            demoEnum.put(key, index);
            index++;
        }

    }
    public final static String name (String key) {
        if (demoEnum.containsKey(key)) return key.toString();
        return null;
    }

    public final static int ordinal(String key) {
        if (demoEnum.containsKey(key)) return demoEnum.get(key);
        return -1;
    }
    public final static Map<String, Integer> valuesOf() {
         return demoEnum;
    }
}