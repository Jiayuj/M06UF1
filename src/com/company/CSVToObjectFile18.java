package com.company;

import java.io.*;
import java.util.ArrayList;

public class CSVToObjectFile18 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> users = loadUsers();
        writeUsers(users);
    }
    public static ArrayList loadUsers() throws IOException {
        ArrayList<String> users = new ArrayList<String>();
        FileReader fr = new FileReader("user.csv");
        BufferedReader br = new BufferedReader(fr);
        boolean c = false;
        while (!c){
            String line = br.readLine();
            if (line==null){
                c=true;
            }else {
                for (String n : line.split(",")){
                    users.add(n);
                }
            }
        }
        return users;
    }
    public static void writeUsers(ArrayList arrayList) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));
        String a = (String) arrayList.get(0);
        String s = (String) arrayList.get(1);
        String d = (String) arrayList.get(2);
        String f = (String) arrayList.get(3);
        String g = (String) arrayList.get(4);
        User user = new User(a,s,d,f,g);
        objectOutputStream.writeObject(user);

        a = (String) arrayList.get(5);
        s = (String) arrayList.get(6);
        d = (String) arrayList.get(7);
        f = (String) arrayList.get(8);
        g = (String) arrayList.get(9);
        User user2 = new User(a,s,d,f,g);
        objectOutputStream.writeObject(user2);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
        User user1 = (User) objectInputStream.readObject();
        System.out.println(user1);
    }

}
class User implements Serializable{
    private String username;
    private String fistname;
    private String lastname;
    private String email;
    private String password;

    public User(String username, String fistname, String lastname, String email, String password) {
        this.username = username;
        this.fistname = fistname;
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

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
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
        return "User: " +
                "username='" + username + '\'' +
                ", fistname='" + fistname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\''+"\n";
    }
}
