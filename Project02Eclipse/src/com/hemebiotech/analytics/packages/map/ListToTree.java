package com.hemebiotech.analytics.packages.map;

import com.hemebiotech.analytics.packages.read.ReadSymptomDataFromFile;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToTree {

    /**
     * Méthode readFile instancie ReadSymptomDataFromFile, crée une TreeMap vide +
     *           une list de "symptom" et converti tout ça en TreeMap avec la liste des symptomes
     *           et leurs nombres d'occurrences
     * @return symptomSort
     */

    public Map<String, Long> readFile ()  {

        ReadSymptomDataFromFile symptom = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");

        Map<String, Long> symptomSort;
        List<String> list = new ArrayList<> (symptom.getSymptoms ());
        symptomSort = (Map<String, Long>)
                list.stream().collect(Collectors.groupingBy
                        (Function.identity (), TreeMap::new, Collectors.counting ()));

        return symptomSort;
    }
}
