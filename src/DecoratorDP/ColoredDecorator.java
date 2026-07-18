package DecoratorDP;

public class ColoredDecorator extends ShapeDecorator {
    private String color;
    public ColoredDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Fill Color " + color);
    }
}
