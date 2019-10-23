package com.company;

import java.io.File;
import java.io.IOException;

public class TestFitxer {

    void crearFitxer() throws IOException {
        File file = new File("/home/dam2a/test.txt");

        if (!file.exists()) {
            System.out.println("Fichero no existe, creat now fitxer");
            file.createNewFile();
        }else {
            System.out.println("Nom: " + file.getName() + " Directori: " + file.getParent() + " Ruta: " + file.getAbsolutePath());
            System.out.println("Rest metodes:");
            System.out.println("Pot llegir" + file.canRead());
            System.out.println("Pot escriure: " + file.canWrite());
        }
    }
}
