package CallbackDP;

public class Receiver implements Callback {

    @Override
    public void onComplete() {
        System.out.println("Receiver: I received the callback!");
    }

}