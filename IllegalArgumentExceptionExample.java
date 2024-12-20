package Assignment;

/**
 * Program to demonstrate IllegalArgumentException.
 * This program passes an invalid argument to a method to trigger an IllegalArgumentException.
 */
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== IllegalArgumentException Example ===");
        try {
            Thread.sleep(-1000); // Invalid argument
        } catch (IllegalArgumentException | InterruptedException e) {
            // Catch block to handle IllegalArgumentException
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to pass invalid argument.");
        }
    }
}