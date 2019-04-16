package factory.factoryMethod;

import factory.old.Pizza;

public class NYCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "NYCheesePizza";
        System.out.println(name + " preparing;");
    }
}
