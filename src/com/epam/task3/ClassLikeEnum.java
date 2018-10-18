package com.epam.task3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class ClassLikeEnum {

    private static int ordinalIndex;

    private final static Map<String, Integer> demoEnum = new LinkedHashMap<>();

    protected ClassLikeEnum(String... stringsArray) {
        for (String name : stringsArray) {
            demoEnum.put(name, ordinalIndex);
            ordinalIndex++;
        }
        ordinalIndex = 0;

    }

    public final static String name(String name) {
        if (demoEnum.containsKey(name)) return name.toString();
        return null;
    }

    public final static int ordinal(String name) {
        if (demoEnum.containsKey(name)) return demoEnum.get(name);
        return -1;
    }

    public final static Map<String, Integer> valueOf(String name) {
        if (demoEnum.containsKey(name)) {
            Map<String, Integer> valueOfName = new LinkedHashMap<>();
            valueOfName.put(name, demoEnum.get(name));
            return valueOfName;
        }
        return null;
    }

    public final static Set<String> values() {
        return demoEnum.keySet();
    }


    public String toString() {
        String enumString = this.getClass().getSimpleName() + ": ";
        for (Map.Entry<String, Integer> likeEnum : demoEnum.entrySet()) {
            enumString += "Name=" + likeEnum.getKey() + ", ordinal=" + likeEnum.getValue() + "; ";
        }
        return enumString;
    }

}