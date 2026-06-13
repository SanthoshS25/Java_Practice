package Chapter10_FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file = new File("Chapter10_FileHandling/daily_reports.txt");
        FileWriter fw= null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            bw.write("=== Daily Report ===");
            bw.newLine();
            bw.write("1. KFC - Rs.50000");
            bw.newLine();
            bw.write("2. Dominos - Rs.30000");
            bw.newLine();
            bw.write("3. McDonald's - Rs.45000");
            System.out.println("Report Saved! ");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try {
                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
