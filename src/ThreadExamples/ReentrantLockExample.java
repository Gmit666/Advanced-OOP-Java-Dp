package ThreadExamples;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {

        lock.lock();

        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        return counter;
    }
}