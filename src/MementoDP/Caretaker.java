package MementoDP;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> saves = new ArrayList<>();

    public void addMemento(Memento memento){
        saves.add(memento);
    }

    public Memento getMemento(int index){
        return saves.get(index);
    }
}
