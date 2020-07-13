package com.hemebiotech.analytics.packages.exceptions;

public class FileError extends Exception {

    public FileError () {
        super("Erreur de lecture du fichier : vérifier le chemin");
    }

    public FileError (String message) {
        super(message);
    }

}
