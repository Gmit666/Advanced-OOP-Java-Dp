package Delegator;

public class TeacherAssistant {
    private Student student;
    private Teacher teacher;

    public TeacherAssistant() {
        this.student = new Student.StudentBuilder().build();
        this.teacher = new Teacher.TeacherBuilder().build();
    }
    public TeacherAssistant(int ID,String Name) {
        this.student = new Student.StudentBuilder().ID(ID).Name(Name).build();
        this.teacher = new Teacher.TeacherBuilder().build();
    }
    public void setName(String name) {
        student.setName(name);
    }
    public String getName() {
        return student.getName();
    }
    public void setID(int ID) {
        student.setID(ID);
    }
    public int getID(){
        return student.getID();
    }
    public void setTuition(int tuition){
        student.setTuition(tuition);
    }
    public int getTuition(){
        return student.getTuition();
    }
    public void setSalary(int Salary){
        teacher.setSalary(Salary);
    }
    public int getSalary(){
        return teacher.getSalary();
    }

    public String toString(){
        return (student.toString() + "Salary: " + teacher.getSalary() + "\n");
    }
}
