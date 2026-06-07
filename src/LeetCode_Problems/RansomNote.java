package src.LeetCode_Problems;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char letter : magazine.toCharArray()) {
            map.put(letter,map.getOrDefault(letter,0)+1);
        }
        for (char letter : ransomNote.toCharArray()) {
            if(map.getOrDefault(letter, 0) <= 0){
                return false;
            }
            if(map.getOrDefault(letter, 0) > 0){
                map.put(letter,map.getOrDefault(letter,0)-1);
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomeNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomeNote, magazine));
    }
}
