package com.hemebiotech.analytics.packages.exceptions;

public class WrongPath extends ExceptionError {

    // renommer

    public WrongPath () {
        super();
        System.out.println ("Erreur lecture fichier : vérifier le chemin");
    }
}
