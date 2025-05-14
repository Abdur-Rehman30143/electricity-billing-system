package electricity.billing.system;

import javax.swing.*;
import java.awt.*;


public class Login extends JFrame  {
    JTextField usertext,userpassword;
    Choice LoginChoice;
    JButton loginButton,cancelButton,signupButton;
    Login(){
        super("LOG IN ");
        getContentPane().setBackground(Color.white);
        JLabel Username=new JLabel("user name");
        Username.setBounds(300,60,100,20);
        add(Username);

        usertext=new JTextField();
        usertext.setBounds(400,60,120,20);
        add(usertext);

        JLabel password=new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);

        userpassword =new JTextField();
        userpassword.setBounds(400,100,120,20);
        add(userpassword);

        JLabel login= new JLabel("Log in");
        login.setBounds(300,140,100,20);
        add(login);

        LoginChoice=new Choice();
        LoginChoice.setBounds(400,140,120,20);
        add(LoginChoice);
        LoginChoice.add("Admin");
        LoginChoice.add("Custumer");

        loginButton=new JButton("Login");
        loginButton.setBounds(340,180,75,23);
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.white);
        add(loginButton);

        cancelButton=new JButton("Cancel");
        cancelButton.setBounds(450,180,75,23);
        cancelButton.setBackground(Color.BLUE);
        cancelButton.setForeground(Color.white);
        add(cancelButton);

        signupButton=new JButton("Sign Up");
        signupButton.setBounds(400,220,80,23);
        signupButton.setBackground(Color.BLUE);
        signupButton.setForeground(Color.white);
        add(signupButton);


        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image imageOne=imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(imageOne);
        JLabel imageLabel=new JLabel(imageIcon1);
        imageLabel.setBounds(2,2,250,250);
        add(imageLabel);


        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }





    public static void main(String[]args){
        new Login();
    }
}
