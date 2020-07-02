package com.hemebiotech.analytics;


import java.io.*;
import java.util.*;


public class MainAppWithReadSymptom {

    public static void main (String[] args) {

        ReadSymptomDataFromFile test = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");

        try {

            List<String> liste = test.GetSymptoms ();
            Collections.sort (liste);
            System.out.println (liste);

            TreeSet<String> occurence = new TreeSet<> (liste);
            for (String string : occurence) {
                System.out.println (string + ": " + Collections.frequency (liste, string));

                FileWriter writer = new FileWriter ("resultat.out");
                for (String s : occurence){
                    writer.write (Collections.frequency (liste, s) + " : " + s);
                }
                writer.close ();
            }
        } catch (Exception e){
            e.printStackTrace ();
        }

    }
}