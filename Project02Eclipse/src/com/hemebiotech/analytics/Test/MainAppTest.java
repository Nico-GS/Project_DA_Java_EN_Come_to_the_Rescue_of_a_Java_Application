package com.hemebiotech.analytics.Test;

import com.hemebiotech.analytics.Test.read.ListToTree;
import com.hemebiotech.analytics.Test.write.WriteFile;

import java.io.IOException;

public class MainAppTest {

    public static void main (String[] args) throws IOException {

        ListToTree test = new ListToTree ();
        System.out.println (test.readFile ());
        WriteFile write = new WriteFile ();
        write.write ();


    }
}
