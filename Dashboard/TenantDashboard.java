package Dashboard;

import java.awt.Color;
import javax.swing.ImageIcon;

import User.Landlord;
import Login.Login;
import User.Tenant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;

public class TenantDashboard implements ActionListener {

    JFrame dashboardFrame;
    JPanel TenantPanel1, results, TenantPanel2, searchResults, resultsp;
    JButton bLandlord, bTenantLogout, bBackToTenantPanel1, bRentApt, b10, b9;
    JButton[] RentApt = new JButton[100];
    JLabel customerPanelBackground, lCp1, lCp2, lCp3, lCp4, lCp5, lSp1, dName, dNamel, dExp, dExpl, poster1, poster2 , dRate , MonthlyRentL;
    boolean b;
    Landlord[] searchResult = new Landlord[100];
    Landlord[] Landlords = new Landlord[100];
    Tenant[] customers = new Tenant[100];

    public TenantDashboard(Tenant[] Tenants , Landlord[] Landlords)
    {
        this.Landlords = Landlords;
        dashboardFrame = new JFrame();

        /////////// Tenant Panel /////////////////

        TenantPanel1 = new JPanel();

        lCp1 = new JLabel("Welcome to Roommate");
        lCp1.setBounds(410, 100, 300, 40);
        Font medFont = lCp1.getFont().deriveFont(Font.PLAIN, 30f);
        lCp1.setForeground(Color.BLACK);
        lCp1.setFont(medFont);

        lCp2 = new JLabel("Search for Apartments");
        lCp2.setBounds(490, 170, 200, 20);
        Font smallFont = lCp2.getFont().deriveFont(Font.PLAIN, 20f);
        lCp2.setForeground(Color.BLACK);
        lCp2.setFont(smallFont);

        lCp3 = new JLabel("Your required Apartment size");
        lCp3.setBounds(370, 250, 250, 20);
        lCp3.setForeground(Color.BLACK);
        lCp3.setFont(smallFont);

        //lCp4 = new Jlable("Apartment Area");

        //lCp5 =



        bLandlord = new JButton("Search for Apartment");
        bLandlord.setBounds(450, 460, 200, 50);
        bLandlord.addActionListener(this);
        bLandlord.setOpaque(true);
        bLandlord.setContentAreaFilled(true);
        bLandlord.setBackground(Color.BLACK);
        bLandlord.setBorderPainted(true);
        bLandlord.setForeground(Color.WHITE);

        bTenantLogout = new JButton("Logout");
        bTenantLogout.setBounds(5, 600, 100, 40);
        bTenantLogout.addActionListener(this);
        bTenantLogout.setOpaque(true);
        bTenantLogout.setContentAreaFilled(true);
        bTenantLogout.setBackground(Color.BLACK);
        bTenantLogout.setBorderPainted(true);
        bTenantLogout.setForeground(Color.WHITE);

        b9 = new JButton("Exit");
        b9.setBounds(1000, 620, 80, 30);
        b9.addActionListener(this);
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
        b9.setForeground(Color.BLACK);

        ImageIcon img = new ImageIcon("Images/1.png");
        poster1 = new JLabel(img);
        poster1.setBounds(0, 0, 1100, 700);

        TenantPanel1.add(lCp1);
        TenantPanel1.add(lCp2);
        TenantPanel1.add(lCp3);
        TenantPanel1.add(lCp5);
        TenantPanel1.add(bLandlord);
        TenantPanel1.add(bTenantLogout);
        TenantPanel1.add(b9);
        TenantPanel1.add(poster1);
        TenantPanel1.setLayout(null);
        TenantPanel1.setBounds(0, 0, 1100, 700);
        TenantPanel1.setBackground(Color.gray);
        TenantPanel1.setVisible(true);

        /////////// search results //////////////////
        TenantPanel2 = new JPanel();

        lSp1 = new JLabel("Apartments available");
        lSp1.setBounds(400, 100, 200, 20);
        lSp1.setForeground(Color.BLACK);
        lSp1.setFont(smallFont);

        bBackToTenantPanel1 = new JButton("Search Again");
        bBackToTenantPanel1.setBounds(475, 580, 150, 40);
        bBackToTenantPanel1.addActionListener(this);
        bBackToTenantPanel1.setOpaque(true);
        bBackToTenantPanel1.setContentAreaFilled(true);
        bBackToTenantPanel1.setBackground(Color.BLACK);
        bBackToTenantPanel1.setBorderPainted(true);
        bBackToTenantPanel1.setForeground(Color.WHITE);

        searchResults = new JPanel();

        searchResults.setLayout(null);
        searchResults.setBounds(260, 70, 600, 500);
        searchResults.setBackground(Color.WHITE);
        searchResults.setVisible(true);
        TenantPanel2.add(searchResults);

        b10 = new JButton("Exit");
        b10.setBounds(1000, 620, 80, 30);
        b10.addActionListener(this);
        b10.setOpaque(false);
        b10.setContentAreaFilled(false);
        b10.setBorderPainted(false);
        b10.setForeground(Color.BLACK);

        ImageIcon img2 = new ImageIcon("Images/2.png");
        poster2 = new JLabel(img2);
        poster2.setBounds(0, 0, 1100, 700);

        TenantPanel2.add(bBackToTenantPanel1);
        TenantPanel2.add(b10);
        TenantPanel2.add(poster2);
        TenantPanel2.setLayout(null);
        TenantPanel2.setBounds(0, 0, 1100, 700);
        TenantPanel2.setBackground(Color.gray);
        TenantPanel2.setVisible(false);

        // dashboardFrame.setIconImage(icon.getImage());
        dashboardFrame.add(TenantPanel1);
        dashboardFrame.add(TenantPanel2);
        dashboardFrame.setLayout(null);
        dashboardFrame.setTitle("Dashboard - Roommate");
        dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboardFrame.setSize(1100, 700);
        dashboardFrame.setLocationRelativeTo(null);
        dashboardFrame.setVisible(true);

    }

    public void addResult(Landlord d) {

        for (int i = 0; i < searchResult.length; i++) {

            if (searchResult[i] == null) {
                searchResult[i] = d;

                break;

            }

        }
    }

    public void newGIG(Landlord searchResult, int gap) {
        int posY = gap * 110;

        resultsp = new JPanel();

        bRentApt = new JButton("Rent");
        bRentApt.setBounds(495, 32, 70, 27);
        bRentApt.addActionListener(this);
        bRentApt.setOpaque(true);
        bRentApt.setContentAreaFilled(true);
        bRentApt.setBackground(Color.BLACK);
        bRentApt.setBorderPainted(true);
        bRentApt.setForeground(Color.WHITE);

        dNamel = new JLabel("Name: ");
        dNamel.setBounds(5, 5, 80, 20);
        dNamel.setForeground(Color.BLACK);

        dName = new JLabel(searchResult.getName());
        dName.setBounds(50, 5, 200, 20);
        dName.setForeground(Color.BLACK);

        MonthlyRentL = new JLabel("Monthly Rent ");
        MonthlyRentL.setBounds(5,75, 200, 20);
        MonthlyRentL.setForeground(Color.BLACK);

        dRate = new JLabel(searchResult.getRate());
        dRate.setBounds(90, 75, 150, 20);
        dRate.setForeground(Color.BLACK);

        resultsp.add(bRentApt);
        resultsp.add(dNamel);
        resultsp.add(dName);
        resultsp.add(dExp);
        resultsp.add(dExpl);
        resultsp.add(dRate);
        resultsp.add(MonthlyRentL);
        resultsp.setLayout(null);
        resultsp.setBounds(10, 10 + posY, 580, 100);
        resultsp.setBackground(Color.gray);
        resultsp.setVisible(true);

        searchResults.add(resultsp);

        RentApt[gap] = bRentApt;

    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < RentApt.length; i++) {
            if (e.getSource() == RentApt[i]) {

                JOptionPane.showMessageDialog(null, "Landlord successfully contacted!", "Success!",
                        JOptionPane.WARNING_MESSAGE);

            }
        }

        if (e.getSource() == bBackToTenantPanel1) {
            TenantPanel2.setVisible(false);
            // searchResults.removeAll();
            // resultsp.removeAll();
            TenantPanel1.setVisible(true);
            for (int i = 0; i < searchResult.length; i++) {
                if (searchResult[i] != null) {
                    searchResult[i] = null;
                }
                searchResults.removeAll();

            }
        }

        if (e.getSource() == bTenantLogout) {

            dashboardFrame.setVisible(false);
            Tenant[] Tenants = new Tenant[0];
            Landlord[] Landlords = new Landlord[0];
            new Login(Tenants, Landlords);

        }

        if (e.getSource() == b9) {

            System.exit(0);

        }
        if (e.getSource() == b10) {

            System.exit(0);

        }
    }
}
