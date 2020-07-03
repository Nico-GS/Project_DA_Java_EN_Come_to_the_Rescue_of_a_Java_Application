package com.hemebiotech.analytics.Test.Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReadFile {

    // Read file
    File file = new File ("Project02Eclipse\\symptoms.txt");

    {
        try {
            Scanner scan = new Scanner (file);
            Map<String, Integer> wordCount = new TreeMap<> ();

            while (scan.hasNext ()){
                String word = scan.next ();
                if (!wordCount.containsKey (word)){
                    wordCount.put (word, 1);
                } else {
                    wordCount.put (word, wordCount.get (word) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println ("Fichier introuvable");
        }
    }

}
