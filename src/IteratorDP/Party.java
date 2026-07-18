package IteratorDP;

public class Party implements GameCollection<Player> {

    private final Player[] players;
    private int size;

    public Party(int capacity) {
        players = new Player[capacity];
        size = 0;
    }

    public void addPlayer(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null");
        }

        if (size >= players.length) {
            throw new IllegalStateException("Party is full");
        }

        players[size] = player;
        size++;
    }

    public int size() {
        return size;
    }

    Player getPlayer(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid player index");
        }

        return players[index];
    }

    @Override
    public GameIterator<Player> createIterator() {
        return new PartyIterator(this);
    }
}