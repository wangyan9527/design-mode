package factory.abstractFactory;

public class PizzaStore {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new LDFactory());
    }

}
