package com.hemebiotech.analytics.packages.controller;

import com.hemebiotech.analytics.packages.exceptions.ExceptionError;
import com.hemebiotech.analytics.packages.interfaces.ISymptomReader;
import com.hemebiotech.analytics.packages.interfaces.ISymptomWriter;
import com.hemebiotech.analytics.packages.map.SymptomMap;
import com.hemebiotech.analytics.packages.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.packages.write.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BiotechController {

    /**
     *
     * Select the path, create a TreeMap and write a file
     *
     * @throws ExceptionError the exception error
     */
    public void run () throws ExceptionError {

        // Select external file
        ISymptomReader symptomFromFile = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");
        List<String> listSymptom = new ArrayList<> (symptomFromFile.getSymptoms ());

        // Create TreeMap of the external file
        SymptomMap symptomToMap = new SymptomMap ();
        Map<String, Long> mapSymptom = symptomToMap.toMap (listSymptom);
        // Writing console result
        System.out.println (symptomToMap.toMap (listSymptom));

        // Write output file
        ISymptomWriter write = new WriteFile ("results.out");
        write.write (mapSymptom);
    }
}
