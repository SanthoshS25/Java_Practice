package Chapter_3_Loops;

import java.util.Scanner;

public class DoWhileLoop {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 1;
        System.out.print("Enter the Number of range : ");
        int n = s.nextInt();
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
