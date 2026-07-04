package VisitorDP;

public class AttackVisitor implements GameObjectVisitor {
    @Override
    public void visit(Warrior warrior) {
        System.out.println("Warrior attacks with sword");
    }

    @Override
    public void visit(Archer archer) {
        System.out.println("Archer attacks with bow");
    }
}