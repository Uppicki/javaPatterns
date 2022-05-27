package Pattern2Observer.displauClasses;

import Pattern2Observer.WeatherData;
import Pattern2Observer.interfaces.DisplayElement;
import Pattern2Observer.interfaces.Observer;
import Pattern2Observer.interfaces.Subject;

import java.util.HashMap;
import java.util.Map;

public class ForecastDisplay implements Observer, DisplayElement {
    private final Subject weatherData;

    private Double currentPressure = 29.92;
    private Double lastPressure = 0.0;


    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public Map<String, Double> display() {
        Map<String, Double> result = new HashMap<>();
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure)
            System.out.println("Improving weather on the way!");
        else if (currentPressure == lastPressure)
            System.out.println("More of the same");
        else if (currentPressure < lastPressure)
            System.out.println("Watch out for cooler, rainy weather");
        result.put("Current pressure", currentPressure);
        result.put("Last Pressure", lastPressure);
        return result;
    }

    @Override
    public void update() {
        if (weatherData instanceof WeatherData) {
            WeatherData wd = (WeatherData) weatherData;
            lastPressure = currentPressure;
            currentPressure = wd.getPressure();
            display();
        }
    }
}
