package Task2;

public class Employee extends Citizen {
    private String company;

    Employee(String name, int age, String country, String company) {
        super(name, age, country);
        this.company = company;
    }

    @Override
    public String toString() { return super.toString() + ", company='" + this.company + '\''; }
}
