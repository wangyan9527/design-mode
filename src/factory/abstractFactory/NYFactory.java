package factory.abstractFactory;

import factory.factoryMethod.NYCheesePizza;
import factory.factoryMethod.NYDefaultPizza;
import factory.factoryMethod.NYPepperPizza;
import factory.old.Pizza;

public class NYFactory implements AbstractFactory {

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
