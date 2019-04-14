package factory.old;

public abstract class Pizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    /**
     * 装盒
     */
    public void box() {
        System.out.println(name + " boxing;");
    }



}
