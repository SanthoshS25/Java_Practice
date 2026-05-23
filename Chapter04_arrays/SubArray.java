package Chapter04_arrays;

public class SubArray {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = arr[0]; // initialize with first element!
        int sum = 0,currentSum =0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = 0;
        //     for (int j = i; j < arr.length; j++) {
        //         sum += arr[j];
        //         if (maxSum < sum) {
        //             maxSum = sum;
        //         }

        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            if(currentSum > maxSum ){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }
}
