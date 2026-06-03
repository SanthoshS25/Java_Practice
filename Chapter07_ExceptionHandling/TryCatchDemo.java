package Chapter07_ExceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(arr[10]);

        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
