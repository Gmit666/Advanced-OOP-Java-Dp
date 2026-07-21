package ThreadExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public void start() {

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(() ->
                System.out.println("Task 1 : " + Thread.currentThread().getName()));

        pool.execute(() ->
                System.out.println("Task 2 : " + Thread.currentThread().getName()));

        pool.shutdown();
    }

}