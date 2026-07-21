package CORDP;

public class LowLevelHandler extends Handler {

    @Override
    public void handleRequest(String problem, int difficulty) {

        if (difficulty <= 3) {
            System.out.println(
                    "Low-level support solved: " + problem
            );
        } else {
            System.out.println(
                    "Low-level support cannot solve: " + problem
            );

            passToNext(problem, difficulty);
        }
    }
}