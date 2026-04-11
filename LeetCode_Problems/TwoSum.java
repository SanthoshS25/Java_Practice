package LeetCode_Problems;
import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                temp[0] = i;
                if(j == i)
                continue;
                if(nums[i] + nums[j] == target){
                    temp[1] = j;
                    return temp;
                }
                
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target  = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
