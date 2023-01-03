package day_02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner4 {
    public static void main(String[] args) {

        // EXERCISE. Ask the user for the length and width of a rectangle and calculate the area.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width and the length of the rectangle respectively");
        double width = scan.nextDouble();
        double length = scan.nextDouble();

        double area = width * length;
        System.out.println("The area of the rectangle is: " + area);

    }
}
