package gof.behavior.observer;

public class Shop extends Publisher {

    public void notifySubscribers(Object data) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(data);
        }

    }
}
