package com.company.mm.bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpOne extends JFrame implements ActionListener {

    //
    long random;
    //
    JTextField textField_name, textField_fName, textField_dob, textField_email, textField_address, textField_city,
            textField_state, textField_pin;
    //
    JButton button_next;
    //
    JRadioButton radioButton_male, radioButton_female, radioButton_married, radioButton_unmarried, radioButton_other;
    //
    JDateChooser dateChooser;

    //Constructor
    SignUpOne()
    {
        //set default layout to null
        setLayout(null);

        //random
        Random ran = new Random();
        random = Math.abs(ran.nextLong() & 9000L) + 1000L;

        //Set application form text label
        JLabel text_formNo = new JLabel("APPLICATION FORM NO. " + random);
        text_formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        text_formNo.setBounds(140, 20, 600, 40);
        add(text_formNo);

        //Set personal detail text label
        JLabel text_personalDetails = new JLabel("Page 1 : Personal Details");
        text_personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        text_personalDetails.setBounds(290, 80, 400, 30);
        add(text_personalDetails);


        //Set name text label
        JLabel text_name = new JLabel("Name:");
        text_name.setFont(new Font("Raleway", Font.BOLD, 20));
        text_name.setBounds(140, 140, 100, 30);
        add(text_name);
        ///
        textField_name = new JTextField();
        textField_name.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_name.setBounds(300, 140, 400, 30);
        add(textField_name);


        //Set Fathers name text label
        JLabel text_fName = new JLabel("Father's Name:");
        text_fName.setFont(new Font("Raleway", Font.BOLD, 20));
        text_fName.setBounds(140, 190, 200, 30);
        add(text_fName);
        ///
        textField_fName = new JTextField();
        textField_fName.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_fName.setBounds(300, 190, 400, 30);
        add(textField_fName);

        //Set date of birth text label
        JLabel text_dob = new JLabel("Date of Birth:");
        text_dob.setFont(new Font("Raleway", Font.BOLD, 20));
        text_dob.setBounds(140, 240, 200, 30);
        add(text_dob);
        ///
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 20));
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);

        //Set Gender text label
        JLabel text_gender = new JLabel("Gender:");
        text_gender.setFont(new Font("Raleway", Font.BOLD, 20));
        text_gender.setBounds(140, 290, 200, 30);
        add(text_gender);
        ///
        radioButton_male = new JRadioButton("Male");
        radioButton_male.setBounds(300, 290,60,30);
        radioButton_male.setBackground(Color.WHITE);
        add(radioButton_male);

        radioButton_female = new JRadioButton("Female");
        radioButton_female.setBounds(450, 290,120,30);
        radioButton_female.setBackground(Color.WHITE);
        add(radioButton_female);

        //Button Grouping(Radio Button -> male, Female)
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButton_male);
        genderGroup.add(radioButton_female);


        //Set Email Address text label
        JLabel text_email = new JLabel("Email Address:");
        text_email.setFont(new Font("Raleway", Font.BOLD, 20));
        text_email.setBounds(140, 340, 200, 30);
        add(text_email);
        ///
        textField_email = new JTextField();
        textField_email.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_email.setBounds(300, 340, 400, 30);
        add(textField_email);


        //Set marital Status text label
        JLabel text_maritalStatus = new JLabel("Marital Status:");
        text_maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        text_maritalStatus.setBounds(140, 390, 200, 30);
        add(text_maritalStatus);
        ///
        radioButton_married = new JRadioButton("Married");
        radioButton_married.setBounds(300, 390,100,30);
        radioButton_married.setBackground(Color.WHITE);
        add(radioButton_married);

        radioButton_unmarried = new JRadioButton("Unmarried");
        radioButton_unmarried.setBounds(450, 390,100,30);
        radioButton_unmarried.setBackground(Color.WHITE);
        add(radioButton_unmarried);

        radioButton_other = new JRadioButton("Other");
        radioButton_other.setBounds(620, 390,100,30);
        radioButton_other.setBackground(Color.WHITE);
        add(radioButton_other);
        ///Button Group (Marital Group)
        ButtonGroup buttonGroup_marital = new ButtonGroup();
        buttonGroup_marital.add(radioButton_married);
        buttonGroup_marital.add(radioButton_unmarried);
        buttonGroup_marital.add(radioButton_other);

        //Set Address text label
        JLabel text_address = new JLabel("Address:");
        text_address.setFont(new Font("Raleway", Font.BOLD, 20));
        text_address.setBounds(140, 440, 200, 30);
        add(text_address);
        ///
        textField_address = new JTextField();
        textField_address.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_address.setBounds(300, 440, 400, 30);
        add(textField_address);


        //Set City text label
        JLabel text_city = new JLabel("City:");
        text_city.setFont(new Font("Raleway", Font.BOLD, 20));
        text_city.setBounds(140, 490, 200, 30);
        add(text_city);
        ///
        textField_city = new JTextField();
        textField_city.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_city.setBounds(300, 490, 400, 30);
        add(textField_city);

        //Set state text label
        JLabel text_state = new JLabel("State:");
        text_state.setFont(new Font("Raleway", Font.BOLD, 20));
        text_state.setBounds(140, 540, 200, 30);
        add(text_state);
        ///
        textField_state = new JTextField();
        textField_state.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_state.setBounds(300, 540, 400, 30);
        add(textField_state);

        //Set [pinCode] text label
        JLabel text_pinCode = new JLabel("Pin Code:");
        text_pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        text_pinCode.setBounds(140, 590, 200, 30);
        add(text_pinCode);
        ///
        textField_pin = new JTextField();
        textField_pin.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_pin.setBounds(300, 590, 400, 30);
        add(textField_pin);

        //
        button_next = new JButton("Next");
        button_next.setBackground(Color.BLACK);
        button_next.setForeground(Color.WHITE);
        button_next.setFont(new Font("Raleway", Font.BOLD, 14));
        button_next.setBounds(620, 660, 80, 30);
        button_next.addActionListener(this);
        add(button_next);

        getContentPane().setBackground(Color.WHITE);

        //set window size
        setSize(850, 800);

        //set creation of window on middle of screen
        setLocationRelativeTo(null);

        //set window visibility
        setVisible(true);
    };

    //
    public void actionPerformed(ActionEvent ae)
    {
        String formNo = "" + random;                    //long converted to string
        String name = textField_name.getText();
        String fName = textField_fName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();      //get text from date chooser by changing to text field
        String gender = null;

        //
        if (radioButton_male.isSelected())
        {
            gender = "Male";
        }
        else if (radioButton_female.isSelected())
        {
            gender = "Female";
        }

        //
        String email = textField_email.getText();
        String marital = null;

        //
        if (radioButton_married.isSelected())
        {
            marital = "Married";
        }
        else if (radioButton_unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        else
        {
            marital = "Other";
        }

        //
        String address = textField_address.getText();
        String city = textField_city.getText();
        String state = textField_state.getText();
        String pin = textField_pin.getText();

        //
        try {
            if (name.equals("") || fName.isEmpty() || dob.isEmpty() || gender == null || email.isEmpty() || marital == null
            || address.isEmpty() || city.isEmpty() || state.isEmpty() || pin.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Field is Empty");               //if field is empty show dialog box
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values('" +formNo+"', '"+name+"', '"+fName+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);

                //
                setVisible(false);
                //open sign up two
                SignUpTwo signUpTwo = new SignUpTwo(formNo);
                signUpTwo.setVisible(true);
            }

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    //
    public static void main(String[] args) {

        new SignUpOne();

    }

}
