package Chapter05_Strings;


public class CheckPalindrome {
    public static void main(String[] args) {
        // String s = "racecar";
        String s = "hello";
        //Method 1
        // char[] a = s.toCharArray();
        // int start = 0, end = a.length-1;
        // while (start < end){
        //     char temp = a[end];
        //     a[start] = a[end];
        //     a[end] = temp;
        //     start++;
        //     end--;
        // }
        // String b = new String(a);
        // if(b.equals(s)){
        //     System.out.println("It is palindrome");
        // }
        // else {
        //     System.out.println("It is not palindrome");
        // }
        // Method 2
        int start = 0, end = s.length()-1;
        boolean flag = true;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }

    }
}