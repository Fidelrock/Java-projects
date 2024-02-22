import java.sql.*;

public class StudentDB1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb1";
        String username = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Search for courses taken by a student in a given semester
            String sql = "SELECT c.coursename " +
                         "FROM course c " +
                         "INNER JOIN studentcourse sc ON c.coursecode = sc.coursecode " +
                         "WHERE sc.regno = '12345' AND sc.semester = 'Spring 2023'";
            ResultSet resultSet = statement.executeQuery(sql);

            // Print the results
            while (resultSet.next()) {
                System.out.println(resultSet.getString("coursename"));
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
