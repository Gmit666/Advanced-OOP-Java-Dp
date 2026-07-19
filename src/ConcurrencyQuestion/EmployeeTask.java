package ConcurrencyQuestion;

public class EmployeeTask implements Runnable {

    private final Employee employee;
    private final DrinkStand drinkStand;
    private final String requestedDrink;

    public EmployeeTask(
            Employee employee,
            DrinkStand drinkStand,
            String requestedDrink
    ) {
        this.employee = employee;
        this.drinkStand = drinkStand;
        this.requestedDrink = requestedDrink;
    }

    @Override
    public void run() {
        switch (requestedDrink.toUpperCase()) {
            case "WATER":
                drinkStand.useWater(employee);
                break;

            case "JUICE":
                drinkStand.useJuice(employee);
                break;

            case "COFFEE":
                drinkStand.useCoffee(employee);
                break;

            default:
                System.out.println("Unknown drink: " + requestedDrink);
        }
    }
}