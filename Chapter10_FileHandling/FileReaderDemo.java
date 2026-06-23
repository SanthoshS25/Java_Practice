package Chapter10_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Chapter10_FileHandling/daily_reports.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("lines in the file : " + line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
