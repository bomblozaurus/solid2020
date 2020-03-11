package pl.zzpj2020.solid.dip.weathertracker.solution;

public interface WeatherObservable {
    void registerObserver(WeatherObserver weatherObserver);
    void unregisterObserver(WeatherObserver weatherObserver);
    void notifyAllObservers();
}
