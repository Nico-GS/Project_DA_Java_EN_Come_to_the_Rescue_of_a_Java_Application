package com.hemebiotech.analytics;

import com.hemebiotech.analytics.packages.interfaces.ISymptomReader;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymptomReader implements ISymptomReader {

    private final Path path;

    public SymptomReader(String filePath) {
        path = Paths.get(filePath);
    }

    @Override
    public List<String> getSymptoms(){
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public Map<String, Long> getSymptomsCount(){
        try {
            return Files.lines(path).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void main(String[] args) {
        SymptomReader reader = new SymptomReader("Project02Eclipse\\symptoms.txt");
        System.out.println(reader.getSymptoms());
        System.out.println(reader.getSymptomsCount());
    }
}