package com.hemebiotech.analytics.Test;

import com.hemebiotech.analytics.Test.read.FileToTreeMap;

import java.io.IOException;

public class MainAppTest {

    public static void main (String[] args) {

        FileToTreeMap test = new FileToTreeMap ();
        System.out.println (test.readFile ());

    }
}
