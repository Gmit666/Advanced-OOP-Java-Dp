package TestMemento;

public class Animal extends LivingEntity {

    public Animal(
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
        changeEnergy(-10);
        System.out.println(getName() + " acts as an animal.");
    }
}