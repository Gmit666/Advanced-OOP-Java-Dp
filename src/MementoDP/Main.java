package MementoDP;

public class Main {
    public static void main(String[] args) {
        Originator Player = new Originator(100,"Amit",1);
        Caretaker Caretaker = new Caretaker();

        Player.printState();
        Caretaker.addMemento(Player.save());
        Player.setHealth(50);
        Player.setLevel(5);
        Player.printState();
        Caretaker.addMemento(Player.save());
        Player.restore(Caretaker.getMemento(0));
        Player.printState();
    }
}
