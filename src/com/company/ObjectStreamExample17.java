//package com.company;
//
//import java.io.*;
//import java.util.ArrayList;
//
//
//public class ObjectStreamExample17 {
//    public static void main(String[] args) throws IOException {
//
//        ArrayList<Person> list= introDades();
//        mostraDades();
//    }
//    public static ArrayList introDades() throws IOException {
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));
//        ArrayList<Person> list = new ArrayList<>();
//        for (int i = 1; list.size()<3 ; i++) {
//            Person person = new Person();
//            person.setNom("P"+i);
//            person.setEdat(18+i);
//            objectOutputStream.writeObject(person);
//            list.add(person);
//        }
//        objectOutputStream.close();
//        return list;
//    }
//    public static void mostraDades() throws IOException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
//        try {
//            while (true){
//                Person personRead = (Person) objectInputStream.readObject();
//                System.out.println(personRead);
//            }
//        }catch (EOFException e ){
//            objectInputStream.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class Person implements Serializable {
//    private String nom;
//    private int edat;
//
//    public String getNom() {
//        return nom;
//    }
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//    public int getEdat() {
//        return edat;
//    }
//    public void setEdat(int edat) {
//        this.edat = edat;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "nom='" + nom + '\'' +
//                ", edat=" + edat +
//                '}';
//    }
//}