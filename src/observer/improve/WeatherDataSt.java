package observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSt implements Subject {

    private float temperatrue;

    private float pressure;

    private float humidity;

    private List<Observer> observers;

    public WeatherDataSt() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperatrue(), getPressure(), getHumidity());
        }
    }

    public void setDate(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        notifyObservers();// 通知所有观察者
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
