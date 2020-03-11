package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Set;

public class WeatherTracker implements WeatherObservable {
    Set<WeatherObserver> observers;
    String currentWeather;

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
        notifyAllObservers();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void unregisterObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.updateWeather(this.currentWeather));
    }
}
