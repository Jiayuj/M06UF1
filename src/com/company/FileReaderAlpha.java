package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAlpha {

    void llegir () throws IOException {
        FileReader fileReader = new FileReader("/home/dam2a/alphabeta.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        boolean o = false;
        while (!o){
            String a = bufferedReader.readLine();
            if (a==null){
                o=true;
            }else {
                System.out.print(a);
                char s = a.charAt(0);
                int d = s -32;
                System.out.print(s = (char) d);
                System.out.print(" ");
            }
        }
        bufferedReader.close();
        fileReader.close();
    }
}
