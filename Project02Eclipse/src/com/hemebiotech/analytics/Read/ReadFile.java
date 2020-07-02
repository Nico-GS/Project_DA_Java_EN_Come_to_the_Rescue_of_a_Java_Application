package com.hemebiotech.analytics.Read;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    // Read file
    {
        try {
            FileInputStream file = new FileInputStream ("Project02Eclipse\\symptoms.txt");
            Scanner scanner = new Scanner (file);

            while (scanner.hasNextLine ()){
                System.out.println (scanner.nextLine ());
            }
            scanner.close ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
    }
}
