package strategy.improve;

/**
 * 叫的第一种特殊方式
 */
public class GaGaQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("~~gaga~~");
    }

}
