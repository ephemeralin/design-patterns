package GoF.creational.singleton;

public class StaticFieldSingleton {
    public static final StaticFieldSingleton instance = new StaticFieldSingleton();

    private StaticFieldSingleton() {
    }
}
