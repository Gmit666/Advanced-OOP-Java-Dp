package IteratorDP;

public interface GameCollection<T> {
    GameIterator<T> createIterator();
}
