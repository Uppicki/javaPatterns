package Pattern2Observer.displauClasses;

import Pattern2Observer.WeatherData;
import Pattern2Observer.interfaces.DisplayElement;
import Pattern2Observer.interfaces.Observer;
import Pattern2Observer.interfaces.Subject;

import java.util.HashMap;
import java.util.Map;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;

    private Double maxTemp = 0.0;
    private Double minTemp = 200.0;
    private Double tempSum = 0.0;
    private Double numReadings = 0.0;


    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public Map<String, Double> display() {
        Map<String, Double> result = new HashMap<>();
        System.out.println("Avg/Max/Min temp: " + (tempSum/numReadings) +
                            "/" + maxTemp + "/" + minTemp);
        result.put("Max Temperature", maxTemp);
        result.put("min Temperature", minTemp);
        result.put("Sum Temperature", tempSum);
        result.put("num days", numReadings);
        return result;
    }

    @Override
    public void update() {
        if (weatherData instanceof WeatherData) {
            WeatherData wd = (WeatherData) weatherData;
            Double temp = wd.getTemperature();
            if (temp > maxTemp) maxTemp = temp;
            if (temp < minTemp) minTemp = temp;

            tempSum += temp;
            numReadings++;

            display();
        }
    }
}
