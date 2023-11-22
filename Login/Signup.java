package Login;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.Font;
import javax.swing.*;

import User.Landlord;
import User.Tenant;

public class Signup implements ActionListener {
    Landlord [] Landlords = new Landlord[100];
    Tenant [] Tenants = new Tenant[100];

    JFrame signupFrame;
    JPanel signupPanel, TenantSignUp, LandlordSignUp, signupComplete;
    JLabel l1, l2, l3, l4, l5, poster1, poster2, poster3, poster4;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l12;
    JLabel l13;
    JLabel l20;
    JLabel l14;
    JTextField tf1, tf2, tf3;
    JTextField tf4, tf5, tf6, tf7, tf8, tf9;
    JPasswordField cp1, ccp1;
    JPasswordField dp1, dcp1;
    JButton lanSignUp, tenSignUp, returnToLogin, returnToSignup, signUp1, signUp2,backButton;
    JComboBox<String> AptType;


    public Signup() {
        signupFrame = new JFrame();
        // main signup panel
        signupPanel = new JPanel();

        l14 = new JLabel("Sign up on Roommate");
        l14.setBounds(390, 100, 400, 80);
        Font bigFont = l14.getFont().deriveFont(Font.PLAIN, 30f);
        l14.setFont(bigFont);

        tenSignUp = new JButton("Sign-up as Tenant");
        tenSignUp.setBounds(345, 400, 150, 50);
        tenSignUp.addActionListener(this);
        tenSignUp.setOpaque(true);
        tenSignUp.setContentAreaFilled(true);
        tenSignUp.setBackground(Color.BLACK);
        tenSignUp.setBorderPainted(true);
        tenSignUp.setForeground(Color.WHITE);

        lanSignUp = new JButton("Sign-up as LandLord");
        lanSignUp.setBounds(545, 400, 200, 50);
        lanSignUp.addActionListener(this);
        lanSignUp.setOpaque(true);
        lanSignUp.setContentAreaFilled(true);
        lanSignUp.setBackground(Color.BLACK);
        lanSignUp.setBorderPainted(true);
        lanSignUp.setForeground(Color.WHITE);

        ImageIcon image1 = new ImageIcon("Images/1.png");
        poster1 = new JLabel(image1);
        poster1.setBounds(0, 0, 1100, 700);

        signupPanel.add(l14);
        signupPanel.add(tenSignUp);
        signupPanel.add(lanSignUp);
        signupPanel.add(poster1);
        signupPanel.setLayout(null);
        signupPanel.setBounds(0, 0, 1100, 700);
        signupPanel.setVisible(true);

        backButton = new JButton("Back");
        backButton.setBounds(1000, 620, 80, 30);
        backButton.addActionListener(this);
        backButton.setOpaque(true);
        backButton.setContentAreaFilled(true);
        backButton.setBackground(Color.BLACK);
        backButton.setBorderPainted(true);
        backButton.setForeground(Color.WHITE);
        backButton.setVisible(true);




        // Tenant signup panel;

        TenantSignUp = new JPanel();

        l1 = new JLabel("Name:");
        l1.setBounds(300, 180, 150, 40);
        Font midFont = l1.getFont().deriveFont(Font.PLAIN, 23f);
        l1.setFont(midFont);

        l2 = new JLabel("Phone Number:");
        l2.setBounds(300, 250, 300, 40);
        l2.setFont(midFont);

        l3 = new JLabel("E-mail Address: ");
        l3.setBounds(300, 300, 400, 80);
        l3.setFont(midFont);

        l4 = new JLabel("Password:");
        l4.setBounds(300, 350, 400, 80);
        l4.setFont(midFont);

        l5 = new JLabel("Confirm Password:");
        l5.setBounds(300, 400, 400, 80);
        l5.setFont(midFont);

        tf1 = new JTextField("", 2);
        tf1.setBounds(500, 183, 220, 32);
        tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf1.setFont(midFont);
        tf1.setOpaque(false);

        tf2 = new JTextField("", 2);
        tf2.setBounds(500, 252, 220, 32);
        tf2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf2.setFont(midFont);
        tf2.setOpaque(false);

        tf3 = new JTextField("", 2);
        tf3.setBounds(500, 318, 220, 32);
        tf3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf3.setFont(midFont);
        tf3.setOpaque(false);

        cp1 = new JPasswordField("", 2);
        cp1.setBounds(500, 375, 220, 32);
        cp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        cp1.setFont(midFont);
        cp1.setOpaque(false);

        ccp1 = new JPasswordField("", 2);
        ccp1.setBounds(500, 423, 220, 32);
        ccp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        ccp1.setFont(midFont);
        ccp1.setOpaque(false);

        signUp1 = new JButton("Sign-up");
        signUp1.setBounds(440, 480, 150, 50);
        signUp1.addActionListener(this);
        signUp1.setOpaque(true);
        signUp1.setContentAreaFilled(true);
        signUp1.setBackground(Color.BLACK);
        signUp1.setBorderPainted(true);
        signUp1.setForeground(Color.WHITE);

        ImageIcon image2 = new ImageIcon("Images/2.png");
        poster2 = new JLabel(image2);
        poster2.setBounds(0, 0, 1100, 700);

        TenantSignUp.add(l1);
        TenantSignUp.add(l2);
        TenantSignUp.add(l3);
        TenantSignUp.add(l4);
        TenantSignUp.add(l5);
        TenantSignUp.add(tf1);
        TenantSignUp.add(tf2);
        TenantSignUp.add(tf3);
        TenantSignUp.add(cp1);
        TenantSignUp.add(ccp1);
        TenantSignUp.add(signUp1);
        TenantSignUp.add(poster2);
        TenantSignUp.setLayout(null);
        TenantSignUp.setBounds(0, 0, 1100, 700);
        TenantSignUp.setVisible(false);



        //Landlord sign up panel

        LandlordSignUp = new JPanel();

        l6 = new JLabel("Name:");
        l6.setBounds(270, 70, 150, 40);
        l6.setFont(midFont);

        l7 = new JLabel("Phone Number:");
        l7.setBounds(270, 120, 200, 40);
        l7.setFont(midFont);

        l8 = new JLabel("E-mail Address: ");
        l8.setBounds(270, 170, 200, 40);
        l8.setFont(midFont);

        l9 = new JLabel("NID Number:");
        l9.setBounds(270, 220, 150, 40);
        l9.setFont(midFont);

        l10 = new JLabel("Select Years to lease:");
        l10.setBounds(270, 320, 300, 40);
        l10.setFont(midFont);

        l12 = new JLabel("Enter your monthly rent:");
        l12.setBounds(270, 420, 250, 40);
        l12.setFont(midFont);

        l13 = new JLabel("Password:");
        l13.setBounds(270, 470, 150, 40);
        l13.setFont(midFont);

        l20 = new JLabel("Confirm Password:");
        l20.setBounds(270, 520, 200, 40);
        l20.setFont(midFont);

        tf4 = new JTextField();
        tf4.setBounds(550, 75, 220, 32);
        tf4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf4.setFont(midFont);
        tf4.setOpaque(false);

        tf5 = new JTextField();
        tf5.setBounds(550, 130, 220, 32);
        tf5.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf5.setFont(midFont);
        tf5.setOpaque(false);

        tf6 = new JTextField();
        tf6.setBounds(550, 180, 220, 32);
        tf6.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf6.setFont(midFont);
        tf6.setOpaque(false);

        tf7 = new JTextField();
        tf7.setBounds(550, 228, 220, 32);
        tf7.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf7.setFont(midFont);
        tf7.setOpaque(false);

        tf8 = new JTextField();
        tf8.setBounds(550, 277, 220, 32);
        tf8.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf8.setFont(midFont);
        tf8.setOpaque(false);

        tf9 = new JTextField();
        tf9.setBounds(550, 427, 220, 32);
        tf9.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf9.setFont(midFont);
        tf9.setOpaque(false);

        dp1 = new JPasswordField("", 2);
        dp1.setBounds(550, 475, 180, 32);
        dp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        dp1.setFont(midFont);
        dp1.setOpaque(false);

        dcp1 = new JPasswordField("", 2);
        dcp1.setBounds(550, 525, 180, 32);
        dcp1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        dcp1.setFont(midFont);
        dcp1.setOpaque(false);


        signUp2 = new JButton("Sign-up");
        signUp2.setBounds(450, 600, 150, 50);
        signUp2.addActionListener(this);
        signUp2.setOpaque(true);
        signUp2.setContentAreaFilled(true);
        signUp2.setBackground(Color.BLACK);
        signUp2.setBorderPainted(true);
        signUp2.setForeground(Color.WHITE);

        ImageIcon image3 = new ImageIcon("Images/3.png");
        poster3 = new JLabel(image3);
        poster3.setBounds(0, 0, 1100, 700);

        LandlordSignUp.add(l6);
        LandlordSignUp.add(l7);
        LandlordSignUp.add(l8);
        LandlordSignUp.add(l9);
        LandlordSignUp.add(l10);
        LandlordSignUp.add(l12);
        LandlordSignUp.add(l13);
        LandlordSignUp.add(l20);
        LandlordSignUp.add(tf4);
        LandlordSignUp.add(tf5);
        LandlordSignUp.add(tf6);
        LandlordSignUp.add(tf7);
        LandlordSignUp.add(tf8);
        LandlordSignUp.add(tf9);
        LandlordSignUp.add(dp1);
        LandlordSignUp.add(dcp1);
        LandlordSignUp.add(signUp2);
        LandlordSignUp.add(poster3);
        LandlordSignUp.setLayout(null);
        LandlordSignUp.setBounds(0, 0, 1100, 700);
        LandlordSignUp.setVisible(false);

        // signup complete panel

        signupComplete = new JPanel();

        l14 = new JLabel("Account has been successfully created!");
        l14.setBounds(280, 100, 600, 80);
        l14.setFont(bigFont);

        returnToLogin = new JButton("Return to Log-in page");
        returnToLogin.setBounds(440, 300, 200, 50);
        returnToLogin.addActionListener(this);
        returnToLogin.setOpaque(true);
        returnToLogin.setContentAreaFilled(true);
        returnToLogin.setBackground(Color.BLACK);
        returnToLogin.setBorderPainted(true);
        returnToLogin.setForeground(Color.WHITE);

        returnToSignup = new JButton("Return to Sign-up page");
        returnToSignup.setBounds(440, 380, 200, 50);
        returnToSignup.addActionListener(this);
        returnToSignup.setOpaque(true);
        returnToSignup.setContentAreaFilled(true);
        returnToSignup.setBackground(Color.BLACK);
        returnToSignup.setBorderPainted(true);
        returnToSignup.setForeground(Color.WHITE);

        ImageIcon image4 = new ImageIcon("Images/4.png");
        poster4 = new JLabel(image4);
        poster4.setBounds(0, 0, 1100, 700);

        signupComplete.add(l14);
        signupComplete.add(returnToLogin);
        signupComplete.add(returnToSignup);
        signupComplete.add(poster4);
        signupComplete.setLayout(null);
        signupComplete.setBounds(0, 0, 1100, 700);
        signupComplete.setVisible(false);

        signupFrame.add(signupPanel);
        signupFrame.add(backButton);
        signupFrame.add(TenantSignUp);
        signupFrame.add(LandlordSignUp);
        signupFrame.add(signupComplete);
        signupFrame.setLayout(null);
        signupFrame.setBounds(0, 0, 1100, 700);
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);

    }

    public void addCustomer(Tenant c)// function for adding an account to the array
    {
        int count = 0;

        for (int i = 0; i < Tenants.length; i++) {
            if (Tenants[i] == null) {
                Tenants[i] = c;
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Tenant Account not added");
        } else {
            System.out.println("Tenant Account added");
        }
    }

    public Tenant[] getTen() {

        return Tenants;

    }

    public void addLandlord(Landlord d)// function for adding an account to the array
    {
        int count = 0;

        for (int i = 0; i < Landlords.length; i++) {
            if (Landlords[i] == null) {
                Landlords[i] = d;
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Landlord Account not added");
        } else {
            System.out.println("Landlord Account added");
        }
    }

    public Landlord[] getLandlord() {

        return Landlords;

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tenSignUp) {
            signupPanel.setVisible(false);
            TenantSignUp.setVisible(true);

        }

        if (e.getSource() == lanSignUp) {
            signupPanel.setVisible(false);
            LandlordSignUp.setVisible(true);

        }

        if (e.getSource() == signUp1) {
            String cname = tf1.getText();
            String phoneNo = tf2.getText();
            String email = tf3.getText();
            String pass = cp1.getText();
            String confPass = ccp1.getText();

            if (cname.length() >= 3 && phoneNo.length() >= 3 && email.length() >= 3 && pass.equals(confPass)) {
                try {
                    Tenant c = new Tenant(cname, phoneNo, email, pass);
                    addCustomer(c);
                    TenantSignUp.setVisible(false);
                    signupComplete.setVisible(true);
                    System.out.println("Cuszzz addedd");
                    File file = new File(".\\Data\\customers.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    pw.println("User Name : " + cname);
                    pw.println("Password : " + pass);
                    pw.println("Phone : " + phoneNo);

                    pw.close();

                } catch (Exception ex) {
                    System.out.print(ex);
                }

            }
        }

        if (e.getSource() == signUp2) {
            String lname = tf4.getText();
            String lphoneNo = tf5.getText();
            String lemail = tf6.getText();
            String lnid = tf7.getText();
            String llicense = tf8.getText();
            String lrate = tf9.getText();
            String lpass = dp1.getText();
            String lconfPass = dcp1.getText();

            if (lname.length() >= 3 && lphoneNo.length() >= 3 && lemail.length() >= 3 && lnid.length() >= 3
                    && llicense.length() >= 3 && !lrate.isEmpty() && lpass.equals(lconfPass)) {
                try {
                    Landlord l = new Landlord(lname, lphoneNo, lemail, lpass, lnid,lrate);
                    addLandlord(l);
                    LandlordSignUp.setVisible(false);
                    signupComplete.setVisible(true);
                    File file = new File(".\\Data\\drivers.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    pw.println("User Name : " + lname);
                    pw.println("Password : " + lpass);
                    pw.println("Phone : " + lphoneNo);

                    pw.close();

                } catch (Exception ex) {
                    System.out.print(ex);
                }

            }
        }

        if (e.getSource() == returnToSignup) {
            signupComplete.setVisible(false);
            signupPanel.setVisible(true);
        }

        if (e.getSource() == returnToLogin) {
            if (e.getSource() == returnToLogin) {
                signupFrame.setVisible(false);
                new Login(Tenants, Landlords);

            }
        }

        if(e.getSource() == backButton) {
        	signupFrame.setVisible(false);
        	new Login(Tenants, Landlords);
        }

    }
}
