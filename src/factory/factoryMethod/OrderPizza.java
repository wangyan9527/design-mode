package factory.factoryMethod;

import factory.old.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法模式
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;

        do {
            orderType = getType();
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while(true);
    }

    /**
     * 不同的子类实现不同的功能，这样利于扩展
     *
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);

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
