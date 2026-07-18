package TestMemento;

public class SimulationEngine {

    private final Caretaker caretaker = new Caretaker();

    public void runSimulation(LivingEntity entity) {

        LivingEntity.Memento state = entity.saveState();

        caretaker.saveState(entity.getId(), state);

        entity.act();
        entity.growOlder();

        if (entity.getEnergy() < 5 || entity.getAge() > 100) {

            LivingEntity.Memento previousState =
                    caretaker.getLastState(entity.getId());

            entity.restoreState(previousState);

            System.out.println(
                    "Entity "
                            + entity.getId()
                            + " restored to previous state."
            );
        }
    }
}