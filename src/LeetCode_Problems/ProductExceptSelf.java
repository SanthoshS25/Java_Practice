package src.LeetCode_Problems;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int leftarr[] = leftArray(arr);
        int rightarr[] = rightArray(arr);
        for(int i = 0; i<arr.length;i++){
            arr[i] = leftarr[i] * rightarr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] leftArray(int arr[]){
        int leftArr[] = new int[arr.length];
        leftArr[0] = 1;
        for (int i = 1;i < arr.length;i++){
            int left = leftArr[i-1] * arr[i-1];
            leftArr[i] = left;
        }
        return leftArr;
        
    }
    public static int[] rightArray(int arr[]){
        int rightArr[] = new int[arr.length];
        rightArr[arr.length-1] = 1;
        for (int i = arr.length - 2;i >= 0;i--){
            int right = rightArr[i+1] * arr[i+1];
            rightArr[i] = right;
        }
        return rightArr;
        
    }
}
