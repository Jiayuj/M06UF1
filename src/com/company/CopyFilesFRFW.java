package com.company;

import java.io.*;
import java.util.Scanner;

public class CopyFilesFRFW {

    void capy() throws IOException {

        File file = new File("/home/dam2a/copy.txt");

        FileReader fr = new FileReader("/home/dam2a/treballadors.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        int c=0;
        while ((c = br.read()) != -1){
            bw.write(c);

        }
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
