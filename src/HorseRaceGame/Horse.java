package HorseRaceGame;

import java.util.Random;

public class Horse implements Runnable {

    private final String name;
    private final int speed;
    private final Race race;
    private final Random random;

    private int distance;

    public Horse(String name, int speed, Race race) {
        this.name = name;
        this.speed = speed;
        this.race = race;
        this.random = new Random();
        this.distance = 0;
    }

    @Override
    public void run() {
        while (distance < race.getFinishDistance()) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            int movement = random.nextInt(speed) + 1;
            distance += movement;

            System.out.println(
                    name + " moved " + movement
                            + " meters. Total: " + distance
            );
        }

        race.finishRace(this);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }
}