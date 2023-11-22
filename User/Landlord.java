package User;

import java.lang.*;
/*import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.ImageIcon;																				//imports libraries
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;*/

public class Landlord extends User {
    String nidNumber;
    String rate;

    public Landlord(String name, String phoneNumber, String emailAddress, String password, String nidNumber, String lrate) {
        super(name, phoneNumber, emailAddress, password);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = password;

    }

    public String getName() {

        return name;

    }

    public String getPhoneNum() {

        return phoneNumber;

    }

    public String getEmailaddress() {

        return emailAddress;

    }

    public String getPassword() {

        return password;

    }

    public String getRate() {

        return rate;

    }

    public void showDriverDetails() {

        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address:" + emailAddress);

    }

}
