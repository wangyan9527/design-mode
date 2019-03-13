package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现java内置观察者接口
 */
public class ForcastConditions implements Observer {

    private float fTemperature;

    private float fPressure;

    private float fHumidity;

    /**
     * 接收被观察者推送的通知
     *
     * @param o
     * @param arg 被观察者推送的对象
     */
    @Override
    public void update(Observable o, Object arg) {
        this.fTemperature = ((WeatherData.Data) arg).temperature;
        this.fPressure = ((WeatherData.Data) arg).pressure;
        this.fHumidity = ((WeatherData.Data) arg).humidity;
        display();
    }

    public void display() {
        System.out.println("---- 明天温度:" + (fTemperature * 1.1) + " ----");
        System.out.println("---- 明天气压:" + (fPressure + 20) + " ----");
        System.out.println("---- 明天湿度:" + (fHumidity - 8) +  " ----");
    }
}
