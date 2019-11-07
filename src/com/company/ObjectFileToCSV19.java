package com.company;

import java.io.*;
import java.util.ArrayList;


public class ObjectFileToCSV19 {
   public static void main(String[] args) throws IOException, ClassNotFoundException {
       ArrayList<User> list = loadUser();
       writeUser(list);
   }
   public static ArrayList loadUser() throws IOException, ClassNotFoundException {
       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"));
       Object o = objectInputStream.readObject();
       ArrayList<User> list = (ArrayList<User>) o;
       objectInputStream.close();
       for (User user : list){
           System.out.println(user);
       }
       return list;
   }
   public static void writeUser(ArrayList<User> list) throws IOException {
       FileWriter fw = new FileWriter("user1.csv",false);
       BufferedWriter bw = new BufferedWriter(fw);
       for (int i = 0; i < list.size() ; i++) {
           bw.write( list.get(i).getUsername()+","+list.get(i).getFirstname()+","+list.get(i).getLastname()+"\n");
       }
       bw.close();
   }

}
class User implements Serializable {
   private String username, firstname,lastname, email, password;
   private static final long serialVersionUID = 12;

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
       return "username= " + username +
               ", firstname= " + firstname +
               ", lastname= " + lastname +
               ", email= " + email +
               ", password= " + password;
   }
}
