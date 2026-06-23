package Chapter10_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OrderHistoryReader {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("Chapter10_FileHandling/orders.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
