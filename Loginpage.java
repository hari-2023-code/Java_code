import javax.swing.*;
import java.awt.*;

public class Loginpage  {
    Loginpage() {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        JLabel lbl = new JLabel("Login here");
        lbl.setBounds(50, 50, 200, 30);
        JTextField txt = new JTextField();
        txt.setBounds(50, 100, 200, 30);
        JButton btn = new JButton("Login Form");
        btn.setBounds(50, 150, 80, 30);
        frame.add(btn);
        frame.add(lbl);
        frame.add(txt);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
  
}