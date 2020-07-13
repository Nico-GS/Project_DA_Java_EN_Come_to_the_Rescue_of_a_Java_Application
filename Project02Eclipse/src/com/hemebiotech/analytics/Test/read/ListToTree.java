package com.hemebiotech.analytics.Test.read;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;

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

    public Map<String, Integer> readFile ()  {

        ReadSymptomDataFromFile symptom = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");

        Map<String, Integer> symptomSort;
        List list = new ArrayList (symptom.getSymptoms ());
        symptomSort = (Map<String, Integer>)
                list.stream().collect(Collectors.groupingBy(Function.identity (), Collectors.counting()));

        

        return symptomSort;
    }
}
