package factory.factoryMethod;

import factory.old.Pizza;

public class NYPepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "NYPepperPizza";
        System.out.println(name + " preparing;");
    }
}
