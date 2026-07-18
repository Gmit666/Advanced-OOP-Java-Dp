package IteratorDP;

import java.util.NoSuchElementException;

public class PartyIterator implements GameIterator<Player> {

    private final Party party;
    private int currentIndex;

    public PartyIterator(Party party) {
        this.party = party;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < party.size();
    }

    @Override
    public Player next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more players in the party");
        }

        Player player = party.getPlayer(currentIndex);
        currentIndex++;

        return player;
    }
}