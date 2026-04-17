package Chapter05_Strings;

public class StringBasics {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
        
        String s = "Santhosh";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0, 3));
        System.out.println(s.replace('a', 'o'));

    }

}
