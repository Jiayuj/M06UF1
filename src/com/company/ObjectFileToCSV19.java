//package com.company;
//
//import java.io.*;
//import java.util.ArrayList;
//
//
//
//public class ObjectFileToCSV19 {
//   public static void main(String[] args) throws IOException {
//       ArrayList<User> userslist = new ArrayList<>();
//       loadUser(userslist);
//       writeUser(userslist);
//   }
//   public static ArrayList loadUser(ArrayList list) throws IOException {
//       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"));
//        try {
//            while (true){
//                User userRead = (User) objectInputStream.readObject();
//                System.out.println(userRead);
//                list.add(userRead);
//            }
//        }catch (EOFException e ){
//            objectInputStream.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//       return list;
//   }
//   public static void writeUser(ArrayList<User> list) throws IOException {
//       FileWriter fw = new FileWriter("user1.csv",false);
//       BufferedWriter bw = new BufferedWriter(fw);
//       for (int i = 0; i < list.size() ; i++) {
//           bw.write( list.get(i).getUsername()+","+list.get(i).getFirstname()+","+list.get(i).getLastname()+"\n");
//       }
//       bw.close();
//   }
//
//}
//class User implements Serializable {
//   private String username, firstname,lastname, email, password;
//   private static final long serialVersionUID = 12;
//
//   public User(String username, String firstname, String lastname, String email, String password) {
//       this.username = username;
//       this.firstname = firstname;
//       this.lastname = lastname;
//       this.email = email;
//       this.password = password;
//   }
//
//   public String getUsername() {
//       return username;
//   }
//
//   public void setUsername(String username) {
//       this.username = username;
//   }
//
//   public String getFirstname() {
//       return firstname;
//   }
//
//   public void setFirstname(String firstname) {
//       this.firstname = firstname;
//   }
//
//   public String getLastname() {
//       return lastname;
//   }
//
//   public void setLastname(String lastname) {
//       this.lastname = lastname;
//   }
//
//   public String getEmail() {
//       return email;
//   }
//
//   public void setEmail(String email) {
//       this.email = email;
//   }
//
//   public String getPassword() {
//       return password;
//   }
//
//   public void setPassword(String password) {
//       this.password = password;
//   }
//
//   @Override
//   public String toString() {
//       return "username= " + username +
//               ", firstname= " + firstname +
//               ", lastname= " + lastname +
//               ", email= " + email +
//               ", password= " + password;
//   }
//}
