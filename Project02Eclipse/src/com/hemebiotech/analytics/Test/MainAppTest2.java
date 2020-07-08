package com.hemebiotech.analytics.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MainAppTest2 {

    public static void main (String[] args) {

        try {
            File file = new File ("Project02Eclipse\\symptoms.txt");
            Scanner scan = new Scanner (file);

            Map<String, Integer> wordCount = new TreeMap<> ();
            while (scan.hasNext ()) {
                String word = scan.next ();
                if (!wordCount.containsKey (word)) {
                    wordCount.put (word, 1);
                } else {
                    wordCount.put (word, wordCount.get (word) + 1);
                }
            }

            // Result in console & Write file output
            FileWriter writer = new FileWriter ("resultat2.out");
            BufferedWriter out = new BufferedWriter (writer);
            for (Map.Entry<String, Integer> entry : wordCount.entrySet ()) {
                System.out.println ("Valeur: " + entry.getKey () + "| Occurence: " + entry.getValue ());
                out.write (entry.getKey () + " = " + entry.getValue () + " \n");
                out.flush (); // Force write
            }

        } catch (IOException e) {
            System.out.println ("Fichier introuvable");
        }

    }
}
