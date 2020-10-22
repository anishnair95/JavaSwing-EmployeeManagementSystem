
package employee;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Anish
 */
public class View implements ActionListener{
    
    JFrame f;
    JTextField t1;
    JLabel l1,l2;
    JButton b1,b2;
    
    View()
    {
        f=new JFrame("View Details");
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setLayout(null);
        l1.setBounds(0,0,500,270);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/view.jpg"));        
        l1.setIcon(i1);
        
        f.add(l1);
        
        l2=new JLabel("Employee Id");
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.white);
        l2.setFont(new Font("serif",Font.BOLD,30));
        //l2.setVisible(true);
        l1.add(l2);
        
        t1=new JTextField();
        t1.setBounds(240,60,200,30);
        l1.add(t1);
        
        b1=new JButton("Search");
        b1.setFont(new Font("serif",Font.PLAIN,20));
        b1.setBounds(240,150,100,30);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Cancel");
        b2.setFont(new Font("serif",Font.PLAIN,20));
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);
        
        
        
        
        
        
        f.setVisible(true);
        f.setLocation(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,270);
        
       
    
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b1)
        {
            f.setVisible(false);
            Print_Data p=new Print_Data(t1.getText());
        }
        if(ae.getSource()==b2)
        {
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String args[])
    {
      new View();
      
    }
    
    
}
