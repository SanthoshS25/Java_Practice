package Chapter04_arrays;

public class SecondLargest {
    public static void main(String[] args) {
        // int[] arr = {45, 12, 78, 34, 89, 23};
        // int[] arr = {10, 10, 10};
        int[] arr = {89, 45, 12, 78, 34, 89, 23};
        int largest = -1, second = -1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            else if (arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
        System.out.println("The Second Largest element in the array is " + second);

    }
}
