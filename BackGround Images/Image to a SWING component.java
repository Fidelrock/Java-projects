JPanel panel = new JPanel();
panel.setLayout(new BorderLayout());
panel.setOpaque(false); // Set the panel to be transparent

JLabel background = new JLabel(new ImageIcon("background.jpg"));
background.setLayout(new BorderLayout());
background.add(otherComponents, BorderLayout.CENTER);

panel.add(background, BorderLayout.CENTER);
