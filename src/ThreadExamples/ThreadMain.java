package ThreadExamples;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Extending Thread ===");

        MyThread threadExample = new MyThread();

        threadExample.start();
        threadExample.join();


        System.out.println("\n=== Implementing Runnable ===");

        Thread runnableThread = new Thread(new MyRunnable());

        runnableThread.start();
        runnableThread.join();


        System.out.println("\n=== ExecutorService ===");

        ExecutorExample executorExample = new ExecutorExample();

        executorExample.start();

        Thread.sleep(1000);


        System.out.println("\n=== Semaphore ===");

        SemaphoreExample semaphoreExample = new SemaphoreExample();

        Thread semaphoreThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.useResource("Thread A");
            }
        });

        Thread semaphoreThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.useResource("Thread B");
            }
        });

        Thread semaphoreThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.useResource("Thread C");
            }
        });

        semaphoreThread1.start();
        semaphoreThread2.start();
        semaphoreThread3.start();

        semaphoreThread1.join();
        semaphoreThread2.join();
        semaphoreThread3.join();


        System.out.println("\n=== synchronized ===");

        Counter counter = new Counter();

        Runnable counterTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };

        Thread counterThread1 = new Thread(counterTask);
        Thread counterThread2 = new Thread(counterTask);

        counterThread1.start();
        counterThread2.start();

        counterThread1.join();
        counterThread2.join();

        System.out.println("Counter = " + counter.getCount());


        System.out.println("\n=== wait / notify ===");

        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();


        System.out.println("\n=== ReentrantLock ===");

        ReentrantLockExample lockExample = new ReentrantLockExample();

        Runnable lockTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    lockExample.increment();
                }
            }
        };

        Thread lockThread1 = new Thread(lockTask);
        Thread lockThread2 = new Thread(lockTask);

        lockThread1.start();
        lockThread2.start();

        lockThread1.join();
        lockThread2.join();

        System.out.println("ReentrantLock counter = " + lockExample.getCounter());


        System.out.println("\n=== CountDownLatch ===");

        CountDownLatchExample latchExample = new CountDownLatchExample(3);

        Thread worker1 = new Thread(new Runnable() {
            @Override
            public void run() {
                latchExample.doWork("Worker 1");
            }
        });

        Thread worker2 = new Thread(new Runnable() {
            @Override
            public void run() {
                latchExample.doWork("Worker 2");
            }
        });

        Thread worker3 = new Thread(new Runnable() {
            @Override
            public void run() {
                latchExample.doWork("Worker 3");
            }
        });

        worker1.start();
        worker2.start();
        worker3.start();

        latchExample.waitForWorkers();

        worker1.join();
        worker2.join();
        worker3.join();


        System.out.println("\n=== CyclicBarrier ===");

        CyclicBarrierExample barrierExample = new CyclicBarrierExample(3);

        Thread barrierThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                barrierExample.performTask("Barrier Thread 1");
            }
        });

        Thread barrierThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                barrierExample.performTask("Barrier Thread 2");
            }
        });

        Thread barrierThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                barrierExample.performTask("Barrier Thread 3");
            }
        });

        barrierThread1.start();
        barrierThread2.start();
        barrierThread3.start();

        barrierThread1.join();
        barrierThread2.join();
        barrierThread3.join();


        System.out.println("\nAll examples finished.");
    }
}