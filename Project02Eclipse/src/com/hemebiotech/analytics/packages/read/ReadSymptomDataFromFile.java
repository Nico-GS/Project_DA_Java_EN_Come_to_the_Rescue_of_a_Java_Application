package com.hemebiotech.analytics.packages.read;

import com.hemebiotech.analytics.packages.exceptions.WrongPath;
import com.hemebiotech.analytics.packages.interfaces.ISymptomReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * Instantiates a new Read symptom data from file.
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms () throws WrongPath {
        List<String> result = new ArrayList<> ();

        if (filepath != null) {

            try (BufferedReader reader = new BufferedReader (new FileReader (filepath))) {
                String line = reader.readLine ();

                while (line != null) {
                    result.add (line);
                    line = reader.readLine ();
                }
            } catch (IOException e) {
                throw new WrongPath ("Erreur de lecture fichier", e);
            }
        }
        return result;
    }
}
