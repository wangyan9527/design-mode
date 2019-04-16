package factory.factoryMethod;

import factory.old.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        } else {
            pizza = new LDDefaultPizza();
        }
        return pizza;
    }
}
