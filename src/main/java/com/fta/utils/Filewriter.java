package com.fta.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class Filewriter {

   private Filewriter(){};

    public static void writeintofile(String data) {

        File filename= new File(System.getProperty("user.dir") + "/src/test/resources/wordfile/outputfile.txt");
        BufferedWriter fileBufferWriter= null;
        try {
            fileBufferWriter = new BufferedWriter(new FileWriter(filename));
            fileBufferWriter.write(data);
            fileBufferWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
