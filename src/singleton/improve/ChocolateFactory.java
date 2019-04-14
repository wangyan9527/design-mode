package singleton.improve;

/**
 * 使用单例模式来模拟巧克力工厂
 */
public class ChocolateFactory {

    private boolean empty;// 是否为空

    private boolean boiled;// 是否加热

    private static ChocolateFactory uniqeInstance;

    /**
     * 这里提供一个唯一的全局访问点
     *
     * @return
     */
    public static ChocolateFactory getInstance() {
        if (uniqeInstance == null) {
            // 多线程情况下可能会创建多个实例
            uniqeInstance = new ChocolateFactory();
        }
        return uniqeInstance;
    }

    /**
     * 使用私有构造函数,
     */
    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    /**
     * 添加巧克力动作
     */
    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
        }
    }

    /**
     * 排出巧克力动作
     */
    public void drain() {
        if (!empty && boiled) {
            empty = true;
        }
    }

    /**
     * 加热巧克力动作
     */
    public void boil() {
        if (!empty && !boiled) {
            boiled = true;
        }
    }


}
