package Chapter_3_Loops;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int a = 0, b = 1,n3 = 0;
        while(n>0){
            System.out.print(a+" ");
            n3 = a;
            a = b;
            b = n3 + b;
            n--;
        }
    }
}
