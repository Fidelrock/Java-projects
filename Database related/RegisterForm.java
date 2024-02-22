import java.sql.*;

public class RegisterForm {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ums";
        String username = "your_username";
        String password = "your_password";
        
        String user = "user_inputted_username";
        String pass = "user_inputted_password";
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO student_login (username, password) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user);
            statement.setString(2, pass);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("User registered successfully!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
