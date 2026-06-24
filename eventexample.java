import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class eventexample implements ActionListener {
    JLabel lbl;

    public eventexample() {
        JFrame frame = new JFrame("Event Example");
        frame.setSize(400, 300);
        lbl = new JLabel("Login here");
        lbl.setBounds(50, 50, 200, 30);
        Button btn = new Button("Login Form");
        btn.setBounds(50, 100, 80, 30);
        btn.addActionListener(this);
        frame.add(btn);
        frame.add(lbl);
        frame.setLayout(new FlowLayout( ));

        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        new LoginForm();
    }
    public static void main(String[] args) {
        new eventexample();


    }
}


