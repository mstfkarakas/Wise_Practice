package day_03_data_casting_maths;

public class C05_WrapperClass {
    public static void main(String[] args) {

    //  primitive data types don't have methods.
    //  but Java created wrapper classes like Integer, Character, Boolean. Those have methods and also the values as regular
    //  primitive data types such as int, char or boolean
        /*
        Integer num = 20;
        */
    //  Sometimes we need numbers within text values (defined as String data), such as "19 apples".
    //  We'll learn how to convert 'numbers which are stored as text' into numbers.

        String text = "123";
        String text2 = "354";

        System.out.println(text + text2); // prints 123354 since they are text, not numbers.
    //  parseInt method converts the text into numbers.
        int text_int = Integer.parseInt(text);
        int text2_int = Integer.parseInt(text2);

        System.out.println(text_int + text2_int);  // prints 123+354 = 477. So treated as integers, not text anymore. !!

    //  We can print MAX and MIN values of integers. We don't have to memorize them
    //  Type this: Integer.M then choose MIN or MAX VALUE and then type ".so" or ".sout" and then hit enter.
        System.out.println(Integer.MAX_VALUE); // will print 2147483647
        System.out.println(Integer.MIN_VALUE); // will print -2147483648

    //  Same works with other data types too.
        System.out.println(Short.MAX_VALUE); // 32767. Etc.

    //  Check if a CHARACTER is a letter, number etc.

        char inp = 'a';

        System.out.println(Character.isDigit(inp));  // is the input character a digit/number?
        System.out.println(Character.isLetter(inp));
        System.out.println(Character.isAlphabetic(inp));
        System.out.println(Character.isLetterOrDigit(inp));

    }
}
