package HorseRaceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Race {

    private final List<Horse> horses;
    private final int finishDistance;

    private Horse winner;

    public Race(int numberOfHorses, int finishDistance) {
        this.finishDistance = finishDistance;
        this.horses = new ArrayList<>();
        this.winner = null;

        createHorses(numberOfHorses);
    }

    private void createHorses(int numberOfHorses) {
        Random random = new Random();

        for (int i = 1; i <= numberOfHorses; i++) {
            int speed = random.nextInt(10) + 1;

            Horse horse = new Horse(
                    "Horse " + i,
                    speed,
                    this
            );

            horses.add(horse);
        }
    }

    public void startRace() {
        List<Thread> threads = new ArrayList<>();

        System.out.println("Race started!");

        for (Horse horse : horses) {
            Thread thread = new Thread(horse);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Race finished!");
        System.out.println("Winner: " + winner.getName());
    }

    public synchronized void finishRace(Horse horse) {
        if (winner == null) {
            winner = horse;
        }
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public int getFinishDistance() {
        return finishDistance;
    }

    public Horse getWinner() {
        return winner;
    }
}