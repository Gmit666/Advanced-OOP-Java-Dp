package ConcurrencyQuestion;

import java.util.concurrent.Semaphore;

public class DrinkStand {

    private final Water water;
    private final Juice juice;
    private final Coffee[] coffeeStations;

    private final Semaphore juiceSemaphore;
    private final Semaphore coffeeSemaphore;

    private final boolean[] coffeeStationOccupied;

    public DrinkStand() {
        water = new Water();
        juice = new Juice();

        coffeeStations = new Coffee[]{
                new Coffee(1),
                new Coffee(2)
        };

        juiceSemaphore = new Semaphore(1, true);
        coffeeSemaphore = new Semaphore(2, true);

        coffeeStationOccupied = new boolean[2];
    }

    public void useWater(Employee employee) {
        water.use(employee);
    }

    public void useJuice(Employee employee) {
        boolean permitAcquired = false;

        try {
            juiceSemaphore.acquire();
            permitAcquired = true;

            juice.use(employee);

            simulateUsage();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(
                    employee.getName()
                            + " was interrupted while waiting for juice"
            );
        } finally {
            if (permitAcquired) {
                juiceSemaphore.release();
            }
        }
    }

    public void useCoffee(Employee employee) {
        if (!employee.hasPermission("COFFEE")) {
            System.out.println(
                    employee.getName()
                            + " is not allowed to use the coffee stations"
            );
            return;
        }

        boolean permitAcquired = false;
        int stationIndex = -1;

        try {
            coffeeSemaphore.acquire();
            permitAcquired = true;

            stationIndex = acquireFreeCoffeeStation();

            coffeeStations[stationIndex].use(employee);

            simulateUsage();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

            System.out.println(
                    employee.getName()
                            + " was interrupted while waiting for coffee"
            );
        } finally {
            if (stationIndex != -1) {
                releaseCoffeeStation(stationIndex);
            }

            if (permitAcquired) {
                coffeeSemaphore.release();
            }
        }
    }

    private synchronized int acquireFreeCoffeeStation() {
        for (int i = 0; i < coffeeStationOccupied.length; i++) {
            if (!coffeeStationOccupied[i]) {
                coffeeStationOccupied[i] = true;
                return i;
            }
        }

        throw new IllegalStateException(
                "Semaphore allowed access, but no coffee station was free"
        );
    }

    private synchronized void releaseCoffeeStation(int stationIndex) {
        coffeeStationOccupied[stationIndex] = false;
    }

    private void simulateUsage() throws InterruptedException {
        Thread.sleep(1000);
    }
}