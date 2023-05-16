package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    //
    JButton button_back;

    //
    String pinNumber;

    //
    BalanceEnquiry(String pinNumber)
    {
        //
        this.pinNumber = pinNumber;
        //
        setLayout(null);


        //
        int frameWidth = 900;
        int frameHeight = 900;

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/mm/icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        ///
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, frameWidth, frameHeight);
        add(image);

        ///
        button_back = new JButton("BACK");
        button_back.setBounds(355, 520, 150, 30);
        button_back.addActionListener(this);
        image.add(button_back);


        ///
        Conn conn = new Conn();
        int totalBalance = 0;

        //
        try{
            ResultSet resultSet = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");


            //
            while (resultSet.next())
            {
                if (resultSet.getString("type").equals("Deposit"))
                {
                    totalBalance += Integer.parseInt(resultSet.getString("amount"));
                }
                else
                {
                    totalBalance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        ///
        JLabel text_balance = new JLabel("Your Current Account balance is Rs " + totalBalance);
        text_balance.setForeground(Color.WHITE);
        text_balance.setBounds(170, 300, 400, 30);
        image.add(text_balance);


        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setUndecorated(true);
        //
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_back)
        {
            //
            setVisible(false);
            //
            new Transaction(pinNumber).setVisible(true);
        }
    };

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
