package AdapterDP;

public class NormalEnemy implements Enemy{

    @Override
    public void move(){
        System.out.println("Moving..");
    }
    @Override
    public void attack(){
        System.out.println("Attacking..");
    }
    @Override
    public void takeDamage(){
        System.out.println("Injured..");
    }
}
