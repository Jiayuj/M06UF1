package com.company;

import java.io.*;

public class CopyDirFRFW {

    void copy() throws IOException {

        File file1 = new File("/home/dam2a/DirC");
        file1.mkdir();
        File file = new File("/home/dam2a/Dir");

        for (File i : file.listFiles()){
            String a = file1.getAbsolutePath()+"/"+i.getName();
            File aa = new File(a);
            if (i.isDirectory()){
                aa.mkdir();
            }else if (i.isFile()){
                FileReader fr = new FileReader(i);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(aa);
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
    }
}
