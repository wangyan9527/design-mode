package decorator.improve;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }

}
