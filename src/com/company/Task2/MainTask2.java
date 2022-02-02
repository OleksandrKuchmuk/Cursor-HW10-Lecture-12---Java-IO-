package com.company.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTask2 {

    public static void main(String[] args) throws IOException {
        FileReader readFromFile = new FileReader(args[0]);
        FileWriter writeToFile = new FileWriter(args[1]);

        try {
            int i;
            while ((i = readFromFile.read()) != -1) {
                writeToFile.write(i);
            }

            System.out.println("File reading and writing both done");

        } catch (IOException e) {
            System.err.println(e.getMessage());

        } finally {
            readFromFile.close();
            writeToFile.close();
       }
    }
}
