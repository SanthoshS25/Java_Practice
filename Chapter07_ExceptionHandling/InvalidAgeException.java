package Chapter07_ExceptionHandling;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String Message){
        super(Message);
    }
}
