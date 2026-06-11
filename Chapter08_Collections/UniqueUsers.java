package Chapter08_Collections;
import java.util.HashSet;

public class UniqueUsers {
    public static void main(String[] args) {
        int arr[] = {101, 102, 103, 101, 104, 102, 105};
        HashSet <Integer> set = new HashSet<>();
        for (int element : arr) {
            set.add(element);
        }
        System.out.println("The Unique User List : " + set);
        System.out.println("The count of the unique Users list : " + set.size());
        System.out.println((set.contains(103))? "It contains 103rd User" : "It doesn't Contains 103rd User");
        set.remove(103);
        System.out.println("The Unique User List : " + set);
    }
}
