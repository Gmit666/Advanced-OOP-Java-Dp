package ConcurrencyQuestion;

public class Main {

    public static void main(String[] args) {

        DrinkStand drinkStand = new DrinkStand();

        Employee amit = new Employee("Amit");
        Employee dan = new Employee("Dan");
        Employee noa = new Employee("Noa");
        Employee maya = new Employee("Maya");

        amit.addPermission("COFFEE");
        dan.addPermission("COFFEE");
        noa.addPermission("COFFEE");

        Thread t1 = new Thread(
                new EmployeeTask(amit, drinkStand, "COFFEE")
        );

        Thread t2 = new Thread(
                new EmployeeTask(dan, drinkStand, "COFFEE")
        );

        Thread t3 = new Thread(
                new EmployeeTask(noa, drinkStand, "COFFEE")
        );

        Thread t4 = new Thread(
                new EmployeeTask(maya, drinkStand, "COFFEE")
        );

        Thread t5 = new Thread(
                new EmployeeTask(amit, drinkStand, "JUICE")
        );

        Thread t6 = new Thread(
                new EmployeeTask(dan, drinkStand, "JUICE")
        );

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}