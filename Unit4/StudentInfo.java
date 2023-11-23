import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfo {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Student Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create and add labels and text fields for each field
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel rollNoLabel = new JLabel("Roll No:");
        JTextField rollNoField = new JTextField(20);
        JLabel cpiLabel = new JLabel("CPI:");
        JTextField cpiField = new JTextField(20);
        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField(20);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(rollNoLabel);
        frame.add(rollNoField);
        frame.add(cpiLabel);
        frame.add(cpiField);
        frame.add(emailLabel);
        frame.add(emailField);

        // Create a button to display the information
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);

        // Create a text area to display the result
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        frame.add(resultArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String rollNo = rollNoField.getText();
                String cpi = cpiField.getText();
                String email = emailField.getText();

                String result = "Name: " + name + "\nRoll No: " + rollNo + "\nCPI: " + cpi + "\nE-mail: " + email;
                resultArea.setText(result);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
