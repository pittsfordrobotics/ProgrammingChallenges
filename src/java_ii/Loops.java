package java_ii;

public class Loops {
    public static void main(String[] args) {
        // Go watch the video. Then come back.
        // Ok, now that you're back it's time for EXERCISES
        // (It's not a coincidence that EXERCISES shares so many letters with EXCITING)

        // 1. Print out all the even numbers from 0 to 100.
        System.out.println("Even numbers, 0 - 100:");
        int a = 0;
        while (a <= 100) {
            System.out.println(a);
            a += 2;
        }
        // 2. Print out all the *odd* numbers from 0 to 100.
        int b = 1;
        System.out.println("Odd numbers, 0 - 99:");
        while (b <= 100) {
            System.out.println(b);
            b += 2;
        }

        // 3. Print out every multiple of 5 from 0 to 100.
        System.out.println("Multiples of 5, 0 - 100:");
        for (int c = 0; c <= 100; c += 5) {
            System.out.println(c);
        }
    }
}
