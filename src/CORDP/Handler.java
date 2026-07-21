package CORDP;

public abstract class Handler {

    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handleRequest(String problem, int difficulty);

    protected void passToNext(String problem, int difficulty) {
        if (next != null) {
            System.out.println("Passing request to the next handler...");
            next.handleRequest(problem, difficulty);
        } else {
            System.out.println("No handler could solve: " + problem);
        }
    }
}