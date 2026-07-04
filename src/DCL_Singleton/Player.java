package DCL_Singleton;

import java.util.Scanner;

public class Player {
    private static volatile Player instance;
    private String name;

    public static Player getInstance() {
        if (instance == null) {
            synchronized (Player.class) {
                if (instance == null) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    instance = new Player(name);
                    sc.close();
                }
            }

        }
        return instance;
    }
    private Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Player player = Player.getInstance();
        Player player1 = Player.getInstance();
        System.out.println(player);
        System.out.println(player1);
    }
}
