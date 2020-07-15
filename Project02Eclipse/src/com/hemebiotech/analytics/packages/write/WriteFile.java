package com.hemebiotech.analytics.packages.write;

import com.hemebiotech.analytics.packages.exceptions.ExceptionError;
import com.hemebiotech.analytics.packages.exceptions.WriteError;
import com.hemebiotech.analytics.packages.interfaces.ISymptomWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFile implements ISymptomWriter {


    /**
     * Méthode write instancie une TreeMap avec les symptomes par ordre
     * alphabétique et nombres d'occurrences
     *
     * @void write()
     */

    @Override
    public Map<String, Long> write () {
        return null;
    }

    public void write (Map<String, Long> list2) throws ExceptionError {

        try {
            FileWriter writer = new FileWriter ("results.out"); // en paramètre
            try (BufferedWriter out = new BufferedWriter (writer)) {
                for (Map.Entry<String, Long> entry : list2.entrySet ()) {
                    out.write (entry.getKey () + " = " + entry.getValue () + "\n");
                    out.flush ();
                }
            }
        } catch (IOException e) {
            throw new ExceptionError ();
        }

    }


}
