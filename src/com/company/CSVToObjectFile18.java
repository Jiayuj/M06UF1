<<<<<<< HEAD
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
=======
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
>>>>>>> origin/master
//        while (!exit){
//            String line = br.readLine();
//            if (line == null){
//                exit=true;
//            }else {
<<<<<<< HEAD
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
=======
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
>>>>>>> origin/master
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
>>>>>>> origin/master
