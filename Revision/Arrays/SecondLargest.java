package Revision.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        // int[] arr = {5, 7, 1, 9, 3};
        int[] arr = { 9, 8, 7, 6 };
        int largest = arr[0], secondLargest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] != largest) {
                if (secondLargest < arr[i]) {
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println("Largest : " + largest + " SecondLargest : " + secondLargest);
    }
}
