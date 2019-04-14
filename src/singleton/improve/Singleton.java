package singleton.improve;

public class Singleton {

    private static Singleton uniqeInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqeInstance == null) {
            uniqeInstance = new Singleton();
        }
        return uniqeInstance;
    }

}
