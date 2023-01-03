package day_02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner6 {
    public static void main(String[] args) {

        //EXERCISE Get a double and an integer from the user and find their sum and product.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = scan.nextInt();
        System.out.println("Enter a decimal number: ");
        double decimal = scan.nextDouble();

        double sum;
        double product;
        sum = integer + decimal;
        product = integer * decimal;

        System.out.println("The sum of your numbers is: " + sum + " and the product of your numbers is: " + product);


    }
}
