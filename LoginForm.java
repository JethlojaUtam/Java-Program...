import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple login form using Java Swing.
 * Note: The class name is now "LoginForm".
 */
public class LoginForm extends JFrame implements ActionListener {

    // Declare components
    private final Container container;
    private final JLabel userLabel;
    private final JLabel passwordLabel;
    private final JTextField userTextField;
    private final JPasswordField passwordField;
    private final JButton loginButton;
    private final JButton resetButton;
    private final JCheckBox showPassword;

    /**
     * Constructor to set up the GUI components.
     */
    public LoginForm() {
        // Set the title of the frame
        setTitle("Login Form");
        // Make the frame visible
        setVisible(true);
        // Set the size of the frame
        setBounds(10, 10, 370, 300);
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make the frame not resizable
        setResizable(false);

        // Get the content pane
        container = getContentPane();
        // Set the layout manager to null for absolute positioning
        container.setLayout(null);

        // --- User Label and TextField ---
        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        userLabel.setBounds(50, 50, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        userTextField.setBounds(150, 50, 150, 30);
        container.add(userTextField);

        // --- Password Label and PasswordField ---
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setBounds(50, 100, 100, 30);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setBounds(150, 100, 150, 30);
        container.add(passwordField);

        // --- Show Password CheckBox ---
        showPassword = new JCheckBox("Show Password");
        showPassword.setFont(new Font("Arial", Font.PLAIN, 12));
        showPassword.setBounds(150, 135, 150, 20);
        container.add(showPassword);

        // --- Login and Reset Buttons ---
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 15));
        loginButton.setBounds(50, 180, 100, 30);
        container.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.BOLD, 15));
        resetButton.setBounds(200, 180, 100, 30);
        container.add(resetButton);

        // Add action listeners to the components
        addActionEvent();
    }

    /**
     * Adds action listeners to the buttons and checkbox.
     */
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    /**
     * Handles actions performed on the components.
     * @param e The ActionEvent object.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Logic for Login Button
        if (e.getSource() == loginButton) {
            String userText = userTextField.getText();
            String pwdText = new String(passwordField.getPassword());

            // Hardcoded credentials for demonstration
            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Logic for Reset Button
        else if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        // Logic for Show Password Checkbox
        else if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                // Show password characters
                passwordField.setEchoChar((char) 0);
            } else {
                // Hide password characters with a dot
                passwordField.setEchoChar('•');
            }
        }
    }

    /**
     * The main method to run the application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // To fix the error "Could not find or load main class LoginForm":
        // 1. Save this file as "LoginForm.java".
        // 2. Compile it from the terminal: javac LoginForm.java
        // 3. Run it from the terminal: java LoginForm
        
        // Create an instance of the login form
        new LoginForm();
    }
}
