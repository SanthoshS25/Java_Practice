package Chapter_3_Loops;
import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the Start Number: ");
        int start = s.nextInt();
        System.out.print("Enter the end Number: ");
        int end = s.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        System.out.println("The sum of the All number is: "+ sum);
    }
}
