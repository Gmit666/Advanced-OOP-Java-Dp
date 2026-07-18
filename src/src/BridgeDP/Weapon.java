package BridgeDP;

public abstract class Weapon {
    protected Element element;

    public Weapon(Element element) {
        this.element = element;
    }

    public abstract String WhatAmI();
}
