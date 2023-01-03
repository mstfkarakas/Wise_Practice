package day_02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner2 {
    public static void main(String[] args) {

    // Exercise. Take a number fromm the user and square it.
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to be squared: ");
        double input_num = num.nextDouble();
        System.out.println("The square of your number is: " + input_num*input_num);


    }
}
