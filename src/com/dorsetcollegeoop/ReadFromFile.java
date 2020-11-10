package com.dorsetcollegeoop;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFromFile {

    private static Scanner input;

    private static String fileName = "superheroes.txt";

    public void ReadTextFile() {
        OpenFile();
        ReadRecords();
        CloseFile();
    }

    public void ReadTextFile(String _fileName) {
        fileName = _fileName;
        OpenFile();
        ReadCapitalCities();
        CloseFile();
    }

    private void OpenFile() {

        try {
            input = new Scanner(Paths.get(fileName));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }

    }

    private void ReadRecords() {

        try {
            while (input.hasNext()) {
                System.out.printf("%s %s %s %d%n",input.next(),input.next(),input.next(),input.nextInt());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating");
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating");
            System.exit(1);

        }

    }



    private void ReadCapitalCities() {

        try {
            while (input.hasNext()) {
                System.out.printf("%s %s %n",input.next(),input.next());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating");
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating");
            System.exit(1);

        }

    }

    private void CloseFile() {
        if (input != null) {
            input.close();
        }
    }


}
