package com.fta.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class Filereader {

    private Filereader(){};
        public static void readlines(){
            String fileName = System.getProperty("user.dir")+"/src/test/resources/wordfile/results.txt"; // Replace "example.txt" with your file name

            try (BufferedReader br = new BufferedReader(new java.io.FileReader(fileName))) { // Using fully qualified name
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }

}
