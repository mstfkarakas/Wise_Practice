package day_03_data_casting_maths;

public class C02_Explicit_Narrowing {
    public static void main(String[] args) {

        // from larger capacity data type to a narrower one, Java doesn't do it automatically.
        // We have to CAST it by inserting the data type we want in parentheses.

        double num1 = 23.15;
        // can't be automatically stored as integer. But we CAN do it by inserting (int).
        int num2 = (int)num1;
        System.out.println(num2);

        byte num3 = (byte)num2; //similarly integer can be stored as byte.
        System.out.println(num3);

        num2 = 130;
        num3 = (byte)num2; // 130 is bigger than byte's capacity. So after +127, it starts from -128
        System.out.println(num3);  // this prints -126

        num2 = 256;
        num3 = (byte)num2;
        System.out.println(num3); //prints 0.

    }
}
