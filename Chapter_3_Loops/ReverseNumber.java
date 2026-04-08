package Chapter_3_Loops;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the Number to be Reversed: ");
        int n = s.nextInt();
        int rev = 0;
        while (n > 0 ){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println("The Reversed Number is: " + rev);
    }
}
