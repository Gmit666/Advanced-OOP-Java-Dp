package CORDP;

public class MiddleLevelHandler extends Handler {

    @Override
    public void handleRequest(String problem, int difficulty) {

        if (difficulty <= 7) {
            System.out.println(
                    "Middle-level support solved: " + problem
            );
        } else {
            System.out.println(
                    "Middle-level support cannot solve: " + problem
            );

            passToNext(problem, difficulty);
        }
    }
}