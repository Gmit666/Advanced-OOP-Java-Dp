package ObserverDP;

public class ConcreteSubscriber implements Subscriber {
    private final String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String context) {
        System.out.println(this.name + " received update: " + context);
    }

}
