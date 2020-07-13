package com.hemebiotech.analytics.Test.write;

import com.hemebiotech.analytics.Test.read.ListToTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFile {

    public void write () throws IOException {

        ListToTree list = new ListToTree ();
        Map<String, Integer> list2 = list.readFile ();
        FileWriter writer = new FileWriter ("results.out");
        BufferedWriter out = new BufferedWriter (writer);
        for (Map.Entry<String, Integer> entry : list2.entrySet ()) {
            out.write (entry.getKey () + " = " + entry.getValue () + " \n");
            out.flush ();

        }
    }
}
