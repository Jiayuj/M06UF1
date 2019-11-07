package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//public class CSVToObjectFile18 {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        List<String> users = new ArrayList<>();//guarda toda users
//        FileReader fr = new FileReader("user.csv");
//        BufferedReader br = new BufferedReader(fr);
//        boolean exit=false;
//        while (!exit){
//            String line = br.readLine();
//            if (line == null){
//                exit=true;
//            }else {
//                List<String> s = loadUser(line);//guarda user de linea.
//                users.addAll(s);
//                writeUser(s);
//            }
//        }
//    }
//    public static List loadUser(String line) throws IOException {
//        List arrayList = new ArrayList();
//        String[]user = line.split(",");
//        for (int i = 0; i < user.length; i++) {
//            arrayList.add(user[i]);
//        }
//        return arrayList;
//    }
//    public static void writeUser(List list) throws IOException, ClassNotFoundException {
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.bin"));
//        User user = new User((String) list.get(0),(String) list.get(1),(String) list.get(2),(String) list.get(3),(String) list.get(4));
//        objectOutputStream.writeObject(user);
//        objectOutputStream.close();
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"));
//        User userRead = (User) objectInputStream.readObject();
//        System.out.println(userRead);
//        objectInputStream.close();
//    }
//
//}
class User implements Serializable {
    private String username, firstname,lastname, email, password;
    private final long serialversionID = 12;

    public User(String username, String firstname, String lastname, String email, String password) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}