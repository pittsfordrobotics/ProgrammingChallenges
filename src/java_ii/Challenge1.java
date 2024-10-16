package java_ii;

public class Challenge1 {
    public static void main(String[] args) {
        /* Write a program to count the number of prime integers from 1 to 1000 and print it.
         * Use an if/else statement and a for loop.
         */
        System.out.println("Prime numbers 1 - 1000");
        boolean prime = true;
        int factor = 2;
        for (int a = 2; a <= 1000; a++) {
            prime = true;
            for (factor = 2; factor < a; factor++) {
                if (a % factor == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(a);
            }

        }
    }
}
