package strategy.old;

/**
 * 通过继承的方式来实现代码的复用，但是一旦有新的类型需要添加，得实现超类中所有方法
 * 超类挖的坑得子类来实现
 */
public abstract class Duck {

    public Duck() {
    }

    public void Quack() {
        System.out.println("~~gaga~~");
    }

    public abstract void display();

    public void swim() {
        System.out.println("~~swim~~");
    }

    public void fly() {
        System.out.println("~~fly~~");
    }
}
