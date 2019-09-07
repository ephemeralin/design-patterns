package gof.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    List<Subscriber> subscribers;

    public Publisher() {
        this.subscribers = new ArrayList<Subscriber>();
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public abstract void notifySubscribers(Object data);
}
