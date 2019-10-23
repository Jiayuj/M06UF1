package com.company;

import java.io.File;
import java.io.IOException;

public class CreaDir {

    void crea() throws IOException {
        File file = null;
        String[] strings = new String[] {"/home/dam2a/Dir","/home/dam2a/Dir/dir"};
        for (String s:strings){
            file = new File(s);
            if (file.exists()) {
                System.out.println(file.getAbsolutePath());
            }else {
                System.out.println("que no ha estat possible crear el directori");
                file.mkdir();
            }
        }
    }
}