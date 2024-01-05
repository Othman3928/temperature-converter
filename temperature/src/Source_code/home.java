package Source_code;


import Source_code.ctf;
import Source_code.ftc;
import Source_code.KelvinConverter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class home extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    home()
    {
       
        
        
        b1 = new JButton("Covert C to F ");
        b1.setBounds(70, 150, 150, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Convert F to C ");
        b2.setBounds(500, 150, 150, 50);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Exist");
        b3.setBounds(290, 250, 125, 50);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("Convert To K ");
        b4.setBounds(280, 150, 150, 50);
        b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        add(b4);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/mm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(690, 390, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 5, 690, 390);
        add(image);
        
        setLayout(null);
        setSize(700 , 450);
        setLocation(450, 200);
//        setUndecorated(true);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            if(e.getSource()==b1)
            {
                new ctf();
                setVisible(false);
            }
            else if(e.getSource()==b2)
            {
                new ftc();
                setVisible(false);
                
            }
            else if (e.getSource()==b3)
            {
                new end();
                setVisible(false);
            }
            else if(e.getSource()==b4)
            {
                new KelvinConverter();
                setVisible(false);
            }
        }catch(Exception E)
        {
            E.printStackTrace();
        }
    }
    
}
