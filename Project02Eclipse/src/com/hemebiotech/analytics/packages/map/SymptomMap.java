package com.hemebiotech.analytics.packages.map;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymptomMap {


    /**
     * Takes a Map as a parameter and returns it as a TreeMap
     *
     * @param list the list
     * @return TreeMap with symptoms + occurrences, sorted
     */
    public Map<String, Long> toMap (List<String> list) {

        return list.stream ().collect (Collectors.groupingBy
                (Function.identity (), TreeMap::new, Collectors.counting ()));
    }
}
