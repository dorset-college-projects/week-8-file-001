package com.dorsetcollegeoop;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteToFile {

    private static Formatter output;

    public void CreateTextFile() {
        OpenFile();
        AddRecords();
        CloseFile();

    }

    public static void OpenFile() {

        try {
            output = new Formatter("superheroes.txt");
        }
        catch (SecurityException securityException) {
            System.out.println("Write permission denied");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error opening file, Terminating");
            System.exit(1);
        }

    }
    public static void AddRecords() {


        for(int i = 0; i < 10; i++) {
            output.format("This is line %d %n",i);
        }

    }
    public static void CloseFile() {

        if (output != null) {
            output.close();
        }


    }


}
