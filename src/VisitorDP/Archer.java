package VisitorDP;

public class Archer implements GameObject {
    @Override
    public void accept(GameObjectVisitor visitor) {
        visitor.visit(this);
    }
}