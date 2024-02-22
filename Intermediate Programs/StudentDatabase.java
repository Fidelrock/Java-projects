
import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Connect to the database
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:students.db");
            System.out.println("Connected to database");

            // Create a table called "students"
            String sql = "CREATE TABLE students (" +
                         "name TEXT, " +
                         "dob TEXT)";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Table created");

            // Insert some sample data into the table
            sql = "INSERT INTO students (name, dob) VALUES " +
                  "('John Smith', '2002-05-15'), " +
                  "('Mary Johnson', '2003-02-28'), " +
                  "('Tom Jones', '2001-11-08')";
            stmt.executeUpdate(sql);
            System.out.println("Data inserted");

            // Query the table and print the results
            sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String dob = rs.getString("dob");
                System.out.println(name + " | " + dob);
            }
            rs.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Disconnected from database");
                }
            } catch (SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }
}

