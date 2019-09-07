package gof.creational.singleton;

public class OnDemandHolderSingleton {

    public static OnDemandHolderSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public static class SingletonHolder {
        public static final OnDemandHolderSingleton instance = new OnDemandHolderSingleton();
    }
}
