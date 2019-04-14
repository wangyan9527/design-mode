package factory.old;

public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        super.setName("prepare");
        System.out.println(name + " prepare");
    }
}
