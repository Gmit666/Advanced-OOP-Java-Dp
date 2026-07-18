package Prototype;

public class Sword implements Cloneable{
    private String name;
    private int dmg;

    public Sword(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }

    public String toString(){
        return "name: " + name + ", dmg: " + dmg;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDmg(int dmg){
        this.dmg = dmg;
    }

    @Override
    public Sword clone() throws CloneNotSupportedException {
        return (Sword) super.clone();
    }
}
