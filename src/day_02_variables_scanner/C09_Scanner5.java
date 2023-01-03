package day_02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner5 {
    public static void main(String[] args) {

        //EXERCISE. Get two number from the user and swap them.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();

        double temp;
        temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("Your numbers are swapped. Your first number is now: " + num1 + "\nYour second number is now: " + num2);


    }
}
