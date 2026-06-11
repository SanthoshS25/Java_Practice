package src.LeetCode_Problems;

import java.util.HashMap;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        HashMap <Character,Integer> map= new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i; 
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        // String s = "loveleetcode";
        System.out.println("The letter " + s.charAt(firstUniqChar(s)) + " is the first Unique Letter");
    }
}
