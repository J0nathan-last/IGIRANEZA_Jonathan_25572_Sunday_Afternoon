package Assignement;
import java.io.*;

/**
 * Program to demonstrate FileNotFoundException.
 * This program tries to open a missing file to trigger a FileNotFoundException
 * and handles it using a try-catch block.
 */
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== FileNotFoundException Example ===");
        try {
            // Attempting to open a file that does not exist
            FileInputStream file = new FileInputStream("missing_file.txt");
        } catch (FileNotFoundException e) {
            // Catch block to handle FileNotFoundException
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to open the file.");
        }
    }
}