package Observer.v2;

import Observer.simple.Publisher;
import Observer.simple.Subscriber;
import Observer.simple.SubscriberAndroid;

public class main {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay currentDisplay=
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
        weatherData.setMeasurements(23,80,19.5f);

    }
}