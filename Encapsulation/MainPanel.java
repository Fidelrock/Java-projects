class MyPanel extends JPanel{
    MyPanel(){
        setBackground(Color.black);
        JLabel label = new JLabel("Hello, World !!");

        label.setFont(new Font(null,Font.BOLD,40));
        label.setForeground(Color.red);
        add(label);
    }
}