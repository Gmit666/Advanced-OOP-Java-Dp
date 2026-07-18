package AbstractFactoryDP;

public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if(type.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }
        if(type.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        throw new IllegalArgumentException("Shape not found");
    }
}
