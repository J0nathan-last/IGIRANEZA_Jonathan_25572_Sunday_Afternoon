package Assignment;

/**
 * Program to demonstrate ClassNotFoundException.
 * This program tries to load a non-existent class to trigger a ClassNotFoundException.
 */
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ClassNotFoundException Example ===");
        try {
            // Attempting to load a non-existent class
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            // Catch block to handle ClassNotFoundException
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to load the class.");
        }
    }
}
