package VisitorDP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameObject> units = new ArrayList<>();

        units.add(new Warrior());
        units.add(new Archer());

        GameObjectVisitor attackVisitor = new AttackVisitor();

        for (GameObject unit : units) {
            unit.accept(attackVisitor);
        }
    }
}
