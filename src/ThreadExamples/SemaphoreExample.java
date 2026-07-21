package ThreadExamples;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private Semaphore semaphore = new Semaphore(2);

    public void useResource(String name) {

        try {

            semaphore.acquire();

            System.out.println(name + " entered.");

            Thread.sleep(1000);

            System.out.println(name + " left.");

        } catch (InterruptedException e) {

            e.printStackTrace();

        } finally {

            semaphore.release();

        }

    }

}