package Pattern2Observer;

import Pattern2Observer.displauClasses.CurrentConditionsDisplay;
import Pattern2Observer.displauClasses.ForecastDisplay;
import Pattern2Observer.displauClasses.StatisticsDisplay;

public class WeatherCentre {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80., 65., 30.4);
        weatherData.setMeasurements(82., 70., 29.2);
        weatherData.setMeasurements(78., 90., 29.2);
    }
}
