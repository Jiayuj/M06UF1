package com.company;

import java.io.*;

public class ComptaVocals {
    int [] convocal;
    File fileR;
    File fileW;

    public ComptaVocals(File fileR, File fileW) {
        convocal = new int[5];
        this.fileR = fileR;
        this.fileW = fileW;
    }
    void contar () throws IOException {
        FileReader fr = new FileReader(fileR);
        BufferedReader br = new BufferedReader(fr);

        int c = 0;
        while ((c = br.read()) != -1){
            char character = (char) c;
            if (character == 'a' || character == 'A'){
                convocal[0]++;
            }else if (character == 'e' || character == 'E'){
                convocal[1]++;
            }else if (character == 'i'|| character == 'I'){
                convocal[2]++;
            }else if (character == 'o'|| character == 'O'){
                convocal[3]++;
            }else if (character == 'u'|| character == 'U'){
                convocal[4]++;
            }
        }
        FileWriter fw = new FileWriter(fileW);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("a, e, i, o, u"+'\n');
        bw.write(convocal[0]+", "+convocal[1]+", "+convocal[2]+", "+convocal[3]+", "+convocal[4]+'\n');

        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
