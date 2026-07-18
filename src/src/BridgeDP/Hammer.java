package BridgeDP;

public class Hammer extends Weapon{
    public Hammer(Element element) {
        super(element);
    }
    @Override
    public String WhatAmI() {
        return "I'm " + element.apply() + "Hammer.";
    }
}
