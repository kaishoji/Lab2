// -------------- Class Header -------------- \\
// Author: Kai Shoji Ohsawa
// Filename: Lab2.java
/* Specification: This program will ask the user to enter two strings, being first name and last name
    then concatenates the strings to make a full name. This program will make use of methods of class
    String, like length() and toUpperCase() ------> source: lab document. */
// For: CSE 110 - Lab #2
// Time Spent: 30 min

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // initializes the following variables
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;

        // this assigns a new value to firstName
        System.out.println("Please enter your first name: ");
        firstName = scan.nextLine();

        // this assigns a new value to lastName
        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine();

        // this assigns a new value to fullName
        fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();
        System.out.print("Your full name (in capitals): ");
        System.out.println(fullName);

        // this assigns a new value to nameLength
        nameLength = fullName.length();
        System.out.print("Length of full name: ");
        System.out.println(nameLength);

        // Below is the string comparison, exemplifying the difference between 
        // using "==" and "equals()". As strings are objects, using the equals sign works.
        String title1 = new String("cse110");
        String title2 = "cse110";

        if ( title1 == title2 ) {
            System.out.println("String comparison using \"==\" sign works.");
        } else {
            System.out.println("String comparison using \"==\" sign does NOT work.");
        }

        if ( title1.equals(title2) ) {
            System.out.println("String comparison using \"equals\" method works.");
        } else {
            System.out.println("String comparison using \"equals\" method does NOT work.");
        }
    }
}