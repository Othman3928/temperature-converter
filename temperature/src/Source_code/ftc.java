package Source_code;


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
public class ftc extends JFrame implements ActionListener{
     JTextField f;
    JButton b1,b2;
    ftc()
    {
       f = new JTextField();
        f.setBounds(240, 130, 200, 30);
        add(f);
        
        b1 = new JButton("Convert");
        b1.setBounds(350, 250, 125, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(200, 250, 125, 50);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hh.jpg"));
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
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    try {
        if (e.getSource() == b1) {
            String input = f.getText();
            if (input.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter a correct value");
            } else {
                double kelvin = Double.parseDouble(input);
                double celsius = kelvin - 273.15;
                JOptionPane.showMessageDialog(null, "Your Celsius Degree is " + celsius);
                new home();
                setVisible(false);
            }
        }
        else if(e.getSource()==b2)
        {
            new home();
            setVisible(false);
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Enter a valid numeric value");
    }
}
    
}
