package factory.factoryMethod;

import factory.old.Pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "LDCheesePizza";
        System.out.println(name + " preparing;");
    }
}
