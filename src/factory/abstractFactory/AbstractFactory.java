package factory.abstractFactory;

import factory.old.Pizza;

public interface AbstractFactory {

    Pizza createPizza(String orderType);

}
