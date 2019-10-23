package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CharsToFile1 {

    void escriu() throws FileNotFoundException {
        File file = new File("/home/dam2a/alphabeta.txt");
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 97 ;i < 123;i++) {
            char c = (char) i;
            printWriter.println(c);
        }

        printWriter.close();
        System.out.println("The file has been created.");
    }
}
