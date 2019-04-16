package factory.factoryMethod;

import factory.old.Pizza;

/**
 * 具体功能放在子类中实现
 */
public class NYOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new NYCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new NYPepperPizza();
        } else {
            pizza = new NYDefaultPizza();
        }
        return pizza;
    }
}
