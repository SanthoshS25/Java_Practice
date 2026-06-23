package Chapter10_FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OrderHistoryBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Chapter10_FileHandling/orders.txt"));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println("Line " + ++count + " : " + line);
            }
            System.out.println("Total No of Lines : " + count);
        } catch (IOException e) {
            System.out.println("Reading error");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Reading error");
            }
        }
    }

}
