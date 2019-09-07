package gof.creational.singleton;

public class EagerThreadSafeSingleton {
    private static final EagerThreadSafeSingleton instance = new EagerThreadSafeSingleton();

    private EagerThreadSafeSingleton() {
    }

    public static EagerThreadSafeSingleton getInstance() {
        return instance;
    }
}
