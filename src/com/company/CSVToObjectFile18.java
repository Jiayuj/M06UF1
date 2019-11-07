//package com.company;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CSVToObjectFile18 {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ArrayList<User> list = new ArrayList<>();
//        loadUser(list);
//        writeUser(list);
//    }
//    public static List loadUser(ArrayList list) throws IOException {
//        FileReader fr = new FileReader("user.csv");
//        BufferedReader br = new BufferedReader(fr);
//        boolean exit = false;
//        while (!exit){
//            String line = br.readLine();
//            if (line == null){
//                exit=true;
//            }else {
//                String [] usersplit = line.split(",");
//                list.add(new User(usersplit));
//            }
//        }
//        return list;
//    }
//    public static void writeUser(ArrayList list) throws IOException, ClassNotFoundException {
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.bin"));
//        objectOutputStream.writeObject(list);
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"));
//        Object o = objectInputStream.readObject();
//        ArrayList<User> list1 = (ArrayList<User>) o;
//        for (User user : list1){
//            System.out.println(user);
//        }
//        objectOutputStream.close();
//        objectInputStream.close();
//    }
//
//}
//class User implements Serializable {
//    private String username, firstname,lastname, email, password;
//    private static final long serialVersionUID = 12;
//
//    public User(String[] strings) {
//        this.username = strings[0];
//        this.firstname = strings[1];
//        this.lastname = strings[2];
//        this.email = strings[3];
//        this.password = strings[4];
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "username= " + username +
//                ", firstname= " + firstname +
//                ", lastname= " + lastname +
//                ", email= " + email +
//                ", password= " + password;
//    }
//}