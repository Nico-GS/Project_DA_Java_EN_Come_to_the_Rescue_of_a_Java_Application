package com.hemebiotech.analytics.Test.read;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToTree {

    // Read file
    public Map<String, Integer> readFile ()  {

        /**
         * Méthode readFile instancie ReadSymptomDataFromFile, crée une TreeMap vide,
         * une list de l'objets
         * @param
         */

        ReadSymptomDataFromFile symptom = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");
        Map<String, Integer> symptomSort = new TreeMap();
        List list = new ArrayList (symptom.getSymptoms ());
        symptomSort = (Map<String, Integer>)
                list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return symptomSort;

    }


}
