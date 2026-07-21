package ThreadExamples;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    private final CyclicBarrier barrier;

    public CyclicBarrierExample(int numberOfThreads) {

        barrier = new CyclicBarrier(numberOfThreads, () ->
                System.out.println("All threads reached the barrier.")
        );
    }

    public void performTask(String threadName) {

        try {
            System.out.println(threadName + " is doing the first part.");

            Thread.sleep(500);

            System.out.println(threadName + " reached the barrier.");

            barrier.await();

            System.out.println(threadName + " is doing the second part.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        } catch (BrokenBarrierException e) {
            System.out.println("Barrier was broken.");
        }
    }
}