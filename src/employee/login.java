package employee;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.lang.Thread;
import java.sql.*;


public class login implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;
    
    
    public login()
    {
        f=new JFrame("Login");
        f.getContentPane().setBackground(new Color(129,212,250));
        f.setLayout(null);
        
        l1=new JLabel("Username");
        l1.setBounds(40,20,100,30);
        f.add(l1);
        
        
        l2=new JLabel("Password");
        l2.setBounds(40,70,100,30);
        f.add(l2);
        
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);
        
        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        f.add(t2);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/icons/login.jpg"));
        Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(360,20,150,150);
        f.add(l3);
        
        
        b1=new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("calibri",Font.BOLD,15));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        f.add(b1);
        
        
        
        b3=new JButton("SignUp");
        b3.setBounds(180,140,120,30);
        b3.setFont(new Font("calibri",Font.BOLD,15));
        b3.setForeground(Color.red);
        b3.addActionListener(this);
        f.add(b3);
        
        l3=new JLabel("Trouble Login ?");
        l3.setBounds(40,190,120,30);
        l3.setFont(new Font("calibri",Font.BOLD,18));
        l3.setForeground(Color.black);
        f.add(l3);
         
        b4=new JButton("Forgot Password");
        b4.setBounds(180,190,140,30);
        b4.setFont(new Font("calibri",Font.BOLD,15));
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.addActionListener(this);
        f.add(b4);
        
        b2=new JButton("Cancel");
        b2.setBounds(460,240,110,30);
        b2.setFont(new Font("calibri",Font.BOLD,15));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this); 
        f.add(b2);       
        
        
        
        f.setVisible(true);
        f.setSize(600,340);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(500,200);
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            try
        {
            conn c1=new conn();
            String u=t1.getText();
            String v=t2.getText();
            
            
            String q="select * from login where username='"+u+"' and password= '"+v+"'";
            ResultSet rs=c1.s.executeQuery(q);
            
            if(rs.next())
            {
               new details().f.setVisible(true);
               f.setVisible(false);
               
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Input");
                t1.setText("");
                t2.setText("");
                 f.setVisible(true);
            }
            
        }
        catch(Exception e)
         {
             e.printStackTrace();
//             System.out.println("Error:"+e);
             
         }
        }
        
        if(ae.getSource()==b2)
        {
            System.exit(0);
        }
        
        if(ae.getSource()==b3)
        {
           f.setVisible(false);
            new Signup();
           
        }
        
        if(ae.getSource()==b4)
        {
            f.setVisible(false);
            new Forgot();
        }
    }
    public static void main(String args[])
    {
        new login();
    }
    
    
}
