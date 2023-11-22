package Login;

import Dashboard.AdminDashboard;
import Dashboard.TenantDashboard;
import User.Landlord;
import User.Tenant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JFrame loginFrame;
    JPanel loginDashboard;
    JPanel adminLogin;
    JLabel background, poster;
    JLabel l1, l2, l3, l4, l5, l6;
    JPasswordField p1, p2;
    JTextField tf1, tf2;
    JButton b1, b2, b4, b5,b6; // login dashboard
    JButton b9, b10; // admin Login
    int count = 1;
    Tenant[] Tenants = new Tenant[100];
    Landlord[] Landlords = new Landlord[100];

    public Login(Tenant[] Tenants, Landlord [] Landlords) {

        this.Tenants = Tenants;

        loginFrame = new JFrame();

        ImageIcon image = new ImageIcon("Images/Background2.jpg");
        background = new JLabel(image);
        background.setBounds(0, 0, 1100, 700);

        // icon
        ImageIcon icon = new ImageIcon("Images/logo.png");

        // login dashboard panel
        loginDashboard = new JPanel();
        l1 = new JLabel("Username:");
        Font smallFont = l1.getFont().deriveFont(Font.PLAIN, 18f);
        l1.setBounds(310, 250, 150, 20);
        l1.setForeground(Color.BLACK);
        l1.setFont(smallFont);

        l2 = new JLabel("Password:");
        l2.setBounds(310, 320, 150, 20);
        l2.setForeground(Color.BLACK);
        l2.setFont(smallFont);

        tf1 = new JTextField("", 2);
        tf1.setBounds(420, 242, 300, 32);
        tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        Font bigFont = tf1.getFont().deriveFont(Font.PLAIN, 20f);
        tf1.setFont(bigFont);
        tf1.setOpaque(false);
        // tf1.setContentAreaFilled(false);
        // tf1.setBorderPainted(false);

        p1 = new JPasswordField("", 2);
        p1.setBounds(420, 311, 300, 32);
        p1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        p1.setFont(smallFont);
        p1.setOpaque(false);
        // / p1.setContentAreaFilled(false);
        // p1.setBorderPainted(false);

        b1 = new JButton("Login");
        b1.setBounds(450, 400, 150, 50);
        b1.addActionListener(this);
        b1.setOpaque(true);
        b1.setContentAreaFilled(true);
        b1.setBackground(Color.BLACK);
        b1.setBorderPainted(true);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Sign-up");
        b2.setBounds(450, 470, 150, 50);
        b2.addActionListener(this);
        b2.setOpaque(true);
        b2.setContentAreaFilled(true);
        b2.setBackground(Color.BLACK);
        b2.setBorderPainted(true);
        b2.setForeground(Color.WHITE);

        b4 = new JButton("Exit");
        b4.setBounds(1000, 620, 80, 30);
        b4.addActionListener(this);
        b4.setOpaque(true);
        b4.setContentAreaFilled(true);
        b4.setBorderPainted(true);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);


        b5 = new JButton("*Administrator portal");
        b5.setBounds(0, 620, 200, 30);
        b5.addActionListener(this);
        b5.setOpaque(true);
        b5.setContentAreaFilled(true);
        b5.setBorderPainted(true);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);

        loginDashboard.add(b1);
        loginDashboard.add(b2);

        loginDashboard.add(b4);
        loginDashboard.add(b5);
        loginDashboard.add(l1);
        loginDashboard.add(l2);
        loginDashboard.add(tf1);
        loginDashboard.add(p1);
        loginDashboard.add(background);
        loginDashboard.setLayout(null);
        loginDashboard.setBounds(0, 0, 1100, 700);
        loginDashboard.setBackground(Color.gray);
        loginDashboard.setVisible(true);

        // admin login panel

        adminLogin = new JPanel();
        l3 = new JLabel("Username: ");
        l3.setBounds(390, 245, 150, 20);
        l3.setForeground(Color.BLACK);
        l3.setFont(smallFont);

        l4 = new JLabel("Password: ");
        l4.setBounds(390, 315, 150, 20);
        l4.setForeground(Color.BLACK);
        l4.setFont(smallFont);

        tf2 = new JTextField("", 4);
        tf2.setBounds(495, 240, 300, 32);
        tf2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf2.setFont(bigFont);
        tf2.setOpaque(false);

        p2 = new JPasswordField("", 4);
        p2.setBounds(495, 308, 300, 32);
        p2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        p2.setFont(bigFont);
        p2.setOpaque(false);


        b6 = new JButton("Login");
        b6.setBounds(545, 400, 150, 50);
        b6.addActionListener(this);
        b6.setOpaque(true);
        b6.setContentAreaFilled(true);
        b6.setBackground(Color.BLACK);
        b6.setBorderPainted(true);
        b6.setForeground(Color.WHITE);

        b9 = new JButton("Exit");
        b9.setBounds(1000, 620, 80, 30);
        b9.addActionListener(this);
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
        b9.setForeground(Color.BLACK);

        b10 = new JButton("*go back to user Login");
        b10.setBounds(0, 620, 200, 30);
        b10.addActionListener(this);
        b10.setOpaque(false);
        b10.setContentAreaFilled(false);
        b10.setBorderPainted(false);
        b10.setForeground(Color.BLACK);

        ImageIcon img = new ImageIcon("Images/1.png");
        poster = new JLabel(img);
        poster.setBounds(0, 0, 1100, 700);

        adminLogin.add(l3);
        adminLogin.add(l4);
        adminLogin.add(b6);
        adminLogin.add(b9);
        adminLogin.add(b10);
        adminLogin.add(tf2);
        adminLogin.add(p2);
        adminLogin.add(poster);
        // adminLogin.add(slider);
        adminLogin.setLayout(null);
        adminLogin.setBounds(0, 0, 1100, 700);
        adminLogin.setBackground(Color.gray);
        adminLogin.setVisible(false);

        loginFrame.setIconImage(icon.getImage());
        loginFrame.add(loginDashboard);
        loginFrame.add(adminLogin);

        loginFrame.setLayout(null);
        loginFrame.setTitle("Login - Roommate");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(1100, 700);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);

    }

    // actions upon clicking the buttons
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            loginFrame.setVisible(false);
            new Signup();
        }

        if (e.getSource() == b6) {
            String adminUsr = tf2.getText();
            String adminPass = p2.getText();

            if (adminUsr.equals("admin") && adminPass.equals("admin")) {

                loginFrame.setVisible(false);
                new AdminDashboard(Tenants, Landlords);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
            }

        }

        if (e.getSource() == b1) {
            String user = tf1.getText();
            String pass = p1.getText();

            for (int i = 0; i < Tenants.length; i++) {
                if (Tenants[i] != null) {
                    String cusName = Tenants[i].getName();
                    String cusPass = Tenants[i].getPassword();
                    if (user.equals(cusName) && pass.equals(cusPass)) {
                        loginFrame.setVisible(false);
                        new TenantDashboard(Tenants , Landlords);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!",
                                "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

            for (int i = 0; i < Landlords.length; i++) {

                if (Landlords[i] != null) {
                    String driName = Landlords[i].getName();
                    String driPass = Landlords[i].getPassword();
                    if (user.equals(driName) && pass.equals(driPass)) {
                        loginFrame.setVisible(false);
                        new TenantDashboard(Tenants , Landlords);

                    }
                }

            }
        }

        if (e.getSource() == b5) {

            loginDashboard.setVisible(false);
            adminLogin.setVisible(true);

        }

        if (e.getSource() == b4) {

            System.exit(0);

        }

        if (e.getSource() == b9) {

            System.exit(0);

        }

        if (e.getSource() == b10) {
            adminLogin.setVisible(false);
            loginDashboard.setVisible(true);

        }

    }

    public void setCus(Tenant Tenants[]) {
        this.Tenants = Tenants;
    }

}
