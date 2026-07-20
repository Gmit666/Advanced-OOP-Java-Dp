package DesignQuestion2025A;

public class Passenger extends Person {

    private String passportNumber;
    private String destination;

    public Passenger(
            String name,
            String passportNumber,
            String destination) {
        super(name);
        this.passportNumber = passportNumber;
        this.destination = destination;
    }

    @Override
    public String getStatusDetails() {
        return "Passenger: " + getName()
                + ", passport: " + passportNumber
                + ", destination: " + destination;
    }
}