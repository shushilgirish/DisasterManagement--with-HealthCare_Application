
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimesheetPanel extends JPanel {

    // Components for login
    private JComboBox<String> roleComboBox;
    private JTextField usernameField;
    private JButton loginButton;

    // Components for timesheet entry
    private JTextField[] hourFields;
    private JButton submitButton;
    private JLabel totalPayLabel;

    // User details
    private String currentUserRole;

    public TimesheetPanel() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components for login
        roleComboBox = new JComboBox<>(new String[] {"Doctor", "Nurse"});
        usernameField = new JTextField(10);
        loginButton = new JButton("Login");

        // Add login components to panel
        add(new JLabel("Role:"));
        add(roleComboBox);
        add(new JLabel("Username:"));
        add(usernameField);
        add(loginButton);

        // Initialize components for timesheet entry
        hourFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            hourFields[i] = new JTextField(2);
            add(new JLabel("Day " + (i + 1) + ":"));
            add(hourFields[i]);
        }

        submitButton = new JButton("Submit Timesheet");
        totalPayLabel = new JLabel("Total Pay: $0.00");

        // Add timesheet components to panel
        add(submitButton);
        add(totalPayLabel);

        // Initially hide timesheet components
        setTimesheetVisibility(false);

        // Add action listeners
        loginButton.addActionListener(e -> {
            currentUserRole = (String) roleComboBox.getSelectedItem();
            setTimesheetVisibility(true); // Show timesheet fields after login
        });

        submitButton.addActionListener(e -> calculatePay());
    }

    private void setTimesheetVisibility(boolean visible) {
        for (JTextField field : hourFields) {
            field.setVisible(visible);
        }
        submitButton.setVisible(visible);
        totalPayLabel.setVisible(visible);
    }

    private void calculatePay() {
        try {
            double totalHours = 0;
            double rate = currentUserRole.equals("Doctor") ? 50 : 25;
            for (JTextField field : hourFields) {
                int hours = Integer.parseInt(field.getText());
                if (hours < 0 || hours > 10) {
                    JOptionPane.showMessageDialog(this, "Invalid hour entry. Hours per day should be between 0 and 10.");
                    return;
                }
                totalHours += hours;
            }

            if (totalHours > 50) {
                JOptionPane.showMessageDialog(this, "Invalid total hours. Weekly hours should not exceed 50.");
                return;
            }

            double totalPay = totalHours * rate;
            totalPayLabel.setText("Total Pay: $" + totalPay);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for hours.");
        }
    }

    
}
