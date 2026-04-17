package Chapter05_Strings;

public class StringReverseBuilder {
    public static void main(String[] args) {
        String s  = "Santhosh";
        // StringBuilder str = new StringBuilder();
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        System.out.println(str.toString());
        // for(int i = s.length() - 1; i>=0; i--){
        //     str.append(s.charAt(i));
        // }
        // System.out.println("The reverse String is: "+ str.toString());
    }
}
