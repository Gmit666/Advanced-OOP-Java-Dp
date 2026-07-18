package TestMemento;

public abstract class Entity {

    private final int id;
    private String name;
    private int x;
    private int y;

    public Entity(int id, String name, int x, int y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}