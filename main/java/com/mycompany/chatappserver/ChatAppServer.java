package com.mycompany.chatappserver;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChatAppServer {

    // Method to add numbers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method to check if the server is running
    public boolean isServerRunning() {
        return true;
    }

    // Validate username: must contain an underscore and be 5 or fewer characters
    public static boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Validate password complexity: at least 8 characters, with uppercase, number, and special character
    public static boolean checkPasswordComplexity(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean isAtLeast8 = password.length() >= 8;

        return hasUppercase && hasNumber && hasSpecialChar && isAtLeast8;
    }

    // Validate South African phone number: starts with +27, followed by 9 digits
    public static boolean isValidPhoneNumber(String number) {
        return Pattern.matches("^(\\+27)[0-9]{9}$", number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("EXSE FEDE LET'S REGISTER");
        
        // Name and surname input
        String name;
        System.out.println("Faka your name dah:");
        name = input.nextLine();
        
        String surname;
        System.out.println("Faka your surname dah:");
        surname = input.nextLine();

        // Username validation loop
        String username;
        while (true) {
            System.out.print("Faka your username dah, no longer than five characters including the underscore: ");
            username = input.nextLine();

            if (checkUsername(username)) {
                System.out.println("Neh, the username is solid!");
                break; // exit loop if valid
            } else {
                System.out.println("Neh my dawg, your username format is wrong. It must contain an underscore and not exceed 5 characters!");
            }
        }

        // Password validation loop
        String password;
        while (true) {
            System.out.print("Faka your password dah, at least 8 characters, with an uppercase letter, a number, and a special character: ");
            password = input.nextLine();

            if (checkPasswordComplexity(password)) {
                System.out.println("Neh, the password is solid!");
                break; // exit loop if valid
            } else {
                System.out.println("Neh my dawg, your password format is wrong. It must be at least 8 characters, with an uppercase letter, a number, and a special character!");
            }
        }

        // Phone Number validation loop
        String phoneNumber;
        while (true) {
            System.out.print("Faka your phone number dah, make sure it is a South African phone number starting with +27: ");
            phoneNumber = input.nextLine();

            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println("Neh, the phone number is ON!");
                break; // exit loop if valid
            } else {
                System.out.println("My dawg, please fix your phone number. It must start with +27 followed by 9 digits!");
            }
        }

        // Close the scanner after all input
        input.close();

        System.out.println("\nWelcome to ChatAppServer, " + name + " " + surname + " " + username + "!");
    }
}
