package Task2;

public class Citizen extends Human {
    private String country;
    public Citizen(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    @Override
    public String toString() { return super.toString() + ", country='" + this.country + '\''; }
}
