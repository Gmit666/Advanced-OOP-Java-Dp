package StrategyDP_StateDP;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.setStrategy(new BowAttack());
        character.fight();
        character.setStrategy(new SwordAttack());
        character.fight();
        character.setState(new EnhancedState());
        character.getState();
        character.setState(new Poisened());
        character.getState();
    }
}
