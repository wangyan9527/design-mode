package strategy.improve;

/**
 * 飞行的第二种特有方式
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("~~Bad Fly~~");
    }
}
