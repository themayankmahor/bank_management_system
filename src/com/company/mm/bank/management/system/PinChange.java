package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    //
    JButton textButton_change, textButton_back;

    //
    JPasswordField passwordField_pin, passwordField_rePin;

    //
    String pinNumber;

    //
    PinChange(String pinNumber)
    {
        this.pinNumber = pinNumber;
        //
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/mm/icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900 , 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        //
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        ///
        JLabel text_change = new JLabel("CHANGE YOUR PIN");
        text_change.setForeground(Color.WHITE);
        text_change.setFont(new Font("System", Font.BOLD, 16));
        text_change.setBounds(250, 280, 500, 35);
        image.add(text_change);


        ///
        JLabel text_pinText = new JLabel("New PIN: ");
        text_pinText.setForeground(Color.WHITE);
        text_pinText.setFont(new Font("System", Font.BOLD, 16));
        text_pinText.setBounds(165, 320, 180, 25);
        image.add(text_pinText);
        //
        passwordField_pin = new JPasswordField();
        passwordField_pin.setFont(new Font("Raleway", Font.BOLD, 25));
        passwordField_pin.setBounds(330, 320, 180, 25);
        image.add(passwordField_pin);


        ///
        JLabel text_rePin = new JLabel("Re-Enter New PIN: ");
        text_rePin.setForeground(Color.WHITE);
        text_rePin.setFont(new Font("System", Font.BOLD, 16));
        text_rePin.setBounds(165, 360, 180, 25);
        image.add(text_rePin);
        //
        passwordField_rePin = new JPasswordField();
        passwordField_rePin.setFont(new Font("Raleway", Font.BOLD, 25));
        passwordField_rePin.setBounds(330, 360, 180, 25);
        image.add(passwordField_rePin);


        ///
        textButton_change = new JButton("CHANGE");
        textButton_change.setBounds(355, 485, 150, 30);
        textButton_change.addActionListener(this);
        image.add(textButton_change);

        ///
        textButton_back = new JButton("BACK");
        textButton_back.setBounds(355, 520, 150, 30);
        textButton_back.addActionListener(this);
        image.add(textButton_back);


        //
        setSize(900, 900);

        //
        setUndecorated(true);

        //
        setLocationRelativeTo(null);

        //
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == textButton_change) {
            try {
                String newPin = passwordField_pin.getText();
                String rePin = passwordField_rePin.getText();

                //
                if (!newPin.equals(rePin)) {
                    JOptionPane.showMessageDialog(null, "Entered Pin doesn't match");
                    return;
                }

                //
                if (newPin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter new PIN");
                    return;
                }

                //
                if (rePin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN");
                    return;
                }

                ///
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rePin+"' where pin = '"+pinNumber+"'";
                String query2 = "update login set pin = '"+rePin+"' where pin = '"+pinNumber+"'";
                String query3 = "update signupthree set pin = '"+rePin+"' where pin = '"+pinNumber+"'";

                //
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                //
                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");

                //
                setVisible(false);

                //
                new Transaction(rePin).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else
        {
            //
            setVisible(false);

            //
            new Transaction(pinNumber).setVisible(true);
        }
    };

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
