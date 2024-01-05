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


public class KelvinConverter extends JFrame implements ActionListener {
    JTextField temperatureField;
    JButton b1,b2;

    
    KelvinConverter() {
        
        temperatureField = new JTextField();
        temperatureField.setBounds(240, 130, 200, 30);
        add(temperatureField);

        
        b1 = new JButton("Convert");
        b1.setBounds(280, 250, 125, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
       

        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hh.jpg"));
        Image i2 = i1.getImage().getScaledInstance(690, 390, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 5, 690, 390);
        add(image);

       
        setLayout(null);
         setSize(700 , 450);
        setLocation(450, 200);
        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            
            String input = temperatureField.getText();
            double temperature = Double.parseDouble(input);

            if (e.getSource() == b1)
            {
               String conversionType = JOptionPane.showInputDialog(null,"Sellect Type of Convert :\n 1:- C to K \n 2:- F to K");             
               double result;
               String resultMessage;
                if (conversionType.equals("1")) {
                    result = temperature + 273.15;
                    resultMessage = "Kelvin : " + result;
                } else if (conversionType.equals("2")) {
                    result = (temperature - 32) * 5 / 9 + 273.15;
                    resultMessage = "Kelvin : " + result;
                } else {
                    resultMessage = "Incorrect Value";
                }
                JOptionPane.showMessageDialog(null, resultMessage);
                new home();
                setVisible(false);
            }
           
        } catch (NumberFormatException ex) {
           
            JOptionPane.showMessageDialog(null, "Incorrect Value");
        }
        
    }

    
    public static void main(String[] args) {
        new KelvinConverter();
    }
}