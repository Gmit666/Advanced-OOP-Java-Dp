package IteratorDP;

public class Main {

    public static void main(String[] args) {

        Party party = new Party(5);

        party.addPlayer(new Warrior("Amit"));
        party.addPlayer(new Archer("Daniel"));
        party.addPlayer(new Mage("Noa"));

        GameIterator<Player> iterator = party.createIterator();

        while (iterator.hasNext()) {
            Player player = iterator.next();
            System.out.println(player);
        }
    }
}