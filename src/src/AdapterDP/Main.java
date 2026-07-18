package AdapterDP;

public class Main {
    public static void main(String[] args) {
        Enemy e1 = new NormalEnemy();
        Enemy e2 = new DragonAdapter(new Dragon());


    }
}
