package ObserverDP;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber s1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber s2 = new ConcreteSubscriber("Subscriber 2");
        Subscriber s3 = new ConcreteSubscriber("Subscriber 3");

        publisher.subscribe(s1);
        publisher.subscribe(s2);
        publisher.subscribe(s3);

        publisher.doMagic("State Changed to ACTIVE");
        System.out.println();
        publisher.unsubscribe(s2);

        publisher.doMagic("State Changed to INACTIVE");
    }
}
