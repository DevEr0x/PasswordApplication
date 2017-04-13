/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordapplication;

import java.util.Scanner;

/**
 *
 * @author ermaz0018
 */
public class PasswordApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        String password;

        System.out.println("Please enter your username: ");

        username = input.nextLine();
        username = username.toLowerCase();


        do {
            System.out.println("Please enter a password with more than 8 characters: ");
            password = input.nextLine();
            password = password.toLowerCase();
        } while (password.length() < 7);
        
        System.out.println("Welcome, " + username + ".");
        System.out.println("Your password is: " + password);
        System.out.println("You are now logged into your account.");
    }

}
