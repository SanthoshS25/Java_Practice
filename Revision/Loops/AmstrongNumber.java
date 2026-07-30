package Revision.Loops;

public class AmstrongNumber {
    public static void main(String[] args) {
        int n = 153, count = 0, amstrongNumber = 0;
        int original = n, temp = n;
        while (n != 0) {
            count++;
            n /= 10;
        }
        while (original != 0) {
            amstrongNumber += Math.pow((original % 10),count);
            original/=10;
        }
        System.out.println(temp == amstrongNumber);

    }
}
