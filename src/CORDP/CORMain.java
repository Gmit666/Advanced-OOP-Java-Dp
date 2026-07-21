package CORDP;

public class CORMain {

    public static void main(String[] args) {

        Handler low = new LowLevelHandler();
        Handler middle = new MiddleLevelHandler();
        Handler high = new HighLevelHandler();

        low.setNext(middle).setNext(high);

        System.out.println("Request 1:");
        low.handleRequest("Resetting a password", 2);

        System.out.println("\nRequest 2:");
        low.handleRequest("Application keeps crashing", 6);

        System.out.println("\nRequest 3:");
        low.handleRequest("Database server failure", 9);

        System.out.println("\nRequest 4:");
        low.handleRequest("Unknown system-wide failure", 15);
    }
}