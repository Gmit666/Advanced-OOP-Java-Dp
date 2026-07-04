package Prototype;

public class Warrior  implements Cloneable{
    private String name;
    private int health;
    private Sword sword;

    public Warrior(String name, int health, Sword sword) {
        this.name = name;
        this.health = health;
        this.sword = sword;
    }

    public String toString(){
        return "name: " + name + ", health: " + health + ", sword: " + sword;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setSword(Sword sword) {
        this.sword = sword;
    }

    @Override
    public Warrior clone() throws CloneNotSupportedException {
        Warrior w = (Warrior) super.clone();
        w.sword = (Sword)this.sword.clone();
        return w;
    }
}
