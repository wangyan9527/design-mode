package observer.java;

public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();

        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forcastConditions);

        System.out.println("~~add~~");
        weatherData.setData(20, 144, 12);

        System.out.println("~~remove~~");
        weatherData.deleteObserver(currentConditions);
        weatherData.setData(23, 150, 10);
    }

}
