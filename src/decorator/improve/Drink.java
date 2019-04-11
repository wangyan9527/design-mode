package decorator.improve;

public abstract class Drink {

    public String description="";

    private float price = 0f;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    public float getPrice() {
        return price;
    }

    public abstract float cost();
}
