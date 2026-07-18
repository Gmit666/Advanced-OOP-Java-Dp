package AbstractFactoryDP;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(type.equalsIgnoreCase("Square")){
            return new Square();
        }
        throw new IllegalArgumentException("Shape not found");
    }
}
