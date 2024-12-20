package Assignment;

import java.io.*;

/**
 * Program to demonstrate EOFException.
 * This program tries to read beyond the end of an empty file using ObjectInputStream
 * to trigger an EOFException.
 */
public class EOFExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== EOFException Example ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empty_file.txt"))) {
            ois.readObject();
        } catch (EOFException e) {
            // Catch block to handle EOFException
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to read the file.");
        }
    }
}