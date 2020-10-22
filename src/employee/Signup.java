/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

/**
 *
 * @author Anish
 */
public class Signup extends JFrame implements ActionListener {
     
      
       JPanel contentPane;
       JTextField textField;
       JTextField textField_1;
       JTextField textField_2;
       JTextField textField_3;
       JButton b1,b2;
       JComboBox combobox;
      public Signup()
      {
                    
          contentPane=new JPanel();
          contentPane.setBorder(new EmptyBorder(5,5,5,5));
            
          setContentPane(contentPane);
          contentPane.setBackground(Color.WHITE);
          contentPane.setLayout(null);
          
          JLabel lblUsername=new JLabel("Username:");
          lblUsername.setForeground(Color.DARK_GRAY);
          lblUsername.setFont(new Font("Tahoma",Font.BOLD,14));
          lblUsername.setBounds(99,86,92,26);
          contentPane.add(lblUsername);
          
          JLabel lblName=new JLabel("Name:");
          lblName.setForeground(Color.DARK_GRAY);
          lblName.setFont(new Font("Tahoma",Font.BOLD,14));
          lblName.setBounds(99,123,92,26);
          contentPane.add(lblName);
          
          JLabel lblPassword =new JLabel("Password:");
          lblPassword.setForeground(Color.DARK_GRAY);
          lblPassword.setFont(new Font("Tahoma",Font.BOLD,14));
          lblPassword.setBounds(99,160,92,26);
          contentPane.add(lblPassword);
          
          JLabel lblAnswer=new JLabel("Answer:");
          lblAnswer.setForeground(Color.DARK_GRAY);
          lblAnswer.setFont(new Font("Tahoma",Font.BOLD,14));
          lblAnswer.setBounds(99,234,92,26);
          contentPane.add(lblAnswer);
          
          combobox=new JComboBox();
          combobox.setModel(new DefaultComboBoxModel(new String[]{"Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?"}));
          combobox.setBounds(265, 202, 148, 20);
          contentPane.add(combobox);
          
          
          JLabel lblSecurityQuestion=new JLabel("Security Question");
          lblSecurityQuestion.setForeground(Color.DARK_GRAY);
          lblSecurityQuestion.setFont(new Font("Tahoma",Font.BOLD,14));
          lblSecurityQuestion.setBounds(99,197,140,26);
          contentPane.add(lblSecurityQuestion);
          
         textField =new JTextField();
         textField.setBounds(265,91,148,20);
         contentPane.add(textField);
         textField.setColumns(10);
         
         
         textField_1 =new JTextField();
         textField_1.setBounds(265,128,148,20);
         contentPane.add(textField_1);
         textField_1.setColumns(10);
         
         textField_2 =new JTextField();
         textField_2.setBounds(265,165,148,20);
         contentPane.add(textField_2);
         textField_2.setColumns(10);
         
         textField_3 =new JTextField();
         textField_3.setBounds(265,239,148,20);
         contentPane.add(textField_3);
         textField_3.setColumns(10);
         
         b1=new JButton("Create");
         b1.addActionListener(this);
         b1.setFont(new Font("Tahoma",Font.BOLD,13));
         b1.setBounds(140,289,100,30);
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         contentPane.add(b1);
         
         b2=new JButton("Back");
         b2.addActionListener(this);
         b2.setFont(new Font("Tahoma",Font.BOLD,13));
         b2.setBounds(300,289,100,30);
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         contentPane.add(b2);
         
         JPanel panel=new JPanel();
         panel.setForeground(new Color(34,139,34));
         panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),5),"Create-Account",
                 TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
         
        panel.setBounds (31,46,476,296);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        
        
          setBounds(600,250,606,406);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
             
      }
    
      public void actionPerformed(ActionEvent ae)
      {
        try{
              conn con=new conn();
          if(ae.getSource()==b1){
         
              
              
              String str="insert into login(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
              PreparedStatement st = con.c.prepareStatement(str);
              
                st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, (String) combobox.getSelectedItem());
		st.setString(5, textField_3.getText());
                
                int i=st.executeUpdate();
                
                if(i>0)
                {
                   JOptionPane.showMessageDialog(null,"Successfully Created");
                   
                }
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                   
          }
         
          if(ae.getSource()==b2)
          {
              setVisible(false);
              new login();
          }
          
        
         }
        catch(Exception ee)
        {
            System.out.print("Error:"+ee);
        }
              
   
      }
   public static void main(String args[])
    {
       new Signup();
    }
}