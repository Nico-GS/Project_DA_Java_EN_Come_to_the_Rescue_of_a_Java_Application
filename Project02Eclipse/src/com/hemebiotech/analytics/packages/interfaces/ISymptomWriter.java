package com.hemebiotech.analytics.packages.interfaces;

import com.hemebiotech.analytics.packages.exceptions.ExceptionError;

import java.util.Map;

public interface ISymptomWriter {


    Map<String, Long> write () throws ExceptionError;

}
