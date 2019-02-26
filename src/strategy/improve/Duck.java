package strategy.improve;

public abstract class Duck {

    protected FlyBehavior flyBehavior;// 抽象的属性

    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 直接调用抽象属性的方法
     */
    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    /**
     * 可通过set方法来使行为变的可配置
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
