package DecoratorDP;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();
        c.draw();
        ColoredDecorator c1 = new ColoredDecorator(c);
        c1.setColor("Red");
        c1.draw();
        ColoredDecorator c2 = new ColoredDecorator(c1);
        c2.setColor("Blue");
        c2.draw();
        Shape c3 = c2.getDecoratedShape();
        c3.draw();
        c.draw();
    }
}
