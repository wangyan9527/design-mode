package strategy.improve;

/**
 *
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new YaYaQucakBehavior();
    }
}
