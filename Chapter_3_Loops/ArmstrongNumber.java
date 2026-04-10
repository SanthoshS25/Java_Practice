package Chapter_3_Loops;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int a = n,temp = n,count = 0,AmstrongNumber = 0;
        while (n > 0){
            count++;
            n/=10;
        }
        for(int i = 0; i < count; i++){
            AmstrongNumber += (int) Math.pow(temp%10,count);
            temp/=10;
        }
        System.out.println((a == AmstrongNumber) ? "It is Amstrong Number" : "It is not Amstrong Number");

        
    }
}