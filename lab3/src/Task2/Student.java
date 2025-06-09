package Task2;

public class Student extends Citizen {
    private String university;

    Student(String name, int age, String country, String university) {
        super(name, age, country);
        this.university = university;
    }

    @Override
    public String toString() { return super.toString() + ", university='" + this.university + '\''; }
}
