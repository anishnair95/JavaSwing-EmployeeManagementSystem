/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Anish
 */
public class details implements ActionListener {
    
    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    
    
    public details()
    {
       f=new JFrame("Employee Detail");
       f.setLayout(null);
       
       l1=new JLabel();
       l1.setLayout(null);
       l1.setBounds(0,0,700,600);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/icons/details.jpg"));
       Image i2=i1.getImage().getScaledInstance(700,600,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       
       l1.setIcon(i3);
       
        l2 = new JLabel("Employee Details");
        l2.setBounds(250,20,300,40);
        l2.setFont(new Font("serif",Font.BOLD,28));
        l2.setForeground(Color.black);
        l1.add(l2);
        
        b1=new JButton("Add");
        b1.setBounds(420,80,100,50);
        b1.setFont(new Font("serif",Font.BOLD,19));
        
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(530,80,100,50);
        b2.setFont(new Font("serif",Font.BOLD,19));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(420,140,100,50);
        b3.setFont(new Font("serif",Font.BOLD,19));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(530,140,100,50);
        b4.setFont(new Font("serif",Font.BOLD,19));
        b4.addActionListener(this);
        l1.add(b4);
        
       f.add(l1);
       
       f.setVisible(true);
       f.setLocation(450,200);
       f.setSize(700,600);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            f.setVisible(false);
            new Add_Employee();
            
        }
        if(ae.getSource()==b2)
        {
            f.setVisible(false);
            new View();
            
        }
        if(ae.getSource()==b3)
        {
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4)
        {
            f.setVisible(false);
            new Search_Employee();
        }
    }
    
    public static void main(String args[])
    {
     new details();
    }
}
