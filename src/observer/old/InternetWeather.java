package observer.old;

public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();

        WeatherData weatherData = new WeatherData(currentConditions);

        weatherData.setData(30, 20, 10);
    }

}
