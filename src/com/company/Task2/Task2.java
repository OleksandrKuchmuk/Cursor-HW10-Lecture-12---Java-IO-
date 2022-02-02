package com.company.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        try {
            FileReader readFromFile = new FileReader(args[0]);
            FileWriter writeToFile = new FileWriter(args[1]);

            int i;
            while ((i = readFromFile.read()) != -1) {
                writeToFile.write(i);
            }

            readFromFile.close();
            writeToFile.close();

            System.out.println("File reading and writing both done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
