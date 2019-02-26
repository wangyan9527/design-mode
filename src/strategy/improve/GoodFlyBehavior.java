package strategy.improve;

/**
 * 通过统一的接口管理行为，这样方便进行扩展，可直接添加实现类
 * 第一种特有方式
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("~~Good Fly~~");
    }
}
