package observer.old;

public class WeatherData {

    private float temperature;

    private float pressure;

    private float humidity;

    private CurrentConditions currentConditions;

    /**
     * 这里如果有其他的实现需要动态的添加或改变,
     * 所以这里应该将CurrentConditions这个类抽象成接口和具体的实现
     *
     * @param currentConditions
     */
    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
