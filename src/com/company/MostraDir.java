package com.company;

import java.io.File;
import java.util.Scanner;

public class MostraDir {

    void mostra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un directori");
        File f =new File(scanner.nextLine());
        for (File i: f.listFiles()) {
            if (i.isDirectory()) {
                System.out.println(i);
            }
        }
    }
}
