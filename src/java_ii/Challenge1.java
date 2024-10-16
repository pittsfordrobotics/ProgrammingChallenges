package java_ii;
import java.lang.Math;

public class Challenge1 {
    public static void main(String[] args) {
        /* Write a program to count the number of prime integers from 1 to 1000 and print it.
         * Use an if/else statement and a for loop.
         */
        // System.out.println("2"); whoops i thought we had to print as well
        int ans = 1;
        for (int i = 3; i <= 1000; i++){
            Boolean flag = true;
            if (i % 2 == 0) continue;
            for (int j = 3; j <= Math.sqrt(i); j += 2){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;
            ans++;
            // System.out.println(i);
        }
        System.out.println(ans);
    }
}
