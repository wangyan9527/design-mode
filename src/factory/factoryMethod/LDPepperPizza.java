package factory.factoryMethod;

import factory.old.Pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "LDPepperPizza";
        System.out.println(name + " preparing;");
    }
}
