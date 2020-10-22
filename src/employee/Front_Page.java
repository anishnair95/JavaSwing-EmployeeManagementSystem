
package employee;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;
public class Front_Page implements ActionListener {
    JFrame f;
    JLabel id,l1;
    JButton b;
    
    Front_Page()
    {
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/icons/front.jpg"));
        
        Image i2=i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
         JLabel l1 = new JLabel(i3); 
         l1.setLayout(null);
         l1.setBounds(0,150,1360,530);      //creating label using image at a particular position
         f.add(l1);
        
        b=new JButton("Click Here To Continue");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.orange);
        b.setFont(new Font("arial",Font.PLAIN,25));
        
        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        
        id=new JLabel();
        id.setBounds(0,0,1360,750);  //same size of image
        id.setLayout(null);
        
        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setFont(new Font("arial",Font.PLAIN,70));            //This is for heading
        lid.setForeground(Color.blue);
        lid.setBounds(60,80,1500,80);
       
        id.add(lid);   //putting label and image inside id label
        id.add(b);
        f.add(id);
        
        
      
        f.getContentPane().setBackground(Color.white);
        
        
        
        
        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
      
        
        while(true)
        {
            lid.setVisible(false);
            try{
                Thread.sleep(500);
                
            }catch(Exception e){}
            
            lid.setVisible(true);
            
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            f.setVisible(false);
//            System.exit(0);
//            f.dispose();
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           login l=new login();
           
        }
        
    }
     
    public static void main(String[] args) {
     
      /*  SwingUtilities.invokeLater(new Runnable()
                {
                    public void run()
                    {
                        new Front_Page();
                    }
                 });*/
        Front_Page ob=new Front_Page();
      System.out.println("Hello World");
    }
    
}
