package Delegator;

public class Student {
    private int ID;
    private String Name;
    private int tuition;

    private Student(StudentBuilder builder) {
        this.ID = builder.ID;
        this.Name = builder.Name;
        this.tuition = builder.tuition;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setTuition(int tuition) {
        this.tuition = tuition;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public int getTuition() {
        return tuition;
    }

    public String toString(){
        return "ID: " + ID + ", Name: " + Name + ", Tuition: " + tuition +"\n";
    }

    public static class StudentBuilder {
        private int ID;
        private String Name;
        private int tuition;

        public StudentBuilder ID(int ID) {
            this.ID = ID;
            return this;
        }
        public StudentBuilder Name(String Name) {
            this.Name = Name;
            return this;
        }
        public StudentBuilder tuition(int tuition) {
            this.tuition = tuition;
            return this;
        }


        public Student build(){
            return new Student(this);
        }
    }
}
