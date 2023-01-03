package day_02_variables_scanner;

public class C02_Data_Types {
    public static void main(String[] args) {

        char character = 'w';   //char accepts only one character and in single quotes.
        char character2 = '2';

        long num = 234532432343423L; // to assign bigger numbers than acceptable range, type L or l at the end.
        byte num2 = 127; //byte is from -128 to +127.

        float num3 = 2332.21f; // Java aut. saves as double. We need to convert it to FLOAT. To do that, type F/f at the end OR
        double num4 = 23.343;

        // In this following division, FLOAT is used so the outcome has 7 decimal digits.
        float a = 20f;
        float b = 6f;
        System.out.println(a/b);

        // In this following division, DOUBLE is used so the outcome has 16 decimal digits.
        double c = 20;
        double d = 6;
        System.out.println(c/d);
    }
}
