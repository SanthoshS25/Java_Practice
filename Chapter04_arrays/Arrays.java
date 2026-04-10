package Chapter04_arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] students = {85, 90, 78, 92, 88};
        int total = 0;
        for(int i = 0; i < students.length;i++){
            total += students[i];
        }
        System.out.println("The total of the Students: " + total);
        System.out.println("The average of the Students: " + total/students.length);
    }
}
