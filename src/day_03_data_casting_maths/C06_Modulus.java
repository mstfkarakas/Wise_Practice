package day_03_data_casting_maths;

import java.util.EnumMap;
import java.util.Scanner;

public class C06_Modulus {
    public static void main(String[] args) {

    //  Modulus is shown by %
        System.out.println(15 % 4);  // prints 3
        System.out.println(45 % 4);  // prints 1
    //  We can find the ones digit of any number by finding the modulus of the number by 10.

        int num = 3426;
        int ones_digit = num % 10;
        System.out.println("Ones digit of 3426 is: " + ones_digit);

    //  If we just divide the number by 10, it will give us an integer by truncating the decimal part. See below
        num = num/10;
        System.out.println("Remaining digits of the number: " + num); // prints 342 by cutting out the 0.6 since it's an integer not a double.

    //  TRICK!!! If we keep dividing by 10 and find the ones digit each time, we can find ALL the DIGITS.
    //  Copy & paste the above codes as many times as the number of digits.

        ones_digit = num % 10;
        System.out.println("Ones digit of 342 is: " + ones_digit);

        num = num/10;
        System.out.println("Remaining digits of the number: " + num);

        ones_digit = num % 10;
        System.out.println("Ones digit of 34 is: " + ones_digit);

        num = num/10;
        System.out.println("Remaining digits of the number: " + num);

        ones_digit = num % 10;
        System.out.println("Ones digit of 3 is: " + ones_digit);

        num = num/10;
        System.out.println("Remaining digits of the number: " + num);

    //  EXERCISE. Get a 4-digit number from the user. Find the sum of the digits of the number.
    //  Solution 1:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digit positive integer: ");
        int input = scan.nextInt();

    //  System.out.println("Your number is: " + input + ". Now we'll find the sum of its digits");

        int ones_digit2 = input % 10;
        input = input/10;
    //  System.out.println("The last digit is: " + ones_digit2);
    //  System.out.println("Remaining number is: " + input);

        int tens_digit = input % 10;
        input = input/10;
    //    System.out.println("The last digit is: " + tens_digit);
    //    System.out.println("Remaining number is: " + input);

        int hundreds_digit = input % 10;
        input = input/10;
    //    System.out.println("The last digit is: " + hundreds_digit);
    //    System.out.println("Remaining number is: " + input);

        int thousands_digit = input % 10;
        input = input/10;
    //    System.out.println("The last digit is: " + thousands_digit);
    //    System.out.println("Remaining number is: " + input);

        System.out.println("The sum of the digits of your number is: " + (int)(thousands_digit+hundreds_digit+tens_digit+ones_digit2));

    //  Solution 2:

        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a four digit positive integer: ");  // Let's say 2457
        int number = entry.nextInt();
    // We create the variables we'll use.
        int one_digit = 0;
        int sum_of_digits = 0;

    //  We'll get each digit and add it to the SUM.
        one_digit = number % 10;
        sum_of_digits = sum_of_digits + one_digit;  // 0 + 7 = 7

    //  Now, we get rid of the last digit by truncating it;
        number = number/10;  // Now the number is 245
        one_digit = number % 10; // this gives us 5
        sum_of_digits = sum_of_digits + one_digit; // This is 7+5 = 12

        number = number/10;  // Now the number is 24
        one_digit = number % 10;  // This gives us 4.
        sum_of_digits = sum_of_digits + one_digit; // This is 4 + 12 = 16

        number = number/10; // This gives us 2
        one_digit = number % 10; // This gives us 2 since it's the last digit already.
        sum_of_digits = sum_of_digits + one_digit; // This gives 2+16 = 18. Let's print it using 'sout'

        System.out.println("Solution 2: The sum of the digits of your number is: " + sum_of_digits);


    }
}
