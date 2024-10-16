package java_ii;

public class Loops {
    public static void main(String[] args) {
        // Go watch the video. Then come back.
        // Ok, now that you're back it's time for EXERCISES
        // (It's not a coincidence that EXERCISES shares so many letters with EXCITING)

        // 1. Print out all the even numbers from 0 to 100.
        for (int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }
        // 2. Print out all the *odd* numbers from 0 to 100.
        for (int i = 1; i < 100; i += 2){
            System.out.println(i);
        }
        // 3. Print out every multiple of 5 from 0 to 100.
        for (int i = 5; i <= 100; i+= 5){
            System.out.println(i);
        }
    }
}
