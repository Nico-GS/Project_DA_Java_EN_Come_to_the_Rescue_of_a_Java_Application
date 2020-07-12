package com.hemebiotech.analytics.Test.read;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;
import java.util.*;

public class FileToTreeMap {

    // Read file
    public Map<String, Integer> readFile ()  {

        ReadSymptomDataFromFile list = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");
        Map<String, Integer> listSort = new TreeMap<>();
        List<String> test = list.getSymptoms();

        for (String word : test) {
            if (!listSort.containsKey(word)) {
                listSort.put(word, 1);
            } else {
                listSort.put(word, listSort.get(word) + 1);
            }
        }
        return listSort;

    }


}
