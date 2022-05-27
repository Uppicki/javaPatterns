package Pattern2Observer.UI;

import Pattern2Observer.UI.displayLabels.CurrentConditionsLabel;
import Pattern2Observer.WeatherData;
import Pattern2Observer.displauClasses.CurrentConditionsDisplay;
import Pattern2Observer.displauClasses.ForecastDisplay;
import Pattern2Observer.displauClasses.StatisticsDisplay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    String[] displays = {
            "current conditions (текущие условия)",
            "forecast (прогноз)",
            "statistic (статистика)"
    };
    private Dimension labelDimension = new Dimension(240, 130);
    private Dimension comboBoxDimension = new Dimension(200, 20);

    private JComboBox<String> comboBox;
    private JPanel weatherPanel;
    private JLabel weatherLabel;

    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay =
            new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay =
            new ForecastDisplay(weatherData);



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

        comboBox = new JComboBox<>(displays);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.setPreferredSize(comboBoxDimension);
        comboBox.addActionListener(new AListener());

        content.add(comboBox, BorderLayout.NORTH);


        weatherPanel = new JPanel();
        weatherPanel.setBorder(BorderFactory.createTitledBorder(
                (String) comboBox.getSelectedItem()));

        weatherLabel = new CurrentConditionsLabel(currentDisplay);
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

