package com.hemebiotech.analytics.packages;

import com.hemebiotech.analytics.packages.map.ListToTree;
import com.hemebiotech.analytics.packages.write.WriteFile;

import java.io.IOException;

public class MainAppTest {

    public static void main (String[] args) throws IOException {

        ListToTree test = new ListToTree ();
        System.out.println (test.readFile ());
        WriteFile write = new WriteFile ();
        write.write ();

    }
}
