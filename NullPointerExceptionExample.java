package Assignment;

/**
 * Program to demonstrate NullPointerException.
 * This program accesses a null reference to trigger a NullPointerException.
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== NullPointerException Example ===");
        try {
            String str = null;
            str.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Catch block to handle NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to access null reference.");
        }
    }
}