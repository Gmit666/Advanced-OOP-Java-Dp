package HorseRaceGame;

public class Player {

    private final String name;
    private int money;

    private Horse selectedHorse;
    private int wager;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void placeBet(Horse horse, int wager) {
        if (wager <= 0 || wager > money) {
            throw new IllegalArgumentException(
                    "Invalid wager amount"
            );
        }

        this.selectedHorse = horse;
        this.wager = wager;

        money -= wager;

        System.out.println(
                name + " wagered " + wager
                        + " on " + horse.getName()
        );
    }

    public void checkResult(Horse winner) {
        if (selectedHorse == winner) {
            int winnings = wager * 2;
            money += winnings;

            System.out.println(
                    name + " won the bet and received "
                            + winnings
            );
        } else {
            System.out.println(
                    name + " lost the bet."
            );
        }

        System.out.println(
                "Current money: " + money
        );
    }

    public int getMoney() {
        return money;
    }
}