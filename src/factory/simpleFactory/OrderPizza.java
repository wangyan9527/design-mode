package factory.simpleFactory;

import factory.old.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        setFactory(simplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza;
        String orderType;

        this.simplePizzaFactory = simplePizzaFactory;

        do {
            orderType = getType();
            // 这里将扩展时可能会变化的部分提取出来
            pizza = simplePizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
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
