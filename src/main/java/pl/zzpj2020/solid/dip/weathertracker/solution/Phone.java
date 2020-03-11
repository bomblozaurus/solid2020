package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Objects;

public class Phone implements WeatherObserver {
    private static final String RAINY = "rainy";

    @Override
    public void updateWeather(String weather) {
        if (Objects.equals(RAINY, weather)) {
            generateRainyWeatherAlert();
        }
    }

    private void generateRainyWeatherAlert() {
        System.out.println("Push notification: Don't Forget the umbrella!");
    }
}
