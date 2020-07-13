package com.hemebiotech.analytics.packages.exceptions;

public class WriteError extends Exception {

    public WriteError (String s) {
        super(s);
        System.out.println ("Erreur d'écriture" + s);
    }

}

