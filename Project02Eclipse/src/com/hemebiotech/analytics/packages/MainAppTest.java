package com.hemebiotech.analytics.packages;

import com.hemebiotech.analytics.packages.controller.BiotechController;
import com.hemebiotech.analytics.packages.exceptions.FileError;
import com.hemebiotech.analytics.packages.exceptions.WriteError;


public class MainAppTest {

    public static void main (String[] args) throws FileError, WriteError {

        BiotechController app = new BiotechController ();
        app.run ();

    }
}
