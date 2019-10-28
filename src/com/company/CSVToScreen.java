package com.company;

import java.io.*;

public class CSVToScreen {

    File file = new File("/home/dam2a/13.csv");
    String[] datos = new String[5];
    void show() throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        boolean c=false;
        for (int i = 0; !c; i++ ){
            String line = br.readLine();
            if (line==null){
                c=true;
            }else if (i!=0) {
                String[] strings = line.split(",");
                for (int j = 0; j < strings.length; j++) {
                    datos[j] = strings[j];

                }
                System.out.println("Persona "+i);
                System.out.println("firtname: "+datos[0]);
                System.out.println("lastname: "+datos[1]);
                System.out.println("username: "+datos[2]);
                System.out.println("password: "+datos[3]);
                System.out.println("email: "+datos[4]);
                System.out.println();
            }
        }
    }
}
