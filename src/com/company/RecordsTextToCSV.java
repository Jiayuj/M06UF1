package com.company;

import java.io.*;

public class RecordsTextToCSV {

    String [] nom = new String[3];
    String [] cognoms = new String[3];
    String [] edat = new  String[3];
    File file = new File("/home/dam2a/12.txt");
    File file1 = new File("/home/dam2a/121.csv");

    void llegeixFitxer() throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        boolean c=false;
        int q=0;
        for (int i = 0; !c; i++ ){
            String line = br.readLine();
            if (i == 0 ){
                nom[q]= line;
            }else if (i==1){
                cognoms[q] = line;
            }else if (i==2){
                edat[q]= line;
            }else if (i==3){
                i=-1;
                q++;
            }
            if (line==null){
                c=true;
            }
        }
        br.close();
        fr.close();
    }
    void mostraPerPantalla() throws IOException {
        FileReader fr = new FileReader(file1);
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

    }
    void escriuSortidaCSV() throws IOException {

        FileWriter fw = new FileWriter(file1);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("nom, cognoms, edat"+'\n');
        for (int i = 0; i < nom.length ; i++) {
            bw.write(nom[i]+", "+cognoms[i]+", "+edat[i]+'\n');
        }

        bw.close();
        fw.close();
    }
}
