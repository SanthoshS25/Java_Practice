package Revision.Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 11;
        boolean flag = true;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}
