package Pattern2Observer.displauClasses;

import Pattern2Observer.WeatherData;
import Pattern2Observer.interfaces.DisplayElement;
import Pattern2Observer.interfaces.Observer;
import Pattern2Observer.interfaces.Subject;

import java.util.HashMap;
import java.util.Map;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Double temperature;
    private Double humidity;
    private final Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public Map<String, Double> display() {
        Map<String, Double> result = new HashMap<>();
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
        result.put("Temperature", temperature);
        result.put("Humidity", humidity);
        return result;
    }

    @Override
    public void update() {
        if (weatherData instanceof WeatherData) {
            WeatherData wd = (WeatherData) weatherData;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
        }
    }
}
