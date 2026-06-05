package Chapter07_ExceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        getElement(arr, 2);
        getElement(arr, 10);

    }

    public static void getElement(int[] arr, int index){
        try{
            System.out.println(arr[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of bound error");
        } finally{
            System.out.println("Cleanup Done...");
        }
    }
}