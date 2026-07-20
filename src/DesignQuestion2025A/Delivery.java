package DesignQuestion2025A;

public class Delivery extends Person {

    private String shipmentId;

    public Delivery(String name, String shipmentId) {
        super(name);
        this.shipmentId = shipmentId;
    }

    @Override
    public void logActivity() {
        super.logActivity();

        System.out.println(
                "Shipment ID: " + shipmentId
        );
    }

    @Override
    public String getStatusDetails() {
        return "Delivery: " + getName()
                + ", shipment ID: " + shipmentId;
    }
}