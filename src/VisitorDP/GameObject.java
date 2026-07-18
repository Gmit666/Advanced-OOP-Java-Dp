package VisitorDP;

public interface GameObject {
    void accept(GameObjectVisitor visitor);
}