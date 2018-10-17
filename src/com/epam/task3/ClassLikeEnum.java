package com.epam.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ClassLikeEnum {
    private int index = 0;

    protected final Map<String, Integer> demoEnum = new LinkedHashMap<>();

    public ClassLikeEnum(String... stringsArray) {
        for (String key : stringsArray) {
            demoEnum.put(key, index);
            index++;
        }

    }
    public final String name (String key) {
        if (demoEnum.containsKey(key)) return key.toString();
        return null;
    }

    public final int ordinal(String key) {
        return demoEnum.get(key);
    }
}