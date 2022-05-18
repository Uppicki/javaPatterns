package Pattern2Observer;

import Pattern2Observer.displauClasses.CurrentConditionsDisplay;

public class WeatherCentre {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    }
}
