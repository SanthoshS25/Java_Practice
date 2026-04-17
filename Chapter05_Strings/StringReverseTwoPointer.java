package Chapter05_Strings;

public class StringReverseTwoPointer {
    public static void main(String[] args) {
        String str = "Hello";
        char[] s = str.toCharArray();
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            // Swap characters at start and end pointers
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }
        System.out.print(s);
    }
}
