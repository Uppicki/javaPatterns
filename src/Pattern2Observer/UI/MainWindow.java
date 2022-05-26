package Pattern2Observer.UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    String[] items = {
            "el1",
            "el2",
            "el3",
            "el4"
    };
    public static void main(String[] args) {
        MainWindow window = new MainWindow();

    }

    public MainWindow() {
        super("Weather centre");

        this.setBounds(-8, -3, 1936, 1056);
        //this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        Container content = getContentPane();

        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        content.add(comboBox);


        JTable table = new JTable();


        setPreferredSize(new Dimension(240, 130));
        pack();
    }
}
