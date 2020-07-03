package com.hemebiotech.analytics.Test.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

    // Read file
    public Map<String, Integer> readFile () throws FileNotFoundException {

        File file = new File ("Project02Eclipse\\symptoms.txt");
        Scanner scan = new Scanner (file);

        Map<String, Integer> wordCount = new TreeMap<> ();
        while (scan.hasNext ()) {
            String word = scan.next ();
            if (!wordCount.containsKey (word)) {
                wordCount.put (word, 1);
            }
            else {
                wordCount.put (word, wordCount.get (word) + 1);
            }
        }
        return wordCount;
     }

}
