package Chapter10_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("Chapter10_FileHandling/student.txt");
        try {
            if (!file.exists()) {
            System.out.println("File created : " + file.createNewFile());
        } else {
            System.out.println("File already exists / disk full");
        }
        System.out.println("Name of File : " + file.getName());
        System.out.println("Absolute Path of File : " + file.getAbsolutePath());
        System.out.println("Size of File : " + file.length());
        file.delete();
        System.out.println("File exists : " + file.exists());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done!");
        }
        
    }
}
