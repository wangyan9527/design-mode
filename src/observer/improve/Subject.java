package observer.improve;

public interface Subject {

    /**
     * 注册
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     */
    void notifyObservers();

}
