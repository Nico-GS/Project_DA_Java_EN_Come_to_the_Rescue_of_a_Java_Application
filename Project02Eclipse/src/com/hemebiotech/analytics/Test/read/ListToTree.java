package com.hemebiotech.analytics.Test.read;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToTree {

    // Read file
    public Map<String, Integer> readFile ()  {

        ReadSymptomDataFromFile symptom = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");
        Map<String, Integer> symptomSort = new TreeMap();
        List maListe2 = new ArrayList (symptom.getSymptoms ());
        symptomSort = (Map<String, Integer>)
                maListe2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return symptomSort;

    }


}
