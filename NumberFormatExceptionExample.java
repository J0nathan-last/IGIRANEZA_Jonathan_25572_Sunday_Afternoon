package Assignment;

/**
 * Program to demonstrate NumberFormatException.
 * This program converts an invalid string to a number to trigger a NumberFormatException.
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== NumberFormatException Example ===");
        try {
            int number = Integer.parseInt("not_a_number"); // Invalid string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting invalid number conversion.");
        }
    }
}