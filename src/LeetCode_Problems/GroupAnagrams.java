package src.LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[]  strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String , List<String>> map = new HashMap<>();
        List<List<String>>  list1 = new ArrayList<>();
        for(int i = 0; i < strs.length;i++){
            List<String> list = map.getOrDefault(SortedString(strs[i]), new ArrayList<>());
            list.add(strs[i]);
            map.put(SortedString(strs[i]),list);
        }
        for (String i : map.keySet()) {
            list1.add(map.get(i));
        }

        System.out.println(list1);
    }

    public static String SortedString(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
