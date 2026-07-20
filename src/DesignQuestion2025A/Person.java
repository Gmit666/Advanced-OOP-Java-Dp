package DesignQuestion2025A;

public abstract class Person {
    private String name;
    private int Entertime;
    private State currentState;

    public Person(String name) {
        this.name = name;
        this.Entertime = -1;
        this.currentState = WaitingState.getInstance();
    }
    public String getStatus(){
        return this.currentState.getStatus(this);
    }

    public void process(){
        currentState.process(this);
    }
    public void recordEntryTime(int time){
        this.Entertime = time;
    }
    public int getEntertime(){
        return this.Entertime;
    }
    public String getName(){
        return this.name;
    }

    public void logActivity(){
        System.out.println(getName() + " " + Object.class.getSimpleName() + " " + getEntertime());
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }
    protected State getStateAfterWaiting() {
        return ProcessingState.getInstance();
    }

    public String getStatusDetails() {
        return getClass().getSimpleName() + " " + name;
    }

}
