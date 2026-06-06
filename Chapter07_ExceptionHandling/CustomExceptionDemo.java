package Chapter07_ExceptionHandling;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 17;
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if (age >=18){
            System.out.println("Welcome, You're Eligible");
        }
        else {
            throw new  InvalidAgeException("Age must be 18 or above!");
        }
    }
}
