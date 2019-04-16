package factory.factoryMethod;

import factory.old.Pizza;

public class LDDefaultPizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "LDDefault";
        System.out.println(name + " preparing;");
    }
}
