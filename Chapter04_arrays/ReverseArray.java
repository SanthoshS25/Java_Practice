package Chapter04_arrays;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int start  = 0, end = arr.length - 1, temp = 0;
        System.out.println(Arrays.toString(arr));
        while(start <= end){
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}