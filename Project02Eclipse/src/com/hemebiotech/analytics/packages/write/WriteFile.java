package com.hemebiotech.analytics.packages.write;

import com.hemebiotech.analytics.packages.map.ListToTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFile {


    /**
     * Méthode write instancie une TreeMap avec les symptomes par ordre
     * alphabétique et nombres d'occurrences
     * @void write()
     */
    public void write () {

        try {
            ListToTree list = new ListToTree ();
            Map<String, Long> list2 = list.readFile ();
            FileWriter writer = new FileWriter ("results.out");
            try (BufferedWriter out = new BufferedWriter (writer)) {
                for (Map.Entry<String, Long> entry : list2.entrySet ()) {
                    out.write (entry.getKey () + " = " + entry.getValue () + " \n");
                    out.flush ();
                }
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
