package src.LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int ele : nums1) {
            set1.add(ele);
        }
        for (int ele : nums2) {
            set2.add(ele);
        }
        for (int ele : set2) {
            if (set1.contains(ele)) {
                list.add(ele);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
