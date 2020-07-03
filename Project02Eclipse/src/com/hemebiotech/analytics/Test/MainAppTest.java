package com.hemebiotech.analytics.Test;

import com.hemebiotech.analytics.Test.read.FileReader;
import java.io.FileNotFoundException;

public class MainAppTest {

    public static void main (String[] args) throws FileNotFoundException {

        FileReader test = new FileReader ();
        test.readFile ();

    }
}
