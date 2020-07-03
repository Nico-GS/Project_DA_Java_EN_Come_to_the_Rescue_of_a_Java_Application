package com.hemebiotech.analytics.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainAppTest2 {

    public static void main (String[] args) {

        try {
            File file = new File("Project02Eclipse\\symptoms.txt");
            Scanner scan = new Scanner(file);

            Map<String, Integer> wordCount = new TreeMap<>();
            while(scan.hasNext()) {
                String word = scan.next();
                if(!wordCount.containsKey(word))
                    wordCount.put(word, 1);
                else
                    wordCount.put(word, wordCount.get(word) + 1);
            }

            // Resultats
            for(String word : wordCount.keySet())
                System.out.println(word + " " + wordCount.get(word));
            System.out.println(wordCount.size());
        }
        catch(IOException e) {
            System.out.println("Fichier introuvable");
        }

    }
}
