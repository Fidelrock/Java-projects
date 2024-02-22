import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataExample {
    
    // MySQL database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "username";
    private static final String PASS = "password";
    
    public static void main(String[] args) {
        
        // SQL statement to insert data
        String sql = "INSERT INTO employees (id, name, age) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Set parameter values
            stmt.setInt(1, 1);
            stmt.setString(2, "John Doe");
            stmt.setInt(3, 30);
            
            // Execute the SQL statement
            int rowsInserted = stmt.executeUpdate();
            
            // Check the number of rows inserted
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
