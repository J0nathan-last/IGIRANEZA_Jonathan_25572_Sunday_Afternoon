package Assignment;

/**
 * Program to demonstrate ClassCastException.
 * This program performs an invalid type cast to trigger a ClassCastException.
 */
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ClassCastException Example ===");
        try {
            Object obj = new int[42];
            String str = (String) obj; // Invalid type cast
        } catch (ClassCastException e) {
            // Catch block to handle ClassCastException
            System.out.println("ClassCastException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting invalid type cast.");
        }
    }
}