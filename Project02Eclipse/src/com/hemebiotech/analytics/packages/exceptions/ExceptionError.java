package com.hemebiotech.analytics.packages.exceptions;

public class ExceptionError extends Exception {

    // Parent exception of WriteError and WrongPath
    public ExceptionError (String message, Throwable cause) {
        super (message, cause);
    }
}
