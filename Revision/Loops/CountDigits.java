package Revision.Loops;

public class CountDigits {
    public static void main(String[] args) {
        int n = 123,rev = 0;
        int original  = n;
        while(n != 0){
            rev = rev*10+n%10;
            n/=10;
        }
        System.out.println((rev == original)? "It is Palindrome" : "It is not Palindrome");
    }
}