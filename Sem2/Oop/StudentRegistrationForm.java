import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    // Components
    JLabel title, nameLabel, ageLabel, genderLabel, courseLabel;
    JTextField nameField, ageField;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JComboBox<String> courseBox;
    JButton submitBtn, resetBtn;
    JTextArea output;

    StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        title = new JLabel("Student Registration Form");
        title.setBounds(120, 20, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title);

        // Name
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 80, 200, 25);
        add(nameField);

        // Age
        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 120, 100, 25);
        add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(150, 120, 200, 25);
        add(ageField);

        // Gender
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 160, 100, 25);
        add(genderLabel);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(150, 160, 80, 25);
        female.setBounds(230, 160, 100, 25);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        add(male);
        add(female);

        // Course
        courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 200, 100, 25);
        add(courseLabel);

        String courses[] = {"BCA", "MCA", "BSc", "MSc"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 200, 200, 25);
        add(courseBox);

        // Buttons
        submitBtn = new JButton("Submit");
        submitBtn.setBounds(100, 250, 100, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(220, 250, 100, 30);
        resetBtn.addActionListener(this);
        add(resetBtn);

        // Output area
        output = new JTextArea();
        output.setBounds(50, 300, 350, 120);
        output.setEditable(false);
        add(output);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitBtn) {
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = "";

            if (male.isSelected()) gender = "Male";
            else if (female.isSelected()) gender = "Female";

            String course = (String) courseBox.getSelectedItem();

            // Validation
            if (name.isEmpty() || age.isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
            } else {
                output.setText("Registration Successful!\n\n");
                output.append("Name: " + name + "\n");
                output.append("Age: " + age + "\n");
                output.append("Gender: " + gender + "\n");
                output.append("Course: " + course);
            }
        }

        if (e.getSource() == resetBtn) {
            nameField.setText("");
            ageField.setText("");
            genderGroup.clearSelection();
            courseBox.setSelectedIndex(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}