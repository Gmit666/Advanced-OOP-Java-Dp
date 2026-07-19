package ConcurrencyQuestion;

public class Coffee{
    private final int stationNumber;
    public Coffee(int stationNumber){
        this.stationNumber = stationNumber;
    }
    public void use(Employee employee){
        System.out.println(employee.getName() + " is using coffee station " + this.stationNumber);
    }
}
