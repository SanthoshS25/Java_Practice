package Chapter04_arrays;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 89, 23};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The Maximum Element in the array is: " + max);
        System.out.println("The Minimum Element in the array is: " + min);
    }
}
