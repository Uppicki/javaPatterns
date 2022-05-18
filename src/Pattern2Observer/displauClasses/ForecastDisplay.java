package Pattern2Observer.displauClasses;

import Pattern2Observer.WeatherData;
import Pattern2Observer.interfaces.DisplayElement;
import Pattern2Observer.interfaces.Observer;
import Pattern2Observer.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private float currentPressure = 29.92f;
    private float lastPressure = 0.0f;


    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure)
            System.out.println("Improving weather on the way!");
        else if (currentPressure == lastPressure)
            System.out.println("More of the same");
        else if (currentPressure < lastPressure)
            System.out.println("Watch out for cooler, rainy weather");
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
