//package UIUX;

import javax.swing.*;
import java.awt.*;
public class HelloSwing {
  
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        JButton button = new JButton("Click Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JTextField textField = new JTextField();
        textField.setBounds(100, 100, 300, 50);
      
        frame.setSize(400, 300);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(textField, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
         
    }
}