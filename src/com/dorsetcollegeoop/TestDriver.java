package com.dorsetcollegeoop;

public class TestDriver {

    public static void run() {

    WriteToFile wf = new WriteToFile();

      // wf.CreateTextFile();

        wf.CreateTextFile("capitalcities.txt");

      ReadFromFile rf = new ReadFromFile();

       /// rf.ReadTextFile();

        rf.ReadTextFile("capitalcities.txt");


    }
}
