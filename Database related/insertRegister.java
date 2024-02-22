try {
    // Create a connection to the database
    String url = "jdbc:mysql://localhost:3306/ums";
    String username = "your_username";
    String password = "your_password";
    Connection connection = DriverManager.getConnection(url, username, password);

    // Create a PreparedStatement object
    String query = "INSERT INTO Student_login(username, password) VALUES(?, ?)";
    PreparedStatement pstmt = connection.prepareStatement(query);

    // Set the values of the PreparedStatement object
    String username = "john123";
    String password = "password123";
    pstmt.setString(1, username);
    pstmt.setString(2, password);

    // Execute the PreparedStatement object
    pstmt.executeUpdate();

    // Close the connection and PreparedStatement objects
    pstmt.close();
    connection.close();
} catch (SQLException e) {
    // Handle any SQL exceptions
    e.printStackTrace();
    
}
