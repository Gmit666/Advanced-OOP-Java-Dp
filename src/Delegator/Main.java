package Delegator;

public class Main {
    public static void main(String[] args) {
        TeacherAssistant TA = new TeacherAssistant(123123,"Amit");
        TA.setSalary(5600);
        TA.setTuition(1500);
        System.out.println(TA);
    }
}
