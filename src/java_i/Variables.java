package java_i;

public class Variables {
    public static void main(String[] args) {
        /*
        So you've watched the video? Cool!
        Besides String, there are some other types of variables. These are not capitalized.
        - int is a type that stores whole numbers (integers).
             int x = 2;
        
        - double is a type that stores decimals.
             double x = 2.5;

        - boolean is a type that stores a value of either true or false (no quotes). These get helpful later.
             boolean x = true;

        Now, declare a variable of each type (boolean, int, double, and String)
        and assign each a value.
        Then, print all of them.
        */

        ///////////////////////////
        boolean a = false;
        int b = 13;
        double c = 1.1;
        String phrase = "Hello there";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(phrase);
        ///////////////////////////

        // Create another 2 ints and 2 doubles.
        // Add the ints and print the result.
        // Multiply an int and a double and print the result.
        // Divide a double by the other double and print the result.

        ///////////////////////////
        int i1 = 36;
        int i2 = 108;
        double d1 = 1.5;
        double d2 = 2.5;
        System.out.println(i1+i2);
        System.out.println(i1*d1);
        System.out.println(d2/d1);
        ///////////////////////////
    }
}
