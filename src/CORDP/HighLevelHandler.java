package CORDP;

public class HighLevelHandler extends Handler {

    @Override
    public void handleRequest(String problem, int difficulty) {

        if (difficulty <= 10) {
            System.out.println(
                    "High-level support solved: " + problem
            );
        } else {
            System.out.println(
                    "High-level support cannot solve: " + problem
            );

            passToNext(problem, difficulty);
        }
    }
}