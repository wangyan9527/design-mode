package decorator.improve;

/**
 * 装饰者分支
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    /**
     * 递归调用，装饰者可以包装被装饰者，也可以包装其他装饰者
     *
     * @return
     */
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "->"
                + obj.getDescription();
    }
}
