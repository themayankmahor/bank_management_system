package com.company.mm.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener {

    //
    JTextField textField_panNo, textField_aadhaarNo;
    //
    JButton button_next;
    //
    JRadioButton radioButton_seniorYes, radioButton_seniorNo, radioButton_accountYes, radioButton_accountNo;
    //
    JComboBox comboBox_religion, comboBox_category, comboBox_income, comboBox_education, comboBox_occupation;
    //
    String formNo;


    //Constructor
    SignUpTwo(String formNo)
    {
        this.formNo = formNo;
        //set default layout to null
        setLayout(null);

        //window title
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        //Set addition detail text label
        JLabel text_additionalDetails = new JLabel("Page 2 : Additional Details");
        text_additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        text_additionalDetails.setBounds(290, 80, 400, 30);
        add(text_additionalDetails);


        //Set religion text label
        JLabel text_religion = new JLabel("Religion:");
        text_religion.setFont(new Font("Raleway", Font.BOLD, 20));
        text_religion.setBounds(120, 140, 100, 30);
        add(text_religion);
        ///
        String[] arr_religion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox_religion = new JComboBox(arr_religion);
        comboBox_religion.setBounds(300, 140, 400, 30);
        comboBox_religion.setBackground(Color.WHITE);
        add(comboBox_religion);


        //Set category text label
        JLabel text_category = new JLabel("Category:");
        text_category.setFont(new Font("Raleway", Font.BOLD, 20));
        text_category.setBounds(120, 190, 200, 30);
        add(text_category);
        ///
        String[] arr_category = {"General", "OBC", "SC", "ST", "Other"};
        comboBox_category = new JComboBox(arr_category);
        comboBox_category.setBounds(300, 190, 400, 30);
        comboBox_category.setBackground(Color.WHITE);
        add(comboBox_category);


        //Set Income text label
        JLabel text_income = new JLabel("Income:");
        text_income.setFont(new Font("Raleway", Font.BOLD, 20));
        text_income.setBounds(120, 240, 200, 30);
        add(text_income);
        ///
        String[] arr_income = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "UpTo 10,00,000"};
        comboBox_income = new JComboBox(arr_income);
        comboBox_income.setBounds(300, 240, 400, 30);
        comboBox_income.setBackground(Color.WHITE);
        add(comboBox_income);


        //Set Educational text label
        JLabel text_educational = new JLabel("Educational");
        text_educational.setFont(new Font("Raleway", Font.BOLD, 20));
        text_educational.setBounds(120, 290, 200, 30);
        add(text_educational);

        //Set Qualification text label
        JLabel text_qualification = new JLabel("Qualification:");
        text_qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        text_qualification.setBounds(120, 315, 200, 30);
        add(text_qualification);
        ///
        String[] arr_education = {"Non Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox_education = new JComboBox(arr_education);
        comboBox_education.setBounds(300, 315, 400, 30);
        comboBox_education.setBackground(Color.WHITE);
        add(comboBox_education);


        //Set occupation text label
        JLabel text_occupation = new JLabel("Occupation:");
        text_occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        text_occupation.setBounds(120, 390, 200, 30);
        add(text_occupation);
        ///
        String[] arr_occupation = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        comboBox_occupation = new JComboBox(arr_occupation);
        comboBox_occupation.setBounds(300, 390, 400, 30);
        comboBox_occupation.setBackground(Color.WHITE);
        add(comboBox_occupation);


        //Set Pan number text label
        JLabel text_panNo = new JLabel("PAN Number:");
        text_panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        text_panNo.setBounds(120, 440, 200, 30);
        add(text_panNo);
        ///
        textField_panNo = new JTextField();
        textField_panNo.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_panNo.setBounds(300, 440, 400, 30);
        add(textField_panNo);


        //Set Aadhaar Number text label
        JLabel text_aadhaarNo = new JLabel("Aadhaar Number:");
        text_aadhaarNo.setFont(new Font("Raleway", Font.BOLD, 20));
        text_aadhaarNo.setBounds(120, 490, 200, 30);
        add(text_aadhaarNo);
        ///
        textField_aadhaarNo = new JTextField();
        textField_aadhaarNo.setFont(new Font("Raleway", Font.BOLD, 14));
        textField_aadhaarNo.setBounds(300, 490, 400, 30);
        add(textField_aadhaarNo);

        //Set senior citizen text label
        JLabel text_state = new JLabel("Senior Citizen:");
        text_state.setFont(new Font("Raleway", Font.BOLD, 20));
        text_state.setBounds(120, 540, 200, 30);
        add(text_state);
        ///YES
        radioButton_seniorYes = new JRadioButton("Yes");
        radioButton_seniorYes.setBounds(300, 540, 100, 30);
        radioButton_seniorYes.setBackground(Color.WHITE);
        add(radioButton_seniorYes);
        ///NO
        radioButton_seniorNo = new JRadioButton("No");
        radioButton_seniorNo.setBounds(450, 540, 100, 30);
        radioButton_seniorNo.setBackground(Color.WHITE);
        add(radioButton_seniorNo);
        //Button Group
        ButtonGroup buttonGroup_seniorCitizen = new ButtonGroup();
        buttonGroup_seniorCitizen.add(radioButton_seniorYes);
        buttonGroup_seniorCitizen.add(radioButton_seniorNo);


        //Set Existing Account text label
        JLabel text_account = new JLabel("Existing Account:");
        text_account.setFont(new Font("Raleway", Font.BOLD, 20));
        text_account.setBounds(120, 590, 200, 30);
        add(text_account);
        ///YES
        radioButton_accountYes = new JRadioButton("Yes");
        radioButton_accountYes.setBounds(300, 590, 100, 30);
        radioButton_accountYes.setBackground(Color.WHITE);
        add(radioButton_accountYes);
        ///NO
        radioButton_accountNo = new JRadioButton("No");
        radioButton_accountNo.setBounds(450, 590, 100, 30);
        radioButton_accountNo.setBackground(Color.WHITE);
        add(radioButton_accountNo);
        //Button Group
        ButtonGroup buttonGroup_existingAccount = new ButtonGroup();
        buttonGroup_existingAccount.add(radioButton_accountYes);
        buttonGroup_existingAccount.add(radioButton_accountNo);

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

    public void actionPerformed(ActionEvent ae)
    {
        String religion         = (String) comboBox_religion.getSelectedItem();             //type cast to string
        String category         = (String) comboBox_category.getSelectedItem();
        String income           = (String) comboBox_income.getSelectedItem();
        String education        = (String) comboBox_education.getSelectedItem();
        String occupation       = (String) comboBox_occupation.getSelectedItem();
        String seniorCitizen    = null;
        //
        seniorCitizen           = radioButton_seniorYes.isSelected() ? "Yes" : "No";

        String existingAccount  = null;
        //
        existingAccount         = radioButton_accountYes.isSelected() ? "Yes" : "No";

        String pan              = textField_panNo.getText();
        String aadhaar          = textField_aadhaarNo.getText();

        try{
            if (pan.isEmpty() || aadhaar.isEmpty())
            {
                //if any text field is empty
                JOptionPane.showMessageDialog(null, "Required Field is Empty");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"','"+occupation+"', '"+seniorCitizen+"', '"+existingAccount+"', '"+pan+"', '"+aadhaar+"')";
                c.s.executeUpdate(query);

                ///open sign up three page
                setVisible(false);
                SignUpThree signUpThree = new SignUpThree(formNo);
                signUpThree.setVisible(true);
            };

        }catch (Exception e)
        {
            System.out.println(e);
        }

    };

    //
    public static void main(String[] args) {
        new SignUpTwo("");
    }

}
