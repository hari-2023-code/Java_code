import javax.swing.*;
import java.awt.*;

public class JTableSwing {
    public static void main (String[] args){
        JFrame jf = new JFrame("Table");

        String[] columnNames = {"ID", "Name", "Age"};
        String[][] data = {
            {"101", "Ram", "20"},
            {"102", "Shyam", "21"},
            {"103", "Hari", "22"},
            {"104", "Sita", "19"},
            {"105", "Gita", "20"},
            {"106", "Ram", "20"},
            {"107", "Shyam", "21"},
            {"108", "Hari", "22"},
            {"109", "Sita", "19"},
            {"110", "Gita", "20"}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        jf.add(scrollPane, BorderLayout.CENTER);

        jf.setSize(400, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
}