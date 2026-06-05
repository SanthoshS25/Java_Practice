package Chapter07_ExceptionHandling;
import java.util.Scanner;
public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        validateAge(age);
    }

    public static void validateAge(int age) throws Exception{
        if (age > 18){
            throw new Exception("Welcome! You can vote.");
        }
        else{
            throw new Exception("Not eligible to vote!");
        }
    }
}
