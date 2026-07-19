package ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers;
    private String mainState;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        if(subscriber == null){
            throw new IllegalArgumentException("Subscriber cannot be null");
        }
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }

    public void doMagic(String newState) {
        mainState = newState;
        notifySubscribers();
    }
    public String getMainState() {
        return mainState;
    }
}
