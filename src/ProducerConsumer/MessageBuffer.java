package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class MessageBuffer {

    private List<String> messages = new ArrayList<>();
    private int capacity = 10;

    // Producer function
    public synchronized void produce(String msg) {

        while (messages.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        messages.add(msg);
        this.notifyAll();
    }


    public synchronized void consume() {
        while (messages.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(messages.remove(0));
        notifyAll();

    }

    public static  void main(String[] args) {
        MessageBuffer messageBuffer = new MessageBuffer();
    }
}