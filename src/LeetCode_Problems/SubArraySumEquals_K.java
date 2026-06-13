package src.LeetCode_Problems;

public class SubArraySumEquals_K {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0; int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length;j++){
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // int nums [] = {1, 1, 1};
        // int k = 2;
        int nums [] = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
