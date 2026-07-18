package BridgeDP;

public class Sword extends Weapon{
    public Sword(Element element) {
        super(element);
    }
    @Override
    public String WhatAmI() {
        return "I'm " + element.apply() + "Sword.";
    }
}
