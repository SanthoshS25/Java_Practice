package Chapter_3_Loops;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                flag = false;
        }
        if (flag)
            System.out.println("The given Number is the Prime Number");
        else {
            System.out.println("The given number is not a Prime Number");
        }

    }
}
