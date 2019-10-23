package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NumsToFile1 {

    void escriu() throws FileNotFoundException {
        File file = new File("/home/dam2a/Num11001200.txt");
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 1100; i < 1201; i++) {
            printWriter.println(i);
        }
        printWriter.close();
        System.out.println("The file has been created.");
    }
}
