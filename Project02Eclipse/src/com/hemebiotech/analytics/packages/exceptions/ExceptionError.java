package com.hemebiotech.analytics.packages.exceptions;

public class ExceptionError extends Exception {

    public ExceptionError () {
    }

    public ExceptionError (String message, Throwable cause) {
        super (message, cause);
    }

    public ExceptionError (Throwable cause) {
        super (cause);
    }
}
