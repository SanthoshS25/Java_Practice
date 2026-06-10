package src.LeetCode_Problems;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        /* Method 1 */
        // Arrays.sort(nums);
        // int i = 0;
        // for(int j = 1;j<nums.length;j++ ){
        //     if(nums[i] == nums[j]){
        //         return true;
        //     }
        //     i++;
        // }
        // return false;
        /* Method 2 */
        HashSet <Integer> set = new HashSet<>();
        for(int element : nums){
            set.add(element);
        }
        if((nums.length) == set.size()) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
