package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Objects;

public class Emailer implements WeatherObserver {
    private static final String SUNNY = "sunny";

    @Override
    public void updateWeather(String weather) {
        if (Objects.equals(SUNNY, weather)) {
            generateSunnyWeatherAlert();
        }
    }

    private void generateSunnyWeatherAlert() {
        System.out.println("Send e-mail to clients allergic to the sun");
    }
}
