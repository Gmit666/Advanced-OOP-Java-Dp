package TestMemento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Caretaker {

    private final Map<Integer, Deque<LivingEntity.Memento>> histories =
            new HashMap<>();

    public void saveState(int entityId, LivingEntity.Memento memento) {
        Deque<LivingEntity.Memento> history =
                histories.computeIfAbsent(
                        entityId,
                        id -> new ArrayDeque<>()
                );

        if (history.size() == 5) {
            history.removeFirst();
        }

        history.addLast(memento);
    }

    public LivingEntity.Memento getLastState(int entityId) {
        Deque<LivingEntity.Memento> history = histories.get(entityId);

        if (history == null || history.isEmpty()) {
            return null;
        }

        return history.peekLast();
    }
}