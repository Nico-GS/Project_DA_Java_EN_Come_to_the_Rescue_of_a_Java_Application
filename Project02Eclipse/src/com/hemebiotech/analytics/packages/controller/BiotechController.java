package com.hemebiotech.analytics.packages.controller;

import com.hemebiotech.analytics.packages.exceptions.ExceptionError;
import com.hemebiotech.analytics.packages.interfaces.ISymptomReader;
import com.hemebiotech.analytics.packages.interfaces.ISymptomWriter;
import com.hemebiotech.analytics.packages.map.ListToTree;
import com.hemebiotech.analytics.packages.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.packages.write.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BiotechController {

    public void run () throws ExceptionError {

        ISymptomReader symptomFromFile = new ReadSymptomDataFromFile ("Project02Eclipse\\symptms.txt");
        List<String> listSymptom = new ArrayList<> (symptomFromFile.getSymptoms ());

        ISymptomWriter symptomToMap =  new ListToTree ();
        Map<String, Long> mapSymptom = symptomToMap.sortLine (listSymptom);
        System.out.println (symptomToMap.sortLine (listSymptom));

        WriteFile write = new WriteFile ();
        write.write (mapSymptom);
    }

}
