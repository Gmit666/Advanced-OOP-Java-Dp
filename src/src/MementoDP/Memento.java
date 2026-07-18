package MementoDP;

public class Memento {
    private final int health;
    private final String name;
    private final int level;

    public Memento(int health, String name, int level) {
        this.health = health;
        this.name = name;
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

}
