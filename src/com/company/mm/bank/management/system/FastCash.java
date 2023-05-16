package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.util.Date;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener {

    //
    JButton button_100, button_500, button_1000, button_2000, button_5000, button_10000, button_back;
    //
    String pinNumber;

    FastCash(String pinNumber)
    {
        //
        this.pinNumber = pinNumber;
        //
        int frameWidth = 900;
        int frameHeight = 900;

        //set initial layout to null
        setLayout(null);

        //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/company/mm/icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        //Atm Image
        JLabel image_atm = new JLabel(i3);
        image_atm.setBounds(0, 0, frameWidth, frameHeight);
        add(image_atm);

        //text
        JLabel text_selectTransaction = new JLabel("SELECT WITHDRAWAL AMOUNT:");
        text_selectTransaction.setBounds(215, 300, 700, 35);
        text_selectTransaction.setForeground(Color.WHITE);
        text_selectTransaction.setFont(new Font("System", Font.BOLD, 16));
        image_atm.add(text_selectTransaction);


        ///
        button_100 = new JButton("Rs 100");
        button_100.setBounds(170, 415, 150,30);
        button_100.addActionListener(this);
        image_atm.add(button_100);

        ///
        button_500 = new JButton("Rs 500");
        button_500.setBounds(355, 415, 150,30);
        button_500.addActionListener(this);
        image_atm.add(button_500);

        ///
        button_1000 = new JButton("Rs 1000");
        button_1000.setBounds(170, 450, 150,30);
        button_1000.addActionListener(this);
        image_atm.add(button_1000);

        ///
        button_2000 = new JButton("Rs 2000");
        button_2000.setBounds(355, 450, 150,30);
        button_2000.addActionListener(this);
        image_atm.add(button_2000);

        ///
        button_5000 = new JButton("Rs 5000");
        button_5000.setBounds(170, 485, 150,30);
        button_5000.addActionListener(this);
        image_atm.add(button_5000);

        ///
        button_10000 = new JButton("Rs 10000");
        button_10000.setBounds(355, 485, 150,30);
        button_10000.addActionListener(this);
        image_atm.add(button_10000);

        ///
        button_back = new JButton("Back");
        button_back.setBounds(355, 520, 150,30);
        button_back.addActionListener(this);
        image_atm.add(button_back);


        //create frame
        setSize(frameWidth, frameHeight);
        //open on center of screen
        setLocationRelativeTo(null);
        //remove window frame
        setUndecorated(true);
        //set visibility -> true
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == button_back)
        {
            //
            setVisible(false);
            //
            new Transaction(pinNumber).setVisible(true);
        }
        else
        {
            //
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            //
            try
            {
                //
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
                int balance = 0;

                //
                while(rs.next())
                {
                    if (rs.getString("type").equals("Deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                //
                if (ae.getSource() != button_back && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " +amount+ " Debited successfully");

                //close current frame
                setVisible(false);

                //
                new Transaction(pinNumber).setVisible(true);

            }catch (Exception e)
            {
                System.out.println(e);
            }
        }

    };

    public static void main(String[] args) {

        new FastCash("");
    }
}
