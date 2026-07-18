package VisitorDP;

public class Warrior implements GameObject {
    @Override
    public void accept(GameObjectVisitor visitor) {
        visitor.visit(this);
    }
}