package Pattern2Observer.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    String[] items = {
            "el1",
            "el2",
            "el3",
            "el4"
    };
    private Dimension labelDimension = new Dimension(240, 130);
    private Dimension comboBoxDimension = new Dimension(200, 20);

    private JComboBox<String> comboBox;
    private JPanel weatherPanel;
    private JLabel weatherLabel;



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

        comboBox = new JComboBox<>(items);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.setPreferredSize(comboBoxDimension);
        comboBox.addActionListener(new AListener());

        content.add(comboBox, BorderLayout.NORTH);


        weatherPanel = new JPanel();
        weatherPanel.setBorder(BorderFactory.createTitledBorder(
                (String) comboBox.getSelectedItem()));

        weatherLabel = new JLabel();
        weatherLabel.setPreferredSize(labelDimension);
        weatherPanel.add(weatherLabel);

        content.add(weatherPanel, BorderLayout.CENTER);



        pack();
    }



    private class AListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String item = (String) comboBox.getSelectedItem();
            weatherPanel.setBorder(BorderFactory.createTitledBorder(
                    (String) comboBox.getSelectedItem()));
        }
    }

}

