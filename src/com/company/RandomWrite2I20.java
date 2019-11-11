package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomWrite2I20 {
    public static void main(String[] args) throws IOException {
        ArrayList<Departament> list = new ArrayList<>();
        int i=list.size();
        writeDepartament(list,i);
    }
    public static void writeDepartament (ArrayList list,int i) throws IOException {
        FileWriter fw = new FileWriter("departament.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String s="";
        for (int j = 0; j < 10; j++) {
            char c = (char) (new Random().nextInt(25)+65);
            s+=c;
        }
        list.add(new Departament((i+1)*10,s));
        bw.write(String.valueOf(new Departament((i+1)*10,s)));
    }

}
class Departament{

    private int id;
    private String nom;

    public Departament(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}'+"\n";
    }
}
