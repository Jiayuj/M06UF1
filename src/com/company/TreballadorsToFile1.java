package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreballadorsToFile1 {
    void escriu() throws IOException {
        File file = new File("/home/dam2a/treballadors.txt");
        PrintWriter printWriter = new PrintWriter(file);
        Scanner scanner = new Scanner(System.in);

        String dato;
        int i = 0;

        String opcion="y";

        while (opcion.equals("Y") || opcion.equals("y")){
            System.out.print("Introduce Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Introduce Cognoms: ");
            String cognoms = scanner.nextLine();
            System.out.print("Introduce Salari: ");
            String salari = scanner.nextLine();
            System.out.println("Estat Casat ? ");
            System.out.println("S = si N = no");
            String casat = scanner.nextLine();
            boolean estacasat = true;
            if (casat.equals("S")){
                estacasat=true;
            }else if (casat.equals("N")){
                estacasat=false;
            }
            System.out.println("Vols Continuar?");
            System.out.println("Y = si   N = no");
            String op = scanner.nextLine();
            if (op.equals("Y")){
                printWriter.println(nom+","+cognoms+","+salari+","+estacasat);
            }else if (op.equals("N")){
                printWriter.println(nom+","+cognoms+","+salari+","+estacasat);
                printWriter.close();
                opcion="N";
            }
        }
    }
}
