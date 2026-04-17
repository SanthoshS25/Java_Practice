package Chapter05_Strings;

public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("San");
        sb.append("thosh");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.length());
    }
}