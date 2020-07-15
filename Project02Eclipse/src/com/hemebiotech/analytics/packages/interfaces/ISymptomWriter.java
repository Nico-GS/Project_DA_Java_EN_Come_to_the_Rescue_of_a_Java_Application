package com.hemebiotech.analytics.packages.interfaces;

import com.hemebiotech.analytics.packages.exceptions.WriteError;

import java.util.Map;

public interface ISymptomWriter {


    Map<String, Long> write () throws WriteError;

}
