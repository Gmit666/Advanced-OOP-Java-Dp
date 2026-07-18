package MementoDP;

public class Originator {
    private int health;
    private String name;
    private int level;

    public Originator(int health, String name, int level) {
        this.health = health;
        this.name = name;
        this.level = level;

    }

    public Memento save() {
        return new Memento(this.health,this.name,this.level);
    }

    public void restore(Memento memento) {
        this.health = memento.getHealth();
        this.name = memento.getName();
        this.level = memento.getLevel();
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }

     public void printState(){
         System.out.println("Name: " + name + ", Health: " + health + ", Level: " + level);
     }
}
