import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvent{
     public static void main(String[] args) {
        JFrame frame = new JFrame("Keyboard Events");
        frame.setLayout(new FlowLayout());

        JLabel Message = new JLabel("Press any key...");
        JTextField textField = new JTextField(20);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Message.setText("Key Pressed:" + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Message.setText("Key Released:" + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyTyped(KeyEvent e) {
                Message.setText("Key Typed:" + e.getKeyCode());
            }
        });
    frame.add(new JLabel("Type something:"));
    frame.add(textField);
    frame.add(Message);

    frame.setSize(300, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    textField.requestFocusInWindow();
           
}
}
     