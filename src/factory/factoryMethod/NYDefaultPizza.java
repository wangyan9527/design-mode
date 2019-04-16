package factory.factoryMethod;

import factory.old.Pizza;

public class NYDefaultPizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "NYDefault";
        System.out.println(name + " preparing;");
    }
}
