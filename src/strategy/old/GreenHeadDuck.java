package strategy.old;

/**
 * 第一种类型
 */
public class GreenHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }

    @Override
    public void fly() {
        System.out.println("~~no fly~~");
    }
}
