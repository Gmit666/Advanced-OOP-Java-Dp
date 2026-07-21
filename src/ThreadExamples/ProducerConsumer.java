package ThreadExamples;

public class ProducerConsumer {

    private boolean available = false;

    public synchronized void produce() throws InterruptedException {

        while (available)
            wait();

        System.out.println("Produced");

        available = true;

        notify();
    }

    public synchronized void consume() throws InterruptedException {

        while (!available)
            wait();

        System.out.println("Consumed");

        available = false;

        notify();
    }

}