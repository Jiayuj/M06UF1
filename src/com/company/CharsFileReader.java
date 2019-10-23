package com.company;

import java.io.*;

public class CharsFileReader {

    void crear() throws IOException {
        File abc = new File("/home/dam2a/alphabeta.txt");
        FileReader fileReader = new FileReader(abc);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int c = 0;
        while ((c = bufferedReader.read()) != -1){
            char character = (char) c;
            System.out.println(character);
        }
        bufferedReader.close();
        fileReader.close();
    }
}

