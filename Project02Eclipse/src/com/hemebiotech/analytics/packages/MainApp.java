package com.hemebiotech.analytics.packages;

import com.hemebiotech.analytics.packages.controller.BiotechController;
import com.hemebiotech.analytics.packages.exceptions.ExceptionError;

public class MainApp {

    public static void main (String[] args) throws ExceptionError {

        BiotechController app = new BiotechController ();
        app.run ();
    }
}
