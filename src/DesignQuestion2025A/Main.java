package DesignQuestion2025A;

public class Main {

    public static void main(String[] args) {

        Person passenger =
                new Passenger(
                        "Amit",
                        "P12345",
                        "London"
                );

        Person crewMember =
                new CrewMember(
                        "Daniel",
                        "Pilot"
                );

        Person delivery =
                new Delivery(
                        "Medical equipment",
                        "SHIP-789"
                );

        passenger.recordEntryTime(10);
        crewMember.recordEntryTime(12);
        delivery.recordEntryTime(15);

        System.out.println(passenger.getStatus());
        passenger.process();

        System.out.println(passenger.getStatus());
        passenger.process();

        System.out.println(passenger.getStatus());

        System.out.println();

        System.out.println(crewMember.getStatus());
        crewMember.process();
        System.out.println(crewMember.getStatus());

        System.out.println();

        delivery.logActivity();
    }
}