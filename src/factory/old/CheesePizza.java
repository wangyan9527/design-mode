package factory.old;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.name = "CheesePizza";
        System.out.println(name + " preparing;");
    }
}
