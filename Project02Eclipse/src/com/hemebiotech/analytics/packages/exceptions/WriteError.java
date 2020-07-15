package com.hemebiotech.analytics.packages.exceptions;

public class WriteError extends ExceptionError {

    public WriteError () {
        super();
        System.out.println ("Erreur d'écriture du fichier.");
    }
}

