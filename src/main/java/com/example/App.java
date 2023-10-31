package com.example;
import java.util.*;
public class App {
private Properties storedCredentials;
 public App(Properties storedCredentials) {
 this.storedCredentials = storedCredentials;
 }
 public boolean matchCredentials(String username, String password) {
 String storedPassword = storedCredentials.getProperty(username);
 return storedPassword != null && storedPassword.equals(password);
 }
public static void main(String args[]) {
Properties storedCredentials = new Properties();
 // Add predefined stored properties here
storedCredentials.setProperty("ram", "3025");
 
 App matcher = new App(storedCredentials);

 Scanner scan = new Scanner(System.in);

// String inputUsername = "user2";
// String inputPassword = "password1";
 String inputUsername,inputPassword;
 System.out.print("Enter the name: ");
 inputUsername = scan.next();
 System.out.println();
 System.out.print("Enter the Id: ");
 inputPassword = scan.next();
 if (matcher.matchCredentials(inputUsername, inputPassword)) {
 System.out.println("Valid name and Id" + "\nLogin successful!");
 } else {
 System.out.println("Invalid name or Id.");
 }
 scan.close();
}
}
