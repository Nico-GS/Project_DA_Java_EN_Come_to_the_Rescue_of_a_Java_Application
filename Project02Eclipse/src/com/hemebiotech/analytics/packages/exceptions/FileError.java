package com.hemebiotech.analytics.packages.exceptions;

public class FileError extends Exception {

    public FileError (String s) {
        super(s);
        System.out.println ("Erreur de lecture du fichier : vérifier le chemin" + s);
    }

}
