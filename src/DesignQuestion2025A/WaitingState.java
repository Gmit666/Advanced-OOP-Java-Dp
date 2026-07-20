package DesignQuestion2025A;

public class WaitingState implements State {

    private static final WaitingState INSTANCE = new WaitingState();

    private WaitingState() {
    }

    public static WaitingState getInstance() {
        return INSTANCE;
    }

    @Override
    public void process(Person person) {
        person.setCurrentState(person.getStateAfterWaiting());
    }

    @Override
    public String getStatus(Person person) {
        return person.getStatusDetails() + " is waiting";
    }
}