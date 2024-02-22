registerButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // TODO: Insert code to insert the user data into the database
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
});
