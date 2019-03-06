package observer.improve;

/**
 * 不同的观察者
 */
public class ForcastConditions implements Observer {

    private float temperatrue;

    private float pressure;

    private float humidity;

    @Override
    public void update(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("明天 温度: " + (temperatrue + Math.random()));
        System.out.println("明天 气压: " + (pressure + Math.random() * 10 ));
        System.out.println("明天 湿度: " + (humidity + Math.random()));
    }
}
