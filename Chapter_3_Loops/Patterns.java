package Chapter_3_Loops;
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number lines of Star: ");
        int n = s.nextInt();
        /*
         * Pattern 1 - Increasing Star
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * Pattern 2 - Decreasing stars
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Break
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                break;
            System.out.println(i);
        }

        // Continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }

    }
}
