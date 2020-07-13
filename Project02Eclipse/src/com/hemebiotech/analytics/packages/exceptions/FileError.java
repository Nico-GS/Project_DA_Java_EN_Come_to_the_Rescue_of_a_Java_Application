package com.hemebiotech.analytics.packages.exceptions;

public class FileError extends Exception {

    // renommer

    public FileError () {
        super ("Erreur de lecture du fichier : vérifier le chemin");
    }

    public FileError (String message) {
        super (message);
    }

    public FileError (String message, Throwable cause) {
        super (message, cause);
    }

    public FileError (Throwable cause) {
        super (cause);
    }
}
