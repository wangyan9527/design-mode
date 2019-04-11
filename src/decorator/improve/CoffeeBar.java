package decorator.improve;

public class CoffeeBar {

    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());


        System.out.println("*******包装********");
        // 包装
        order = new Espresso(); // 主体
        order = new Milk(order); // 进行包装
        order = new Chocolate(order); // 包装
        order = new Chocolate(order); // 包装
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());

    }

}
