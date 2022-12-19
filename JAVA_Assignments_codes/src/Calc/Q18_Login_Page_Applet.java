//Q18_Login_Page_Applet
package JAVA_Lab_File;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends Applet {

    Label userNameLabel, passwordLabel;
    JTextField userName;
    JPasswordField password;

    public void init() {

        userNameLabel = new Label("User Name");
        userName = new JTextField(20);
        userName.setText("User Name");
        passwordLabel = new Label("Password");
        password = new JPasswordField(20);
        password.setText("Password");
        password.setEchoChar('#');
        login = new Button("Login");
        reset = new Button("Reset");
        userNameLabel.setBounds(10, 10, 100, 20);
        userName.setBounds(150, 10, 150, 20);
        passwordLabel.setBounds(10, 50, 100, 20);
        password.setBounds(150, 50, 150, 20);
        login.setBounds(50, 100, 100, 20);
        login.setBackground(Color.GREEN);
        reset.setBounds(200, 100, 100, 20);
        reset.setBackground(Color.CYAN);
        //set applet layout to null
        setLayout(null);
        //add elements to applet
        add(userNameLabel);
        add(userName);
        add(passwordLabel);
        add(password);
        add(login);
        add(reset);

        //set size of applet
        setSize(400, 300);

        //login button click
        login.addActionListener((ActionListener) ae -> {
            String uname = userName.getText();
            String passwd = password.getText();
            System.out.println("User Name :" + uname);
            System.out.println("Password :" + passwd);
            if (uname.equals("Bond007") && passwd.equals("James007")) {
                JOptionPane.showMessageDialog(null, "Successfully Login");
            } else {
                JOptionPane.showMessageDialog(null, "Opps username/ password is incorrect");
            }

        });
        //reset button click
        reset.addActionListener((ActionListener) ae -> {
            userName.setText("");
            password.setText("");

        });

    }
}