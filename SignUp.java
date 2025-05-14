

package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;

public class SignUp extends JFrame {
    Choice loginChoice;
    JTextField meterText, employeeText, usernameText, nameText;
    JPasswordField passwordText;
    JButton createButton, backButton;
    JLabel meterLabel, employeeLabel;

    SignUp() {
        super("Sign Up");
        getContentPane().setBackground(new Color(139, 227, 199));
        setLayout(null);

        JLabel createLabel = new JLabel("Create Account As");
        createLabel.setBounds(20, 30, 130, 20);
        add(createLabel);

        loginChoice = new Choice();
        loginChoice.setBounds(160, 30, 120, 20);
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        add(loginChoice);

        meterLabel = new JLabel("Meter No");
        meterLabel.setBounds(20, 85, 120, 20);
        meterLabel.setVisible(false);
        add(meterLabel);

        meterText = new JTextField();
        meterText.setBounds(160, 85, 120, 20);
        meterText.setVisible(false);
        add(meterText);

        employeeLabel = new JLabel("Employee ID");
        employeeLabel.setBounds(20, 85, 120, 20);
        add(employeeLabel);

        employeeText = new JTextField();
        employeeText.setBounds(160, 85, 120, 20);
        add(employeeText);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(20, 120, 120, 20);
        add(usernameLabel);

        usernameText = new JTextField();
        usernameText.setBounds(160, 120, 120, 20);
        add(usernameText);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 155, 120, 20);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(160, 155, 120, 20);
        add(nameText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 195, 120, 20);
        add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(160, 195, 120, 20);
        add(passwordText);

        loginChoice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String userType = loginChoice.getSelectedItem();
                if (userType.equals("Customer")) {
                    employeeLabel.setVisible(false);
                    employeeText.setVisible(false);
                    meterLabel.setVisible(true);
                    meterText.setVisible(true);
                } else {
                    employeeLabel.setVisible(true);
                    employeeText.setVisible(true);
                    meterLabel.setVisible(false);
                    meterText.setVisible(false);
                }
            }
        });

        createButton = new JButton("Create");
        createButton.setBounds(30, 260, 75, 30);
        createButton.setBackground(Color.blue);
        createButton.setForeground(Color.white);
        add(createButton);

        backButton = new JButton("Back");
        backButton.setBounds(175, 260, 75, 30);
        backButton.setBackground(Color.blue);
        backButton.setForeground(Color.white);
        add(backButton);

        // Optional image
        try {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
            Image img = icon.getImage().getScaledInstance(210, 210, Image.SCALE_DEFAULT);
            JLabel imgLabel = new JLabel(new ImageIcon(img));
            imgLabel.setBounds(310, 60, 210, 210);
            add(imgLabel);
        } catch (Exception ex) {
            System.out.println("Image not found.");
        }

        setSize(600, 380);
        setLocation(500, 200);
        setVisible(true);
    }





    public static void main(String[] args) {
        new SignUp();
    }
}
