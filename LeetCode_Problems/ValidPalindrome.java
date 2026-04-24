package LeetCode_Problems;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        boolean flag = true;
        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }

        return flag;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if(isPalindrome(s)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
    }
}
