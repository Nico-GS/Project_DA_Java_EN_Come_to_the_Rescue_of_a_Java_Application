package com.hemebiotech.analytics.packages.exceptions;

public class FileError extends ExceptionError {

    // renommer

    public FileError (String s) {
        super();
        System.out.println ("Erreur lecture fichier : vérifier le chemin");
    }
}
