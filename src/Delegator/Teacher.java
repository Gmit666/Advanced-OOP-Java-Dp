package Delegator;

public class Teacher {
    private int ID;
    private String Name;
    private int Salary;

    private Teacher(TeacherBuilder builder){
        this.ID = builder.ID;
        this.Name = builder.Name;
        this.Salary = builder.Salary;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public int getSalary() {
        return Salary;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String toString(){
        return "ID: " + ID + ", Name: " + Name + ", Salary: " + Salary + "\n";
    }

    public static class TeacherBuilder{
        private int ID;
        private String Name;
        private int Salary;

        public TeacherBuilder setID(int ID){
            this.ID = ID;
            return this;
        }
        public TeacherBuilder setName(String Name){
            this.Name = Name;
            return this;
        }
        public TeacherBuilder setSalary(int Salary){
            this.Salary = Salary;
            return this;
        }
        public Teacher build(){
            return new Teacher(this);
        }
    }
}
