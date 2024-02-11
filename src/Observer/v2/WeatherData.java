package Observer.v2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    public List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public WeatherData(){
        observers= new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer->observer.update(temperature,humidity,pressure));
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        measurementsChanged();
    }
}
