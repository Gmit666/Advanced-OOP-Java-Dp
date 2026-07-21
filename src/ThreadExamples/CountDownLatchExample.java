package ThreadExamples;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    private final CountDownLatch latch;

    public CountDownLatchExample(int numberOfWorkers) {
        latch = new CountDownLatch(numberOfWorkers);
    }

    public void doWork(String workerName) {

        try {
            System.out.println(workerName + " started working.");

            Thread.sleep(500);

            System.out.println(workerName + " finished working.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
        }
    }

    public void waitForWorkers() {

        try {
            latch.await();
            System.out.println("All workers finished.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}