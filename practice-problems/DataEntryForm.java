import javax.swing.*;
import java.awt.*;

public class DataEntryForm extends JFrame {
    private JLabel nameLabel, ageLabel, emailLabel;
    private JTextField nameField, ageField, emailField;
    private JButton submitButton;

    public DataEntryForm() {
        setTitle("Data Entry Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize components
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        emailLabel = new JLabel("Email:");
        nameField = new JTextField(20);
        ageField = new JTextField(5);
        emailField = new JTextField(20);
        submitButton = new JButton("Submit");

        // Set layout
        setLayout(new GridLayout(4, 2));

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Empty cell for spacing
        add(submitButton);

        // Add action listener for the submit button
        submitButton.addActionListener(e -> {
            // Retrieve data from text fields
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            // Do something with the data (e.g., print to console)
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);

            // Clear fields after submission
            nameField.setText("");
            ageField.setText("");
            emailField.setText("");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DataEntryForm form = new DataEntryForm();
            form.setVisible(true);
        });
    }
}
