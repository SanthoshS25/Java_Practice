package Chapter_2_DataTypes;

public class FloatVsDouble {
    public static void main(String[] args) {
        float result1 = (float) ((float) 10.0 / 3.0);
        double result2 = 10.0 / 3.0;

        double cgpa = 8.34567;
        System.out.printf("CGPA: %.2f", cgpa);
        System.out.println("\n");
        System.out.println(result1);
        System.out.println(result2);
    }
}
