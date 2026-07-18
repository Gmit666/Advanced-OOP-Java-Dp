package Prototype;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sword s1 = new Sword("Excalibur",50);
        Warrior w1 = new Warrior("Amit",111,s1);
        System.out.println(w1);
        Warrior w2 = w1.clone();
        System.out.println(w2);
        Sword s2 = s1.clone();
        System.out.println(s2);
        s2.setName("Dragon slayer");

        w2.setName("Gmit");
        w2.setSword(s2);
        System.out.println(w2);
    }
}
