import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Studentform implements ActionListener{
JTextField txtName;
JTextField txtid;
JTextField txtCourse;
JTextField txtemail;

        public Studentform() {
        JFrame frame = new JFrame("Student Form");
        JPanel formPanel = new JPanel();
        formPanel.setLayout(
            new GridLayout(4, 2,5,5));
        JLabel lblName = new JLabel("Name:");
        JLabel lblid = new JLabel("ID:");
        JLabel lblCourse = new JLabel("Course:");
        JLabel lblemail = new JLabel("Email:");

        txtName = new JTextField(20);
        txtid = new JTextField(20);
        txtCourse = new JTextField(20);
        txtemail = new JTextField(20);

        formPanel.add(lblName);
        formPanel.add(txtName);

        formPanel.add(lblid);
        formPanel.add(txtid);

        formPanel.add(lblCourse);
        formPanel.add(txtCourse);

        formPanel.add(lblemail);
        formPanel.add(txtemail);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        JButton btnRegister = new JButton("Register");
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        

        buttonPanel.add(btnRegister);
        buttonPanel.add(btnClear);

        

        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setTitle("Student Registration Form");
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        txtName.setText("");
        txtid.setText("");
        txtCourse.setText("");
        txtemail.setText("");
    }
    public static void main(String[] args)  {
        new Studentform();
    }
}