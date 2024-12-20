package Assignment;

/**
 * Program to demonstrate ArrayIndexOutOfBoundsException.
 * This program accesses an invalid array index to trigger an ArrayIndexOutOfBoundsException.
 */
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== ArrayIndexOutOfBoundsException Example ===");
        try {
            int[] arr = {1, 2, 3};
            int invalidElement = arr[5]; // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to access invalid array index.");
        }
    }
}