package factory.abstractFactory;

import factory.factoryMethod.LDCheesePizza;
import factory.factoryMethod.LDDefaultPizza;
import factory.factoryMethod.LDPepperPizza;
import factory.old.Pizza;

public class LDFactory implements AbstractFactory {

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
