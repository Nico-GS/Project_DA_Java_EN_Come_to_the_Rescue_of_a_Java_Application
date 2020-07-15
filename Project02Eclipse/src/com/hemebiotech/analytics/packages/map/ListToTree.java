package com.hemebiotech.analytics.packages.map;


import com.hemebiotech.analytics.packages.interfaces.ISymptomWriter;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToTree implements ISymptomWriter {

    /**
     * Méthode readFile instancie ReadSymptomDataFromFile, crée une TreeMap vide +
     * une list de "symptom" et converti tout ça en TreeMap avec la liste des symptomes
     * et leurs nombres d'occurrences
     *
     * @return symptomSort
     */

    public Map<String, Long> sortLine (List<String> list) {

        return list.stream ().collect (Collectors.groupingBy
                (Function.identity (), TreeMap::new, Collectors.counting ()));
    }
}
