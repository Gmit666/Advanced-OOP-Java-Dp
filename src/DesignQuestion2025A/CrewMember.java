package DesignQuestion2025A;

public class CrewMember extends Person {

    private String role;

    public CrewMember(String name, String role) {
        super(name);
        this.role = role;
    }

    @Override
    protected State getStateAfterWaiting() {
        return TransferredState.getInstance();
    }

    @Override
    public String getStatusDetails() {
        return "Crew member: " + getName()
                + ", role: " + role;
    }
}