package VisitorDP;

public interface GameObjectVisitor {
    void visit(Warrior warrior);
    void visit(Archer archer);
}