package AdapterDP;

public class DragonAdapter implements Enemy{
    private final Dragon dragon;
    public DragonAdapter(Dragon dragon){
        this.dragon = dragon;
    }

    @Override
    public void takeDamage(){
        dragon.takeHit();
    }
    @Override
    public void attack(){
        dragon.breathFire();
    }
    @Override
    public void move(){
        dragon.fly();
    }
}
