package LeetCode_Problems;
import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length, j = 0,temp = 0;
        for (int i = 0;i < n; i++){
            if(nums[i] != 0){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
