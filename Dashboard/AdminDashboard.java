package Dashboard;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;

import Login.*;
import User.*;

public final class AdminDashboard implements ActionListener {

    JFrame aDashboardFrame;
    JTextField tf1 , tf2;
    JPanel adminPanel1 , adminPanel2 , adminPanel3, adminPanel4, adminPanel5, adminPanelTen, adminPanelLand;
    JLabel aL1 , aL2 , aL3 , tenName, tenPhone, tenEmail , tenPass, tenNamel, tenPhonel, tenEmaill, tenPassl, poster1, poster2 , poster3 , poster5;
    JLabel landName, landPhone, landEmail, landPass, landNamel, landPhonel, landEmaill, landPassl;
    JButton manageTen, manageLand, back1 ,back2, remove1 , remove2 , b9 , b10;
    Landlord[] Landlords = new Landlord[100];
    Tenant[] Tenants = new Tenant[100];

    public AdminDashboard(Tenant[] tenants , Landlord[] Landlord)
    {
        this.Landlords = Landlord;
        aDashboardFrame = new JFrame();


        adminPanel1 = new JPanel();
        aL1 = new JLabel("Welcome Admin");
        aL1.setBounds(420,100,400,50);
        Font midFont = aL1.getFont().deriveFont(Font.PLAIN, 30f);
        aL1.setForeground(Color.BLACK);
        aL1.setFont(midFont);

        manageTen = new JButton("Manage Tenant");
        manageTen.setBounds(375,400,150,50);
        manageTen.addActionListener(this);
        manageTen.setOpaque(true);
        manageTen.setContentAreaFilled(true);
        manageTen.setBackground(Color.BLACK);
        manageTen.setBorderPainted(true);
        manageTen.setForeground(Color.WHITE);


        manageLand = new JButton("Manage Landlords");
        manageLand.setBounds(575,400,150,50);
        manageLand.addActionListener(this);
        manageLand.setOpaque(true);
        manageLand.setContentAreaFilled(true);
        manageLand.setBackground(Color.BLACK);
        manageLand.setBorderPainted(true);
        manageLand.setForeground(Color.WHITE);

        b9=new JButton("Exit");
        b9.setBounds(1000,620,80,30);
        b9.addActionListener(this);
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);
        b9.setBorderPainted(false);
        b9.setForeground(Color.BLACK);

        b10 = new JButton("Logout");
        b10.setBounds(10,610,100,40);
        b10.addActionListener(this);
        b10.setOpaque(true);
        b10.setContentAreaFilled(true);
        b10.setBackground(Color.BLACK);
        b10.setBorderPainted(true);
        b10.setForeground(Color.WHITE);

        adminPanel2 = new JPanel();

        adminPanel4 = new JPanel();


        adminPanel3 = new JPanel();

        adminPanel3.setLayout(null);
        adminPanel3.setBounds(260,70,600,500);
        adminPanel3.setBackground(Color.WHITE);
        adminPanel3.setVisible(true);


        tf1=new JTextField("" , 2);
        tf1.setBounds(350,590,220,32);
        tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        Font bigFont = tf1.getFont().deriveFont(Font.PLAIN, 20f);
        tf1.setFont(bigFont);
        tf1.setOpaque(false);

        remove1 = new JButton("Remove User");
        remove1.setBounds(600,600,150,25);
        remove1.addActionListener(this);
        remove1.setOpaque(true);
        remove1.setContentAreaFilled(true);
        remove1.setBackground(Color.BLACK);
        remove1.setBorderPainted(true);
        remove1.setForeground(Color.WHITE);

        back1 = new JButton("Back");
        back1.setBounds(20,600,80,25);
        back1.addActionListener(this);
        back1.setOpaque(true);
        back1.setContentAreaFilled(true);
        back1.setBackground(Color.BLACK);
        back1.setBorderPainted(true);
        back1.setForeground(Color.WHITE);




        ImageIcon image1 = new ImageIcon("Images/1.png");
        poster1 = new JLabel(image1);
        poster1.setBounds(0,0,1100,700);


        adminPanel2.add(adminPanel3);
        adminPanel2.add(back1);
        adminPanel2.add(tf1);
        adminPanel2.add(remove1);
        adminPanel2.add(poster1);
        adminPanel2.setLayout(null);
        adminPanel2.setBounds(0,0,1100,700);
        adminPanel2.setBackground(Color.gray);
        adminPanel2.setVisible(false);


        adminPanel5 = new JPanel();

        adminPanel5.setLayout(null);
        adminPanel5.setBounds(260,70,600,500);
        adminPanel5.setBackground(Color.WHITE);
        adminPanel5.setVisible(true);

        tf2=new JTextField("" , 2);
        tf2.setBounds(350,590,220,32);
        tf2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        tf2.setFont(bigFont);
        tf2.setOpaque(false);

        remove2 = new JButton("remove User");
        remove2.setBounds(600,600,150,25);
        remove2.addActionListener(this);
        remove2.setOpaque(true);
        remove2.setContentAreaFilled(true);
        remove2.setBackground(Color.BLACK);
        remove2.setBorderPainted(true);
        remove2.setForeground(Color.WHITE);

        back2 = new JButton("Back");
        back2.setBounds(20,600,80,25);
        back2.addActionListener(this);
        back2.setOpaque(true);
        back2.setContentAreaFilled(true);
        back2.setBackground(Color.BLACK);
        back2.setBorderPainted(true);
        back2.setForeground(Color.WHITE);


        ImageIcon image5 = new ImageIcon("Images/5.png");
        poster5 = new JLabel(image5);
        poster5.setBounds(0,0,1100,700);


        adminPanel4.add(adminPanel5);
        adminPanel4.add(tf2);
        adminPanel4.add(remove2);
        adminPanel4.add(back2);
        adminPanel4.add(poster5);
        adminPanel4.setLayout(null);
        adminPanel4.setBounds(0,0,1100,700);
        adminPanel4.setBackground(Color.gray);
        adminPanel4.setVisible(false);



        ImageIcon image2 = new ImageIcon("Images/2.png");
        poster2 = new JLabel(image2);
        poster2.setBounds(0,0,1100,700);



        adminPanel1.add(aL1);
        adminPanel1.add(b9);
        adminPanel1.add(b10);
        adminPanel1.add(manageTen);
        adminPanel1.add(manageLand);
        adminPanel1.add(adminPanel2);
        adminPanel1.add(adminPanel4);
        adminPanel1.add(poster2);
        adminPanel1.setLayout(null);
        adminPanel1.setBounds(0,0,1100,700);
        adminPanel1.setBackground(Color.gray);
        adminPanel1.setVisible(true);







        aDashboardFrame.add(adminPanel1);
        aDashboardFrame.add(adminPanel2);
        aDashboardFrame.add(adminPanel4);
        aDashboardFrame.setLayout(null);
        aDashboardFrame.setTitle("Admin Dashboard - Roommate");
        aDashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aDashboardFrame.setSize(1100,700);
        aDashboardFrame.setLocationRelativeTo(null);
        aDashboardFrame.setVisible(true);


    }

    public void cusList(Tenant c ,int gap )
    {

        int posY = gap*110;

        adminPanelTen = new JPanel();


        tenNamel = new JLabel("Name: ");
        tenNamel.setBounds(5,5,80,20);
        tenNamel.setForeground(Color.BLACK);


        tenName = new JLabel(c.getName());
        tenName.setBounds(43,5,200,20);
        tenName.setForeground(Color.BLACK);

        tenPhonel = new JLabel("Phone No: ");
        tenPhonel.setBounds(5,23,200,20);
        tenPhonel.setForeground(Color.BLACK);

        tenPhone = new JLabel(c.getPhoneNum());
        tenPhone.setBounds(70,23,150,20);
        tenPhone.setForeground(Color.BLACK);

        tenEmaill = new JLabel("E-mail Address: ");
        tenEmaill.setBounds(5,43,200,20);
        tenEmaill.setForeground(Color.BLACK);

        tenEmail = new JLabel(c.getEmailaddress());
        tenEmail.setBounds(100,43,150,20);
        tenEmail.setForeground(Color.BLACK);

        tenPassl = new JLabel("Password: ");
        tenPassl.setBounds(5,63,200,20);
        tenPassl.setForeground(Color.BLACK);

        tenPass = new JLabel(c.getPassword());
        tenPass.setBounds(65,63,150,20);
        tenPass.setForeground(Color.BLACK);



        adminPanelTen.add(tenName);
        adminPanelTen.add(tenNamel);
        adminPanelTen.add(tenPhone);
        adminPanelTen.add(tenPhonel);
        adminPanelTen.add(tenEmail);
        adminPanelTen.add(tenEmaill);
        adminPanelTen.add(tenPass);
        adminPanelTen.add(tenPassl);
        adminPanelTen.setLayout(null);
        adminPanelTen.setBounds(10 , 10 +posY ,580 , 100 );
        adminPanelTen.setBackground(Color.gray);
        adminPanelTen.setVisible(true);





        adminPanel3.add(adminPanelTen);


    }

    public void LandList(Landlord d , int gap )
    {

        int posY = gap*110;

        adminPanelLand = new JPanel();


        landNamel = new JLabel("Name: ");
        landNamel.setBounds(5,5,80,20);
        landNamel.setForeground(Color.BLACK);


        landName = new JLabel(d.getName());
        landName.setBounds(43,5,200,20);
        landName.setForeground(Color.BLACK);

        landPhonel = new JLabel("Phone No: ");
        landPhonel.setBounds(5,23,150,20);
        landPhonel.setForeground(Color.BLACK);

        landPhone = new JLabel(d.getPhoneNum());
        landPhone.setBounds(70,23,150,20);
        landPhone.setForeground(Color.BLACK);

        landEmaill = new JLabel("E-mail Address: ");
        landEmaill.setBounds(5,43,150,20);
        landEmaill.setForeground(Color.BLACK);

        landEmail = new JLabel(d.getEmailaddress());
        landEmail.setBounds(100,43,150,20);
        landEmail.setForeground(Color.BLACK);

        landPassl = new JLabel("Password: ");
        landPassl.setBounds(5,80,150,20);
        landPassl.setForeground(Color.BLACK);

        landPass = new JLabel(d.getPassword());
        landPass.setBounds(65,63,150,20);
        landPass.setForeground(Color.BLACK);


        adminPanelLand.add(landName);
        adminPanelLand.add(landNamel);
        adminPanelLand.add(landPhone);
        adminPanelLand.add(landPhonel);
        adminPanelLand.add(landEmail);
        adminPanelLand.add(landEmaill);
        adminPanelLand.add(landPass);
        adminPanelLand.add(landPassl);
        adminPanelLand.setLayout(null);
        adminPanelLand.setBounds(10 , 10 +posY ,580 , 100 );
        adminPanelLand.setBackground(Color.gray);
        adminPanelLand.setVisible(true);



        adminPanel5.add(adminPanelLand);



    }


    public void actionPerformed(ActionEvent e)
    {


        if (e.getSource() == b9)
        {

            System.exit(0);

        }

        if (e.getSource() == b10)
        {

            aDashboardFrame.setVisible(false);
            new Login(Tenants , Landlords);


        }

        if(e.getSource() == back1)
        {
            adminPanel2.setVisible(false);
            adminPanel1.setVisible(true);

        }


        if(e.getSource() == back2)
        {
            adminPanel4.setVisible(false);
            adminPanel1.setVisible(true);

        }

        if(e.getSource() == manageTen)
        { adminPanel3.removeAll();
            adminPanel1.setVisible(false);
            adminPanel2.setVisible(true);
            for(int i=0; i<Tenants.length; i++)
            {
                if(Tenants[i] != null)
                {
                    cusList(Tenants[i] , i);
                }
            }
        }


        if(e.getSource() == manageLand)
        { adminPanel5.removeAll();
            adminPanel1.setVisible(false);
            adminPanel4.setVisible(true);
            for(int i=0; i<Landlords.length; i++)
            {
                if(Landlords[i] != null)
                {
                    LandList(Landlords[i] , i);
                }
            }
        }

        if(e.getSource() == remove1)
        {
            String cusDelete = tf1.getText();

            for(int i=0; i<Tenants.length; i++)
            {
                if(Tenants[i] != null)
                {
                    if(Tenants[i].getName().equals(cusDelete))
                    {
                        Tenants[i] = null;
                        adminPanel3.removeAll();
                        adminPanel2.setVisible(false);
                        adminPanel2.setVisible(true);
                        break;
                    }
                }
            }

            for(int i=0; i<Tenants.length; i++)
            {
                if(Tenants[i] != null)
                {
                    cusList(Tenants [i] , i);
                }
            }
        }


        if(e.getSource() == remove2)
        {
            String driDelete = tf2.getText();

            for(int i=0; i<Landlords.length; i++)
            {
                if(Landlords[i] != null)
                {
                    if(Landlords[i].getName().equals(driDelete))
                    {
                        Landlords[i] = null;
                        System.out.println("Driver" +i+ "removed");
                        adminPanel5.removeAll();
                        adminPanel4.setVisible(false);
                        adminPanel4.setVisible(true);
                        break;
                    }
                }
            }


            for(int i=0; i<Landlords.length; i++)
            {
                if(Landlords[i] != null)
                {
                    LandList(Landlords[i] , i);
                    System.out.println(Landlords[i].getName());
                }
            }

        }


    }
}
