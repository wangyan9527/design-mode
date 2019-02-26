package strategy.improve;

public class StimulateDuck {

    public static void main(String[] args) {

        /**
         * 这里定义成超类的类型，这样就屏蔽了子类的实现，从而不用考虑上层的差别性
         */
        Duck redHeadDuck = new RedHeadDuck();
        Duck greenHeadDuck = new GreenHeadDuck();

        System.out.println("--redHead--");
        redHeadDuck.quack();
        redHeadDuck.fly();

        System.out.println("--greenHead--");
        greenHeadDuck.quack();
        greenHeadDuck.fly();

        // 动态改变行为
        greenHeadDuck.setFlyBehavior(new GoodFlyBehavior());
        greenHeadDuck.fly();


    }

}
