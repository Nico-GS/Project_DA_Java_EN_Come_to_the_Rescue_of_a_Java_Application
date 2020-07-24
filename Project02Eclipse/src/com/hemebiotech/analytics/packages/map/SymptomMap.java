package com.hemebiotech.analytics.packages.map;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymptomMap {

    /**
     * Méthode toMap instancie ReadSymptomDataFromFile, crée une TreeMap vide +
     * une list de "symptom" et converti tout ça en TreeMap avec la liste des symptômes
     * et leurs nombres d'occurrences
     *
     * @return toMap
     */

    public Map<String, Long> toMap (List<String> list) {

        return list.stream ().collect (Collectors.groupingBy
                (Function.identity (), TreeMap::new, Collectors.counting ()));
    }
}
