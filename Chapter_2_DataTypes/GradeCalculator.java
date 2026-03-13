package Chapter_2_DataTypes;

public class GradeCalculator {
    public static void main(String[] args) {
        
        int marks = 70; // In question, they mentioned to decalre marks as int so i have decalred like this other wise byte is enough

        if (marks >= 90){ // checks whether the marks are greater than or equal to 90
            System.out.println("A Grade");
        }else if (marks >= 75){ // checks whether the marks are greater than or equal to 75
            System.out.println("B Grade");
        }else if (marks >= 35){ // checks whether the marks are greater than or equal to 35
            System.out.println("C Grade");
        }
        else { // if all the above condition fails , else block will be executed
            System.out.println("Fail");
        }
        System.out.println((marks >= 35)? "Passed" : "Failed"); // checks whether the student is passed or failed
    }
}
