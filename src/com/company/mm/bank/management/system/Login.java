package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton button_login, button_signup, button_clear;
    JTextField textField_card;
    JPasswordField passwordField_pin;

    //Constructor
    Login()
    {
        //set window title
        setTitle("AUTOMATED TELLER MACHINE");

        //null -> initial layout
        setLayout(null);

        //get image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/mm/icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);                //scale logo image
        ImageIcon i3 = new ImageIcon(i2);                                                                   //get new scaled image
        JLabel label = new JLabel(i3);                                                                      //pass scaled image through JLabel
        label.setBounds(70, 10, 100, 100);
        //add image to Frame
        add(label);

        //add text (Welcome to ATM) "TITLE"
        JLabel text_title = new JLabel("Welcome To ATM");
        text_title.setFont(new Font("Osward", Font.BOLD, 38));
        text_title.setBounds(200, 40, 400, 40);
        add(text_title);

        //add text (Card No)
        JLabel text_cardNo = new JLabel("Card No: ");
        text_cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        text_cardNo.setBounds(120, 150, 150, 30);
        add(text_cardNo);
        //Text Field(card)
        textField_card = new JTextField();
        textField_card.setBounds(300, 150, 230, 30);
        textField_card.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField_card);

        //add text (Pin)
        JLabel text_pin = new JLabel("Pin: ");
        text_pin.setFont(new Font("Raleway", Font.BOLD, 28));
        text_pin.setBounds(120, 220, 250, 30);
        add(text_pin);
        //Text Field(pin)
        passwordField_pin = new JPasswordField();
        passwordField_pin.setBounds(300, 220, 230, 30);
        passwordField_pin.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField_pin);

        //Login Button
        button_login = new JButton("SIGN IN");
        button_login.setBounds(300, 300, 100, 30);                      //set button location
        button_login.setBackground(Color.BLACK);                                          //set button color
        button_login.setForeground(Color.WHITE);                                          //set button text color
        button_login.addActionListener(this);
        add(button_login);

        //Clear Button
        button_clear = new JButton("CLEAR");
        button_clear.setBounds(430, 300, 100, 30);                      //set button location
        button_clear.setBackground(Color.BLACK);                                          //set button color
        button_clear.setForeground(Color.WHITE);                                          //set button text color
        button_clear.addActionListener(this);
        add(button_clear);


        //Sign up Button
        button_signup = new JButton("SIGN UP");
        button_signup.setBounds(300, 350, 230, 30);                      //set button location
        button_signup.setBackground(Color.BLACK);                                          //set button color
        button_signup.setForeground(Color.WHITE);                                          //set button text color
        button_signup.addActionListener(this);
        add(button_signup);

        //change background color
        getContentPane().setBackground(Color.WHITE);

        //set window(Frame) size
        setSize(800, 480);

        //set window(Frame) visibility
        setVisible(true);

        //set window location
        //setLocation(350,200);
        setLocationRelativeTo(null);        //set creation of window on middle of screen
    };


    ///action performed (abstract )
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == button_clear)
        {
            //clear(empty) card and pin text field
            textField_card.setText("");
            passwordField_pin.setText("");
        }
        else if (ae.getSource() == button_login)
        {
            Conn conn = new Conn();
            String cardNumber = textField_card.getText();
            String pinNumber = passwordField_pin.getText();
            String query = "select * from login where card_no = '"+cardNumber+"' and pin = '"+pinNumber+"'";

            try {
                ResultSet resultSet = conn.s.executeQuery(query);

                //
                if (resultSet.next())
                {
                    //
                    setVisible(false);
                    //
                    Transaction transaction = new Transaction(pinNumber);
                    transaction.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Pin");
                }

            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == button_signup)
        {
            //goto sign up page
            setVisible(false);
            SignUpOne signUpOne = new SignUpOne();
            signUpOne.setVisible(true);
        }
    }

}
