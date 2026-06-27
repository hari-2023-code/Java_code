import javax.swing.*;
import java.awt.event.*;

public class WindowEventExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Window Example");
        frame.setSize(400,300);

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                System.out.println("Opened");
            }

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("Closing");
                System.exit(0);
            }

        });

        frame.setVisible(true);
    }
}