package TestMemento;

public class Plant extends LivingEntity {

    public Plant(
            int id,
            String name,
            int x,
            int y,
            int energy,
            int age) {

        super(id, name, x, y, energy, age);
    }

    @Override
    public void act() {
        changeEnergy(5);
        System.out.println(getName() + " acts as a plant.");
    }
}