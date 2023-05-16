package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {

    //
    MiniStatement(String pinNumber)
    {
        //
        setLayout(null);
        //
        int frameWidth = 400;
        int frameHeight = 600;

        //
        JLabel text_mini = new JLabel();
        add(text_mini);

        ///
        JLabel text = new JLabel();
        add(text);

        //
        JLabel text_bankName = new JLabel("INDIAN BANK");
        text_bankName.setBounds(150,20,100,20);
        add(text_bankName);

        //
        JLabel text_card = new JLabel();
        text_card.setBounds(20,80,300,20);
        add(text_card);

        //
        JLabel text_balance = new JLabel();
        text_balance.setBounds(20, 400, 300, 20);
        add(text_balance);

        try
        {
            Conn conn = new Conn();
            ResultSet resultSet = conn.s.executeQuery("select * from login where pin = '"+pinNumber+"'");

            //
            while (resultSet.next())
            {
                //
                text_card.setText("Card Number: " + resultSet.getString("card_no").substring(0,4)+ "XXXXXXXX" + resultSet.getString("card_no").substring(12));
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }


        ///
        try
        {
            Conn conn = new Conn();
            int balance = 0;
            ResultSet resultSet = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");

            //
            while (resultSet.next())
            {
                text_mini.setText(text_mini.getText() +"<html>"+resultSet.getString("date") + "&nbsp&nbsp&nbsp&nbsp&nbsp:"+ resultSet.getString("type") + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:"+resultSet.getString("amount") +"<br><br><html>");

                    if (resultSet.getString("type").equals("Deposit"))
                    {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }
                    else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
            }
            text_balance.setText("Your Current account balance is Rs. "+balance);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        //
        text_mini.setBounds(20, 140, 400,200);

        //
        setSize(frameWidth, frameHeight);
        //
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        //
        setVisible(true);
    }

    public static void main(String[] args) {

        new MiniStatement("");

    }
}
