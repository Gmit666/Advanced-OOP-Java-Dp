package AbstractFactoryDP;

public class FactoryProducer{


    public static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("Normal")) {
            return new ShapeFactory();
        }
        if(type.equalsIgnoreCase("Rounded")) {
            return new RoundedShapeFactory();
        }
        throw new IllegalArgumentException("Unknown factory: " + type);
    }
}
