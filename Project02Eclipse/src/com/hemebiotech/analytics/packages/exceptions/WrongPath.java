package com.hemebiotech.analytics.packages.exceptions;

public class WrongPath extends ExceptionError {

    public WrongPath () {
        super ();
        System.out.println ("Erreur lecture fichier : vérifier le chemin");
    }
}
