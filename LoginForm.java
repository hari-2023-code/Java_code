import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    JTextField userField;
    JPasswordField passField;
    JButton loginBtn, clearBtn;

    LoginForm() {

        setTitle("Login Form");
        setSize(350, 220);
        setLayout(null);
        setLocationRelativeTo(null); // Center the window

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 25);
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(140, 30, 120, 25);
        add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(140, 70, 120, 25);
        add(passField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(60, 120, 90, 30);
        add(loginBtn);

        clearBtn = new JButton("Clear");
        clearBtn.setBounds(170, 120, 90, 30);
        add(clearBtn);

        loginBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginBtn) {

            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }

        if (e.getSource() == clearBtn) {
            userField.setText("");
            passField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm());
    }
}