package CallbackDP;

public class CallbackMain {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Sender sender = new Sender(receiver);

        sender.doWork();

    }

}