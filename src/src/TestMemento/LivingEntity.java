package TestMemento;

public abstract class LivingEntity extends Entity {

    private int energy;
    private int age;

    public LivingEntity(
            int id,
            String name,
            int x,
            int y,
            int energy,
            int age) {

        super(id, name, x, y);
        this.energy = energy;
        this.age = age;
    }

    public void move(int newX, int newY) {
        setPosition(newX, newY);
    }

    public void changeEnergy(int delta) {
        energy += delta;
    }

    public void growOlder() {
        age++;
    }

    public abstract void act();

    public int getEnergy() {
        return energy;
    }

    public int getAge() {
        return age;
    }

    public Memento saveState() {
        return new Memento(
                getName(),
                getX(),
                getY(),
                energy,
                age
        );
    }

    public void restoreState(Memento memento) {
        if (memento == null) {
            return;
        }

        setName(memento.name);
        setPosition(memento.x, memento.y);
        energy = memento.energy;
        age = memento.age;
    }

    public static class Memento {

        private final String name;
        private final int x;
        private final int y;
        private final int energy;
        private final int age;

        private Memento(
                String name,
                int x,
                int y,
                int energy,
                int age) {

            this.name = name;
            this.x = x;
            this.y = y;
            this.energy = energy;
            this.age = age;
        }
    }
}