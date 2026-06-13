package Chapter10_FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("Chapter10_FileHandling/orders.txt");
        FileWriter fw = null;
        try{
            fw = new FileWriter(file,false);
        fw.write("Order1: Burger - Rs.100\n");
        fw.write("Order2: Pizza - Rs.200\n");
        fw.write("Order3: Dosa - Rs.50\n");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                if(fw != null) fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
}
}