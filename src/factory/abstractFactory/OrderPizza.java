package factory.abstractFactory;

import factory.old.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        setFactory(abstractFactory);
    }

    public void setFactory(AbstractFactory abstractFactory) {
        Pizza pizza;
        String orderType;

        this.abstractFactory = abstractFactory;

        do {
            orderType = getType();
            pizza = abstractFactory.createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while(true);

    }

    private String getType() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return str;
    }


}
