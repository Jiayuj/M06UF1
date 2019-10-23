package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharsFileToScreen1 {
    void busca() throws FileNotFoundException {
        File file = new File("/home/dam2a/alphabeta.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String a = scanner.nextLine();
            char s = a.charAt(0);
            int d = s -32;
            System.out.print(a + " ");
            System.out.println(s = (char) d);
        }
        scanner.close();
    }
}
