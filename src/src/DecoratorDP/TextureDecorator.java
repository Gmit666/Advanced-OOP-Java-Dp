package DecoratorDP;

public class TextureDecorator extends ShapeDecorator {
    private String texture;
    public TextureDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw Texture " + texture);
    }
}
