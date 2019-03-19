package observer.java;

import java.util.Observable;

/**
 * 继承java内置观察者
 */
public class WeatherData extends Observable {

    private float temperature;

    private float pressure;

    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        // 必须设置,不然不会通知被观察者,这样做的好处是可以有条件的通知
        this.setChanged();

        // 将通知推送给观察者
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));

        // 清除变化,这样观察者将不会再收到通知
        this.clearChanged();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public class Data{

        public float temperature;

        public float pressure;

        public float humidity;

        public Data(float temperature, float pressure, float humidity) {
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
        }
    }
}
