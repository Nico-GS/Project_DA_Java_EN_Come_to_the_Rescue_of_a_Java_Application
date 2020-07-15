package com.hemebiotech.analytics.packages.exceptions;

public class WriteError extends Exception {

    public WriteError () {
        super ("Erreur lors de l'écriture du fichier");
    }

    public WriteError (String message) {
        super (message);
    }

    public WriteError (String message, Throwable cause) {
        super (message, cause);
    }

    public WriteError (Throwable cause) {
        super (cause);
    }
}

