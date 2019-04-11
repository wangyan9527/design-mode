package decorator.improve;

/**
 * 被装饰者分支
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
