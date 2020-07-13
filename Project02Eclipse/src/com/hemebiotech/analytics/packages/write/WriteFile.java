package com.hemebiotech.analytics.packages.write;

import com.hemebiotech.analytics.packages.map.ListToTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFile {

    public void write () throws IOException {

        try {
            ListToTree list = new ListToTree ();
            Map<String, Integer> list2 = list.readFile ();
            FileWriter writer = new FileWriter ("results.out");
            BufferedWriter out = new BufferedWriter (writer);
            for (Map.Entry<String, Integer> entry : list2.entrySet ()) {
                out.write (entry.getKey () + " = " + entry.getValue () + " \n");
                out.flush ();

            }
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
