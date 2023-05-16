package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    //
    JTextField textField_amount;

    //
    JButton button_deposit, button_back;

    //
    String pinNumber;
    //
    Deposit(String pinNumber)
    {
        this.pinNumber = pinNumber;
        //
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/mm/icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        //
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900, 900);
        add(image);

        ///
        JLabel text_enterAmount = new JLabel("Enter the Amount you want to deposit");
        text_enterAmount.setForeground(Color.WHITE);
        text_enterAmount.setFont(new Font("System", Font.BOLD, 16));
        text_enterAmount.setBounds(170, 300, 400, 20);
        image.add(text_enterAmount);

        ///
        textField_amount = new JTextField();
        textField_amount.setFont(new Font("Raleway", Font.BOLD, 22));
        textField_amount.setBounds(170,350, 320,25);
        image.add(textField_amount);

        ///
        button_deposit = new JButton("Deposit");
        button_deposit.setBounds(355, 485, 150, 30);
        button_deposit.addActionListener(this);
        image.add(button_deposit);

        ///
        button_back = new JButton("Back");
        button_back.setBounds(355, 520, 150, 30);
        button_back.addActionListener(this);
        image.add(button_back);


        //
        setSize(900, 900);
        setLocationRelativeTo(null);
        setVisible(true);
    };

    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_deposit)
        {
            //
            String depositAmount = textField_amount.getText();
            Date date = new Date();

            //
            try{
                //
                if (depositAmount.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to Deposit");
                }
                else
                {
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Deposit', '"+depositAmount+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+depositAmount+" Deposited successfully");
                    //
                    setVisible(false);
                    //
                    new Transaction(pinNumber).setVisible(true);
                }

            }
            catch (Exception e)
            {
                System.out.println(e);
            }

        }
        else if (ae.getSource() == button_back)
        {
            //
            setVisible(false);
            //
            new Transaction(pinNumber).setVisible(true);
        }
    };

    public static void main(String[] args) {
        new Deposit("");
    }

}
