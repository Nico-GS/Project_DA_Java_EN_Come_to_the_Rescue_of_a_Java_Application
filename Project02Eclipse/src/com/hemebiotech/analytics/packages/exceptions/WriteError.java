package com.hemebiotech.analytics.packages.exceptions;

public class WriteError extends ExceptionError {

    public WriteError (String s) {
        super();
        System.out.println ("Erreur d'écriture du fichier.");
    }
}

