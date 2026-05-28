package LeetCode_Problems;
import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(int j = 1;j<nums.length;j++ ){
            if(nums[i] == nums[j]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
