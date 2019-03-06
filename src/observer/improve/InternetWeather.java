package observer.improve;

public class InternetWeather {

    public static void main(String[] args) {
        WeatherDataSt weatherDataSt = new WeatherDataSt();

        // 第一个观察者
        CurrentConditions currentConditions = new CurrentConditions();
        // 第二个观察者
        ForcastConditions forcastConditions = new ForcastConditions();

        // 注册观察者
        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);

        // 模拟
        System.out.println("--------------register---------------");
        weatherDataSt.setDate(30, 150, 40);

        // 移除观察者
        weatherDataSt.removeObserver(currentConditions);

        System.out.println("-------------remove-------------");
        weatherDataSt.setDate(40, 200, 30);
    }

}
