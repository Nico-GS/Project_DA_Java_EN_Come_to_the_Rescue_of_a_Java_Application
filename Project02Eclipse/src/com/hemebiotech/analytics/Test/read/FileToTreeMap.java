package com.hemebiotech.analytics.Test.read;

import com.hemebiotech.analytics.ReadSymptomDataFromFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileToTreeMap {

    // Read file
    public Map<String, Integer> readFile () {

        ReadSymptomDataFromFile list = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");
        Map<String, Integer> listSort = new TreeMap<> ();
        ArrayList<String> test = new ArrayList<> (list.getSymptoms ());

        Scanner scan = new Scanner (String.valueOf (test));
        while (scan.hasNext ()) {
            String word = scan.next ();
            if (!listSort.containsKey (word)) {
                listSort.put (word, 1);
            } else {
                listSort.put (word, listSort.get (word) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : listSort.entrySet ()) {
            System.out.println ("Valeur: " + entry.getKey () + " Occurence: " + entry.getValue ());
        }


        return listSort;
    }

}
