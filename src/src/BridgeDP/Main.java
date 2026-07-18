package BridgeDP;

public class Main {
    public static void main(String[] args) {
        Weapon w1 = new Bow(new Fire());
        Weapon w2 = new Bow(new Ice());
        Weapon w3 = new Hammer(new Fire());
        Weapon w4 = new Hammer(new Lightning());
        Weapon w5 = new Sword(new Fire());

        System.out.println(w1.WhatAmI());
        System.out.println(w2.WhatAmI());
        System.out.println(w3.WhatAmI());
        System.out.println(w4.WhatAmI());
        System.out.println(w5.WhatAmI());
    }
}
