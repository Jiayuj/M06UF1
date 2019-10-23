package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreballadorsToScreen1 {

    int i;

    void mostra() throws FileNotFoundException {
        File file = new File("/home/dam2a/treballadors.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String [] spits = scanner.nextLine().split(",");
            i++;
            System.out.println("Treballador  "+ i);
            System.out.println("Nom:         " +spits[0]);
            System.out.println("Cognoms:     " +spits[1]);
            System.out.println("Salari:      " +spits[2]);
            System.out.println("Casat:       " +spits[3]);
            System.out.println();
        }
        scanner.close();
    }
}
