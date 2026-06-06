package Chapter07_ExceptionHandling;

public class ThrowDemo1 {
    public static void main(String[] args) {
        try {
            processFile();
        } catch (Exception e) {
            System.out.println("The file is not found and detail info: " + e.getMessage());
        }
    }

    public static void processFile() throws Exception{
        readFile();
    }
    public static void readFile() throws Exception{
        throw new Exception("File not found");
    }

}
