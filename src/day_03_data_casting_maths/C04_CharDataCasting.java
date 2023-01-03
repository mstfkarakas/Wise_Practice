package day_03_data_casting_maths;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        // If char is used in a mathematical calculation, Java uses the ASCII values of the characters.
        System.out.println('a' + 'b'); // Output is 195, since ASCII values are 97, 98 respectively.

        System.out.println('a' - 32); // Prints 65 since a's ASSCI value is 97 and 97-32 is 65.

     // In ASSCI, difference btw a capital letter and a lowercase is 32, e.g. A and a.
        System.out.println((char)('a' - 32)); //casting is added, so the output is- the ASSCI letter corresponding to 65 which is A.



     // EXERCISE. Take a char from the user. Print the 3 characters after the one the user enters.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char input_character = scan.next().charAt(0);  //scan.next() takes the first word only. 0th index is the first character.

        System.out.println((char)(input_character + 1) +", " + (char)(input_character + 2) + ", " + (char)(input_character + 3));


    }
}
