package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {

    //
    JButton button_deposit, button_withdrawal, button_fastCash, button_miniStatement, button_pinChange, button_balanceEnquiry, button_exit;
    //
    String pinNumber;

    Transaction(String pinNumber)
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
        JLabel text_selectTransaction = new JLabel("Please select your Transaction");
        text_selectTransaction.setBounds(215, 300, 700, 35);
        text_selectTransaction.setForeground(Color.WHITE);
        text_selectTransaction.setFont(new Font("System", Font.BOLD, 16));
        image_atm.add(text_selectTransaction);


        ///
        button_deposit = new JButton("Deposit");
        button_deposit.setBounds(170, 415, 150,30);
        button_deposit.addActionListener(this);
        image_atm.add(button_deposit);

        ///
        button_withdrawal = new JButton("Cash Withdrawal");
        button_withdrawal.setBounds(355, 415, 150,30);
        button_withdrawal.addActionListener(this);
        image_atm.add(button_withdrawal);

        ///
        button_fastCash = new JButton("Fast Cash");
        button_fastCash.setBounds(170, 450, 150,30);
        button_fastCash.addActionListener(this);
        image_atm.add(button_fastCash);

        ///
        button_miniStatement = new JButton("Mini Statement");
        button_miniStatement.setBounds(355, 450, 150,30);
        button_miniStatement.addActionListener(this);
        image_atm.add(button_miniStatement);

        ///
        button_pinChange = new JButton("Pin Change");
        button_pinChange.setBounds(170, 485, 150,30);
        button_pinChange.addActionListener(this);
        image_atm.add(button_pinChange);

        ///
        button_balanceEnquiry = new JButton("Balance Enquiry");
        button_balanceEnquiry.setBounds(355, 485, 150,30);
        button_balanceEnquiry.addActionListener(this);
        image_atm.add(button_balanceEnquiry);

        ///
        button_exit = new JButton("Exit");
        button_exit.setBounds(355, 520, 150,30);
        button_exit.addActionListener(this);
        image_atm.add(button_exit);


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
        if (ae.getSource() == button_exit)
        {
            System.exit(0);
        }
        else if (ae.getSource() == button_deposit)
        {
            //
            setVisible(false);
            //
            new Deposit(pinNumber).setVisible(true);
        }
        else if (ae.getSource() == button_withdrawal)
        {
            //
            setVisible(false);
            //
            new Withdrawal(pinNumber).setVisible(true);
        }
        else if (ae.getSource() == button_fastCash)
        {
            //
            setVisible(false);
            //
            new FastCash(pinNumber).setVisible(true);
        }
        else if (ae.getSource() == button_pinChange)
        {
            //
            setVisible(false);
            //
            new PinChange(pinNumber).setVisible(true);
        }
        else if (ae.getSource() == button_balanceEnquiry)
        {
            //
            setVisible(false);
            //
            new BalanceEnquiry(pinNumber).setVisible(true);
        }
        else if (ae.getSource() == button_miniStatement)
        {
            //
            new MiniStatement(pinNumber).setVisible(true);
        }
    };

    public static void main(String[] args) {

        new Transaction("");
    }

}
