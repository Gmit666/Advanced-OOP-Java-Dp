package BridgeDP;

public class Bow extends Weapon{
    public Bow(Element element) {
        super(element);
    }
    @Override
    public String WhatAmI() {
        return "I'm " + element.apply() + "Bow.";
    }

}
