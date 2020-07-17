package com.hemebiotech.analytics.packages.interfaces;

import java.util.List;
import java.util.Map;

public interface ISymptomWriter {
    /**
     * @param list Symptom
     * @return Map vide qui contiendra la liste des symptomes avec
     * leurs occurrences
     */
    Map<String, Long> toMap (List<String> list);
}
