package Assignment;

import java.sql.*;

/**
 * Program to demonstrate SQLException.
 * This program tries to connect to a non-existent database to trigger a SQLException.
 */
public class SQLExceptionExample {
    public static void main(String[] args) {
        System.out.println("=== SQLException Example ===");
        try {
            // Attempting to connect to a non-existent database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            // Catch block to handle SQLException
            System.out.println("SQLException caught: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting database connection.");
        }
    }
}