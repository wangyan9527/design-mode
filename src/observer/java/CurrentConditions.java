package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现java内置观察者接口
 */
public class CurrentConditions implements Observer {

    private float cTemperature;

    private float cPressure;

    private float cHumidity;

    /**
     * 接收被观察者推送的通知
     *
     * @param o
     * @param arg 被观察者推送的对象
     */
    @Override
    public void update(Observable o, Object arg) {
        this.cTemperature = ((WeatherData.Data) arg).temperature;
        this.cPressure = ((WeatherData.Data) arg).pressure;
        this.cHumidity = ((WeatherData.Data) arg).humidity;
        display();
    }

    public void display() {
        System.out.println("---- 今天温度:" + cTemperature + " ----");
        System.out.println("---- 今天气压:" + cPressure + " ----");
        System.out.println("---- 今天湿度:" + cHumidity + " ----");
    }
}
