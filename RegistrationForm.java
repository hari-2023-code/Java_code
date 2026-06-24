import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(new JLabel("Name"));
        frame.add(new JTextField());

        frame.add(new JLabel("Email"));
        frame.add(new JTextField());

        frame.add(new JLabel("Phone"));
        frame.add(new JTextField());

        frame.add(new JLabel("Password"));
        frame.add(new JPasswordField());

        frame.add(new JButton("Register"));
        frame.add(new JButton("Cancel"));

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}