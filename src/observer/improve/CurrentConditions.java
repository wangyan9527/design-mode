package observer.improve;

/**
 * 不同的观察者对象
 */
public class CurrentConditions implements Observer {

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
        System.out.println("今天 温度: " + temperatrue);
        System.out.println("今天 气压: " + pressure);
        System.out.println("今天 湿度: " + humidity);
    }

}
