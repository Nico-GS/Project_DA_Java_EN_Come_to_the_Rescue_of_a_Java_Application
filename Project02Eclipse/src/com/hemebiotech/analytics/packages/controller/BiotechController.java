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

    public void run () throws ExceptionError {

        ISymptomReader symptomFromFile = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");
        List<String> listSymptom = new ArrayList<> (symptomFromFile.getSymptoms ());

        ISymptomWriter symptomToMap = new SymptomMap ();
        Map<String, Long> mapSymptom = symptomToMap.toMap (listSymptom);
        System.out.println (symptomToMap.toMap (listSymptom));

        WriteFile write = new WriteFile ("results.out");
        write.write (mapSymptom);
    }

}
