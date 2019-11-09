package com.company;

import java.util.ArrayList;
import java.util.Random;

public class RandomWrite2I20 {
    public static void main(String[] args) {
        ArrayList<Departament> list = new ArrayList<>();
        for (int i = 0; i <9 ; i++) {
            String s="";
            for (int j = 0; j < 10; j++) {
                char c = (char) (new Random().nextInt(25)+65);
                s+=c;
            }
            list.add(new Departament((i+1)*10,s));
        }
        System.out.println(list);
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
