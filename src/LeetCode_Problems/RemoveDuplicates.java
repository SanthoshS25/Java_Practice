package LeetCode_Problems;
// import java.util.Arrays;

public class RemoveDuplicates{
    public static void main(String[] args) {
        // int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        // int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j = 1; j < nums.length ; j++){
            if(nums[i-1] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}