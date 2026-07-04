package StrategyDP_StateDP;

public class Character {
    private Attack strategy;
    private State currentState;

    public Character(Attack strategy,State state) {
        this.strategy = strategy;
        this.currentState = state;
    }
    public Character() {

    }

    public void fight(){
        strategy.attack();
    }

    public void setState(State state){
        this.currentState = state;
    }
    public void getState(){
        this.currentState.applyState();
    }

    public void setStrategy(Attack attack){
        this.strategy = attack;
    }
}
