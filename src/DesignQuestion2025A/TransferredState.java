package DesignQuestion2025A;

public class TransferredState implements State {

    private static final TransferredState INSTANCE =
            new TransferredState();

    private TransferredState() {
    }

    public static TransferredState getInstance() {
        return INSTANCE;
    }

    @Override
    public void process(Person person) {
        System.out.println(
                person.getName() + " has already been transferred"
        );
    }

    @Override
    public String getStatus(Person person) {
        return person.getStatusDetails() + " was transferred";
    }
}