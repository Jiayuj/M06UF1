package com.company;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;


//public class ObjectStreamExample17 {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ArrayList<String> person = new ArrayList<String>();
//
//        introDades("A",18);
//        person.add(mostraDades());
//        introDades("B",19);
//        person.add(mostraDades());
//        person.forEach(n -> System.out.println(n));
//
//    }
//    public static void introDades(String n,int e) throws IOException {
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));
//        Person person = new Person();
//        person.setNom(n);
//        person.setEdat(e);
//        objectOutputStream.writeObject(person);
//        objectOutputStream.close();
//    }
//    public static String mostraDades() throws IOException, ClassNotFoundException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
//        Person person = (Person) objectInputStream.readObject();
//        return String.valueOf(person);
//    }
//
//}

class Person implements Serializable {
    private String nom;
    private int edat;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }
}