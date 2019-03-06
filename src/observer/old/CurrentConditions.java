package observer.old;

public class CurrentConditions {

    private float temperature;

    private float pressure;

    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("today temperature: " + temperature);
        System.out.println("today pressure: " + pressure);
        System.out.println("today humidity: " + humidity);
    }

}
