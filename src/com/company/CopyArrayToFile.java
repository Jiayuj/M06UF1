package com.company;

import java.io.*;

public class CopyArrayToFile {

    String[] strings;
    File file;

    public CopyArrayToFile(File file,String[] strings) {
        this.file = file;
        this.strings = strings;
    }

    void copy() throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < strings.length ; i++) {
            bw.write(strings[i]+"\n");
        }
        bw.close();
        fw.close();
    }
    void show() throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        boolean c = false;
        while (!c){
            String line = br.readLine();
            if (line==null){
                c=true;
            }else {
                System.out.println(line);
            }
        }
        br.close();
        fr.close();
    }
}
