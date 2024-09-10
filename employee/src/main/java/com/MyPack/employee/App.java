package com.MyPack.employee;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public App() {
        // Setup login window
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // No layout manager, using manual bounds

        // Title Label
        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(100, 10, 200, 30); // Setting bounds for title
        add(titleLabel);

        // Username Label
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 50, 100, 30); // Setting bounds for username label
        add(lblUsername);

        // Username Field
        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 150, 30); // Setting bounds for username field
        add(usernameField);

        // Password Label
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 100, 100, 30); // Setting bounds for password label
        add(lblPassword);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30); // Setting bounds for password field
        add(passwordField);

        // Login Button
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 100, 30); // Setting bounds for login button
        add(btnLogin);

        // Login button action listener
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Static username and password for login validation
                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    dispose(); // Close login window

                    // Open Employee Management App after login
                    new EmployeeManagementApp();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new App(); // Open login page first
    }
}
