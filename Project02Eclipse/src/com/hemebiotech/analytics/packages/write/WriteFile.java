package com.hemebiotech.analytics.packages.write;

import com.hemebiotech.analytics.packages.exceptions.WriteError;
import com.hemebiotech.analytics.packages.interfaces.ISymptomWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class WriteFile implements ISymptomWriter {

    private final String pathToWrite;

    /**
     * Instantiates a new Write file.
     *
     * @param pathToWrite path and name for the output file
     */
    public WriteFile (String pathToWrite) {
        this.pathToWrite = pathToWrite;
    }


    @Override
    public void write (Map<String, Long> list2) throws WriteError {

        try (FileWriter writer = new FileWriter (pathToWrite);
             BufferedWriter out = new BufferedWriter (writer)) {
            for (Map.Entry<String, Long> entry : list2.entrySet ()) {
                out.write (entry.getKey () + " = " + entry.getValue () + "\n");
                out.flush ();
            }
        } catch (IOException e) {
            throw new WriteError ("Erreur écriture fichier", e);
        }
    }
}
