package AbstractFactoryDP;

public class Main {
    public static void main(String[] args) {
        AbstractFactory normal = FactoryProducer.getFactory("Normal");
        AbstractFactory rounded = FactoryProducer.getFactory("Rounded");

        Shape c1 = normal.getShape("Square");
        Shape c2 = rounded.getShape("Square");
        c1.draw();
        c2.draw();

    }
}
