package Chapter_3_Loops;
import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long n = s.nextInt();
        long temp = n;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println("there are " + count +" Digits in the given Number " + temp);
    }
}
