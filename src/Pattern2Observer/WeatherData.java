package Pattern2Observer;

import Pattern2Observer.interfaces.Observer;
import Pattern2Observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;

    private Double temperature;
    private Double humidity;
    private Double pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }


    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update();
    }

    public void setMeasurements(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    } //Доработать до приёма данных из интернета

}
