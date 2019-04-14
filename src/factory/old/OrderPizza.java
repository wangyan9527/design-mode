package factory.old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    public OrderPizza() {
        Pizza pizza;
        String orderType;

        do {
            // 这样做不利于扩展
            orderType = getType();
            if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
            } else if("greek".equals(orderType)) {
                pizza = new GreekPizza();
            } else if ("pepper".equals(orderType)) {
                pizza = new PepperPizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
