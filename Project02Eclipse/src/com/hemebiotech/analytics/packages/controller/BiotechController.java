package com.hemebiotech.analytics.packages.controller;

import com.hemebiotech.analytics.packages.exceptions.ExceptionError;
import com.hemebiotech.analytics.packages.interfaces.ISymptomReader;
import com.hemebiotech.analytics.packages.map.ListToTree;
import com.hemebiotech.analytics.packages.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.packages.write.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BiotechController {

    public void run () throws ExceptionError {

        ISymptomReader symptom = new ReadSymptomDataFromFile ("Project02Eclipse\\symptoms.txt");
        List<String> list = new ArrayList<> (symptom.getSymptoms ());

        ListToTree toTree = new ListToTree ();
        Map<String, Long> list2 = toTree.sortLine (list);
        System.out.println (toTree.sortLine (list));

        WriteFile write = new WriteFile ();
        write.write (list2);
    }

}
