package HorseRaceGame;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Amit", 1000);
        while(player.getMoney() >= 0)
        {
            Race race = new Race(5, 50);
            List<Horse> horses = race.getHorses();

            System.out.println("Available horses:");

            for (int i = 0; i < horses.size(); i++) {
                System.out.println(
                        (i + 1) + ". " + horses.get(i).getName()
                );
            }



            System.out.print("Choose a horse: ");
            int horseChoice = scanner.nextInt();

            System.out.print("Enter wager: ");
            int wager = scanner.nextInt();

            Horse selectedHorse = horses.get(horseChoice - 1);

            player.placeBet(selectedHorse, wager);

            race.startRace();

            player.checkResult(race.getWinner());
        }


        scanner.close();
    }
}