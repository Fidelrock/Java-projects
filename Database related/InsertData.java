import java.sql.*;
import java.util.Scanner;

public class InsertData {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/your_database_name";

    // Database credentials
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Prepare a statement for inserting data
            String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            // Get user input for name, email, and age
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            // Set the values of the prepared statement
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, age);

            // Execute the statement and insert the data into the database
            int rows = stmt.executeUpdate();
            System.out.println(rows + " rows inserted successfully.");

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            } // do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
            scanner.close();
        } // end try
    }
}
