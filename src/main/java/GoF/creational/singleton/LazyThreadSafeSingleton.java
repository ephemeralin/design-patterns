package GoF.creational.singleton;

public class LazyThreadSafeSingleton {
    private volatile static LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {
    }

    public static LazyThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new LazyThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
