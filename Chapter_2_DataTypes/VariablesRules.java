package Chapter_2_DataTypes;

public class VariablesRules {
    public static void main(String[] args) {
        long phoneNumber = 1234567890L; // choose long - as the phone number requires more memory where int can be used
        float cgpa = 8.2F; // choose float - as it is combination of integer + decimal value
        byte age = 20; // choose byte - as it age ranges atmost 100
        String name = "Santhosh"; // choose string as it combination of char
        char firstNameOfCollege = 'K'; // choose char - as it store just single character
        boolean placedOrNot = false; // choose boolean - to denote true or false

        System.out.println(phoneNumber);
        System.out.println(cgpa);
        System.out.println(age);
        System.out.println(name);
        System.out.println(firstNameOfCollege);
        System.out.println(placedOrNot);
    }
}
