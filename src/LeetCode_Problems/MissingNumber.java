package src.LeetCode_Problems;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(findMissingDigit(arr));

    }

    public static int findMissingDigit(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] != 0) {
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) != 1) {
                return arr[i] - 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }
}
