package strategy.old;

/**
 * 运行
 */
public class StimulateDuck {

    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.Quack();
        greenHeadDuck.swim();
        greenHeadDuck.fly();

        redHeadDuck.display();
        redHeadDuck.Quack();
        redHeadDuck.swim();
        redHeadDuck.fly();

    }

}
