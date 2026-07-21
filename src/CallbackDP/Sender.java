package CallbackDP;

public class Sender {

    private Callback callback;

    public Sender(Callback callback) {
        this.callback = callback;
    }

    public void doWork() {

        System.out.println("Sender is working...");

        System.out.println("Work finished!");

        callback.onComplete();
    }

}