package Assignement;

/**
 * Program to demonstrate ArithmeticException.
 * This program performs division by zero to trigger an ArithmeticException.
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ArithmeticException Example ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting the calculation.");
        }
    }
}