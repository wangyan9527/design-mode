package factory.simpleFactory;

import factory.old.CheesePizza;
import factory.old.GreekPizza;
import factory.old.PepperPizza;
import factory.old.Pizza;

public class SimplePizzaFactory {

    /**
     * 将变化的部分提取到简单工厂中
     *
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
        } else if("greek".equals(orderType)) {
            pizza = new GreekPizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
        }
        return pizza;
    }

}
