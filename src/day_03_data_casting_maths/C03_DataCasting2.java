package day_03_data_casting_maths;

import java.util.Scanner;

public class C03_DataCasting2 {
    public static void main(String[] args) {

        System.out.println(28/5); // prints only the integer part;5.

        int num1 = 25;
        int num2 = 6;
        System.out.println(num1/num2);

        double num3 = 6;
        System.out.println(num1/num3); //since one of the data is double then the answer is decimal (double)

        // EXERCISE. Get two integers from the user. Print their quotient as decimal (double type)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num_1 = scan.nextInt();
        int num_2 = scan.nextInt();
        double quotient = (double) num_1/num_2;  // we HAD to cast the data here. Otherwise, the answer is an integer.
        System.out.println("The answer is: " + quotient);
        // We can print without the quotient variable.
        System.out.println("The answer is: " + (double)num_1/num_2); // Second solution. One of the numbers should be cast to double. That's it.

    }
}
