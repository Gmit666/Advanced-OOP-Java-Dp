package DesignQuestion2025A;

public interface State {
    void process(Person person);
    String getStatus(Person person);

}
