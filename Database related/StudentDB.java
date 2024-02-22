import java.sql.*;

public class StudentDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Insert a new student record
            String sql = "INSERT INTO student (regno, firstname, lastname, programme, status) " +
                         "VALUES ('12345', 'John', 'Doe', 'Computer Science', 'Active')";
            statement.executeUpdate(sql);

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
