package Assignment;
import java.io.*;
public class IOExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== IOException Example ===");
        try {
            // Attempting to read a file that does not exist
            BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
            reader.readLine();
        } catch (IOException e) {
            // Catch block to handle IOException
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            // Code in finally block runs regardless of exception occurrence
            System.out.println("Finished attempting to read the file.");
        }
    }
}