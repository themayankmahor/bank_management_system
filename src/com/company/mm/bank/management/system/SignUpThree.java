package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {

    //
    JRadioButton radioButton_savingAccount, radioButton_fixedAccount, radioButton_currentAccount, radioButton_recurringAccount;

    //
    JCheckBox checkBox_atmCard, checkBox_internetBanking, checkBox_mobileBanking, checkBox_alerts, checkBox_chequeBook, checkBox_eStatement,
            checkBox_confirmation;

    //
    JButton button_submit, button_cancel;

    //
    String formNo;

    //Constructor
    SignUpThree(String formNo)
    {
        this.formNo = formNo;
        //set layout to null otherwise your setBounds doesn't work
        setLayout(null);

        ///text page 3
        JLabel text_accountDetails = new JLabel("Page 3: Account Details");
        text_accountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        text_accountDetails.setBounds(280, 40, 350, 40);
        add(text_accountDetails);

        ///text Account type
        JLabel text_type = new JLabel("Account Type:");
        text_type.setFont(new Font("Raleway", Font.BOLD, 22));
        text_type.setBounds(100, 90, 150, 30);
        add(text_type);

        //
        radioButton_savingAccount = new JRadioButton("Saving Account");
        radioButton_savingAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButton_savingAccount.setBackground(Color.WHITE);
        radioButton_savingAccount.setBounds(100, 130, 250, 20);
        add(radioButton_savingAccount);

        //
        radioButton_fixedAccount = new JRadioButton("Fixed Deposit Account");
        radioButton_fixedAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButton_fixedAccount.setBackground(Color.WHITE);
        radioButton_fixedAccount.setBounds(350, 130, 250, 20);
        add(radioButton_fixedAccount);

        //
        radioButton_currentAccount = new JRadioButton("Current Account");
        radioButton_currentAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButton_currentAccount.setBackground(Color.WHITE);
        radioButton_currentAccount.setBounds(100, 170, 250, 20);
        add(radioButton_currentAccount);

        //
        radioButton_recurringAccount = new JRadioButton("Recurring Account");
        radioButton_recurringAccount.setFont(new Font("Raleway", Font.BOLD, 16));
        radioButton_recurringAccount.setBackground(Color.WHITE);
        radioButton_recurringAccount.setBounds(350, 170, 250, 20);
        add(radioButton_recurringAccount);

        //button ground accounts
        ButtonGroup buttonGroup_account = new ButtonGroup();
        buttonGroup_account.add(radioButton_savingAccount);
        buttonGroup_account.add(radioButton_fixedAccount);
        buttonGroup_account.add(radioButton_currentAccount);
        buttonGroup_account.add(radioButton_recurringAccount);


        ///text Card Number
        JLabel text_cardNumber = new JLabel("Card Number:");
        text_cardNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        text_cardNumber.setBounds(100, 250, 200, 30);
        add(text_cardNumber);

        ///text number
        JLabel text_number = new JLabel("XXXX-XXXX-XXXX-0207");
        text_number.setFont(new Font("Raleway", Font.BOLD, 22));
        text_number.setBounds(330, 250, 300, 30);
        add(text_number);

        ///text Card Number
        JLabel text_pin = new JLabel("PIN:");
        text_pin.setFont(new Font("Raleway", Font.BOLD, 22));
        text_pin.setBounds(100, 320, 200, 30);
        add(text_pin);

        ///text number
        JLabel text_pinNumber = new JLabel("XXXX");
        text_pinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        text_pinNumber.setBounds(330, 320, 300, 30);
        add(text_pinNumber);

        ///text your 16 digit card number
        JLabel text_cardDetail = new JLabel("Your 16 Digit Card Number");
        text_cardDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        text_cardDetail.setBounds(100, 280, 300, 20);
        add(text_cardDetail);


        ///text your 4 digit pin
        JLabel text_pinDetail = new JLabel("Your 4 Digit Pin");
        text_pinDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        text_pinDetail.setBounds(100, 350, 300, 20);
        add(text_pinDetail);

        ///text your 4 digit pin
        JLabel text_services = new JLabel("Services Required:");
        text_services.setFont(new Font("Raleway", Font.BOLD, 22));
        text_services.setBounds(100, 400, 200, 20);
        add(text_services);

        ///Check boxes
        //atm card
        checkBox_atmCard = new JCheckBox("ATM CARD");
        checkBox_atmCard.setBackground(Color.WHITE);
        checkBox_atmCard.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBox_atmCard.setBounds(100, 450, 200, 30);
        add(checkBox_atmCard);

        //Internet banking
        checkBox_internetBanking = new JCheckBox("Internet Banking");
        checkBox_internetBanking.setBackground(Color.WHITE);
        checkBox_internetBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBox_internetBanking.setBounds(350, 450, 200, 30);
        add(checkBox_internetBanking);

        //Mobile Banking
        checkBox_mobileBanking = new JCheckBox("Mobile Banking");
        checkBox_mobileBanking.setBackground(Color.WHITE);
        checkBox_mobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBox_mobileBanking.setBounds(100, 500, 200, 30);
        add(checkBox_mobileBanking);

        //Email & SMS Alerts
        checkBox_alerts = new JCheckBox("Email & SMS Alerts");
        checkBox_alerts.setBackground(Color.WHITE);
        checkBox_alerts.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBox_alerts.setBounds(350, 500, 200, 30);
        add(checkBox_alerts);

        //Cheque Book
        checkBox_chequeBook = new JCheckBox("Cheque Book");
        checkBox_chequeBook.setBackground(Color.WHITE);
        checkBox_chequeBook.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBox_chequeBook.setBounds(100, 550, 200, 30);
        add(checkBox_chequeBook);

        //E-statement
        checkBox_eStatement = new JCheckBox("E-Statement");
        checkBox_eStatement.setBackground(Color.WHITE);
        checkBox_eStatement.setFont(new Font("Raleway", Font.BOLD, 16));
        checkBox_eStatement.setBounds(350, 550, 200, 30);
        add(checkBox_eStatement);

        //atm card
        checkBox_confirmation = new JCheckBox("I Hereby declares that the above entered details are correct to the best of my knowledge");
        checkBox_confirmation.setBackground(Color.WHITE);
        checkBox_confirmation.setFont(new Font("Raleway", Font.BOLD, 12));
        checkBox_confirmation.setBounds(100, 630, 600, 30);
        add(checkBox_confirmation);


        ///Button Submit
        button_submit = new JButton("Submit");
        button_submit.setBackground(Color.BLACK);
        button_submit.setForeground(Color.WHITE);
        button_submit.setFont(new Font("Raleway", Font.BOLD, 14));
        button_submit.setBounds(250, 670, 100, 30);
        button_submit.addActionListener(this);
        add(button_submit);


        ///Button Cancel
        button_cancel = new JButton("Cancel");
        button_cancel.setBackground(Color.BLACK);
        button_cancel.setForeground(Color.WHITE);
        button_cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        button_cancel.setBounds(420, 670, 100, 30);
        button_cancel.addActionListener(this);
        add(button_cancel);


        //set window size
        setSize(850, 800);

        //set window background color
        getContentPane().setBackground(Color.WHITE);

        //set creation of window on middle of screen
        setLocationRelativeTo(null);

        //set window visibility
        setVisible(true);
    };

    //
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_submit)
        {
            String accountType = null;
            //
            if (radioButton_savingAccount.isSelected())
            {
                accountType = "Saving Account";
            }
            else if (radioButton_fixedAccount.isSelected())
            {
                accountType = "Fixed Deposit Account";
            }
            else if (radioButton_currentAccount.isSelected())
            {
                accountType = "Current Account";
            }
            else
            {
                accountType = "Recurring Account";
            }

            //
            Random random = new Random();
            String cardNo = "" + Math.abs(random.nextLong() & 90000000L + 5040936000000000L);

            //
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L + 1000L));

            //
            String facility = "";
            //
            if (checkBox_atmCard.isSelected())
            {
                facility = facility + " ATM CARD";
            }
            else if (checkBox_internetBanking.isSelected())
            {
                facility += " Internet Banking";
            }
            else if (checkBox_mobileBanking.isSelected())
            {
                facility += " Mobile Banking";
            }
            else if (checkBox_alerts.isSelected())
            {
                facility += " EMAILS & SMS Alerts";
            }
            else if (checkBox_chequeBook.isSelected())
            {
                facility += " Cheque Book";
            }
            else if (checkBox_eStatement.isSelected())
            {
                facility += " E-Statement";
            }

            ///DataBase Handling
            try
            {
                if (accountType == null)
                {
                    JOptionPane.showMessageDialog(null, "Required Field is Empty");
                }
                else
                {
                    Conn c = new Conn();
                    String query = "insert into signupthree values('"+formNo+"', '"+accountType+"', '"+cardNo+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"', '"+cardNo+"', '"+pinNumber+"')";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);

                    //
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNo + "\n Pin: "+ pinNumber);

                    //
                    setVisible(false);
                    //
                    new Deposit(pinNumber).setVisible(true);
                }
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == button_cancel)
        {
            //
            setVisible(false);

            //
            new Login().setVisible(true);
        }
    };

    //
    public static void main(String[] args) {
        new SignUpThree("");
    }
}
