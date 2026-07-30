package Revision.Arrays;

import java.util.Arrays;

public class ReverseArray {
    /* Reverse Array */
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5};
    //     int temp = 0;
    //     int start = 0, end=arr.length-1;
    //     while(start < end){
    //         temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;end--;
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4}; 
        boolean flag = true;
        for(int i = 1;i< arr.length;i++){
            if(arr[i] < arr[i-1]){
                flag = false;
                break;
            }
        }
        System.out.println("Arrays is sorted?:  " + flag);
    }
}
