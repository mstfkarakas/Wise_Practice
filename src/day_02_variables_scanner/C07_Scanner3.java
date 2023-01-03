package day_02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner3 {
    public static void main(String[] args) {

        // Ask user their name, surname and age. Print them each in a line and say your registration is successful.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your forename: ");
        String forename = scan.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scan.nextLine();

        System.out.println("Enter your age: ");
        double age = scan.nextDouble();

        System.out.println("Name: " + forename + "\nSurname: " + surname + "\nAge: " + age + "\nYour registration is successful");
    }
}

