package strategy.improve;

/**
 * 每个对象根据需求进行属性的组装
 */
public class RedHeadDuck extends Duck {

    /**
     * 这里可通过构造方法来组装这个对象的属性
     */
    public RedHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }
}
