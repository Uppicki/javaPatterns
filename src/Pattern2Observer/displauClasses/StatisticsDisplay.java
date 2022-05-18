package Pattern2Observer.displauClasses;

import Pattern2Observer.WeatherData;
import Pattern2Observer.interfaces.DisplayElement;
import Pattern2Observer.interfaces.Observer;
import Pattern2Observer.interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;


    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temp: " + (tempSum/numReadings) +
                            "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update() {
        if (weatherData instanceof WeatherData) {
            WeatherData wd = (WeatherData) weatherData;
            float temp = wd.getTemperature();
            if (temp > maxTemp) maxTemp = temp;
            if (temp < minTemp) minTemp = temp;

            tempSum += temp;
            numReadings++;

            display();
        }
    }
}
