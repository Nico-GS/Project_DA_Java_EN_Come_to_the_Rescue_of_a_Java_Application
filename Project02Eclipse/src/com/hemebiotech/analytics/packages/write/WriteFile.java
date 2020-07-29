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
     * @param pathToWrite chemin et nom du fichier de sortie
     */
    public WriteFile (String pathToWrite) {
        this.pathToWrite = pathToWrite;
    }

    /**
     * Méthode write instancie une TreeMap avec les symptomes par ordre
     * alphabétique et nombres d'occurrences
     *
     * @void write()
     */
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
