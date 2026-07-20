package DesignQuestion2025A;

public class ProcessingState implements State {

    private static final ProcessingState INSTANCE =
            new ProcessingState();

    private ProcessingState() {
    }

    public static ProcessingState getInstance() {
        return INSTANCE;
    }

    @Override
    public void process(Person person) {
        person.setCurrentState(TransferredState.getInstance());
    }

    @Override
    public String getStatus(Person person) {
        return person.getStatusDetails() + " is being processed";
    }
}