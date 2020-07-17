package com.hemebiotech.analytics.packages.interfaces;

import com.hemebiotech.analytics.packages.exceptions.WriteError;

import java.util.List;
import java.util.Map;

public interface ISymptomWriter {
    /**
     * @param
     * @return Ecriture de la map dans un fichier de sortie
     */
    void write (Map<String, Long> list) throws WriteError;
}
